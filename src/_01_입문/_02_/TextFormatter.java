package _01_입문._02_;

public class TextFormatter {
    private FormatStrategy strategy;

    public void setStrategy(FormatStrategy strategy) {
        this.strategy = strategy;
    }

    public String execute(String input){
        if(strategy == null){
            throw new IllegalStateException("전략이 설정되지 않았습니다.");
        }
        return strategy.format(input);
    }
}
