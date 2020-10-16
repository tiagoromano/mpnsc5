window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.UtilJS = window.blockly.js.blockly.UtilJS || {};

/**
 * UtilJS
 */
window.blockly.js.blockly.UtilJS.getDateDaysToIncrease = function(days) {
 var item, x;
  return this.cronapi.dateTime.incDay(this.cronapi.dateTime.getNow(), days);
}
