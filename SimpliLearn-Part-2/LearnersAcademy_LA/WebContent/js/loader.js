$(document).ready(function(){
	$("#remoteContent").load("remote-load/helparea.html");
});

$("#leftNav a").click(function(event){
	var page = $(this).attr('href');
	$("#remoteContent").load("remote-load/"+page);
	return false;
});