package com.careerit.cj.jdbc;

import java.sql.*;

public class JDBCConnectionExample
{
    public static void main(String[] args)
    {
        //Creating objects to get connection,execute statement and hold the result set
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try
        {
            //Driver manager is used to get the connection details(we are passing url,user and password)
            con= ConnectionUtil.getconnection();
            //Writes the driver name of database connection we are using
            System.out.println(con.getMetaData().getDriverName());
            st=con.createStatement();
            rs=st.executeQuery("select ename,deptno from emp where ename='ALLEN'");
            while(rs.next())
            {
                String eName=rs.getString("ename");
                long deptNo=rs.getLong("deptno");
                System.out.println("emp name: "+eName+" dept no: "+deptNo);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        //closing all the resources that are opened.
        finally
        {
            ConnectionUtil.close(rs,st,con);

            /*
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }

             */
        }



    }
}
