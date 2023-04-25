//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//public class DbManager {
  //  public Connection getConnection() {
       
       // try{
         //   Class.forName("com.mysql.cj.jdbc.Driver");
          //  java.sql.Connection con=DriverManager.getConnection("jdbc:sql://localhost:3306/onlineVotingDb","root","ABCD#EFG@123");
            //return con;
       // }catch( ClassNotFoundException e){
           // e.printStackTrace();
           // return null;
       // }catch(SQLException e){
           //    e.printStackTrace();
            //return null;
       // }
        
    //}
    
    
    
    
    /*try {

			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineVotingDb", "root", "Swatijagtap1998"); 
			return con;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;

		}
	}
}
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineVotingSystem","root","Swatijagtap1998");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}