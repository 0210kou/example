

import java.util.List;
/**
 *
 * @author 白川
 *
 */



/*
public class SelectEmployeeSample {
	/**
	 *
	 * Employeeテーブルに接続するMain Method
	 */
/*
	public static void main(String[]args){
		Connection conn = null;
		try{
			/**
			 * JDBCドライバの読込み
			 *//*
			Class.forName("org.h2.Driver");

			/**
			 * データベースへ接続
			 *//*
			conn = DriverManager.getConnection(
					"jdbc:h2:~/docoTsubu","shirakawa","");

			/**
			 * SELECT文を準備
			 */ /*
			String sql1 = "update MUTTER set TEXT='今日は仕事だ' where ID=1";
			String sql = "select * from MUTTER";
			//String sql = "select ID,NAME,AGE from MUTTER";
			PreparedStatement pStmt = conn.prepareStatement(sql1);
			PreparedStatement pStmt1 = conn.prepareStatement(sql);

			/**
			 * selectを実行し、結果表(Resultset)を取得
			 */ /*


			ResultSet rs = pStmt1.executeQuery();

			/**
			 * 結果表に格納されたレコードの内容を表示
			 */ /*
			while(rs.next()){
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				//int age = rs.getInt("AGE");
				String text =rs.getString("TEXT");


				/**
				 * 取得したデータを出力
				 */ /*
				System.out.println("ID" + id);
				System.out.println("名前" + name);
				System.out.println("つぶやき" + text + "\n");
			}
		} catch(SQLException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally {
			/**
			 * データベース切断
			 */ /*
			if(conn != null){
				try{
					conn.close();

				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}
     */




/**
 * @author 白川
 * DBからレコードを取得するクラス
 *
 *@throws 
 */
			public class SelectEmployeeSample{
				/**
				 *  EmployeeDAOクラスからインスタンスを生成
				 */
				public static void main(String[]args){
					

					EmployeeDAO empDAO = new EmployeeDAO();

					/**
					 *  EmployeeDAOクラスでList<Employee> findAll()メソッドを実行
					 */

					List<Employee> empList = empDAO.findAll();

					/**
					 * 取得したレコードの出力
					 */

					for(Employee emp : empList){
						System.out.println("ID" + emp.getId());
						System.out.println("NAME" + emp.getName());
						System.out.println("AGE" + emp.getAge());
					}

				}
			}