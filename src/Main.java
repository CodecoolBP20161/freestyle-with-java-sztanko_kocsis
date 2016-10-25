import Controller.JsonHandler;
import Frames.LoginFrame;
import org.json.simple.parser.ParseException;

import java.io.IOException;

//main class to start the password manager

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
//        LoginFrame login = new LoginFrame();

        JsonHandler handler = new JsonHandler("kiskacsa", "élkmlkm", "nkljnkjnkj");
        String json = handler.encodeJSON();
        JsonHandler.writeFile(json);
//
//        String password = JsonHandler.decodeJSON("salted_hashed_password");
//        System.out.println(password);

        }

    }
