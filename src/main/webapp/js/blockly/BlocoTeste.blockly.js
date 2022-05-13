window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoTeste = window.blockly.js.blockly.BlocoTeste || {};

/**
 * BlocoTeste
 */
window.blockly.js.blockly.BlocoTeste.ExecutarArgs = [];
window.blockly.js.blockly.BlocoTeste.Executar = async function() {
 var item;
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.BlocoRetorno:Executar', async function(sender_item) {
      item = sender_item;
    console.log(item);
  }.bind(this));
  this.cronapi.notification.customNotify('error', 'testando', 'fade', 'top', 'left', 'true');
}
