window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoMascaraCliente = window.blockly.js.blockly.BlocoMascaraCliente || {};

/**
 * BlocoMascara
 */
window.blockly.js.blockly.BlocoMascaraCliente.ExecutarArgs = [];
window.blockly.js.blockly.BlocoMascaraCliente.Executar = async function() {
 var item;
  item = this.cronapi.screen.getValueOfField("vars.combobox9691");
  console.log(item);
  if (item == 1) {
    this.cronapi.screen.changeValueOfField("vars.input4389", ' ');
    this.cronapi.screen.changeAttrValue("input4389", 'mask', '(99) 99999-9999;0');
    (await this.cronapi.screen.recompileComponent("input4389"));
  } else if (item == 2) {
    this.cronapi.screen.changeValueOfField("vars.input4389", ' ');
    this.cronapi.screen.changeAttrValue("input4389", 'mask', '9-9999;0');
    (await this.cronapi.screen.recompileComponent("input4389"));
  }
}
