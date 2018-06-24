
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;


/**
 *
 * @author Michelle
 */
public class PruebaJBrowser {
    
 public void dowloadMap(String location){
     
     try{
         
         String imageURL = "https://www.google.com/maps/place/Hangzhou,+Zhejiang,+China/@30.2616855,119.8916835,10z/data="
               + URLEncoder.encode(location, "UTF-8") + "!3m1!4b1!4m5!3m4!1s0x344bb629439aaa99:0xa7bfd183824de83a!8m2!3d30.274084!4d120.15507";
         URL url = new URL(imageURL);
         InputStream is = url.openStream();
         OutputStream os = new FileOutputStream(location);
         byte[] b= new byte[2048];
         int length;
         while((length = is.read(b)) != -1){
             os.write(b, 0 ,length);
         }
     }
     catch(Exception e){
         e.printStackTrace();
     }
     
 }
    
}
