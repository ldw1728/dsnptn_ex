package main.java.proxy;

import java.util.HashMap;

public class FileDataProxy implements FileData{

    private HashMap<String, byte[]> cachedFileData;
    private FileData obj;

    public FileDataProxy(FileData obj){
        this.obj = obj;
        cachedFileData = new HashMap<>();
    }

    protected boolean isExist(String fileName){
        return cachedFileData.isEmpty() ? false : cachedFileData.containsKey(fileName);
    }

    @Override
    public byte[] getFileData(String fileName) {
        
        byte[] resData = null;

        if(isExist(fileName)){
            
            System.out.println("get FileData from cachedMap");

            resData = cachedFileData.get(fileName);
        }
        else{

            System.out.println("get FileData from stream");

            resData = obj.getFileData(fileName);
            if(resData != null){
                cachedFileData.put(fileName, resData);
           }
        }

        return resData;
    }
    
}
