import java.util.*;
import java.io.*;
public class HelloWorld {
    public void hello()
    {
        System.out.println("Hello World!!!");
    }
    public static void main(String[] args)
    {
        //클래스->객체
        HelloWorld hw = new HelloWorld();
        //메소트 호출
        hw.hello();
    }
}
