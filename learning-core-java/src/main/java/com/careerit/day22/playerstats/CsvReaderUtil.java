package com.careerit.day22.playerstats;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

//We are using final because we dont want any subclasses to be created for this class
final public class CsvReaderUtil
{
    //A private constructor
    private CsvReaderUtil() {

    }
    //we need to have static methods for private classes in order to access them
    public static List<Player> loadPlayers() throws IOException
    {
        //Initially we are taking an empty array list to store the players
        List<Player> playerInfo=new ArrayList<>();

        //We are getting the file Name using variable called as fileName
        String fileName = PlayerServices.class.getResource("/player.csv").getFile();

        //we are accessing the file using Reader class object which is prebuilt library(Reader)
        Reader in = new FileReader(fileName);

        //Specifying all the headers in the file
        final String[] HEADERS = "name,role,amount,country,team".split(",");

        /* taken help of CSVFORMAT to read the file and
        mentioned that we have a header line in the file and neglected it */
        //Default means it takes comma as separator
        //Skip the headers and build a CsvFormat object using comma as separator
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(HEADERS)
                .setSkipHeaderRecord(true)
                .build();
        //we are getting all the records in CSvRecord
        Iterable<CSVRecord> records = csvFormat.parse(in);
        for (CSVRecord csvRecord : records)
        {
            //getting individual fields
            String name = csvRecord.get("name");
            String role = csvRecord.get("role");
            double amount = Double.parseDouble(csvRecord.get("amount"));
            String country = csvRecord.get("country");
            String team = csvRecord.get("team");
            //Setting obtained records to player object
            //we can use the builder or setters to set the values
            Player player = Player.builder()
                    .name(name)
                    .team(team)
                    .amount(amount)
                    .role(role)
                    .team(team).build();
            playerInfo.add(player);
        }
        return playerInfo;
    }
}
