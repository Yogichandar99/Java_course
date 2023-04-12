package com.careerit.day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.core.SqlCommand;

public class DbConnection {


    public static void main(String[] args)
    {
        //We are taking connection object to establish the connection with JDBC
        //connection type object
        Connection con = null;
        //Statement to execute the sql statement, with statement type
        Statement st = null;
        //rs object of ResultSet to store the query results
        ResultSet rs = null;
        try
        {
            //Initially for the connection object
            // we are specifying the url,username and password for the database server
            con = DriverManager.getConnection("jdbc:postgresql://dpg-cg3m9b9mbg5fch5veac0-a.oregon-postgres.render.com/learning_sql_db_g8ls",
                    "dbuser", "KofpfFXO00PThiZTaSRfKYPaTiCIvPcs");
            //creating the sql statement
            st = con.createStatement();
            //rs stores the result
            rs = st.executeQuery("select name,amount from player");
            //if rs has next value we are printing the values obtained from the query
            while(rs.next()){
                String name = rs.getString("name");
                double amount = rs.getDouble("amount");
                System.out.println(String.format("%s,%s",name,amount));
            }
        }catch(SQLException e){
            System.out.println("While getting player data :"+e);
        }finally{
            System.out.println("Closing Resources");
            try{
                if(rs!= null)
                    rs.close();
                if(st!=null)
                    st.close();
                if(con!=null)
                    con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }


}