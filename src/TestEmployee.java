import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestEmployee {

  @Test
  @DisplayName("Create employee and use getters")
  public void testEmployee()
  {
    Employee e = new Employee("Arthur Weasley", 1000.0, 1996, "123-45-6789");
    
    assertEquals("Arthur Weasley", e.getName());
    assertEquals(1000.0, e.getSalary());
    assertEquals(1996, e.getYear());
  }
  @Test
  @DisplayName("Compare employee objects")
  public void testEmployeeEquals()
  {
    Employee e1 = new Employee("Arthur Weasley", 1000.0, 1996, "123-45-6789");
    Employee e2 = new Employee("Arthur Weasley", 1000.0, 1996, "023-45-6789");
    Employee e3 = new Employee("Arthur Weasley", 1000.0, 1996, "123-45-6789");
    assertEquals(e1, e3);
    assertNotEquals(e1, e2);
    assertNotEquals(e3, e2);
  }
  @Test
  @DisplayName("Employee inheritance")
  public void testEmployeeExtends()
  {
    Employee e1 = new Employee("Arthur Weasley", 1000.0, 1996, "123-45-6789");
    assertTrue((e1 instanceof Person));
  }
}