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
public static Var ExecutarRelatorio() throws Exception {
 return new Callable<Var>() {

   private Var i = Var.VAR_NULL;

   public Var call() throws Exception {

    i =
    Var.valueOf(1);

    for (long count = 0; count <
    Var.valueOf(200).getObjectAsLong();count++) {

        i =
        cronapi.math.Operations.sum(i,
        Var.valueOf(1));

        cronapi.database.Operations.insert(Var.valueOf("app.entity.Relatorio"),Var.valueOf("nome",i),Var.valueOf("id",
        cronapi.util.Operations.generateUUID()));
    } // end for
    return Var.VAR_NULL;
   }
 }.call();
}

}

