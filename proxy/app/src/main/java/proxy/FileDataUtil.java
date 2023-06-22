package main.java.proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDataUtil implements FileData{
    
    @Override
    public byte[] getFileData(String fileName) {

        FileInputStream fio = null;
        byte[] resByteArr = null;

        try{

            File file = new File(fileName);
            fio = new FileInputStream(file);
            resByteArr = fio.readAllBytes();
            fio.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        return resByteArr;

    }
}
