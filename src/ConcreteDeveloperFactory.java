public class ConcreteDeveloperFactory implements IDeveloperAbstractFactory {
    @Override
    public IDeveloper createDeveloper(String language) {
        if (language.equals("java")) {
            return new JavaDeveloper();
        } else if (language.equals("cpp")) {
            return new CppDeveloper();
        } else {
            throw new RuntimeException("Unknown language: " + language);
        }
    }
}
