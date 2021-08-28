package PatternFactoryMethod;

public class Program {
    public static void main(String[] args) {
//      в зависимости от аргумента передаваемого в метод createDeveloperBySpeciality выводится соответствующий текст

        DevelopreFactory developreFactory = createDeveloperBySpeciality("с++");
        Developer developer = developreFactory.createDeveloper();

        developer.writeCode();
    }

    static DevelopreFactory createDeveloperBySpeciality(String speciality) {
//        System.out.println(speciality);
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if(speciality.equalsIgnoreCase("с++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality!");
        }
    }
}
