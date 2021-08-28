package PatternFactoryMethod;

public class CppDeveloperFactory implements DevelopreFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
