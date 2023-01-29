import InitWorkingDirectory.InitWorkingDirectory;
import common.EnterPeople;

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
       new InitWorkingDirectory(jarPath()); // Should be replaced with Thread

    }
}


