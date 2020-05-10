package com.moon;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory sqlSession;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testConnection() throws Exception{
		System.out.println(ds);
		
		Connection con = ds.getConnection();
		
		System.out.println(con);
		
		con.close();		
	}
	
	@Test
	public void testSqlSession() throws Exception{
		System.out.println(sqlSession);
	}
	

}
