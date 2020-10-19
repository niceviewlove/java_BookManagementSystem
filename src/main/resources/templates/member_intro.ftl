<html>
	<head>
	<style> 
		html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video {
		    margin: 0;
		    padding: 0;
		    border: 0;
		    font-size: 100%;
		    vertical-align: baseline;
		}
	
		html, body, #wrapper {
	    	height: 100%;
		}	
		
		body {
		    font-size: 14px;
		    line-height: 1.4;
		    color: rgb(33, 35, 41);
		    letter-spacing: -0.04em;
		    font-family: Roboto, "Noto Sans KR", sans-serif, 돋움, Dotum, helvetica;
		}
		
		.join-container {
		    position: relative;
		    min-width: 1280px;
		    height: 100%;
		}
		
		.join-intro-wrap {
		    position: absolute;
		    top: 0;
		    right: 0;
		    bottom: 0;
		    left: 0;
		    background: url(https://i.pinimg.com/originals/a3/4e/5f/a34e5fc6b40f01739e020f6d40ad6399.jpg) no-repeat 50% 50%;
		    background-size: cover;
		}
		
		.join-intro {
			margin: 0 auto;
			width: 1112px;
			height: 100%;
		}
		
		.join-intro-contents {
			position: absolute;
			display: inline-block;
			top: 50%;
			transform: translateY(-50%);
		}
	
		p {
		    display: block;
		    margin-block-start: 1em;
		    margin-block-end: 1em;
		    margin-inline-start: 0px;
		    margin-inline-end: 0px;
		}
		
		.join-intro .txt-welcome {
		    font-size: 40px;
		    font-weight: bold;
		    font-style: normal;
		    font-stretch: normal;
		    line-height: 1.2;
		    letter-spacing: -1.2px;
		    color: #ffffff;
		    line-height: 44px;
		}	
		
		.join-intro .join-arr {
			display: block;
			margin-top: 37px;
		}
		
		a[role=button] {
			cursor: pointer;
		}
		
		.join-arr {
			font-size: 20px;
			line-height: 30px;
			letter-spacing: -0.4px;
			color: #ccc;
			font-weight: bold;
		}
			
	</style>
	</head> 
	
	<body> 
      <div id="wrapper"> 
	    <div class="join-container">
		  <div class="join-intro-wrap">
		    <div class="join-intro">
			  <div class="join-intro-contents">
			    <p class="txt-welcome">Members in Sion's Library</p>
				  <a href="./form" method="GET" class="btn-signup join-arr" role="button">Member 등록하기 ></a>
				  <a class="btn-signup join-arr" role="button">Member 삭제하기 ></a>
				  <a class="btn-signup join-arr" role="button">Member 수정하기 ></a>
				  <a href="./list" method="GET" class="btn-signup join-arr" role="button">Member 전체보기></a>							
			  </div>
			</div>
		  </div>
		</div>
      </div>	
	</body>
</html>