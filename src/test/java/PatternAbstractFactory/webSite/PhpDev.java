package PatternAbstractFactory.webSite;

import PatternAbstractFactory.Developer;

public class PhpDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP Dev - write PHP code");
    }

    @Override
    public void POReviewCode() {

    }
}
