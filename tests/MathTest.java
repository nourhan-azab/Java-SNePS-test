package tests;

import junit.framework.TestCase;
import main.Calculation;

public class MathTest extends TestCase {
private int value1;
private int value2;
public MathTest(String testName) {
super(testName);
}
protected void setUp() throws Exception {
super.setUp();
value1 = 3;
value2 = 5;
}
protected void tearDown() throws Exception {
super.tearDown();
value1 = 0;
value2 = 0;


}
public void testAdd() {
int total = 8;
int sum = Calculation.add(value1, value2);
assertEquals(sum, total);
}
public void testFailedAdd() {
int total = 9;
int sum = Calculation.add(value1, value2);
assertNotSame(sum, total);
}

}
