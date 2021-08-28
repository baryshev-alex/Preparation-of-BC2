package PatternFactoryMethod;

public class JavaDeveloperFactory implements DevelopreFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
