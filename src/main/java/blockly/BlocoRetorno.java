package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoRetorno {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoRetorno
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
Var.valueOf("teste bloco servidor");
   }
 }.call();
}

}

