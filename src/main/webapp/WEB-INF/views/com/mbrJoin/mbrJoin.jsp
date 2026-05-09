<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<div class="join-page">
    <div class="join-box">
        <h1>회원가입</h1>

        <c:if test="${not empty msg}">
            <p style="color:red;">${msg}</p>
        </c:if>

        <form id="mbrJoinForm"
              action="<c:url value='/lgn/mbrJoin.do' />"
              method="post">

            <div>
                <label for="id">아이디</label>
                <input type="text"
                       id="id"
                       name="id"
                       maxlength="20"
                       autocomplete="username"
                       required>
            </div>

            <div>
                <label for="pswd">비밀번호</label>
                <input type="password"
                       id="pswd"
                       name="pswd"
                       maxlength="72"
                       autocomplete="new-password"
                       required>
            </div>

            <div>
                <label for="flnm">성명</label>
                <input type="text"
                       id="flnm"
                       name="flnm"
                       maxlength="40"
                       required>
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
                       maxlength="200">
            </div>

            <div>
                <label for="brdt">생년월일</label>
                <input type="date"
                       id="brdt"
                       name="brdt">
            </div>

            <button type="submit">회원가입</button>

            <div>
                <a href="<c:url value='/lgn/lgn' />">로그인 화면으로 이동</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>