package com.careerit.cj.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactApplication
{
    //Drop table statement
    private static final String DROP_TABLE="drop table contact";
    //Initially taking a statement to execute the query to create a contact table
    private static final String CREATE_TABLE="" +
            "create table contact(id int,name varchar(100),email varchar(200),mobile varchar(20))";
    //We need to drop the table before if the table exists
    private static final String ADD_CONTACT="insert into contact(id,name,email,mobile) values(?,?,?,?)";
    private static final String DELETE_CONTACT="delete from contact where id=?";
    private static final String GET_ALL_CONTACTS="select id,name,email,mobile from contact";
    private static final String GET_CONTACT="select id,name,email,mobile from contact where id=?";
    private static final String UPDATE_CONTACT="update contact set name=? email=? mobile=?";
    public static void deleteTable()
    {
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionUtil.getconnection();
            st= con.createStatement();
            //As it is ddl command we are going with execute
            //DMl-executeQuery
            st.execute(DROP_TABLE);
        }
        catch(SQLException e)
        {
            System.out.println("while deleting the table "+e);
        }
        finally
        {
            ConnectionUtil.close(st,con);
        }

    }
    public static void createTable()
    {
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionUtil.getconnection();
            st= con.createStatement();
            //As it is ddl command we are going with execute
            //DMl-executeQuery
            st.execute(CREATE_TABLE);
        }
        catch(SQLException e)
        {
            System.out.println("while creating the table "+e);
        }
        finally
        {
            ConnectionUtil.close(st,con);
        }
    }
    public static void addContact(Contact contact)
    {
        Connection con=null;
        PreparedStatement pst=null;
        try{
            con=ConnectionUtil.getconnection();
            pst= con.prepareStatement(ADD_CONTACT);
            //Setting all the values
            pst.setInt(1,contact.getId());
            pst.setString(2, contact.getName());
            pst.setString(3,contact.getEmail());
            pst.setString(4,contact.getMobile());
            //As it is update which is DMl-executeUpdate
            int count = pst.executeUpdate();
            System.out.println("Total "+count+" contact(s) are added");
        }
        catch(SQLException e)
        {
            System.out.println("while creating the table "+e);
        }
        finally
        {
            ConnectionUtil.close(pst,con);
        }

    }
    //By passing the id we delete the contact
    public static void deleteContact(int cid)
    {
        Connection con=null;
        PreparedStatement pst=null;
        try{
            con=ConnectionUtil.getconnection();
            pst= con.prepareStatement(DELETE_CONTACT);
            pst.setInt(1,cid);
            int count=pst.executeUpdate();
            if(count!=0)
            {
                System.out.println("Contact with id "+cid+" is deleted");
            }
            else
            {
                System.out.println("Contact not found");
            }
        }
        catch(SQLException e)
        {
            System.out.println("while deleting the contact "+e);
        }
        finally
        {
            ConnectionUtil.close(pst,con);
        }

    }
    //To display the details from the contact table
    public static void showContact()
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            con=ConnectionUtil.getconnection();
            st= con.createStatement();
            rs=st.executeQuery(GET_ALL_CONTACTS);
            List<Contact> list=new ArrayList<>();
            while(rs.next())
            {
                int cid=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                String mobile=rs.getString("mobile");
                Contact contact= Contact.builder().id(cid).name(name).email(email).mobile(mobile).build();
                list.add(contact);
            }
            if(list.isEmpty())
            {
                System.out.println("No contacts in the given list");
            }
            else{
                for(Contact ct:list)
                {
                    System.out.println(ct+" ");
                }
            }

        }
        catch (SQLException e)
        {
            System.out.println("while retrieving all the contact "+e);
        }
        finally
        {
            ConnectionUtil.close(rs,st,con);
        }
    }
    public static void showContactByID(int cid)
    {
        Connection con=null;
        PreparedStatement pst=null;
        try{
            con=ConnectionUtil.getconnection();
            pst= con.prepareStatement(GET_CONTACT);
            pst.setInt(1,cid);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                String name=rs.getString("name");
                String email=rs.getString("email");
                String mobile=rs.getString("mobile");
                System.out.println("For the given id "+cid+ " name of contact: "+name+" email: "+email+ " mobile "+mobile);
            }
        }
        catch(SQLException e)
        {
            System.out.println("while getting the contact by id  "+e);
        }
        finally
        {
            ConnectionUtil.close(pst,con);
        }

    }
    public static void update(Contact contact)
    {
        Connection con=null;
        PreparedStatement pst=null;
        try{
            con=ConnectionUtil.getconnection();
            pst=con.prepareStatement(UPDATE_CONTACT);
            pst.setString(1,contact.getName());
            pst.setString(2,contact.getEmail());
            pst.setString(3, contact.getMobile());
        }
        catch(SQLException e)
        {
            System.out.println("while updating the contact "+e);
        }
        finally
        {
            ConnectionUtil.close(pst,con);
        }


    }


}
