window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.TryCatch = window.blockly.js.blockly.TryCatch || {};

/**
 * TryCatch
 */
window.blockly.js.blockly.TryCatch.FonteDeDadosArgs = [];
window.blockly.js.blockly.TryCatch.FonteDeDados = async function() {
 var teste, nova, lista, excecao, resultado;
  lista = ['a', 'b'];
  try {
     resultado = lista[4];
   } catch (excecao_exception) {
        excecao = excecao_exception;
     this.cronapi.util.throwException(excecao);
    console.log(String('Não foi confirmado') + String(excecao));
   } finally {
     console.log(String('O valor é:') + String(resultado));
  }
}
