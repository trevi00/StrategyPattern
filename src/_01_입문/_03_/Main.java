package _01_입문._03_;

public class Main {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor();
        String originalFile = "sample.jpg";

        // 흑백 필터 테스트
        processor.setStrategy(new GrayscaleFilterStrategy());
        String result1 = processor.process(originalFile);

        // 세피아 필터 테스트
        processor.setStrategy(new SepiaFilterStrategy());
        String result2 = processor.process(originalFile);
    }
}
