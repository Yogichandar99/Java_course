package com.careerit.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil
{
    //Creating an object of properties to get the details
    private static Properties pros;
    //As it is final method overriding is not possible and even object creation is not possible.
    private ConnectionUtil()
    {

    }
    //Writing a static block so that it gets executed first
    static{
        pros=new Properties();
        try{
            pros.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getconnection()
    {
        Connection con=null;
        try
        {
            //Instead of specifying the details(url,user and password) everytime we are keeping all the details in a file
            //and accessing them using properties object
           con= DriverManager.getConnection(pros.getProperty("db.url"),pros.getProperty("db.username"),pros.getProperty("db.password"));
        }
        catch (SQLException e)
        {
            System.out.println("While connecting to db: "+e);
        }
        return con;
    }
    public static void close(ResultSet rs, Statement st,Connection con)
    {
        try
        {
            if (rs != null)
            {
                rs.close();
            }
            if (st != null)
            {
                st.close();
            }
            if (con != null)
            {
                con.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println("while closing the file "+e);
        }
    }
    //If result set is null we are just closing everything.
    public static void close(Statement st,Connection con)
    {
        close(null,st,con);
    }
}
