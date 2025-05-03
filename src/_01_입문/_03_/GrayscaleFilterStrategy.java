package _01_입문._03_;

public class GrayscaleFilterStrategy implements ImageFilterStrategy{
    @Override
    public String apply(String filePath) {
        String newName = filePath.replace(".", "_grayscale.");
        System.out.println("흑백 필터 적용 → " + newName);
        return newName;
    }
}
