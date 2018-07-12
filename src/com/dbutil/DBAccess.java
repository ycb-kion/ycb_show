package com.dbutil;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	public SqlSession getSqlSession()throws IOException{
		Reader reader=Resources.getResourceAsReader("com/config/Configuration.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sqlSessionFactory.openSession();
		return session;
	}

}
