package com.careerit.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Manager
{
    public static void main(String[] args) throws IOException
    {
        //Database can be accessible by specifying the db properties which can be hardcoded
        // or can be kept in a file and can be accesses anywhere in the application.
        //Initially creating a connection object
        Properties pros=new Properties();
        pros.load(Manager.class.getResourceAsStream("/db.properties"));
        //Getting the name of dbuser
        System.out.println(pros.getProperty("db.username"));
        //Steps
        //Inorder to make database accessible we need to create
        //1. connection object to import the required classes
        //2. Write the statement which need to be executed
        //3. handle the result set
        //4.close all the resources opened using finally
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            con= DriverManager.getConnection(pros.getProperty("db.url"),pros.getProperty("db.username"), pros.getProperty("db.password"));
            st= con.createStatement();
            rs=st.executeQuery("select ename from emp");
            while(rs.next())
            {
                String ename=rs.getString("ename");
                System.out.println("name of emp: "+ename);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
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
