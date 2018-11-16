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
                <li><a href="Home">Home</a></li>
                <li><a href="index.jsp">Exit</a></li>
            </ul>

        </div>
    </div>
</nav>

<div class="container-fluid">
    <h2 style="color: white;">Contacts: </h2>
    <br /><br />

    <table class="all">
        <tr>
            <td class="header col-md-1" style="color: white;"><strong>First Name</strong></td>
            <td class="header col-md-1" style="color: white;"><strong>Last Name</strong></td>
            <td class="header col-md-1" style="color: white;"><strong>Relationship</strong></td>
            <td class="header col-md-2" style="color: white;"><strong>Cell Phone</strong></td>
            <td class="header col-md-2" style="color: white;"><strong>Work Phone</strong></td>
            <td class="header col-md-2" style="color: white;"><strong>Address</strong></td>
            <td class="header col-md-1" style="color: white;"><strong>City</strong></td>
            <td class="header col-md-1" style="color: white;"><strong>State</strong></td>
            <td class="header col-md-1" style="color: white;"><strong>Zip</strong></td>
            <td class="header col-md-1" style="color: white;"><strong>Email</strong></td>
        </tr>

        <c:forEach var="currentContact" items="${contacts}">
            <tr>
                <td class="allCells col-md-1" style="color: white;">${currentContact.firstName}</td>
                <td class="allCells col-md-1" style="color: white;">${currentContact.lastName}</td>
                <td class="allCells col-md-1" style="color: white;">${currentContact.relationshipToStudent}</td>
                <td class="allCells col-md-2" style="color: white;">${currentContact.cellPhone}</td>
                <td class="allCells col-md-2" style="color: white;">${currentContact.workPhone}</td>
                <td class="allCells col-md-2" style="color: white;">${currentContact.address}</td>
                <td class="allCells col-md-1" style="color: white;">${currentContact.city}</td>
                <td class="allCells col-md-1" style="color: white;">${currentContact.state}</td>
                <td class="allCells col-md-1" style="color: white;">${currentContact.zip}</td>
                <td class="allCells col-md-1" style="color: white;">${currentContact.email}</td>

            </tr>
        </c:forEach>
    </table>
</div>
<br /><br />

<%@ include file="../footer.jsp" %>
