package PatternBuilder;

public enum Tuning {
    CHROME, LEATHER, WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}