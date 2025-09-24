public class JavaDeveloperFactory implements IDeveloperFactory{
    @Override
    public IDeveloper createDeveloper(){
        return new JavaDeveloper();
    }
}