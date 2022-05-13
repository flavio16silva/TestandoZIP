package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Salvar1 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Salvar
public static Var MoverRenomear() throws Exception {
 return new Callable<Var>() {

   private Var dadosArquivo = Var.VAR_NULL;
   private Var info = Var.VAR_NULL;
   private Var trasfere = Var.VAR_NULL;
   private Var renomeia = Var.VAR_NULL;

   public Var call() throws Exception {

    dadosArquivo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.arquivoDinamico"));

    info =
    cronapi.json.Operations.toJson(dadosArquivo);

    trasfere =
    cronapi.io.Operations.fileMove(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().toString() +
    cronapi.io.Operations.fileSeparator().toString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("path")).toString()),
    cronapi.io.Operations.fileAppDir());

    if (trasfere.getObjectAsBoolean()) {

        renomeia =
        cronapi.io.Operations.fileRename(
        Var.valueOf(
        cronapi.io.Operations.fileAppDir().toString() +
        cronapi.io.Operations.fileSeparator().toString() +
        cronapi.json.Operations.getJsonOrMapField(info,
        Var.valueOf("path")).toString()),
        Var.valueOf(
        cronapi.json.Operations.getJsonOrMapField(info,
        Var.valueOf("name")).toString() +
        cronapi.json.Operations.getJsonOrMapField(info,
        Var.valueOf("fileExtension")).toString()));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

