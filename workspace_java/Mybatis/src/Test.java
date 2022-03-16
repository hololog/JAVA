import java.util.*;

import org.apache.ibatis.session.*;

public class Test {

	public static void main(String[] args) {
		SqlSession session = SqlMapClient.getSqlSession();
		
		Map param = new HashMap();
		param.put("STD_NO", "2022");
		
		
		List<Map<String, String>> temp = session.selectList("Test.select", param);
		System.out.println(temp);
		session.close();
	}

}
