<%--
  Created by IntelliJ IDEA.
  User: ossic
  Date: 17/9/30
  Time: 下午6:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript">

        function validate_required(field,alerttxt)
        {
            with (field)
            {
                if (value==null||value=="")
                {alert(alerttxt);return false}
                else {return true}
            }
        }

        function validate_form(thisform)
        {
            with (thisform)
            {
                if (validate_required(email,"Email must be filled out!")==false)
                {email.focus();return false}
            }
        }
    </script>
</head>

<body>
<form action="submitpage.htm" onsubmit="return validate_form(this)" method="post">
    Email: <input type="text" name="email" size="30">
    <input type="submit" value="Submit">
</form>
</body>
</html>
