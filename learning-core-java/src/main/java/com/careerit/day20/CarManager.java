package com.careerit.day20;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

public class CarManager
{
    public static void main(String[] args)
    {
        List<Car> carList=carDetailsLoader();
        System.out.println(carList);

    }
    //We are taking a method to load the csv file into list(which stores each individual car object)
    private static List<Car> carDetailsLoader()
    {
        //initially taking an empty list carList of car object type
        List<Car> carList=new ArrayList<>();
        //logic
        //Step-1 load the csv file:
        //We will write the code to load url in try block
        try
        {
            URL url = CarManager.class.getResource("/car.csv");
            List<String> list = Files.readAllLines(Paths.get(url.toURI()));
            for(int i=0;i< list.size();i++)
            {
                //getting each individual line
                String data=list.get(i);
                //storing all the information available in the line into an array
                //Each , comma seperates a value
                String arr[]=data.split(",");
                Car object=convertData(arr);
                carList.add(object);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (URISyntaxException e)
        {
            e.printStackTrace();
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        return carList;
    }
    private static Car convertData(String arr[])
    {
        long id = 0;
        if (arr[0].matches("\\d+"))
        {
            id = Long.parseLong(arr[0]);
        }
        String first_name=arr[1];
        String last_name=arr[2];
        String email=arr[3];
        String gender=arr[4];
        String vin=arr[5];
        return new Car(id,first_name,last_name,email,gender,vin);
    }
}
