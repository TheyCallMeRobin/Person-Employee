import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

  @Test
  @DisplayName("Create default person")
  public void testPersonDefault()
  {
    Person p = new Person();
    assertEquals("", p.toString());
    assertEquals("", p.getName());
  }
  @Test
  @DisplayName("Create person with name")
  public void testPersonWithName()
  {
    Person p = new Person("Harry Potter");
    assertEquals("Harry Potter", p.toString());
    assertEquals("Harry Potter", p.getName());
  }
  @Test
  @DisplayName("Set name")
  public void testPersonSetName()
  {
    Person p = new Person();
    p.setName("Harry Potter");
    assertEquals("Harry Potter", p.toString());
    assertEquals("Harry Potter", p.getName());
  }
  @Test
  @DisplayName("Create person with name")
  public void testPersonEquals()
  {
    Person p1 = new Person("Harry Potter");
    Person p2 = new Person("Harry Potter");
    Person p3 = new Person("Sirius Black");
    assertTrue(p1.equals(p2));
    assertFalse(p1.equals(p3));
    assertFalse(p2.equals(p3));
  }
}