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
        <br /><br /><br />

        <div class="row">
            <a href="AddUser" class="btn btn-default">Add User</a>

            <span class="buttonSpacer"><a href="EditUser" class="btn btn-default">Edit User</a></span>

            <span class="buttonSpacer"><a href="DeleteUser" class="btn btn-default">Delete User</a></span>
        </div>


    </div>
</nav>

<%@ include file="../footer.jsp" %>
