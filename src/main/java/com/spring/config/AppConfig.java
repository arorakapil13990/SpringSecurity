package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.spring.interceptor.RequestHandler;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.spring.*"})
@Import(value = { LoginSecurityConfig.class })
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public RequestHandler requestHandler() {
        return new RequestHandler();
    }

//    @Override
//    public void addInterceptors(final InterceptorRegistry registry) {
//        registry.addInterceptor(requestHandler());
//    } 

	
	@Bean
	public ViewResolver getJspResolver(){
		InternalResourceViewResolver  resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setSuffix(".jsp");
		resolver.setPrefix("/WEB-INF/jsp/");
		return resolver;
	}
}
