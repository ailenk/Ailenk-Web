package ink.bignose.catmall.order.interceptor;

import ink.bignose.common.constant.AuthServerConstant;
import ink.bignose.common.vo.MemberResponseVO;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/23  14:53
 * DESCRIPTION:
 **/
@Component
public class LoginUserInterceptor implements HandlerInterceptor {

    public static ThreadLocal<MemberResponseVO> loginUser = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        AntPathMatcher matcher = new AntPathMatcher();
        boolean status = matcher.match("/order/order/status/**", requestURI);
        boolean payed = matcher.match("/payed/**", requestURI);
        if (status || payed)
            return true;

        MemberResponseVO attribute = (MemberResponseVO) request.getSession().getAttribute(AuthServerConstant.LOGIN_USER);
        if (!ObjectUtils.isEmpty(attribute)) {
            loginUser.set(attribute);
            return true;
        } else {
            request.getSession().setAttribute("msg", "请先进行登录");
            response.sendRedirect("http://auth.catmall.com/login.html");
            return false;
        }
    }
}
