package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) 
				throws ClassNotFoundException, SQLException {  //예외처리 위임
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
				"kingsmile", "oracle");
		
		//3. 사용 (DML 명령어 - Insert )  - Statement  / PreparedStatement
		Statement stmt = conn.createStatement();
//		insert into gift values(11,'사탕세트', 100, 9000);
//		1)고정값 레코드 입력
//		String sql = "INSERT INTO GIFT VALUES(12,'사탕세트2', 1002, 9002)";   // auto commit
		
//		2) 레코드 값을 입력 받아서 처리 - Scanner, IO , main args
		String sql = "INSERT INTO GIFT VALUES("+args[0]+", ' " + args[1] +" ' , " + args[2]+", " + args[3] +")";
		System.out.println(sql);
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "  개 데이터 추가 성공함");
		
		//4. 닫기 (자원 반환)
		stmt.close();		conn.close();
	}
}















