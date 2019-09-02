$(document).on('click', '.mod_row', function(event){
  var row = $(this).parents('tr');
  var td0 = row.find('td').eq(0);
  var td1 = row.find('td').eq(1);
  var td2 = row.find('td').eq(2);

  var td0_string = td0.text();
  var td1_string = td1.text();
  var td2_string = td2.text();
  
//  var input_tag0 = $('<input type="text" />');
//  td0.html(input_tag0);
//  input_tag0.val(td0_string);

  var input_tag1 = $('<input type="text" />');
  td1.html(input_tag1);
  input_tag1.val(td1_string);

  var input_tag2 = $('<input type="text" />');
  td2.html(input_tag2);
  input_tag2.val(td2_string);
 
  var td3 = $(this).parents('tr').find('td').eq(3);
  td3.find('.mod_row').hide();
  td3.find('.mod_done').show();
});


$(document).on('click', '.search', function(event){
	var keyword = $(this).parents('div').find('input').val();
	$.ajax({
	    url:'/wow/search',
	    type: 'post',
	    data: {
	    	keyword: keyword
	    },
	    success:function(data){
	    $('table').find('tbody').html('');
	       for(var i = 0; i < data.length; i++) {
	           $html_string = '<tr>';
	           $html_string = $html_string + '<td>' + data[i]['idx'] + '</td>';
	           $html_string = $html_string + '<td>' + data[i]['name'] + '</td>';
	           $html_string = $html_string + '<td>' + data[i]['address'] + '</td>';
	           $html_string = $html_string + '<td><button class="mod_row">수정하기</button><button class="mod_done">수정완료</button></td>';
	           $html_string = $html_string + '<td><button class="delete">삭제하기</butto></td>';
	           $html_string = $html_string + '</tr>';
	           $('table').append($html_string);
	         }
	         console.log(data);
	    }
    });
});
	 

$(function(){
  $.ajax({
           url:'/wow/user_info',
           success:function(data){
           for(var i = 0; i < data.length; i++) {
               $html_string = '<tr>';
               $html_string = $html_string + '<td>' + data[i]['idx'] + '</td>';
               $html_string = $html_string + '<td>' + data[i]['name'] + '</td>';
               $html_string = $html_string + '<td>' + data[i]['address'] + '</td>';
               $html_string = $html_string + '<td><button class="mod_row">수정하기</button><button class="mod_done">수정완료</button></td>';
               $html_string = $html_string + '<td><button class="delete">삭제하기</butto></td>';
               $html_string = $html_string + '</tr>';
               $('table').append($html_string);
             }
             console.log(data);
           }
       });
});

$(document).on('click', '.mod_done', function(event){
	var idx = $(this).parents('tr').find('td').eq(0).text();
	var name = $(this).parents('tr').find('td').eq(1).find('input').val();
	var address = $(this).parents('tr').find('td').eq(2).find('input').val();
	$.ajax({
	    url:'/wow/update',
	    type: 'post',
	    data: {
	    	idx : idx,
	    	name : name,
	    	address : address
	    },
	    success:function(data){
	    	//새로고침 역할!!
	      location.reload();
	    }
	});
});

$(document).on('click', '.new_row', function(event){
	 $html_string = '<tr>';
     $html_string = $html_string + '<td></td>';
     $html_string = $html_string + '<td>' + '<input type="text" />' + '</td>';
     $html_string = $html_string + '<td>' + '<input type="text" />' + '</td>';
     $html_string = $html_string + '<td><button class="insert">입력완료</button></td>';
     $html_string = $html_string + '</tr>';
     $('table').append($html_string);
});

$(document).on('click', '.insert', function(event){
	var name = $(this).parents('tr').find('td').eq(1).find('input').val();
	var address = $(this).parents('tr').find('td').eq(2).find('input').val();
	$.ajax({
	    url:'/wow/insert',
	    type: 'post',
	    data: {
	    	name : name,
	    	address : address
	    },
	    success:function(data){
	    	//새로고침 역할!!
	      location.reload();
	    }
	});
});

$(document).on('click', '.delete', function(event){
	var idx = $(this).parents('tr').find('td').eq(0).text();
	$.ajax({
	    url:'/wow/delete',
	    type: 'post',
	    data: {
	    	idx: idx
	    },
	    success:function(data){
	    	//새로고침 역할!!
	      location.reload();
	    }
	});
});

