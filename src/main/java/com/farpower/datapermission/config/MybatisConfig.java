/**
 * 
 */
package com.farpower.datapermission.config;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.farpower.datapermission.interceptors.PermissionInterceptors;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

/**
 * @author xiaoshenbo
 *
 */
@Configuration
public class MybatisConfig {
	@Autowired
	private DataSource dataSource;
/*
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DruidDataSource();
	}*/

	/**
	 * mybatis-plus分页插件<br>
	 */
	@Bean
	public Interceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	@Bean
	public Interceptor permissionInterceptors(){ return  new PermissionInterceptors(); }

	@Bean(name = "globalConfig")
	public GlobalConfiguration globalConfiguration() {
		GlobalConfiguration globalConfiguration = new GlobalConfiguration();
		globalConfiguration.setIdType(0);
		return globalConfiguration;
	}

	@Bean(name = "sqlSessionFactory")
	@ConfigurationProperties(prefix = "mybatis")
	public MybatisSqlSessionFactoryBean sqlSessionFactory() {
		MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		List<Interceptor> interceptorList = new ArrayList<>();
		interceptorList.add(paginationInterceptor());
		// 添加数据权限的mybatis拦截器
		interceptorList.add(permissionInterceptors());
		sqlSessionFactoryBean.setPlugins(interceptorList.toArray(new Interceptor[] {}));
		sqlSessionFactoryBean.setGlobalConfig(globalConfiguration());
		return sqlSessionFactoryBean;
	}
}
