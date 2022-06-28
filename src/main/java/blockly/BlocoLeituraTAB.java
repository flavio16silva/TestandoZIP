package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoLeituraTAB {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoLeituraTAB
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
    Var.valueOf("cron-crn-enterprise-combobox-858388"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

