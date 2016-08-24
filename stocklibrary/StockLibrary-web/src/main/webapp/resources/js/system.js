window.i = 0;
window.espacoParagrafo="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";

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
	if(isCampoValido($("#textAreaConteudo").val())){
		var textoCompleto ="<p>"+espacoParagrafo + $("#textAreaConteudo").val() + "</p>";
	}
	
	for(j = 1;j <= window.i;j++){		
		var idCompleto = "#textAreaConteudo"+j;
		
		if(isCampoValido($(idCompleto).val())){
			textoCompleto += "<p>"+espacoParagrafo +  $(idCompleto).val() + "</p>";
		}
	}
	
	  $("#Conteudo").val(textoCompleto); 
	  
	  $("#botaoCadastroMaterialHidden").click();
	  setTimeout(function() {$('#message').hide(1000);}, 5000);
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

function isCampoValido(campo){
	if(trim(campo) != ""){
		return true;
	}
	return false;
}

function trim(str) {
	return str.replace(/^\s+|\s+$/g,"");
}