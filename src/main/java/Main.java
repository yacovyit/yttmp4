import com.github.axet.vget.VGet;

import java.io.File;
import java.net.URL;

/**
 * Created by yacovyitzhak on 06/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://www.youtube.com/watch?v=qQB2NXfJev0";
            String path = "/Users/yacovyitzhak/tmp/";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
