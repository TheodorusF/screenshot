import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread{

    String ACCESS_TOKEN;

    public MyThread(String ACCESS_TOKEN){
        this.ACCESS_TOKEN = ACCESS_TOKEN;
    }

    public void run(){

        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");

        Rectangle screen = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        for(int i = 0; i < 5; i++){ //Написал только до 5, но можно поставить for(;;)
            String name = dataFormat.format(new Date());

            try{
                BufferedImage image = new Robot().createScreenCapture(screen);
                ByteArrayOutputStream outputFile = new ByteArrayOutputStream();
                ImageIO.write(image, "png", outputFile);

                InputStream in = new ByteArrayInputStream(outputFile.toByteArray());
                FileMetadata metadata = client.files()
                        .uploadBuilder("/" + name + ".png")
                        .uploadAndFinish(in);
                sleep(3000); //поставил столько, т.к. среднее время 1 итерации 2 секунды.
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
