window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BancosList = window.blockly.js.blockly.BancosList || {};

/**
 * Describe this function...
 */
window.blockly.js.blockly.BancosList.closeModalList = function() {
 var dataFim, dataInicio, gradeSelecionada;
  this.cronapi.screen.hideComponent("crn-text-component-nome");
  this.cronapi.screen.hideModal("modalListOptions");
}

/**
 * Describe this function...
 */
window.blockly.js.blockly.BancosList.openModalList = function() {
 var dataFim, dataInicio, gradeSelecionada;
  this.cronapi.screen.showModal("modalListOptions");
}

/**
 * BancosList
 */
window.blockly.js.blockly.BancosList.loadBancosList = function() {
 var dataFim, dataInicio, gradeSelecionada;
  dataInicio = this.blockly.js.blockly.UtilJS.getDateDaysToIncrease(-1);
  dataFim = this.blockly.js.blockly.UtilJS.getDateDaysToIncrease(1);
  console.log(dataInicio);
  console.log(dataInicio);
  this.cronapi.screen.changeValueOfField("vars.dataInicio", dataInicio);
  this.cronapi.screen.changeValueOfField("vars.datafim", dataFim);
}

/**
 * Describe this function...
 */
window.blockly.js.blockly.BancosList.geraDados = function() {
 var dataFim, dataInicio, gradeSelecionada;
  this.cronapi.screen.hideModal("modalListOptions");
  this.cronapi.screen.hideComponent("cron-crn-grid-search");
  this.cronapi.screen.showComponent("crn-text-component-nome");
  gradeSelecionada = this.cronapi.screen.getValueOfField("vars.comboboxGrade");
  if (gradeSelecionada == 1) {
    this.cronapi.screen.showComponent("crn-cron-grid-orcl-tablespace");
  }
  if (gradeSelecionada == 2) {
    this.cronapi.screen.showComponent("crn-cron-grid-orcl-lock-session");
  }
  if (gradeSelecionada == 3) {
    this.cronapi.screen.showComponent("crn-cron-grid-orcl-waits");
  }
}

/**
 * Describe this function...
 */
window.blockly.js.blockly.BancosList.closeGrid = function() {
 var dataFim, dataInicio, gradeSelecionada;
  this.cronapi.screen.hideComponent("crn-text-component-nome");
  this.cronapi.screen.hideComponent("crn-cron-grid-orcl-tablespace");
  this.cronapi.screen.hideComponent("crn-cron-grid-orcl-lock-session");
  this.cronapi.screen.hideComponent("crn-cron-grid-orcl-waits");
  this.cronapi.screen.showComponent("cron-crn-grid-search");
}
