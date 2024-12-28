
public class DemoJDBC{
    public static void main(String[] args) {
       /* //import pkg
        //load and reg
        //create connection
        // create statement
        //execute statement
        //process the resuts
        //close
        */

        String url="jdbc:mysql://localhost:3306/cdacdb";
        String uname="cdac";
        String pass="cdac"

        class.forname( "com.mysql.jdbc.driver");

        Connection connection = DriverManager.getConnection(url,uname,pass);

        System.out.println("");


    }

}