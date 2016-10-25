package Controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// this class is responsible for handling config.json file for authentication

public class JsonHandler {
    private String dbName;
    private String salt;
    private String saltedHashedPassword;

    public JsonHandler(String dbName, String salt, String saltedHashedPassword) {
        this.dbName = dbName;
        this.salt = salt;
        this.saltedHashedPassword = saltedHashedPassword;
    }

    public String encodeJSON() {
        JSONObject obj = new JSONObject();
        obj.put("database_name", this.dbName);
        obj.put("salt", this.salt);
        obj.put("salted_hashed_password", this.saltedHashedPassword);
        return obj.toString();
    }

    public static String decodeJSON(String key) throws ParseException, IOException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(JsonHandler.readFile());
        JSONObject jsonObject = (JSONObject) obj;
        return (String) jsonObject.get(key);
    }

    public static void writeFile(String json) throws IOException {
        FileWriter file = new FileWriter("config.json");
        file.write(json);
        file.flush();
        file.close();
    }

    public static FileReader readFile() throws FileNotFoundException {
        FileReader configFile = new FileReader("config.json");
        return configFile;
    }
}
