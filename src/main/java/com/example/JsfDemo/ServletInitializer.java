package com.example.JsfDemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@EnableAutoConfiguration
//@ComponentScan({"com.dsi.JsfDemo"})
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JsfDemoApplication.class);
	}

//	@Bean
//	public ServletRegistrationBean servletRegistrationBean() {
//		FacesServlet servlet = new FacesServlet();
//		return new ServletRegistrationBean(servlet, "*.jsf");
//	}
//
//	@Bean
//	public FilterRegistrationBean rewriteFilter() {
//		FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
//		rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
//				DispatcherType.ASYNC, DispatcherType.ERROR));
//		rwFilter.addUrlPatterns("/*");
//		return rwFilter;
//	}

}
