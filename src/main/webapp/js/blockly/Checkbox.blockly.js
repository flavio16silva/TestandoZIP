window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Checkbox = window.blockly.js.blockly.Checkbox || {};

/**
 * Checkbox
 */
window.blockly.js.blockly.Checkbox.ExecutarArgs = [];
window.blockly.js.blockly.Checkbox.Executar = async function() {
 var item;
  item = this.cronapi.screen.getValueOfField("vars.grid51955");
  console.log(item);
}
