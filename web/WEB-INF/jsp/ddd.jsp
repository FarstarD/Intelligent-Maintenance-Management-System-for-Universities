<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/weixiu.css">
    <div class="box">

        <div class="top">

            <div>   <img src="${pageContext.request.contextPath}/images/firstSy/TittleLogo 位置X17Y16.png" alt=""> 维修管理系统  </div>

            <div></div> <div></div><div></div>
            <div  > <p>今日保修人数:10人</p>  <p>未处理保修人数:10人</p>  </div>
            <div></div>
            <div> <br> <img src="${pageContext.request.contextPath}/images/firstSy/TimeLogo02.png" alt=""  >
                <div class="span"><span id="time">今日保修人数:10人今日保修人数:10人</span></div>

            </div>

            <div></div>
            <div></div>

            <div class="topdiv" > <img src="${pageContext.request.contextPath}/images/firstSy/路径 37.png" alt=""    class="img"  >    <div class="sayhibox" >下午好，维修人员  </div>


            </div>


        </div>


        <img src="${pageContext.request.contextPath}/images/firstSy/顶部和内页的分界线 位置X0Y92.png" alt=""   >
        <div class="left">

            <ul>

                <div>
                    <li    class="caili" >
                        <img src="${pageContext.request.contextPath}/images/firstSy/主菜单LOGO 位置X23Y112.png" alt="" class=""  style="display: inline-block;"  > &nbsp;  主菜单 </li>

                    <li  >
                        <form action="${pageContext.request.contextPath}/books/nullDeal">
                            <input type="hidden" name="bookState" value="未处理">
                            <button type="submit" class="ingbut" >&nbsp;&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/images/111.png" alt="">  &nbsp;&nbsp;未处理页面</button>
                        </form>

                    </li>
                    <p></p>

                    <li>
                        <form action="${pageContext.request.contextPath}/books/statIng">
                            <input type="hidden" name="bookState" value="正在处理">
                            <button type="submit" class="ingbut" >&nbsp;&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/images/222.png" alt="">  &nbsp;&nbsp;正在处理页面</button>
                        </form>

                    </li>
                    <p></p>
                    <li>
                        <form action="${pageContext.request.contextPath}/books/statEnd">
                            <input type="hidden" name="bookState" value="未处理">
                            <button type="submit" class="ingbut" >&nbsp;&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/images/333.png" alt="">  &nbsp;&nbsp;处理完成页面</button>
                        </form>

                    </li>
                    <p></p>
                    <li><a class="ingbut" href="${pageContext.request.contextPath}/user/toUpdatePwd">&nbsp;&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/images/firstSy/key.png" alt="">  &nbsp;&nbsp;修改密码</a></li>
                    <p></p>
                    <li><a class="ingbut" href="${pageContext.request.contextPath}/user/goOut">&nbsp;&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/images/firstSy/exit.png" alt="">  &nbsp;&nbsp;注销</a></li>
                </div>


            </ul>


        </div>
    </div>
        <!-- 左栏盒子在这结束 -->

