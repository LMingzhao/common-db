/**   
 * 
 * @Title: PrimaryDataSourceConfig.java 
 * @Prject: dsplat-web
 * @Package: com.dsplat.configuration 
 * @author: Lmz
 * @date: 2018年1月4日 下午2:49:50 
 * @version: V1.0   
 */
package com.common.configuration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/** 
 * 主数据源配置类
 * @ClassName: PrimaryDataSourceConfig 
 * @author: Lmz
 * @date: 2018年1月4日 下午2:49:50  
 */
@Configuration
@MapperScan(basePackages = "com.dsplat.dao.dbmain",sqlSessionFactoryRef = "dbmainSqlSessionFactory")
public class MainDataSourceConfig {

	private static final Logger logger = Logger.getLogger(MainDataSourceConfig.class);
	
	@Bean(name = "dbmainDataSource")
    @ConfigurationProperties("datasource.dbmain")
    public DataSource dbmainDataSource(){
		DataSource dataSource = DataSourceBuilder.create().build();
		logger.info("dbmain数据源初始化成功");
        return dataSource;
    }

    @Bean(name = "dbmainSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dbmainDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/dsplat/dao/dbmain/mybatis/mapping/*.xml"));
        logger.info("dbmain数据源会话工程初始化成功");
        return sessionFactoryBean.getObject();
    }

}
