package File_handing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterApp {
    public static void main(String[] args) throws IOException {
        whenWriteStringUsingBufferedWritter_thenCorrect();
    }
    public static void whenWriteStringUsingBufferedWritter_thenCorrect()
        throws IOException{
        File filename = new File("Src/main/resources/file.text");
        FileWriter fileWriter = new FileWriter(filename,true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("Beautiful");
        writer.flush();
        writer.close();


    }

}
