<html>
  <head>
	<style>
	  body {
	    background: url("https://weheartit.com/entry/205328055");
	  }
	</style>
  </head>	
  <body>
  	<h1>이름 / 성별 / 나이 / 이메일 / 휴대폰</h1>
	<#list body as item>
	  <div>${item.name}</div>
	  <div>${item.gender}</div>
	  <div>${item.age}</div>
	  <div>${item.email}</div>
	  <div>${item.phone}</div>
	</#list>
  </body>
</html>