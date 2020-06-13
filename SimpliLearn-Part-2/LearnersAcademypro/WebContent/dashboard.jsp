<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dash Board</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;

}

li {
  float: left;
}

li button {
  display: block;
  color: white;
   width: 800px;
  height: 50px;
  border-radius: 30px;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
    background-color: green;
    text-size:50px;
}

li button:hover {
  background-color: Green;;
  
   opacity: 0.6;
}
#main ul li{
position: relative;
width:100%;
margin-left:20%;
margin-top:20px;
margin-bottom:20px;

}

#main {
width:85%;
  background-image: url("bgimage.jpg");
 background-size: cover;
background-repeat:no-repeat;
margin-left:8%;
}


</style>
</head>
<body >
	<h3>DashBoard</h3>
<div id="main">
<c:choose>
		<c:when  test="${sessionScope.login != null}">
		
			
<ul>
 <li><form method="post" action="students">
			<input type="hidden" name="action" value="display"/>
			<button name="Students">Students</button>
			
	  </form>
  </li>
    <li><form method="post" action="teachers">
			<input type="hidden" name="action" value="display"/>
			<button name="Teachers">Teachers</button>
	       
	   </form>
  </li>
   <li><form method="post" action="classes">
			<input type="hidden" name="action" value="display"/>
			<button name="Classes">Classes</button>
			
	   </form>
  </li>
  <li><form method="post" action="subjects">
	      <input type="hidden" name="action" value="display"/>
	      <button name="Subjects">Subjects</button>
       
	   </form>
  </li>
   <li><form method="post" action="logout">
			<button name="logout">Button</button>

	   </form>
  </li>
</ul>
</c:when>
		<c:otherwise>
			<jsp:forward page="login.jsp"></jsp:forward>
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>