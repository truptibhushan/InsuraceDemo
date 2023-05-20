import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testEat() {
        String foodType = "Pizza";
        Person personObj = new Person();
        String result = personObj.eat(foodType);
        assertEquals("Pizza", result);
    }
}
