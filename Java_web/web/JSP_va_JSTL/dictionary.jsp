<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String, String> dic=new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");

        String search=request.getParameter("txtSearch");
        String result=dic.get(search);
        if(result!=null) {
            out.println("Word: "+search);
            out.println("Word: "+result);
        } else {
            out.println("Not found");
        }
    %>

</body>
</html>