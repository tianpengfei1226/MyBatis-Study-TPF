package com.tpf.mybatis.test;

import com.tpf.mybatis.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  EmployeeTest.java,v 1.0, 2019/12/27-12:34 tianpengfei Exp $
 */
public class EmployeeTest {
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	public void testSelectOne() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			Employee employee = openSession.selectOne(
					"com.tpf.mybatis.EmployeeMapper.selectEmp", 1);
			System.out.println(employee);
		} finally {
			openSession.close();
		}
	}
}
