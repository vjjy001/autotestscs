package com.bls.fsms.autotest.config;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import oracle.jdbc.pool.OracleDataSource;

/**
 * Configuration for LAUS database
 * 
 * 
 * @author JIAN_J
 *
 */
@Configuration
@ConfigurationProperties("laus.oracle")
public class LAUSDatabaseConfig {

	@NotNull
	private String url;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

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
	
	@Bean(name="lausDS")
	public DataSource dataSource() throws SQLException{
		//logger.info("Inside StarsOracleConfiguration::dataSource().... [Active-Environment: "+ environment+" ]");
		OracleDataSource ds= new OracleDataSource();
		ds.setURL(url);
		ds.setUser(username);
		ds.setPassword(password);
		ds.setImplicitCachingEnabled(true);
		//logger.info("Returning oracle datasource....");
		return ds;
	}
	
	@Bean(name="lausJDBC")
	@Autowired	
	public JdbcTemplate jdbcTemplate(@Qualifier("lausDS") DataSource lausDS) { 
        return new JdbcTemplate(lausDS); 
    } 
}
