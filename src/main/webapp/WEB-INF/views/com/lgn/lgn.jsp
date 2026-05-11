<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<%-- <link rel="stylesheet" href="<c:url value='' />"> --%>
</head>
<body>
	<div class="lgn-page">
		<div class="lgn-box">
		
			<c:if test="${not empty msg}">
				<p style="color:blue;"><c:out value="${msg}" /></p>
			</c:if>
		
			<form id="lgnForm"
				class="lgn-form"
				action="<c:url value='/com/lgn/lgnProc.do' />"
				method="post">
				
				<input type="hidden"
			    	name="${_csrf.parameterName}"
			    	value="${_csrf.token}" />

				<div class="input-group">
					<div class="input-wrap" id="idWrap">
						<label for="id">아이디</label>
						<input type="text"
							id="id"
							name="id"
							autocomplete="username"
							required>
					</div>

					<div class="input-wrap" id="pwWrap">
						<label for="pswd">비밀번호</label>
						<input type="password"
							id="pswd"
							name="pswd"
							autocomplete="current-password"
							required>
					</div>
				</div>

				<button type="submit" class="lgn-btn" id="lgnBtn" >
					로그인
				</button>

				<div class="lgn-links">
					<a href="<c:url value='' />">비밀번호 찾기</a>
					<span class="divider">|</span>
					<a href="<c:url value='' />">아이디 찾기</a>
					<span class="divider">|</span>
					<a href="<c:url value='/com/mbrJoin/mbrJoin.do' />">회원가입</a>
				</div>
			</form>
		</div>
	</div>

	<%-- <script src="<c:url value='/resources/js/lgn/lgn.js' />"></script> --%>
</body>
</html>
