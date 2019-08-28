//package com.qf.j1904.config;
//
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.support.StandardServletMultipartResolver;
//import org.springframework.web.servlet.DispatcherServlet;
//
//@Configuration
//public class UploadConfig {
//
//    @Bean(name = DispatcherServlet.MULTIPART_RESOLVER_BEAN_NAME)//渲染的组件Bean
//    public StandardServletMultipartResolver multipartResolver() {
//        StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
//        multipartResolver.setResolveLazily(true);
//        return multipartResolver;
//    }
//}
