
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>

    <link href="css/sys.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript" src="jquery-1.10.2.min.js"></script>
</head>

<body >
<table border="0" cellspacing="0" cellpadding="0" width="100%">
    <tr>
        <td class="topg"></td>
    </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
    <tr>
        <td width="1%"><img src="images/tleft.gif"/></td>
        <td width="39%" align="left">[部门管理]</td>

        <td width="57%"align="right">
            <!--添加部门的连接-->
            <a href="addOrEditDepartment.html">
                <img src="images/button/tianjia.gif" />
            </a>

        </td>
        <td width="3%" align="right"><img src="images/tright.gif"/></td>
    </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
    <tr>
        <td ><img src="images/result.gif"/></td>
    </tr>
</table>

<table width="100%" border="1" >

    <tr class="henglan" style="font-weight:bold;">
        <td width="6%" align="center">部门名称</td>
        <td width="7%" align="center">编辑</td>
    </tr>

    <#--<tr class="tabtd1">-->
        <#--<td align="center">java </td>-->
        <#--<td width="7%" align="center">-->
            <#--<a href="addOrEditDepartment.html"><img src="images/button/modify.gif" class="img"/></a>-->
        <#--</td>-->
    <#--</tr>-->
    <#list pageInfo.list as b>
    <tr class="tabtd2">
        <td align="center">${b.dname}</td>
        <td width="7%" align="center">
            <a href="addOrEditDepartment.html"><img src="images/button/modify.gif" class="img"/></a>
        </td>
    </tr>
    </#list>
</table>



<table border="0" cellspacing="0" cellpadding="0" align="center">
    <#--<tr>-->
        <#--<td align="right">-->
            <#--<span>第1/3页</span>-->
            <#--<span>-->
        	<#--<a href="#">[首页]</a>&nbsp;&nbsp;-->
            <#--<a href="#">[上一页]</a>&nbsp;&nbsp;-->
            <#--<a href="#">[下一页]</a>&nbsp;&nbsp;-->
            <#--<a href="#">[尾页]</a>-->
        <#--</span>-->
        <#--</td>-->
    <#--</tr>-->
       <tr>
          <td align="right">

    <div>
        <span>第${pageInfo.pageNum}/${pageInfo.pages}页</span>
        <button onclick="fenyeFun(1)">[首页]</button>
        <button onclick="fenyeFun(${pageInfo.pageNum-1})">[上一页]</button>
        <button onclick="fenyeFun(${pageInfo.pageNum+1})">[下一页]</button>
        <button onclick="fenyeFun(${pageInfo.pages})">[尾页]</button>
    </div>
          </td>
       </tr>
</table>
<script type="text/javascript">
    function fenyeFun(num) {
        console.log(num);
        location.href="listDepartment.html?pageNum="+num;
    }
</script>
</body>
</html>
