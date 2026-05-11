<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<div class="mbrjoin-page">
    <div class="mbrjoin-box">
    
        <h1>회원가입</h1>

        <c:if test="${not empty msg}">
            <p style="color:red;"><c:out value="${msg}" /></p>
        </c:if>

        <form id="mbrJoinForm"
            action="<c:url value='/com/mbrJoin/mbrJoin.do' />"
            method="post">
              
            <input type="hidden"
              	name="${_csrf.parameterName}"
              	value="${_csrf.token}" />

            <div>
                <label for="id">아이디</label>
                <input type="text"
                       id="id"
                       name="id"
                       maxlength="20"
                       autocomplete="username"
                       required="required">
            </div>

            <div>
                <label for="pswd">비밀번호</label>
                <input type="password"
                       id="pswd"
                       name="pswd"
                       maxlength="72"
                       autocomplete="new-password"
                       required="required">
            </div>

            <div>
                <label for="flnm">성명</label>
                <input type="text"
                       id="flnm"
                       name="flnm"
                       maxlength="40"
                       required="required">
            </div>

            <div>
                <label for="mblTelno">휴대전화번호</label>
                <input type="text"
                       id="mblTelno"
                       name="mblTelno"
                       maxlength="11"
                       placeholder="01012345678">
            </div>

            <div>
                <label for="rsdcAddr">거주지주소</label>
                <input type="text"
                       id="rsdcAddr"
                       name="rsdcAddr"
                       maxlength="66">
            </div>

            <div>
                <label for="brdt">생년월일</label>
                <input type="date"
                       id="brdt"
                       name="brdt">
            </div>

            <button type="submit">회원가입</button>

            <div>
                <a href="<c:url value='/com/lgn/lgn.do' />">로그인 화면으로 이동</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>