<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.xiaoshuocity.com/commonTag" prefix="commonTag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <link href="/css/list.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="/css/page.css"/>
    <title>确认不通过的记录</title>
</head>

<body>
<div id="Holder">
    <div id="MainPage">
        <jsp:include page="/gly/common/head.jsp">
            <jsp:param name="p" value="9"/>
        </jsp:include>

        <div id="MainBody" class="layout-full-width">
            <jsp:include page="left.jsp">
                <jsp:param name="p" value="24"/>
            </jsp:include>

            <div id="CooperationMain" class="layout-main box clear-fix">
                <div class="layout-block-header">
                    <h2>广告主确认不通过的记录</h2>
                </div>

                <div id="AdposListTableBar">
                    <div class="ui-table-body">
                        <table class="tableList" width="100%" cellpadding="0" cellspacing="0">
                            <tbody>
                            <tr>
                                <th style="width: 60px;">
                                    订单ID
                                </th>
                                <th>
                                    广告标题
                                </th>
                                <th style="width: 90px;">
                                    广告类型
                                </th>
                                <th style="width: 90px;">
                                    金额
                                </th>
                                <th style="width: 90px;">
                                    计划发布日期
                                </th>
                                <th style="width: 120px;">
                                    微信名称
                                </th>
                                <th style="width: 120px;">
                                    微信号
                                </th>
                                <th style="width: 80px;">
                                    操作
                                </th>
                            </tr>
                            <c:forEach var="item" items="${list}" varStatus="status">
                                <tr>
                                    <td>${item.id}</td>
                                    <td>
                                        <a href="zxqr_list_no_ggz.jsp#" onclick="detail('${item.adId}');return false;">${item.ad.title}</a>
                                    </td>
                                    <td>
                                            ${item.ad.typeStr}
                                    </td>
                                    <td>
                                            ${item.amountStr}
                                    </td>
                                    <td>
                                        <fmt:formatDate value="${item.planDay}" pattern="yyyy-MM-dd"/>
                                    </td>
                                    <td>
                                       ${item.user.chineseName}
                                    </td>
                                     <td>
                                       ${item.user.englishName}
                                    </td>
                                    <td>
                                        <a href="#" onclick="zxqr_load('${item.id}');return false;">执行确认</a>
                                    </td>
                                </tr>
                            </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>

                <div class="pageblk" style="padding-top:15px;padding-bottom:15px;">
                    <commonTag:page limit="5" pageBean="${pageBean}" urlString="${urlString}" anchor="m1"/>
                </div>
            </div>
        </div>

        <jsp:include page="/user/common/foot.jsp"/>

    </div>
</div>
<script type="text/javascript">
    function zxqr_load(orderId) {
        var url = "/user/ad_order/ggz_zxqr_load.do?id=" + orderId;
        var obj = openDialog(url, 900, 550, "yes");
        if (obj != "" && obj != null) {
            location.reload();
        }
    }
</script>

</body>
</html>