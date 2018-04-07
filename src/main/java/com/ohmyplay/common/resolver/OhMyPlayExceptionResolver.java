package com.ohmyplay.common.resolver;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OhMyPlayExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {

        if( isRestController(handler)) {
            return null;
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");

        return mv;
    }

    private boolean isRestController(Object handler) {

        if (handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod)handler;

            return method.getMethod().getDeclaringClass().isAnnotationPresent(RestController.class);
        }

        return false;
    }
}
