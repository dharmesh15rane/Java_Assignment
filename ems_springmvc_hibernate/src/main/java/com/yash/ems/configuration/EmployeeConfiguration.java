package com.yash.ems.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * EmployeeConfiguration file
 * @author Dharmesh
 *
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.yash.ems")
public class EmployeeConfiguration extends WebMvcConfigurerAdapter
{
	/**
	 * Interface to be implemented by objects that can resolve views by name. 
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
	
	/**
	 * Interface to resolving messages
	 * @return
	 */
	@Bean
	public MessageSource messageSource() {
	 ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	 messageSource.setBasename("application");
	 return messageSource;
	}

	/**
	 * Resource handler to serve static resources like css, images, pages etc.
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
}
