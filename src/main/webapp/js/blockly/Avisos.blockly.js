window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Avisos = window.blockly.js.blockly.Avisos || {};

/**
 * Avisos
 */
window.blockly.js.blockly.Avisos.closeFilter = function() {
 var item, dataFim, dataInicio;
  this.cronapi.screen.hideModal("modal4338");
}

/**
 * Avisos
 */
window.blockly.js.blockly.Avisos.closeDetail = function() {
 var item, dataFim, dataInicio;
  this.cronapi.screen.hideModal("modal98827");
}

/**
 * Avisos
 */
window.blockly.js.blockly.Avisos.openFilter = function() {
 var item, dataFim, dataInicio;
  dataInicio = this.cronapi.screen.getValueOfField("vars.dataInicio1224");
  dataFim = this.cronapi.screen.getValueOfField("vars.dataFim5946");
  if (this.cronapi.logic.isNullOrEmpty(dataInicio)) {
    this.cronapi.screen.changeValueOfField("vars.dataInicio1224", this.blockly.js.blockly.UtilJS.getDateDaysToIncrease(-30));
  }
  if (this.cronapi.logic.isNullOrEmpty(dataFim)) {
    this.cronapi.screen.changeValueOfField("vars.dataFim5946", this.blockly.js.blockly.UtilJS.getDateDaysToIncrease(1));
  }
  this.cronapi.screen.showModal("modal4338");
}

/**
 * Avisos
 */
window.blockly.js.blockly.Avisos.openDetail = function() {
 var item, dataFim, dataInicio;
  this.cronapi.screen.showModal("modal98827");
}

/**
 * Describe this function...
 */
window.blockly.js.blockly.Avisos.setPrimaryFilter = function() {
 var item, dataFim, dataInicio;
  this.cronapi.screen.changeValueOfField("vars.ciente7276", 'N');
  this.cronapi.screen.changeValueOfField("vars.dataInicio1224", this.blockly.js.blockly.UtilJS.getDateDaysToIncrease(-30));
  this.cronapi.screen.changeValueOfField("vars.dataFim5946", this.blockly.js.blockly.UtilJS.getDateDaysToIncrease(1));
  this.cronapi.screen.changeValueOfField("vars.tipoAlerta", 1);
}
