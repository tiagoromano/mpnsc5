package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Util {

public static final int TIMEOUT = 300;

/**
 *
 * @param tipoBanco
 * @return Var
 */
// Avisos
public static Var getTipoBanco(Var tipoBanco) throws Exception {
 return new Callable<Var>() {

   private Var urlBase = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;
   private Var fim = Var.VAR_NULL;

   public Var call() throws Exception {
    urlBase = Var.valueOf("<img src=\"views/public/imgs/");
    if (Var.valueOf(tipoBanco.equals(Var.valueOf(1))).getObjectAsBoolean()) {
        item = Var.valueOf("database_oracle.png");
    } else if (Var.valueOf(tipoBanco.equals(Var.valueOf(2))).getObjectAsBoolean()) {
        item = Var.valueOf("database_sql.png");
    } else if (Var.valueOf(tipoBanco.equals(Var.valueOf(3))).getObjectAsBoolean()) {
        item = Var.valueOf("database_postgre.png");
    } else if (Var.valueOf(tipoBanco.equals(Var.valueOf(4))).getObjectAsBoolean()) {
        item = Var.valueOf("database_mysql.png");
    }
    fim = Var.valueOf("\">");
    urlBase.append(item.toString());
    urlBase.append(fim.toString());
    return urlBase;
   }
 }.call();
}

/**
 *
 * @param days
 * @return Var
 */
// Describe this function...
public static Var getDateDaysToIncrease(Var days) throws Exception {
 return new Callable<Var>() {

   private Var flag = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.dateTime.Operations.incDay(cronapi.dateTime.Operations.getNowNoHour(), days);
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Describe this function...
public static Var getIdUserSATO() throws Exception {
 return new Callable<Var>() {

   private Var usuaCodigo = Var.VAR_NULL;

   public Var call() throws Exception {
    usuaCodigo = cronapi.database.Operations.query(Var.valueOf("base.entity.UsuariosSato"),Var.valueOf("select u.id from UsuariosSato u where u.email = :email"),Var.valueOf("email",cronapi.util.Operations.getCurrentUserName()));
    if (cronapi.logic.Operations.isNullOrEmpty(usuaCodigo).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"), Var.valueOf("Usuário não identificado no SATO"));
    }
    return usuaCodigo;
   }
 }.call();
}

/**
 *
 * @param flag
 * @return Var
 */
// Describe this function...
public static Var getYesNo(Var flag) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    if (Var.valueOf(Var.valueOf(flag.getObjectAsString().toUpperCase()).equals(Var.valueOf("S"))).getObjectAsBoolean()){
      return Var.valueOf("SIM");
    }
    return Var.valueOf("NÃO");
   }
 }.call();
}

/**
 *
 * @param param_text
 * @param size
 * @return Var
 */
// Describe this function...
public static Var setLimitsText(Var param_text, Var size) throws Exception {
 return new Callable<Var>() {

   // param
   private Var text = param_text;
   // end

   public Var call() throws Exception {
    if (Var.valueOf(Var.valueOf(text.length()).compareTo(size) > 0).getObjectAsBoolean()) {
        text = cronapi.text.Operations.getLettersFromFirstToFromStart(text,size);
        text.append(Var.valueOf("...").toString());
    }
    return text;
   }
 }.call();
}

}

