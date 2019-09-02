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