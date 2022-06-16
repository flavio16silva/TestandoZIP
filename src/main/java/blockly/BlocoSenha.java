package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class BlocoSenha {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoSenha
public static Var Teste() throws Exception {
 return new Callable<Var>() {

   private Var email = Var.VAR_NULL;
   private Var SenhaAtual = Var.VAR_NULL;

   public Var call() throws Exception {

    email =
    Var.valueOf("flavio@bla.com.br");

    SenhaAtual =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.password from User u where u.email = :email"),Var.valueOf("email",email)),
    Var.valueOf("this[0]"));

    System.out.println(
    cronapi.util.Operations.matchesencryptPassword(
    Var.valueOf("bla@123"), SenhaAtual).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

