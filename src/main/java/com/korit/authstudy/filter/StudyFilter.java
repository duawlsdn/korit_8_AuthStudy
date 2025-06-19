package com.korit.authstudy.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StudyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("전 처리");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("후 처리");
        // doFilter를 통해 다음 필터를 넘어가며 최종적으로 Controller를 호출하는데
        // 만약에 없을 시에는 이전의 필터로 리턴을 하게 된다.

        // doFilter 라는 메소드를 기준으로 이전 일때 전처리 , 이후 일때 후처리
    }
}
