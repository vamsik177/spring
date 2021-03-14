<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color:red; text-align:center">Result page</h1>
<h1 style="color:green; text-align:center">All ${operation} List</h1>
<c:choose>
	<c:when test="${listInfo ne null && !empty listInfo }">
		<table align="center" bgcolor= "pink">
			<c:forEach var="languages" items="${listInfo}" >
				<tr>
					<td style="color:blue">${languages}</td>		
			</c:forEach>
		</table>
		<b>languages count::${languageCount}</b>
	</c:when>
	<c:otherwise>
	<h1 style="color:red; text-align:center"> No ${operation} Found</h1>
	
	</c:otherwise>
</c:choose>

<br><br>
<a href= "welcome">home</a>


