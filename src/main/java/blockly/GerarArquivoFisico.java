package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GerarArquivoFisico {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Gerar
public static Var GerarArquivo() throws Exception {
 return new Callable<Var>() {

   private Var link = Var.VAR_NULL;
   private Var texto = Var.VAR_NULL;
   private Var arquivo = Var.VAR_NULL;

   public Var call() throws Exception {

    link =
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().toString() +
    cronapi.io.Operations.fileSeparator().toString() +
    Var.valueOf("novoArquivo.txt").toString());

    texto =
    Var.valueOf("Testando arquivo físico.");

    arquivo =
    cronapi.io.Operations.fileOpenToWrite(link, texto);

    cronapi.io.Operations.fileDownload(link);
    return Var.VAR_NULL;
   }
 }.call();
}

}

