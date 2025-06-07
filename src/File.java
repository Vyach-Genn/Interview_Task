import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

    public void readFile(String filePath) {
        try {
            Path path = Paths.get(filePath);
            String content = new String(Files.readAllBytes(path));
            System.out.println("Содержание файла: \n" + content);
        } catch (IOException e) {
            System.err.print("Ошибка при чтение файла" + e.getMessage());
        } catch (SecurityException e) {
            System.err.print("Нет права доступа" + e.getMessage());
        } finally {
            System.out.println("Завершение обработки");
        }
    }
}
