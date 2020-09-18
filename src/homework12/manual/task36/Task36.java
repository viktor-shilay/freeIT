package homework12.manual.task36;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
 */

public class Task36 {
    public static void main(String[] args) {
        getFiles("src\\homework12\\manual\\task36\\TestFolder", "");
    }

    public static void getFiles(String path, String separator){
        File folder = new File(path);
        System.out.println(separator + "\uD83D\uDCC2" + folder.getName());
        File[] files = folder.listFiles();
        if (files == null){
            System.out.println("Something went wrong!");
            return;
        }
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (o1.isDirectory() == o2.isDirectory()) {
                    return 0;
                }else if (o2.isFile()){
                    return -1;
                    }
                return 1;
            }
        });
        separator += "|  ";
        for (File file:files){
            if(file.isDirectory()){
                getFiles(file.getAbsolutePath(), separator);
            }
            else{
                System.out.println(separator.substring(0, separator.length()-3) + "└──"+ file.getName());
            }
        }
    }
}
