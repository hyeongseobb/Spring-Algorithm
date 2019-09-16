$(function(){
  $.ajax({
       url:'/wow/post_details',
       data:{
    	 'idx': idx
       },
       success:function(data){
    	   $('h3').text(data['title']);
    	   $('#de').html(data['description']);
    	   var editor = new tui.Editor({
    		   el: document.querySelector('#de'),
    		   initialEditType: 'markdown',
    		   previewStyle: 'vertical',
    		   height: '300px'
    	   });
//             console.log(data);
       }
   });
});


//$(document).on('click', '.submit_button', function(event){
//	var idx = $(this).parents('tr').find('td').eq(0).text();
//	$.ajax({
//	    url:'/wow/post_update',
//	    type: 'post',
//	    data: {
//	    	idx: idx
//	    },
//	    success:function(data){
//	    	//새로고침 역할!!
//	      location.href
//	    }
//	});
//});