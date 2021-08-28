package PatternAbstractFactory.banking;

import PatternAbstractFactory.Developer;

public class SeniorJavaDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Team Lead - writes Java code...");
    }

    @Override
    public void POReviewCode() {
        System.out.println("SeniorJavaDev - Team Lead - Code Review");
    }
}
