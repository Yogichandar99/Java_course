package com.careerit.cj.jdbc;

public class ContactManager
{
    public static void main(String[] args)
    {
        ContactApplication obj=new ContactApplication();
        obj.deleteTable();
        obj.createTable();
        Contact contact = Contact.builder().id(1001).name("Krish").email("krish.t@gmail.com").mobile("9876543210")
                .build();
        obj.addContact(contact);
        Contact contact1 = Contact.builder().id(1002).name("Yogi").email("Yogi@gmail.com").mobile("9848765432")
                .build();
        obj.addContact(contact1);
        Contact contact2 = Contact.builder().id(1003).name("Ram").email("Ram@gmail.com").mobile("9848765431")
                .build();
        obj.addContact(contact2);
        obj.deleteContact(1001);
        obj.deleteContact(1009);
        //To display all the contacts.
        obj.showContact();

        //Contact details that need to be updated
        //passing them as a contact object
        //we should not change the id but we can change rest parameters
        Contact toUpdateContact= Contact.builder().id(1002).name("Yogichandar").email("yogichb11@gmail.com").mobile("9848765432").build();
        obj.update(toUpdateContact);
        //Getting the updated contact
        obj.showContactByID(1002);

    }
}
