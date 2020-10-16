package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EmailSistema {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entity
 * @param size
 * @return Var
 */
// EmailSistema
public static Var getCorpoEmailGrade(Var Entity, Var size) throws Exception {
 return new Callable<Var>() {

   private Var corpoEmail = Var.VAR_NULL;

   public Var call() throws Exception {
    corpoEmail = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("corpoEmail"));
    return blockly.Util.setLimitsText(corpoEmail, size);
   }
 }.call();
}

/**
 *
 * @param Entity
 * @return Var
 */
// EmailSistema
public static Var getFlgEnviadoDescricao(Var Entity) throws Exception {
 return new Callable<Var>() {

   private Var flgEnviado = Var.VAR_NULL;

   public Var call() throws Exception {
    flgEnviado = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("flgEnviado"));
    return blockly.Util.getYesNo(flgEnviado);
   }
 }.call();
}

}

