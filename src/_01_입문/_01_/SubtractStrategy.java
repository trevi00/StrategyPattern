package _01_입문._01_;

public class SubtractStrategy implements CalculateStrategy{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
