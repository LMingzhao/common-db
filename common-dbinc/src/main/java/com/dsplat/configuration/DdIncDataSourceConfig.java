/**   
 * 
 * @Title: DdIncDataSourceConfig.java 
 * @Prject: dsplat-web
 * @Package: com.dsplat.configuration 
 * @author: Lmz
 * @date: 2018年1月4日 下午2:49:50 
 * @version: V1.0   
 */
package com.dsplat.configuration;

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
 * dbinc数据源配置类
 * @ClassName: DdIncDataSourceConfig 
 * @author: Lmz
 * @date: 2018年1月4日 下午2:49:50  
 */
@Configuration
@MapperScan(basePackages = "com.dsplat.dao.dbinc",sqlSessionFactoryRef = "dbincSqlSessionFactory")
public class DdIncDataSourceConfig {

	private static final Logger logger = Logger.getLogger(DdIncDataSourceConfig.class);
	
	@Bean(name = "dbincDataSource")
    @ConfigurationProperties("datasource.dbinc")
    public DataSource masterDataSource(){
		DataSource dataSource = DataSourceBuilder.create().build();
		logger.info("dbinc数据源初始化成功");
        return dataSource;
    }

    @Bean(name = "dbincSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dbincDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/dsplat/dao/dbinc/mybatis/mapping/*.xml"));
        logger.info("dbinc数据源会话工程初始化成功");
        return sessionFactoryBean.getObject();
    }

}
