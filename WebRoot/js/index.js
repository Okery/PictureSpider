$(document).ready(function(){
	$("#search").click(function(){
		var url = $("#url").val();
		$.ajax({
			url:"spider2/search",
			data:
				{
				url:url
				},
			type:"post",
			success:function(){
				alert("成功");
			}
		});
	});
});