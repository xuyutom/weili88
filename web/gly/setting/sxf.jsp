<%@ page import="base.util.BaseIntUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.xiaoshuocity.com/commonTag" prefix="commonTag" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <link href="/css/list.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="/css/page.css"/>
    <link href="/css/form.css" rel="stylesheet" type="text/css">
    <title>平台手续费</title>
</head>
<%
    int type = BaseIntUtil.getInt(request, "type");
    pageContext.setAttribute("type", type);
%>
<body>
<div id="Holder">
    <div id="MainPage">
        <jsp:include page="/gly/common/head.jsp">
            <jsp:param name="p" value="7"/>
        </jsp:include>

        <div id="MainBody" class="layout-full-width">
            <jsp:include page="left.jsp">
                <jsp:param name="p" value="${param.type}"/>
            </jsp:include>

            <div id="CooperationMain" class="layout-main box clear-fix" style="height:520px;">
                <div class="layout-block-header">
                    <h2><a style="color: #333" href="price_min.jsp" title="">平台手续费</a>
                    </h2>
                </div>
                <form method="post" action="#" name="f1" id="f1">
                    <input type="hidden" name="type" value="${type}"/>
                    <table class="formTable" width="60%" border="0" cellspacing="0" cellpadding="0">
                        <tbody>
                        <tr>
                            <td style="width: 150px;text-align: right;">
                                平台手续费最低值:
                            </td>
                            <td style="text-align: left;padding-left:10px;    ">
                                <input type="text" name="minSxf" id="minSxf" size="30" value="${setting.minSxf}"/>元
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align: right;">
                                平台手续费最高值:
                            </td>
                            <td style="text-align: left;padding-left:10px;    ">
                                <input type="text" name="maxSxf" id="maxSxf" size="30" value="${setting.maxSxf}"/>元
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align: right;">
                                平台手续费百分比:
                            </td>
                            <td style="text-align: left;padding-left:10px;    ">
                                <input type="text" name="percentSxf" id="percentSxf" size="30" value="${setting.percentSxf}"/>微币
                            </td>
                        </tr>

                        <tr style="height:60px;">
                            <td style="width: 150px;text-align: right;">

                            </td>
                            <td style="text-align: left;padding-left:10px;">
                                <input id="b1" type="button" value="提交" class="button blue medium"
                                       style="cursor: pointer;"/>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>

        <jsp:include page="/user/common/foot.jsp"/>
    </div>
</div>
<script type="text/javaScript">
    var flag = 1;
    var url = '/gly/setting/update.do';
    $(document).ready(function () {
        $("#b1").click(function(e) {
            if ($("#minSxf").val() == '') {
                flag = 1;
                layer.msg('平台手续费最低值不能为空!');
                return false;
            }
            if ($("#maxSxf").val() == '') {
                flag = 1;
                layer.msg('平台手续费最高值不能为空!');
                return false;
            }
            if ($("#percentSxf").val() == '') {
                flag = 1;
                layer.msg('平台手续费百分比不能为空!');
                return false;
            }

            if (flag != 1) {
                flag = 1;
                layer.msg('请不要重复提交!');
                return false;
            }
            flag = 0;
            jQuery.post(url, $("#f1").serialize(), function(jsonobj) {
                if (jsonobj.code == "200") {
                    flag = 1;
                    layer.alert(jsonobj.msg);
                } else {
                    flag = 1;
                    layer.alert("操作失败了:" + jsonobj.msg);
                }
            }, "json");
        });
    });
</script>

</body>
</html>