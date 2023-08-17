package com.jsp.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan(basePackages = "com.jsp")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver getObject()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
	@Bean("dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource driver=new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3307/techa40");
		driver.setUsername("root");
		driver.setPassword("12345");
		return driver;
		}
		
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate(DataSource source)
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(source);
		return template;
	} 
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**")
	                .addResourceLocations("/resources/");
	  }
	
}
