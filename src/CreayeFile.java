import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreayeFile {
    public static StringBuffer sb = new StringBuffer();
    public static void createDirectory(String directory, String file){
        File directory6 = new File(directory, file);
        if(directory6.mkdir()) {
            sb.append(directory6.getName() + " " + "Папка создана\n");
        } else
        System.out.println(directory6.getName() + " " + "Папка не создана");
    }
    public static void createFile(String file){
        File file1 = new File(file);
        try {
            if(file1.createNewFile()) {
                sb.append(file1.getName() + " " + "Файл создан\n");
            } else
                System.out.println(file1.getName() + " " + "Файл не создан");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        createDirectory("/Users/uliagudkova/Games", "/src");
        createDirectory("/Users/uliagudkova/Games", "/res");
        createDirectory("/Users/uliagudkova/Games", "/savegames");
        createDirectory("/Users/uliagudkova/Games", "/temp");
        createDirectory("/Users/uliagudkova/Games/src", "/main");
        createDirectory("/Users/uliagudkova/Games/src", "/test");
        createFile("/Users/uliagudkova/Games/src/main/Main.java");
        createFile("/Users/uliagudkova/Games/src/main/Utils.java");
        createDirectory("/Users/uliagudkova/Games/src", "/drawables");
        createDirectory("/Users/uliagudkova/Games/src", "/vectors");
        createDirectory("/Users/uliagudkova/Games/res", "/icons");
        createFile("/Users/uliagudkova/Games/temp/temp.txt");

        System.out.println(sb);

        try(FileWriter fw = new FileWriter("/Users/uliagudkova/Games/temp/temp.txt")){
            fw.write(String.valueOf(sb));
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
