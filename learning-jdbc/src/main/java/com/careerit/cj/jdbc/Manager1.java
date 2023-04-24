package com.careerit.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Manager1
{
    public static void main(String[] args) throws IOException, SQLException {
        //Creating an object for property class
        Properties pros=new Properties();
        //load the file using the object created
        pros.load(Manager1.class.getResourceAsStream("/db.properties"));
        //create connection object, statement object and result set to have access and execute queries
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try
        {
            //getting all the connection details using driver Manager
            con= DriverManager.getConnection(pros.getProperty("db.url"),pros.getProperty("db.username"),pros.getProperty("db.password"));
            st= con.createStatement();
            rs= st.executeQuery("select ename,deptno from emp where deptno=20");
            while(rs.next())
            {
                String eName=rs.getString("ename");
                String dName=rs.getString("deptno");
                System.out.println("ename: "+eName+"  deptno: "+dName);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(st!=null)
                {
                    st.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
