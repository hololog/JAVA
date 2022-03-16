import java.io.*;

import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;

public class SqlMapClient {
	
	private static SqlSession session;
	
	static {
		try {
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			session = sqlMapper.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession() {
		return  session;
	}
	
}
