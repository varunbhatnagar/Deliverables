<!-- JAVASCRIPT FOR VIEWING THE IMAGES INJ LARGE FORM-->
var plusimageviewer={
	enlargeboxmarkup: '<div class="enlargebox"><div class="title"><img src="closebox.gif" style="margin: 2px 1px 1px 0" title="Hide Image"  /></div><div class="largeimage"></div></div>',
	captionoffset: [-5, -15], //additional offset of caption relative to bottom left edge of image
	fadeduration: [300, 100], //fade in and out duration, in milliseconds
	//////////NO NEED TO EDIT BEYOND HERE/////////////

	pluscontainers:[],
	$enlargebox: null,
	boxzindex:100,

getcaptionposition:function($img){
	var offsets=$img.offset()
	return [offsets.left+this.captionoffset[0], offsets.top+$img.outerHeight()+this.captionoffset[1]] //return position of caption relative to thumb image
},

getlargeimgposition:function($, $enlargebox){
	var boxdimensions=[$enlargebox.outerWidth(), $enlargebox.outerHeight()]
	var docdimensions=[$(window).width(), $(window).height()]
	var docscrollpos=[$(document).scrollLeft(), $(document).scrollTop()]
	var leftpos=(docdimensions[0]>boxdimensions[0])? docscrollpos[0]+docdimensions[0]/2-boxdimensions[0]/2 : docscrollpos[0]+1 //center large image horizontally
	var toppos=(docdimensions[1]>boxdimensions[1])? docscrollpos[1]+docdimensions[1]/2-boxdimensions[1]/2 : docscrollpos[1]+1
	return [leftpos, toppos]
},

showimage:function($, $img){
	var pluscontainer=this.pluscontainers[$img.data('order')]
	pluscontainer.$enlargearea.empty().html('<img src="'+pluscontainer.enlargesrc+'" style="width:'+pluscontainer.enlargesize[0]+';" height:'+pluscontainer.enlargesize[1]+'" />')
	var largeimgpos=this.getlargeimgposition($, pluscontainer.$enlargebox)
	pluscontainer.$enlargebox.css({zIndex:++this.boxzindex, display:'none', left:largeimgpos[0], top:largeimgpos[1]}).fadeIn(this.fadeduration[0])
},

init:function($, $img){
	var captionpos=this.getcaptionposition($img)
	var $caption=$('<div class="enlargecaption"><a href="#">View Full Image</a></div>').css({left:captionpos[0], top:captionpos[1]}).appendTo(document.body)
	var $enlargebox=$(this.enlargeboxmarkup).appendTo(document.body)
	var $enlargearea=$enlargebox.find('.largeimage:eq(0)') //reference DIV that will contain actual enlarged image
	var enlargesrc=$img.attr('data-plusimage')
	var enlargesize=$img.attr('data-plussize').split(',') //get dimensions of large image as string
	enlargesize=[parseInt(enlargesize[0]), parseInt(enlargesize[1])] //get dimensions of large image as array [w, h]
	$caption.click(function(e){ //open large image when caption is clicked on
		plusimageviewer.showimage($, $img, e)
		e.preventDefault()
		e.stopPropagation()
	})
	$enlargebox.click(function(e){
		e.stopPropagation()
	}).find('div.title img:eq(0)').click(function(){ //close image box when "x" icon is clicked on
		$enlargebox.fadeOut(plusimageviewer.fadeduration[1])
	})
	this.pluscontainers.push({$img:$img, $caption:$caption, captionpos:captionpos, $enlargebox:$enlargebox, $enlargearea:$enlargearea, enlargesrc:enlargesrc, enlargesize:enlargesize})
}

}

jQuery(document).ready(function($){
	var $targetimages=$('img[data-plusimage]')
	$targetimages.each(function(i){
		var $img=$(this).data('order', i)
		plusimageviewer.init($, $(this), i)
	})
	if ($targetimages.length>0){
		$(document).click(function(){ //hide all plus size images when document is clicked
			var pluscontainers=plusimageviewer.pluscontainers
			for (var i=0; i<pluscontainers.length; i++){
				pluscontainers[i].$enlargebox.hide()
			}
		})
		$(window).bind('resize', function(){ //hide all plus size images when document is clicked
			var pluscontainers=plusimageviewer.pluscontainers
			for (var i=0; i<pluscontainers.length; i++){
				var captionpos=plusimageviewer.getcaptionposition(pluscontainers[i].$img)
				pluscontainers[i].captionpos=[captionpos[0], captionpos[1]] //refresh caption position
				pluscontainers[i].$caption.css({left:pluscontainers[i].captionpos[0], top:pluscontainers[i].captionpos[1]}) //reposition captions when window resized
			}
		})		
	}

})






rahul={p:0,x:0,y:0,w:0,h:0,r:0,v:0,s:0,isVertical:0,a1:0,a2:0,a3:0,color:'#ffffff',colorover:'#ffffff',backgroundcolor:'#0099ff',backgroundcolorover:'#000000',bordercolor:'#000000',fontsize:20,fontfamily:'Arial',pas:0,ordermenu:function(){this.p=this.r/this.s;this.a1=this.a2=this.isVertical?0:Math.PI/2},ordermenuitem:function(a7,a6,a5){a4=" onclick='window.open(\""+a6+"\""+(a5?(",\""+a5+"\""):",\"_self\"")+")'";document.write("<div id='ordermenu"+this.a3+"' style='cursor:pointer;cursor:expression(\"hand\");position:absolute;width:"+this.w+"px;left:"+this.h+"px;"+"background-color:"+this.backgroundcolor+";color:"+this.color+";border:1px solid "+this.bordercolor+";font:normal "+this.fontsize+"px "+this.fontfamily+";text-align:center;cursor:default;z-Index:1000;' onmouseover='this.style.color=\""+this.colorover+"\";this.style.backgroundColor=\""+this.backgroundcolorover+"\"'"+	"onmouseout='this.style.color=\""+this.color+"\";this.style.backgroundColor=\""+this.backgroundcolor+"\"'"+a4+">"+a7+"</div>");this.a3++},muta:function(){a8=document.getElementById("controale");for(i=0;i<this.a3;i++){a9=document.getElementById("ordermenu"+i+"");a9s=a9.style;if(this.isVertical){xi=parseInt(this.r*Math.cos(this.a1+i*this.pas))/this.s;yi=parseInt(this.r*Math.sin(this.a1+i*this.pas));a10=(this.p+xi)/(2*this.p);a11=this.fontsize*(this.p+xi)/(2*this.p)+2;a12=parseInt(100*(this.p+xi)/(2*this.p))}else{xi=parseInt(this.r*Math.cos(this.a1+i*this.pas));yi=parseInt(this.r*Math.sin(this.a1+i*this.pas))/this.s;a10=(this.p+yi)/(2*this.p);a11=this.fontsize*(this.p+yi)/(2*this.p)+2;a12=parseInt(100*(this.p+yi)/(2*this.p))};a13=(this.w-20)*a10+20;a14=(this.h-20)*a10+10;a9s.top=(yi+this.y-a14/2)+"px";a9s.left=(xi+this.x-a13/2)+"px";a9s.width=a13+"px";a9s.fontSize=a11+"px";a9s.zIndex=a12};a8.style.top=this.y+(this.isVertical?this.r:this.p)+this.h/2+6;a8.style.left=this.x-a8.offsetWidth/2;if(this.a1!=this.a2){this.a1=(this.a1>this.a2)?(this.a1-this.pas/this.v):(this.a1+this.pas/this.v);if(Math.abs(this.a1-this.a2)<this.pas/this.v)
this.a1=this.a2;setTimeout("rahul.muta()",10)}},ordermenuclose:function(){this.pas=2*Math.PI/this.a3;document.write('<div id="controale" style="position:absolute"><button type="" onclick="rahul.a2+=rahul.pas;rahul.muta()" onfocus="this.blur()">&lt;&lt;</button> <button type="" onclick="rahul.a2-=rahul.pas;rahul.muta()" onfocus="this.blur()">&gt;&gt;</button></div>');rahul.muta()}};

function getposOffset(what, offsettype){
var totaloffset=(offsettype=="left")? what.offsetLeft : what.offsetTop;var parentEl=what.offsetParent;while (parentEl!=null){totaloffset=(offsettype=="left")? totaloffset+parentEl.offsetLeft :totaloffset+parentEl.offsetTop;parentEl=parentEl.offsetParent;}return totaloffset;
}
