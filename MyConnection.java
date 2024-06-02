
package motorph;
import java.sql.DriverManager;


/**
 *
 * @author edsamae
 */
public class MyConnection {
    private static java.sql.Connection MyConnection;
    
    public static java.sql.Connection getMyConnection(){
        if (MyConnection == null) {
            try {
                    String url = "jdbc:mysql://localhost:3306/LoginForm";
                    String user = "root";
                    String password = "";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    MyConnection = DriverManager.getConnection(url,user,password);
                    System.out.println("Connection Successfully");
            }catch (Exception e) {
                System.out.println("Error");
            }
            }
       return MyConnection;
    } 
    public static void main(String args[]){
        getMyConnection();  
    }
    
}
