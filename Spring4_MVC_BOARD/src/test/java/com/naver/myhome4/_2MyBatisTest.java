package com.naver.myhome4;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 *  	--Junit이란?
 	1. Junit이란 Java에서 독립된 단위테스트를 지원해주는 프레임워크입니다.
 	
 	2. Test Runner는 Junit 프레임워크에서 테스트 클래스 내에 존재하는 각각의 테스트 메소드 실행을 담당하고 있는 클래스입니다.
 		Junit에 내장된 기본 Test Runner은 BlockJunit4ClassRunner 입니다.
 		
 	3. @RunWith JUnit 프레임워크의 테스트 실행방법을 확장할 때 사용하는 애노테이션입니다.
 		@RunWith Runner클래스를 설정하면 JUnit에 내장된 Runner대신 그 클래스를 실행합니다.
 		여기서는 스프링 테스트를 위해서 SpringJUnit4ClassRunner라는 Runner 클래스를 설정해줍니다.
 			
 	4. @RunWith(SpringJUnit4ClassRunner.class)
    	SpringJUnit4ClassRunner라는 JUnit용 테스트 컨텍스트 프레임워크 확장 클래스를 지정해 주면 JUnit이
    		테스트를 진행하는 중에 테스트가 사용할 애플리케이션 컨텍스트를 만들고 관리하는 작업을 진행해 줍니다.
    
 	5. @ContextConfiguration은 자동으로 만들어줄 애플리케이션 컨텍스트의 설정파일의 위치즐 지정할 떄 사용합니다.
    	@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })	
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class _2MyBatisTest {
	private static final Logger logger = LoggerFactory.getLogger(_2MyBatisTest.class);
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory; //SqlSessionFactory에서 만든 SqlSessionFactory를
	
	@Test //현재 메소드를 테스트 대상으로 지정하는 애노테이션입니다.(org.junit.Test)
	public void testSqlSessionFactory() {
		logger.info("~~~~~sqlSessionFactory : " + sqlSessionFactory);
		//sqlSessionFactory : org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@f0da9
		//만약에 root-context.xml 파일에 설정한 SqlSessionFactory Bean 의 설정에 문제가 있다면
		//이 코드에서 문제가 발생할 것입니다.
	}
	
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; //SqlSessionTemplate에서 만든 SqlSessionTemplate를
	
	@Test //현재 메소드를 테스트 대상으로 지정하는 애노테이션입니다.(org.junit.Test)
	public void testSqlSessionTemplate() {
		logger.info("~~~~~sqlSessionTemplate : " + sqlSessionTemplate);
	}
	
	
}
