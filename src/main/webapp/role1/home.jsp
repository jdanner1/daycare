<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%@ include file="../head-tag.jsp" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="mailto:support@daycare.com?Subject=Customer%20Inquiry"
               target="_top"
               class="navbar-brand">SUPPORT@DAYCARE</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="role1/userGuide.html">User Guide</a></li>
                <li><a href="ManageUsers">Manage Users</a></li>
                <li><a href="index.jsp">Exit</a></li>
            </ul>

        </div>
    </div>
</nav>

<div class="row">
    <c:if test="${not empty message1}">
        <h3 style="color: white; text-align:center;">${message1}</h3>
    </c:if>
</div>

<div class="row">
    <div class="col-sm-1"></div>

    <form class="form-horizontal col-sm-8"
          id="vocalization-form"
          name="vocalization-form"
          action="HomeAction"
          method="post">

        <div class="form-group">
            <label class="control-label col-sm-3">Select Student</label>
            <div class="col-sm-9">
                <select class="form-control" name="student">
                    <option disabled selected value>Select One</option>
                    <c:forEach var="student" items="${students}">
                        <option value="${student.studentID}">${student.studentID} ${student.firstName} ${student.lastName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="col-sm-3"></div>
        <div class="col-sm-9">
            <input type="submit"
                   value="Submit"
                   class="buttons form-button" />

            <span id="spacer01"></span>

            <input type="reset"
                   value="Reset"
                   class="buttons form-button" />
        </div>
    </form>
    <div class="col-sm-3"></div>
</div>

<%@ include file="../footer.jsp" %>
