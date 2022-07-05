package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RequisicaoURL {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Blocoteste
public static Var Requisi_C3_A7_C3_A3o(@ParamMetaData(description = "pagina") Var pagina, @ParamMetaData(description = "limite") Var limite) throws Exception {
 return new Callable<Var>() {

   private Var requisicao = Var.VAR_NULL;

   public Var call() throws Exception {

    requisicao =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/json"),
    Var.valueOf(
    Var.valueOf("https://retoolapi.dev/UJbHah/data?_page=").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.paginainput4374")).toString() +
    Var.valueOf("_limit=").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.Limiteinput43741321")).toString()),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("page",
    Var.valueOf("2")) , Var.valueOf("limit",
    Var.valueOf("10"))), Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY"));

    System.out.println(requisicao.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

