package _01_입문._03_;

public class SepiaFilterStrategy implements ImageFilterStrategy{
    @Override
    public String apply(String filePath) {
        String newName = filePath.replace(".", "_sepia.");
        System.out.println("세피아 필터 적용 → " + newName);
        return newName;
    }
}
