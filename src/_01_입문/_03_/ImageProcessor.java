package _01_입문._03_;

public class ImageProcessor {
    private ImageFilterStrategy strategy;

    public void setStrategy(ImageFilterStrategy strategy) {
        this.strategy = strategy;
    }

    public String process(String filePath) {
        if (strategy == null) {
            throw new IllegalStateException("필터 전략이 선택되지 않았습니다");
        }
        return strategy.apply(filePath);
    }
}
