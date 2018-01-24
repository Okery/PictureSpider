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
			success:function(data){
				//alert(data.message);
				//判断后台是否出现异常
				//出现异常则给出提示
				if(data.flag==1){
					alert("此地址无法访问！");
				}else{
					$(".result").show();
					for(var i =0;i<data.pictures.length;i++){
						alert(data.pictures[i].src);
						$("div[class='result']").append(
									"<div class=\"item\"><img alt=\"\" src=\""+data.pictures[i].src+"\"></div>"
								);
					}
					alert("ss");
				}
			}
		});
	});
});