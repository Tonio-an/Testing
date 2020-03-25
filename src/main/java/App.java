import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class App {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
    }
    public static int sum(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("DONE!");
        return d;
    }
}
