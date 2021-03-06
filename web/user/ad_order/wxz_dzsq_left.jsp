<%@ page import="base.util.BaseIntUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    int p = BaseIntUtil.getInt(request, "p");
    pageContext.setAttribute("p",p);
%>
<script type="text/javascript">
    function detail(id) {
        var url = "/user/ad/detail.do?id=" + id;
        openDialog(url, 1000, 650, "yes");
    }
</script>

<div class="layout-sidebar">
    <div>
        <div class="ui-unmenu">
            <div class="box sub-nav"><h3>对账申请</h3>
                <ul class="ui-list">
                    <li class="nav_opt<c:if test="${p==0}"> active</c:if>">
                        <a href="/user/ad_order/wxz_dzsq_list_no.do" title="未申请对账记录">未申请对账记录</a>
                    </li>
                    <li class="nav_opt<c:if test="${p==1}"> active</c:if>">
                        <a href="/user/ad_order/wxz_dzsq_list_yes.do" title="申请对账记录">已申请对账记录</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
