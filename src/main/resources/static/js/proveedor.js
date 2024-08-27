$(document).ready(function(){
	$('body').on('click', '.editarProveedor',function(){
		$('#id').val($(this).attr('id'));
		$('#txtRaz').val($(this).attr('param1'));
		$('#txtRuc').val($(this).attr('param2'));
		$('#txtDir').val($(this).attr('param3'));
		$('#txtTel').val($(this).attr('param4'));
		$('#txtCon').val($(this).attr('param5'));
	})
});