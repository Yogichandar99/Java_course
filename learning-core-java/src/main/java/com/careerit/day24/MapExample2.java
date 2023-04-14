package com.careerit.day24;

import java.util.HashMap;
import java.util.Map;

public class MapExample2
{
    public static void main(String[] args)
    {
                Map<String, Integer> map = new HashMap<>();
                //Here string in the key and integer is the value
        //initially krish,0 into map is inserted
                map.putIfAbsent("Krish", 0);
                //value=0
                int value = map.get("Krish");
                //updating value to 1
                map.put("Krish", value + 1);
                //adding manoj,0 to map
                map.putIfAbsent("Manoj", 0);
                //updating manoj ad manoj,1 as map.get(manoj) return 0 and adding 1 to it
                map.put("Manoj", map.get("Manoj") + 1);
                System.out.println(map);
                //final output krish 1, manoj,1



    }
}
