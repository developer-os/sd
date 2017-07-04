var LoginCollecton = LoginCollecton || {};
LoginCollecton.Data = LoginCollecton.Data || {};
$(document).ready(function() {
	$('button').click(function() {
		var usernmae = $('#username').val();
		var password = $('#password').val();
		var url = 'login';
		var dataj = {
			'loginName': usernmae,
			'password': password
		};
		$.ajax({
			type:'POST',
			url: url,
			contentType: 'application/json;charset=utf-8',
			dataType: 'json',
			data: JSON.stringify(dataj),
			success: function(data) {
				alert(data);
			},
			error: function() {

			}
		})

	});

});
