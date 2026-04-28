package lecture.exam03;

public class Application {
    public static void main(String[] args) {

        FileService fileService = new FileService();

        fileService.createFile();
        fileService.readFile();

        System.out.println("프로그램 종료");

    }
}
