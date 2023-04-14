package com.careerit.day24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample
{
    public static void main(String[] args) {
        //Creation of Map
        //Will key what type is key and what type is value is
        // here we are storing id of integer and value of string type
        Map<Integer,String> map=new HashMap<>();
        //adding values to map by put() method
        map.put(1001,"Krish");
        map.put(1002,"Manoj");
        map.put(1003,"Rajesh");
        //For the key 1003 Rajesh is overidden by yogi
        map.put(1003,"Yogi");
        //This method putIfAbsent will push the key and value pair only if it is absent.
        map.putIfAbsent(1004,"Ramesh");
        //Retrieving the map
        //1. getting all the key and values directly
        System.out.println(map);
        //2. Passing the key and getting the values
        //We need to collect all the keys using KeySet
        Set<Integer> keys=map.keySet();
        //looping over the keys to get their values
        for(Integer key:keys)
        {
            System.out.println("key:"+key+" and values is "+map.get(key));
        }
        //Getting all the keys and values using an entry set
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //In java 8 mapentry set was enhanced as follows:
        map.entrySet().forEach(ele->
        {
            System.out.println(ele.getKey()+" "+ele.getValue());
        });
        //Operations
        //To check whether a map is empty or not
        System.out.println(map.isEmpty());
        System.out.println(map.remove(1001));
        System.out.println(map.remove(1002,"Manoj"));
        System.out.println(map);
    }
}
