import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        HelloWord h = new HelloWord();
        Method m=h.getClass().getMethod("sayHello");
        System.out.println(m.getAnnotation(MyNumberAnnotaion.class).value());   
    }
}
 