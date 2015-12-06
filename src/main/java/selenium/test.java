package selenium;

/**
 * Created by Mihai on 12/5/2015.
 */
public class test {
    private static test ourInstance = new test();

    public static test getInstance() {
        return ourInstance;
    }

    private test() {
    }
}
