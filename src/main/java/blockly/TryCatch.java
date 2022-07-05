package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TryCatch {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// TryCatch
public static Var Testando() throws Exception {
 return new Callable<Var>() {

   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
        Var.valueOf("Pessoa"));
     } catch (Exception excecao_exception) {
          excecao = Var.valueOf(excecao_exception);

        System.out.println(
        Var.valueOf(
        Var.valueOf("Ocorreu um erro").toString() +
        cronapi.util.Operations.getExceptionMessage(excecao).toString()).getObjectAsString());
     } finally {

        System.out.println(
        Var.valueOf(
        Var.valueOf("A posição é:").toString()).getObjectAsString());
    }

    System.out.println(
    Var.valueOf("blabla").getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var EsconderModal() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf("ModalAlteracao"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var SalvarModal() throws Exception {
 return new Callable<Var>() {

   private Var except = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
        Var.valueOf("Pessoa"));
     } catch (Exception except_exception) {
          except = Var.valueOf(except_exception);

        cronapi.util.Operations.throwException(except);
     }

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf("ModalAlteracao"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

