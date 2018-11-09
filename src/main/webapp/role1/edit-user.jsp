<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="title" value="Search Results" />
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
                <li><a href="Home">Home</a></li>
                <li><a href="index.jsp">Exit</a></li>
            </ul>
        </div>

        <div class="row">
            <h2 class="userTable">Users:</h2>
            <table id="userTable" class="display" cellspacing="0" width="100%">
                <thead>
                <th class="userTable">UserId</th>
                <th class="userTable">User Name</th>
                <th class="userTable">Password</th>
                </thead>
                <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>
                        <td class="userTable">${user.userId}</td>
                        <td class="userTable">${user.userName}</td>
                        <td class="userTable">${user.password}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="row editList">

            <form class="form-horizontal"
                  method="post"
                  name="edit-user-form"
                  id="edit-user-form"
                  action="http://itins3.madisoncollege.edu/echo.php">

                <div class="form-group">
                    <label class="control-label">Which User to Edit?</label>
                    <br /><br /><br /><br />

                    <c:forEach var="user" items="${users}">
                        <div class="col-sm-9">
                            <input class="form-check-input" type="radio" name="userName"  value="${user.userName}" /> <span style="color:white;">${user.userName}</span>
                        </div>

                    </c:forEach>
                </div>

                    <input type="submit"
                           value="Submit"
                           class="buttons form-button" />


            </form>


        </div>


    </div>
</nav>

<%@ include file="../footer.jsp" %>
