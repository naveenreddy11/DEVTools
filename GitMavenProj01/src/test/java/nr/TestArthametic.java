package nr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nr.Arithmetic.Sum;

public class TestArthametic {
Sum s=new Sum();
int sum=s.arthameticsum(5, 5);


@Test
public void withpositivevalue() {
	s.arthameticsum(5, 2);
	int expected=10;
	int actual=7;
	assertEquals(10, sum);
}}
