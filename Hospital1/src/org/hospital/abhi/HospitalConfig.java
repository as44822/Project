package org.hospital.abhi;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hospital.service.UserService;
import org.hospital.service.UserServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"org.hospital.*"})
public class HospitalConfig extends WebMvcConfigurerAdapter{
	@Bean
	ViewResolver createViewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setViewClass(InternalResourceView.class);
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("System");
		dataSource.setPassword("123");
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource ds) {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(ds);
		sessionFactory.setPackagesToScan("org.hospital.hibernate");
		Properties props=new Properties();
		props.put("hibernate.dialect" ,"org.hibernate.dialect.OracleDialect");
		sessionFactory.setHibernateProperties(props);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTemplate hibernateTamplate(SessionFactory sf){
		HibernateTemplate hTemp=new HibernateTemplate(sf);
		hTemp.setCheckWriteOperations(false);
		return hTemp;
	}
	
	@Bean 
	public HibernateTransactionManager transactionManager(SessionFactory sf){
		HibernateTransactionManager txManager=new HibernateTransactionManager(sf);
	
		return txManager;
	}
	
	
	@Bean 
	public UserService userManagerBean(){
		
		return new UserServiceImp();
	}
	
}
