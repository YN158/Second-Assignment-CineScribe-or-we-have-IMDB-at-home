import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Actors
{
    public static final String API_KEY = "m1VvjWeAKHsw3K8p7TBv6A==ADa8dFodXrwsZ20Z";   // TODO --> add your api key about Actors here
    String netWorth = "";
    Boolean isAlive = false;
    String Name = "";
    String DateOfDeath = "";

    private String PS;


    public Actors(String netWorth, boolean isAlive)
    {
        //TODO --> (Write a proper constructor using the get_from_api functions)
    }
    @SuppressWarnings({"deprecation"})
    /**
     * Retrieves data for the specified actor.
     * @param name for which Actor should be retrieved
     * @return a string representation of the Actors info or null if an error occurred
     */
    public String getActorData(String name)
    {
        Name = name;
        try {
            URL url = new URL("https://api.api-ninjas.com/v1/celebrity?name="+
                    name.replace(" ", "+")+"&apikey="+API_KEY);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Api-Key", API_KEY);

            System.out.println(connection);
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null)
                {
                    response.append(inputLine);
                    System.out.println(inputLine);
                    PS = inputLine.toString();
                }

                int NWindex = PS.indexOf("net_worth");
                int NWindex2 = PS.indexOf(",", NWindex);
                netWorth = PS.substring(NWindex+12, NWindex2);

                int LSindex = PS.indexOf("is_alive");
                String PS2 = PS.substring(LSindex+11);
                if (PS2.equals("t"))
                {
                    isAlive = true;
                }
                else if (PS2.equals("f"))
                {
                    isAlive = false;
                }

                if (!isAlive)
                {
                    int TDindex = PS.indexOf("death");
                    int TDindex2 = PS.indexOf("}", TDindex);
                    DateOfDeath = PS.substring(TDindex+11, TDindex2-1);
                }

                in.close();
                return response.toString();
            }
            else
            {
                return "Error: " + connection.getResponseCode() + " " + connection.getResponseMessage();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public double getNetWorthViaApi(String actorsInfoJson)
    {
        //TODO --> (This function must return the "NetWorth")
        double result = Double.parseDouble(netWorth);;
        return result;
    }

    public boolean isAlive(String actorsInfoJson)
    {
        //TODO --> (If your chosen actor is alive it must return true otherwise it must return false)
        boolean statues = isAlive;
        return statues;
    }

    public String getDateOfDeathViaApi(String actorsInfoJson)
    {
        //TODO --> (If your chosen actor is deceased it must return the date of death)  -->
        String date = DateOfDeath;
        return date;
    }

}