<%-- 
    Document   : testJshuffle
    Created on : 2014-02-08, 19:02:13
    Author     : Michał
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Test shuffle</title>
    <link rel="stylesheet" type="text/css" href="css/default.css" />
    <link rel="stylesheet" type="text/css" href="css/component.css" />
    <script src="script/jquery.shuffle.js" type="text/javascript"></script>
    <script src="script/jquery-1.11.0.js" type="text/javascript"></script>
    <script src="script/masonry.pkgd.min.js"></script>
    <script src="script/imagesloaded.js"></script>
    <script src="script/modernizr-2.6.2.js"></script>
    <script src="script/classie.js"></script>
    <script src="script/AnimOnScroll.js"></script>
    <div class="container">
			<!-- Top Navigation -->
			<div class="codrops-top clearfix">
				<a class="codrops-icon codrops-icon-prev" href="http://tympanus.net/Tutorials/ExpandingSearchBar/"><span>Previous Demo</span></a>
				<span class="right"><a href="http://dribbble.com/erikamackley">Illustrations by by Erika Mackley</a><a class="codrops-icon codrops-icon-drop" href="http://tympanus.net/codrops/?p=15677"><span>Back to the Codrops Article</span></a></span>
			</div>
			<header>
				<h1>Loading Effects for Grid Items <span>with CSS Animations</span></h1>	
<!--				<nav class="codrops-demos">
					<a href="index.html">Demo 1</a>
					<a href="index2.html">Demo 2</a>
					<a href="index3.html">Demo 3</a>
					<a href="index4.html">Demo 4</a>
					<a href="index5.html">Demo 5</a>
					<a href="index6.html">Demo 6</a>
					<a href="index7.html">Demo 7</a>
					<a class="current-demo" href="index8.html">Demo 8</a>
				</nav>-->
			</header>
			<ul class="grid effect-8" id="grid">
				<li><a href="http://drbl.in/fWMM"><img src="images/1.jpg"></a></li>
				<li><a href="http://drbl.in/fWPV"><img src="images/3.jpg"></a></li>
				<li><a href="http://drbl.in/fWMT"><img src="images/4.jpg"></a></li>
				<li><a href="http://drbl.in/fQdt"><img src="images/12.png"></a></li>
				<li><a href="http://drbl.in/fHaa"><img src="images/13.png"></a></li>
				<li><a href="http://drbl.in/gXMo"><img src="images/10.png"></a></li>
				<li><a href="http://drbl.in/gXMn"><img src="images/9.jpg"></a></li>
				<li><a href="http://drbl.in/fzYo"><img src="images/2.jpg"></a></li>
				<li><a href="http://drbl.in/fARU"><img src="images/14.png"></a></li>
				<li><a href="http://drbl.in/fGhI"><img src="images/5.jpg"></a></li>
				<li><a href="http://drbl.in/fKCf"><img src="images/6.jpg"></a></li>
				<li><a href="http://drbl.in/fLBG"><img src="images/7.jpg"></a></li>
				<li><a href="http://drbl.in/fPEY"><img src="images/8.jpg"></a></li>
				<li><a href="http://drbl.in/fWwG"><img src="images/9.jpg"></a></li>
				<li><a href="http://drbl.in/fQdt"><img src="images/12.png"></a></li>
				<li><a href="http://drbl.in/fHaa"><img src="images/13.png"></a></li>
				<li><a href="http://drbl.in/gXMo"><img src="images/10.png"></a></li>
				<li><a href="http://drbl.in/gXMn"><img src="images/11.png"></a></li>
				<li><a href="http://drbl.in/fzYo"><img src="images/2.jpg"></a></li>
				<li><a href="http://drbl.in/fARU"><img src="images/14.png"></a></li>
				<li><a href="http://drbl.in/fWMM"><img src="images/1.jpg"></a></li>
				<li><a href="http://drbl.in/fWPV"><img src="images/3.jpg"></a></li>
				<li><a href="http://drbl.in/fWMT"><img src="images/4.jpg"></a></li>
				<li><a href="http://drbl.in/fGhI"><img src="images/5.jpg"></a></li>
				<li><a href="http://drbl.in/fKCf"><img src="images/6.jpg"></a></li>
				<li><a href="http://drbl.in/fLBG"><img src="images/7.jpg"></a></li>
				<li><a href="http://drbl.in/fPEY"><img src="images/8.jpg"></a></li>
				<li><a href="http://drbl.in/fWwG"><img src="images/9.jpg"></a></li>
				<li><a href="http://drbl.in/fQdt"><img src="images/12.png"></a></li>
				<li><a href="http://drbl.in/fHaa"><img src="images/13.png"></a></li>
				<li><a href="http://drbl.in/gXMo"><img src="images/10.png"></a></li>
				<li><a href="http://drbl.in/gXMn"><img src="images/11.png"></a></li>
			</ul>
		</div>
<!--		<script src="js/masonry.pkgd.min.js"></script>
		<script src="js/imagesloaded.js"></script>
		<script src="js/classie.js"></script>
		<script src="js/AnimOnScroll.js"></script>-->
		<script>
			new AnimOnScroll( document.getElementById( 'grid' ), {
				minDuration : 0.4,
				maxDuration : 0.6,
				viewportFactor : 0.2
			} );
		</script>
		<!-- For the demo ad -->   
  </body>
</html>
