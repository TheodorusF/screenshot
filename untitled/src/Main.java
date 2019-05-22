import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args){

        MyThread thread1 = new MyThread("Epbn3llC8UAAAAAAAAAD9p3x2msHyYQ1jTflviPGcGReffWl6-eQPd_cByuiSbuQ");
        thread1.start();

//        BufferedImage image1 = new Robot().createScreenCapture(new Rectangle(Toolkit
//                .getDefaultToolkit()
//                .getScreenSize()));
//
//        String ACCESS_TOKEN = "Epbn3llC8UAAAAAAAAAD9p3x2msHyYQ1jTflviPGcGReffWl6-eQPd_cByuiSbuQ";
//
//        // Create Dropbox client
//        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
//        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
//
//        try{
//            InputStream in = new FileInputStream("test.txt");
//            FileMetadata metadata = client.files()
//                    .uploadBuilder("/test2.txt")
//                    .uploadAndFinish(in);
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }
    }
}

