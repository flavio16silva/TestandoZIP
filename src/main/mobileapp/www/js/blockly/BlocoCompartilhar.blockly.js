window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoCompartilhar = window.blockly.js.blockly.BlocoCompartilhar || {};

/**
 * BlocoCompartilhar
 */
window.blockly.js.blockly.BlocoCompartilhar.CompartilharMobileArgs = [];
window.blockly.js.blockly.BlocoCompartilhar.CompartilharMobile = async function() {
 var item;
  console.log('Entrou');
  item = this.cronapi.util.share('Teste', 'Teste', 'www.google.com');
  console.log('Saiu');
}
