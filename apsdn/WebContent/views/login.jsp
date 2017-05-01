<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style type="text/css">
 			.aParent div { 
 				 float: left;
				 clear: none; 
			}
			.viewport {
    			width: 100%;
    			position: absolute;
    			top: 0;
    			bottom: 0;
    			background-color: 
			}
			.login {
			    background-color: darkblue;
    			color: white;
    			height: 50px;
			}
			.login-form {
				border-collapse: collapse;
				height: 100%;
				border-color: gray;
			}
			.loginData {
				background-color: gray;
				color: white;
				height: 50px;
			}
		</style>
	</head>
	<body>
<!-- 		<div class="aParent"> -->
		<div class="viewport">
			<table class="login-form" border="1">
			<tr>
				<td width = "50%" align="center">
					<div style="word-wrap: break-word;"><font size="100px">Achieving perfect secrecy using dynamic network control</font></div>
				</td>
				<td width = "40%" align="center">
					<form action="/">
						<table class="login-form">
							<tr class="login">
								<td colspan="3" align="center" width="100%">
									Login 
								</td>
							</tr>
							<tr class="loginData">
								<td>
									User Name 
								</td>
								<td>
								:
								</td>
								<td>
									<input type="text"></input>
								</td>
							</tr>
							<tr class="loginData">
								<td>
									Password
								</td>
								<td>
								:
								</td>
								<td>
									<input type="password"></input>
								</td>
							</tr>
							<tr>
								<td colspan="3"  align="right">
									<input type="button" value="Reset"></input>
									<input type="submit"></input>
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</div>

	</body>
</html>