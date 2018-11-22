import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {

    @Test
    public void testFile(){
        String input="C:/Users/liu/Pictures/12.jpg";
        String output="C:/Users/liu/Pictures/12_01.jpg";
        this.fileCopy(input,output);


    }


    public void fileCopy(String input,String output){

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(new File(input));
            fos = new FileOutputStream(new File(output));

            byte[] b = new byte[1024];
            int len;

            while((len = fis.read(b)) != -1){
                fos.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
