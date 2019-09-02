
$(document).on('click', '.user_info', function(event){
	$.ajax({
		url:'/wow/user_info',
		success:function(data){
			console.log(data);
			$('p').html(JSON.stringify(data));
		}
	});
});