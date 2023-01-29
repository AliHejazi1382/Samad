import InitWorkingDirectory.InitWorkingDirectory;
import common.Date;
import common.EnterPeople;
import common.Food;
import io.ReadPeople;
import user.User;
import utlis.Dinner;
import utlis.Launch;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;

public class Main {
    private static String jarPath() {
        try {
            return Main.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .toURI()
                    .getPath();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//       new InitWorkingDirectory(jarPath()); // Should be replaced with Thread
        User newUser = new User("Ali",
                "Mosayyeb",
                new Food(Launch.GHEIME, Dinner.KEBAB, new Date(245, 455, 43)));


    }
}


