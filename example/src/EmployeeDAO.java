import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 白川
 *
 */
/**
 *
 * DB接続、Select実行クラス
 *
 */
public class EmployeeDAO {
	/**
	 *
	 *
	 *EMPLOYEEテーブルの全テーブルの検索を行うFindALL()メソッド
	 *
	 * @return
	 * 検索結果 String型 id,String型 name,int型 age
	 *
	 * @thorws SQLException
	 */
	public List<Employee> findAll(){

		Connection conn = null;

		List<Employee> empList = new ArrayList<Employee>();



		try{

			//JDBCドライバを読み込み
			Class.forName("org.h2.Driver");

			//データベースへ接続
			conn = DriverManager.getConnection(
					"jdbc:h2:~/example","shirakawa","");


			//select文を準備
			String sql = "SELECT ID,NAME,AGE from EMPLOYEE";
			PreparedStatement pStmt = conn.prepareStatement(sql);


			//select文を実行し結果表を取得
			ResultSet rs = pStmt.executeQuery();


			//結果表に格納されたレコードの内容をEMPLOYEEインスタンスに設定し、ArrayListインスタンスに追加
			while(rs.next()){
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				Employee employee = new Employee(id,name,age);
				empList.add(employee);
			}
		}catch(SQLException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
	}finally{
		//データベース切断
		if(conn != null){
			try{
				conn.close();

			}catch(SQLException e){
				e.printStackTrace();
				return null;
			}
		}
	}
		return empList;
}
	public boolean remove(String id){

		Connection conn = null;

	try{
		//JDBCドライバの読込み
		Class.forName("org.h2.Driver");

		//データベースへの接続
		conn = DriverManager.getConnection("jdbc:h2:~/example","shirakawa","");


		//DELETE文を準備する
		String sql1 = "DELETE FROM EMPLOYEE where ID=?";
		PreparedStatement pStmt = conn.prepareStatement(sql1);

		pStmt.setString(1,id);

		int r = pStmt.executeUpdate();
		return ( r > 0);

	}catch(Exception e){
		e.printStackTrace();
		return false;
	}finally{
		//データベース切断
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
				return false;
			}
		}
	}


	}

}

