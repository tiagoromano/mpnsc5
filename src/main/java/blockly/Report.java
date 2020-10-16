package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Report {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Report
public static Var Execute() throws Exception {
 return new Callable<Var>() {

   private Var bancId = Var.VAR_NULL;
   private Var dataInicio = Var.VAR_NULL;
   private Var dataFim = Var.VAR_NULL;

   public Var call() throws Exception {

    bancId =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("VwBancos.active.id"));

    dataInicio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dataInicio"));

    dataFim =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.datafim"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.util.openReport"),
    Var.valueOf("reports/oraclePerformance.report"), cronapi.list.Operations.newList(Var.valueOf("dataInicioReport" ,
    cronapi.dateTime.Operations.formatDateTime(dataInicio,
    Var.valueOf("dd/MM/yyyy HH:mm"))) , Var.valueOf("dataFimReport" ,
    cronapi.dateTime.Operations.formatDateTime(dataFim,
    Var.valueOf("dd/MM/yyyy HH:mm"))) , Var.valueOf("totalAlocadoDb" , Var.VAR_NULL) , Var.valueOf("delta" , Var.VAR_NULL) , Var.valueOf("totalDelta" , Var.VAR_NULL) , Var.valueOf("totalAlocado" , Var.VAR_NULL) , Var.valueOf("deltaAno" , Var.VAR_NULL) , Var.valueOf("ultimoValor" , Var.VAR_NULL) , Var.valueOf("bancId" , bancId) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("bancId" , bancId) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim)));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Report
public static Var ExecuteOrclMapArchive() throws Exception {
 return new Callable<Var>() {

   private Var bancId = Var.VAR_NULL;
   private Var dataInicio = Var.VAR_NULL;
   private Var dataFim = Var.VAR_NULL;

   public Var call() throws Exception {

    bancId =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("VwBancos.active.id"));

    dataInicio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dataInicio"));

    dataFim =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.datafim"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.util.openReport"),
    Var.valueOf("reports/oracleMapArchive.report"), cronapi.list.Operations.newList(Var.valueOf("dataInicioReport" ,
    cronapi.dateTime.Operations.formatDateTime(dataInicio,
    Var.valueOf("dd/MM/yyyy HH:mm"))) , Var.valueOf("dataFimReport" ,
    cronapi.dateTime.Operations.formatDateTime(dataFim,
    Var.valueOf("dd/MM/yyyy HH:mm"))) , Var.valueOf("bancId" , bancId) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("datafim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim) , Var.valueOf("bancId" , bancId) , Var.valueOf("dataInicio" , dataInicio) , Var.valueOf("dataFim" , dataFim)));
    return Var.VAR_NULL;
   }
 }.call();
}

}

