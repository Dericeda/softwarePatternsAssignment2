public class Main {
    public static void main(String[] args) {
        IDeveloperFactory factory;

        String lang = "java";

        if (lang.equals("java")) {
            factory = new JavaDeveloperFactory();
        } else if (lang.equals("cpp")) {
            factory = new CppDeveloperFactory();
        } else {
            throw new RuntimeException("Unknown language: " + lang);
        }

        IDeveloper developer = factory.createDeveloper();
        developer.writeCode();
    }

}