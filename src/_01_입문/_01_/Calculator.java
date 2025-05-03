package _01_입문._01_;

public class Calculator {
    private CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int excute(int a, int b){
        if(strategy == null){
            throw new IllegalStateException("전략이 설정되지 않았습니다.");
        }
        return strategy.calculate(a, b);
    }
}
