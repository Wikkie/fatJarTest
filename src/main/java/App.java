
import com.google.common.base.Joiner;

public class App {
    public String getGreeting() {
        return "Hello world." + Joiner.on(", ").skipNulls().join(1,2,3,4, null, 5,6,7,8);
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
