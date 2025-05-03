package _01_입문._02_;

public class UpperCaseStrategy implements FormatStrategy{
    @Override
    public String format(String input) {
        return input.toUpperCase();
    }
}
