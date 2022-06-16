package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoMascara {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoMascara
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.combobox2747"));

    System.out.println(item.getObjectAsString());

    if (
    Var.valueOf(item.equals(
    Var.valueOf(1))).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeAttrValue"),
        Var.valueOf("input1117"),
        Var.valueOf("mask"),
        Var.valueOf("(99) 99999-9999;0"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.input1117"),
        Var.valueOf("(99) 99999-9999;0"));
    } else if (
    Var.valueOf(item.equals(
    Var.valueOf(2))).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeAttrValue"),
        Var.valueOf("input1117"),
        Var.valueOf("mask"),
        Var.valueOf("999.999.999-99;0"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("vars.input1117"),
        Var.valueOf("999.999.999-99;0"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

