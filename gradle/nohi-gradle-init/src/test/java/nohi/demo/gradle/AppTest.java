/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nohi.demo.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        System.out.println("====测试=====");
        App classUnderTest = new App();
        assertNotNull("app should have a greeting 测试", classUnderTest.getGreeting());
    }
}
