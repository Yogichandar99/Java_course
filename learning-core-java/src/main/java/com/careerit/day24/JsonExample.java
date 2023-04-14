package com.careerit.day24;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample
{
    public static void main(String[] args) throws JsonProcessingException {
        String data="{\"id\":1001,\"username\":\"Krishna\",\"password\":\"Krish@123\"}";

        //If we want to split the data, we are taking help of third party libraries such as jackson
        //we are creating an object for accessing the imported class
        ObjectMapper objectMapper=new ObjectMapper();
        //we are creating a user type object to convert the given string into user data
        User user=objectMapper.readValue(data,User.class);
        System.out.println(user);

        //Splitting an array of json objects
        String data1="[{\"id\":1,\"username\":\"krish\",\"password\":\"krish@123\"},{\"id\":2,\"username\":\"manoj\",\"password\":\"manoj@123\"}]";
        //We are taking an array to store the objects
        User[] user1=objectMapper.readValue(data1,User[].class);
        System.out.println(user1);
    }
}
