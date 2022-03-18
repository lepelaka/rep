<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <%@ include file="../common/head.jsp" %>
    </head>
    <body class="sb-nav-fixed">
        <%@ include file="../common/nav.jsp" %>
        <main class="mt-5 pt-5">
            <div class="container-fluid px-4">
                <h1 class="mt-4">Board</h1>
                <div class="card mb-4">
                    <div class="card-body">
                        <form>
						  <div class="mb-3 mt-3">
						    <label for="bno" class="form-label">bno</label>
						    <input type="text" class="form-control" id="bno" name="bno" value="${board.bno}" disabled>
						  </div>
						  <div class="mb-3">
						    <label for="title" class="form-label">title</label>
						    <input type="text" class="form-control" id="title" name="title" value="${board.title}" disabled>
						  </div>
						  <div class="mb-3">
						    <label for="content" class="form-label">content</label>
						    <textarea class="form-control" id="content" name="content" disabled>${board.content}</textarea>
						  </div>
						  <div class="mb-3">
						    <label for="regDate" class="form-label">regDate</label>
						    <input type="text" class="form-control" id="regDate" name="regDate" value="${board.regDate}" disabled>
						  </div>
						  <div class="mb-3">
						    <label for="writer" class="form-label">writer</label>
						    <input type="text" class="form-control" id="writer" name="writer" value="${board.writer}" disabled>
						  </div>
						  <a href="list" class="btn btn-outline-secondary">list</a>
						  <c:if test="${not empty member && member.id == board.writer}">
						  <a href="modify?bno=${board.bno}" class="btn btn-outline-warning">modify</a>
						  <a href="remove?bno=${board.bno}" class="btn btn-outline-danger" onclick="return confirm('삭제하시겠습니까?')">remove</a>
						  </c:if>
						</form>
                    </div>
                </div>
            </div>
        </main>
        <%@ include file="../common/footer.jsp" %>
    </body>
</html>