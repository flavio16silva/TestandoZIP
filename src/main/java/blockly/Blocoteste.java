package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Blocoteste {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Blocoteste
public static Var Registro() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshActiveRecord"),
    Var.valueOf("User"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

