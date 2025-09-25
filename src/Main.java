public class Main {
    public static void main(String[] args) {

        IDeveloperAbstractFactory abstractFactory = new ConcreteDeveloperFactory();
        IDeveloper javaDev = abstractFactory.createDeveloper("java");
        IDeveloper cppDev = abstractFactory.createDeveloper("cpp");

        javaDev.writeCode();
        cppDev.writeCode();

//        IDeveloperFactory factory = new JavaDeveloperFactory();
//        IDeveloper dev1 = factory.createDeveloper();
//        dev1.writeCode();


    }

}