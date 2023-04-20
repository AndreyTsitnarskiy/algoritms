package recursiveFileFindSystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecursiveFile {

    public static void recursiveSearch(File file, List<File> fileList) {
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files != null){
                for(File f : files){
                    if(f.isDirectory()){
                        recursiveSearch(f, fileList);
                    }else{
                        if(f.getName().toLowerCase().endsWith(".jpg")){
                            fileList.add(f);
                        }
                    }
                }
            }
        }
    }

    public static void printResult(File file){
        List<File> fileList = new ArrayList<>();
        recursiveSearch(file, fileList);
        for (File f : fileList) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
