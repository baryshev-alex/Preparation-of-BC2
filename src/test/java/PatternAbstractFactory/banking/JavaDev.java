package PatternAbstractFactory.banking;

import PatternAbstractFactory.Developer;

public class JavaDev implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Dev - writes Java code...");
    }

    @Override
    public void POReviewCode() {

    }
}
