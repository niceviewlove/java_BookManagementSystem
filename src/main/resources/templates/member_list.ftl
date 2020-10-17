<html>
	<head>
	</head>
	
	<body>
		<h1>Hello Sion</h1>
		<div>
			<a href="/members/form">member add</a>
		</div>
		<#list body as item>
		<p>${item.name}</p>
		</#list>
	</body>
</html>