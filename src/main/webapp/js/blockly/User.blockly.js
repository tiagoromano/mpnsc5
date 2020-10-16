window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.User = window.blockly.js.blockly.User || {};

/**
 * Describe this function...
 */
window.blockly.js.blockly.User.setLogin = function() {
 var item, email, login;
  email = this.cronapi.screen.getValueOfField("User.active.email");
  login = this.cronapi.screen.getValueOfField("User.active.login");
  if (!this.cronapi.logic.isNullOrEmpty(login) || login != 'admin') {
    this.cronapi.screen.changeValueOfField("User.active.login", email);
  }
  this.cronapi.screen.post("User");
}

/**
 * User
 */
window.blockly.js.blockly.User.getListSato = function() {
 var item, email, login;
  this.cronapi.screen.showModal("modal1615");
}

/**
 * Describe this function...
 */
window.blockly.js.blockly.User.closeModalSato = function() {
 var item, email, login;
  this.cronapi.screen.hideModal("modal1615");
}
