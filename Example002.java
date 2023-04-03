import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо. Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
 */
public class Example002 {
    public static void main(String[] args){
        Path file = Path.of("file.txt", args);
        try{
            Files.createFile(file);
        } catch (IOException e){
            System.out.println("Файл существует");
        }

        try{
            Files.writeString(file,createString());
        } catch (IOException e){
                
        }
        }
        // if (Files.exists(file)){
        //     System.out.println("Файл найден");
        // } else{
        //     System.out.println("Файл не найден");
        // }
        private static StringBuilder createString() {  
            StringBuilder String = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    String.append("TEST");
                }
                return String;
        }
}
