package Data.data;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JsonDataReader {
    public String firstName, lastName, email, password;

    public void JsonReader() throws  IOException, ParseException {

        String filePath = System.getProperty("user.dir")+"/src/test/java/org/example/data/userData.json";
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();
        JSONArray jsonArray =  (JSONArray) parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jsonArray)
        {
            JSONObject person =  (JSONObject)jsonObj;
            firstName = (String) person.get("firstname");
            lastName = (String) person.get("lastname");
            email = (String) person.get("email");
            password = (String) person.get("password");

        }
    }
}
