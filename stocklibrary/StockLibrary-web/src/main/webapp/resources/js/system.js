window.i = 0;
$("#botaoAdicionarParagrafo").click(function(){
	i++;
	var id = "id = textAreaConteudo"+i;
	var tagH5 = "<h5 id=paragrafo" + i + "> Paragrafo:"+ i +"</h5>";
	var aberturaTagTextArea = "<textarea class='form-control' rows='20' style='height: 39%; width: 52%;'";
	var fechamentoTagTextArea = "/>";
	
	var textAreaFinal = tagH5 + aberturaTagTextArea + id + fechamentoTagTextArea;
	$("#divCadastroMaterial").append(textAreaFinal);	
});

function prepararInsercao() {
	var textoCompleto ="<p> " + $("#textAreaConteudo").val() + " </p>";
	for(j = 1;j <= window.i;j++){		
		var idCompleto = "#textAreaConteudo"+j;
		textoCompleto += "<p> " +  $(idCompleto).val() + " </p>";
	}
	alert(textoCompleto);	
  
  $("#textoCompleto").val(textoCompleto); 
  
  $("#botaoCadastroMaterialHidden").click();
}

function removerParagrafo(){
	if(i > 0){
		var idTextoCompleto = "#textAreaConteudo"+(i);
		$(idTextoCompleto).remove();
		$("#paragrafo"+i).remove();
		$("#espacoText"+i).remove();
		window.i = i-1;
	}
}
