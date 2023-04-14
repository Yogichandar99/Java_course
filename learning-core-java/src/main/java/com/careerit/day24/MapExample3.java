package com.careerit.day24;

import java.util.HashMap;
import java.util.Map;

public class MapExample3
{
    public static void main(String[] args) {
        String data="Learning java is fun java is high level programming language";
        String arr[]=data.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String ele:arr)
        {
            map.putIfAbsent(ele,0);
            map.put(ele,map.get(ele)+1);
        }
        System.out.println(map);
    }
}
