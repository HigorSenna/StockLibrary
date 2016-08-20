var i = 0;
$("#botaoAdicionarParagrafo").click(function(){
	var id = "id = textAreaConteudo"+i;
	var textArea = "Paragrafo:"+ (i+1) +"<textarea class='form-control' rows='20' style='height: 39%; width: 52%;'" + id + ">";
	$("#divCadastroMaterial").append("<br />" + textArea);
	i++;
});

$("#botaoCadastroMaterial").click(function(){
	'#{cadastroMaterialController.salvar()}';
});
