window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoCompartilhar = window.blockly.js.blockly.BlocoCompartilhar || {};

/**
 * BlocoCompartilhar
 */
window.blockly.js.blockly.BlocoCompartilhar.ExecutarArgs = [];
window.blockly.js.blockly.BlocoCompartilhar.Executar = async function() {
 var item;
  console.log('Entrou');
  item = this.cronapi.util.share('Teste', 'Compartilhar', 'www.google.com');
}
