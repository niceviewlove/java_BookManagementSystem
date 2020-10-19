<html>
	<head>
	<style>
	body {
	background: url("https://weheartit.com/entry/205328055");
	}
	</style>
	</head>
	
	<body>
		<h1>Hello Sion</h1>
		<div>
			<a href="/members/form">Adding Member</a>
		</div>
		<#list body as item>
			<p>${item.name}</p>
			<p>${item.gender}</p>
		</#list>
	</body>
</html>