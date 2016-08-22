window.i = 0;
$("#botaoAdicionarParagrafo").click(function(){
	var id = "id = textAreaConteudo"+i;
	var textArea = "Paragrafo:"+ (i+1) +"<textarea class='form-control' rows='20' style='height: 39%; width: 52%;'" + id + ">";
	$("#divCadastroMaterial").append("<br />" + textArea);	
	i++;	
});

function prepararInsercao() {
	var textoCompleto ="<p> " + $("#textAreaConteudo").val() + " </p>";
	for(j = 0;j < window.i ;j++){		
		var idCompleto = "#textAreaConteudo"+j;
		textoCompleto += "<p> " +  $(idCompleto).val() + " </p>";
	}
	alert(textoCompleto);	
  
  $("#textoCompleto").val(textoCompleto); 
  
  $("#botaoCadastroMaterialHidden").click();
}
