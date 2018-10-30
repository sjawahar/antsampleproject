package olleh;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldUT {

    @Test
    public void test_add_to_stack(){
        //Arrange
        HelloWorld mstack = new HelloWorld();

        //Act
        mstack.push(10);

        //Assert
        assertEquals(1,mstack.getCount());
    }
    @Test
    public void test_add_to_stack_overflow(){
        //Arrange
        HelloWorld mstack = new HelloWorld();

        //Act
        mstack.push(10);
        mstack.push(10);
        mstack.push(10);

        mstack.push(10);
        mstack.push(10);
        mstack.push(10);

        mstack.push(10);
        mstack.push(10);
        mstack.push(10);

        mstack.push(10);
        mstack.push(10);

        //Assert
        assertEquals(1,mstack.getCount());
    }
}
