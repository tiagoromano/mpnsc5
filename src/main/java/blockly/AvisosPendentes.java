package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AvisosPendentes {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entity
 * @return Var
 */
// AvisosPendentes
public static Var getAvisos24horas(Var Entity) throws Exception {
 return new Callable<Var>() {

   private Var tipoAlerta = Var.VAR_NULL;
   private Var data = Var.VAR_NULL;
   private Var alerId = Var.VAR_NULL;
   private Var bancId = Var.VAR_NULL;

   public Var call() throws Exception {
    tipoAlerta = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("tipoAlerta"));
    data = Var.VAR_NULL;
    if (Var.valueOf(tipoAlerta.equals(Var.valueOf(1))).getObjectAsBoolean()) {
        alerId = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("alerId"));
        bancId = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("codiBanc"));
        data = cronapi.database.Operations.query(Var.valueOf("base.entity.VwPolomsgAvisos"),Var.valueOf("select COUNT(v) from VwPolomsgAvisos v where v.codiBanc = :bancId AND v.alerId = :alerId AND v.dataAviso >= :dataAviso"),Var.valueOf("bancId",bancId),Var.valueOf("alerId",alerId),Var.valueOf("dataAviso",blockly.Util.getDateDaysToIncrease(Var.valueOf(-1))));
    }
    return data;
   }
 }.call();
}

/**
 *
 * @param Entity
 * @return Var
 */
// AvisosPendentes
public static Var getCiente(Var Entity) throws Exception {
 return new Callable<Var>() {

   private Var ciente = Var.VAR_NULL;

   public Var call() throws Exception {
    ciente = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("ciente"));
    return blockly.Util.getYesNo(ciente);
   }
 }.call();
}

/**
 *
 * @param Entity
 * @return Var
 */
// AvisosPendentes
public static Var getIconeBanco(Var Entity) throws Exception {
 return new Callable<Var>() {

   private Var tipoBanco = Var.VAR_NULL;

   public Var call() throws Exception {
    tipoBanco = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("tipoBanco"));
    return blockly.Util.getTipoBanco(tipoBanco);
   }
 }.call();
}

/**
 *
 * @param Entity
 * @param size
 * @return Var
 */
// AvisosPendentes
public static Var getMensagemGrade(Var Entity, Var size) throws Exception {
 return new Callable<Var>() {

   private Var mensagem = Var.VAR_NULL;

   public Var call() throws Exception {
    mensagem = cronapi.object.Operations.getObjectField(Entity, Var.valueOf("msgErro"));
    return blockly.Util.setLimitsText(mensagem, size);
   }
 }.call();
}

/**
 */
// Describe this function...
public static void doRefresh() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"), Var.valueOf("VwPolomsgAvisos"), Var.valueOf("true"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Describe this function...
public static void setCientePoloMsgAvisos() throws Exception {
  new Callable<Var>() {

   private Var ciente = Var.VAR_NULL;
   private Var cienteAux = Var.VAR_NULL;

   public Var call() throws Exception {
    ciente = cronapi.screen.Operations.getValueOfField(Var.valueOf("VwPolomsgAvisos.active.ciente"));
    if (Var.valueOf(ciente.equals(Var.valueOf("N"))).getObjectAsBoolean()) {
        ciente = Var.valueOf("S");
    } else {
        ciente = Var.valueOf("N");
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("VwPolomsgAvisos.active.ciente"), ciente);
    cienteAux = blockly.Util.getYesNo(ciente);
    cienteAux.append(Var.valueOf("*").toString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("VwPolomsgAvisos.active.cienteAux"), cienteAux);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("VwPolomsgAvisos.active.usuaCodigo"), blockly.Util.getIdUserSATO());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"), Var.valueOf("VwPolomsgAvisos"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

