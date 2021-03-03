package sktest.demo.ins.rel.cls;

import org.junit.jupiter.api.Test;
import org.shaneking.demo.ins.rel.cls.Implement1;
import org.shaneking.demo.ins.rel.cls.Implement2;
import org.shaneking.demo.ins.rel.cls.Implement3;
import org.shaneking.demo.ins.rel.cls.Implement4;
import org.shaneking.ling.test.SKUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImplementTest extends SKUnit {
  @Test
  public void instanceOf44() {
    assertEquals(true, new Implement4() instanceof Implement4);
  }

  @Test
  public void instanceOf43() {
    assertEquals(true, new Implement4() instanceof Implement3);
  }

  @Test
  public void instanceOf42() {
    assertEquals(true, new Implement4() instanceof Implement2);
  }

  @Test
  public void instanceOf41() {
    assertEquals(true, new Implement4() instanceof Implement1);
  }

  @Test
  public void instanceOf34() {
    assertEquals(false, new Implement3() instanceof Implement4);
  }

  @Test
  public void instanceOf33() {
    assertEquals(true, new Implement3() instanceof Implement3);
  }

  @Test
  public void instanceOf32() {
    assertEquals(true, new Implement3() instanceof Implement2);
  }

  @Test
  public void instanceOf31() {
    assertEquals(true, new Implement3() instanceof Implement1);
  }

  @Test
  public void isInstance44() {
    assertEquals(true, new Implement4() instanceof Implement4);
  }

  @Test
  public void isInstance43() {
    assertEquals(false, new Implement3() instanceof Implement4);
  }

  @Test
  public void isInstance34() {
    assertEquals(true, new Implement4() instanceof Implement3);
  }

  @Test
  public void isInstance33() {
    assertEquals(true, new Implement3() instanceof Implement3);
  }

  @Test
  public void isInstance24() {
    assertEquals(true, new Implement4() instanceof Implement2);
  }

  @Test
  public void isInstance23() {
    assertEquals(true, new Implement3() instanceof Implement2);
  }

  @Test
  public void isInstance14() {
    assertEquals(true, new Implement4() instanceof Implement1);
  }

  @Test
  public void isInstance13() {
    assertEquals(true, new Implement3() instanceof Implement1);
  }

  @Test
  public void isAssignableFrom44() {
    assertEquals(true, Implement4.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom43() {
    assertEquals(false, Implement4.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom42() {
    assertEquals(false, Implement4.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom41() {
    assertEquals(false, Implement4.class.isAssignableFrom(Implement1.class));
  }

  @Test
  public void isAssignableFrom34() {
    assertEquals(true, Implement3.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom33() {
    assertEquals(true, Implement3.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom32() {
    assertEquals(false, Implement3.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom31() {
    assertEquals(false, Implement3.class.isAssignableFrom(Implement1.class));
  }

  @Test
  public void isAssignableFrom24() {
    assertEquals(true, Implement2.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom23() {
    assertEquals(true, Implement2.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom22() {
    assertEquals(true, Implement2.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom21() {
    assertEquals(false, Implement2.class.isAssignableFrom(Implement1.class));
  }

  @Test
  public void isAssignableFrom14() {
    assertEquals(true, Implement1.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom13() {
    assertEquals(true, Implement1.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom12() {
    assertEquals(true, Implement1.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom11() {
    assertEquals(true, Implement1.class.isAssignableFrom(Implement1.class));
  }
}
