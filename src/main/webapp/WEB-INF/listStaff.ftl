<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <meta http-equiv=“Content-Type” content=“text/html;charset=utf-8”>


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
        <td width="39%" align="left">[员工管理]</td>

        <td width="57%"align="right">

            <a href="javascript:void(0)" onclick="searchStaff(1)"><img src="images/button/gaojichaxun.gif" /></a>

            <a href="addStaff.html">
                <img src="images/button/tianjia.gif" />
            </a>

        </td>
        <td width="3%" align="right"><img src="images/tright.gif"/></td>
    </tr>
</table>

<!-- 查询条件：马上查询 -->
<form id="conditionFormId" action="listStaff.html" method="post">
    <table width="88%" border="0" style="margin: 20px;" >
        <tr>
            <td width="80px">部门：</td>
            <td width="200px">

                <select name="dtId" onchange="changeDepartment()" id="dptId">
                    <option value="">--请选择部门--</option>
                <#list departmentList as c >
                    <option  value="${c.id}">${c.dname}</option>

                </#list>
                </select>

            </td>
            <td width="80px" >职务：</td>
            <td width="200px" >

                <select name="dtId" id="dtId">
                    <option value="">--请选择职务--</option>

                </select>

            </td>
            <td width="80px">姓名：</td>
            <td width="200px" ><input type="text" name="staffName" size="12" /></td>
            <td ></td>
        </tr>
    </table>
</form>


<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
    <tr>
        <td ><img src="images/result.gif"/></td>
    </tr>
</table>

<table width="100%" border="1" >
    <tr class="henglan" style="font-weight:bold;">
        <td width="10%" align="center">员工姓名</td>
        <td width="6%" align="center">性别</td>
        <td width="12%" align="center">入职时间</td>
        <td width="15%" align="center">所属部门</td>
        <td width="10%" align="center">职务</td>
        <td width="10%" align="center">编辑</td>
    </tr>

    <#list pageInfo.list as b>
    <tr class="tabtd1">
        <td align="center">${b.name}</td>
        <td align="center">${b.sex}</td>
        <td align="center">${b.entryDate?string('yyyy-MM-dd')}</td>
        <td align="center">${b.dname}</td>
        <td align="center">${b.tname}</td>
        <td width="7%" align="center">

            <a href="pages/staff/editStaff.jsp"><img src="images/button/modify.gif" class="img" /></a>
        </td>

    </tr>
    </#list>
    <#--<tr class="tabtd2">-->
        <#--<td align="center">肉丝</td>-->
        <#--<td align="center">女</td>-->
        <#--<td align="center">2013-04-16</td>-->
        <#--<td align="center">咨询部</td>-->
        <#--<td align="center">主管</td>-->
        <#--<td width="7%" align="center">-->

            <#--<a href="pages/staff/editStaff.jsp"><img src="images/button/modify.gif" class="img" /></a>-->
        <#--</td>-->
    <#--</tr>-->
</table>



<table border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <td align="right">

            <div>
                <span>第${pageInfo.pageNum}/${pageInfo.pages}页</span>
                <button onclick="searchStaff(1)">[首页]</button>
                <button onclick="searchStaff(${pageInfo.prePage})">[上一页]</button>
                <button onclick="searchStaff(${pageInfo.nextPage})">[下一页]</button>
                <button onclick="searchStaff(${pageInfo.pages})">[尾页]</button>
            </div>
        </td>
    </tr>
</table>
<script type="text/javascript">
//    $(function () {
//        changeDepartment()
//    })


function searchStaff(pn) {
    $("#pageNum").val(pn);
    $("#conditionFormId").submit();
}

    function changeDepartment() {
        var dptId=$("#dptId").val();

        $("dtId").html('<option value="">请选择</option>');

        if (dptId==""){
            return
        }
        $.ajax({
            url:'list.html',
            dataType:"json",
            data:{dptId:dptId},
            method:"post",
            success:function (dutiesList) {

                $.each(dutiesList,function (i,obj) {
                        $("#dtId").append("<option value='"+obj.id+"'>"+obj.tname+"</option>");
                })

            }
        })
    }
</script>

</body>
</html>
