package example.hello;

public class Servant implements Hello {

    public Servant() {}

    public String sayHello() {
        return "Hello, world!";
    }

    public int soma (int a, int b) {
        return a + b;
    }
}
