import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by admin on 17.03.2017.
 */
public class killthis {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://4pda.ru/forum/index.php?act=idx");
        HttpURLConnection conn= (HttpURLConnection) url.openConnection();
        try(InputStream is=conn.getInputStream()){
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            while (true){
                int c=is.read();
                if (c<0) break;
                bos.write(c);
            }
            System.out.println(bos.toString("Cp1251"));
        }
        conn.disconnect();
    }
}
