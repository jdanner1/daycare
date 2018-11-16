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

    <table class="all">
        <tr>
            <td class="header" style="color: white; margin: 1em;"><strong>First Name</strong></td>
            <td class=header" style="color: white; margin: 1em;"><strong>Last Name</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>Relationship</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>Cell Phone</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>Work Phone</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>Address</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>City</strong></td>
            <td class="header"style="color: white; margin: 1em;"><strong>State</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>Zip</strong></td>
            <td class="header" style="color: white; margin: 1em;"><strong>Email</strong></td>
        </tr>

        <c:forEach var="currentContact" items="${contacts}">
            <tr>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.firstName}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.lastName}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.relationshipToStudent}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.cellPhone}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.workPhone}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.address}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.city}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.state}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.zip}</td>
                <td class="allCells" style="color: white; margin: 1em;">${currentContact.email}</td>

            </tr>
        </c:forEach>
    </table>
</div>

<%@ include file="../footer.jsp" %>
