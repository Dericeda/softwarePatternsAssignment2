public class CppDeveloperFactory implements IDeveloperFactory {
    @Override
    public IDeveloper createDeveloper() {
        return new CppDeveloper();
    }
}