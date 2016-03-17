/**
 * 
 */
package com.kss.data.configuration;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * @author kiran
 *
 */
@Configuration
@PropertySource("classpath:database/database.properties")
@ConfigurationProperties("spring.datasource")
public class Jpa {
	
	private String username;
	private String password;
	private String url;
	private String driverClassName;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	@Bean
	public DataSource getDataSource() {
		System.out.println(username+"  "+password+"   "+url+"   "+driverClassName);
	
		DataSource dataSource = DataSourceBuilder.create()
			.driverClassName(driverClassName)
			.username(username)
			.password(password)
			.url(url).build();
		
		return dataSource;
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setDataSource(getDataSource());
		
		localContainerEntityManagerFactoryBean.setPackagesToScan("com.kss.data.login.entity");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
		
		return localContainerEntityManagerFactoryBean;
		
	}

}
