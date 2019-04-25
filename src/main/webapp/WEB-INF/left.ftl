
<HTML><HEAD>
    <link href="css/dtree.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/dtree.js"></script>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
</HEAD>
<BODY bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center" >
    <tr>
        <div class="dtree">
            <script type="text/javascript">
                //这里是菜单
                //第二个参数是相对路径，比如工程名或者根路径
                var d = new dTree('d','');
                d.add('01','-1','CRM管理系统');
                d.add('0105','01','人力资源部');
                d.add('010501','0105','部门管理','listDepartment.html','','right');
                d.add('010502','0105','职务管理','listPost.html','','right');
                d.add('010503','0105','员工管理','listStaff.html','','right');

                document.write(d);
            </script>

        </div>
    </tr>
</table>
</BODY>
</HTML>
