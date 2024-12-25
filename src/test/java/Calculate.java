import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculate {



    public int methodAdd(int a, int b) {
        return a + b;
    }

    @Test
    void tesasd(){
        Calculate calculate = new Calculate();
        Assert.assertEquals(calculate.methodAdd(5, 5), 10);
        System.out.println("It's Okay");
    }
}
