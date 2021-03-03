package sktest.demo.ins.rel.cls;

import org.junit.jupiter.api.Test;
import org.shaneking.demo.ins.rel.cls.Extend1;
import org.shaneking.demo.ins.rel.cls.Extend2;
import org.shaneking.demo.ins.rel.cls.Extend3;
import org.shaneking.ling.test.SKUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendTest extends SKUnit {
  @Test
  public void instanceOf33() {
    assertEquals(true, new Extend3() instanceof Extend3);
  }

  @Test
  public void instanceOf32() {
    assertEquals(true, new Extend3() instanceof Extend2);
  }

  @Test
  public void instanceOf31() {
    assertEquals(true, new Extend3() instanceof Extend1);
  }

  @Test
  public void instanceOf23() {
    assertEquals(false, new Extend2() instanceof Extend3);
  }

  @Test
  public void instanceOf22() {
    assertEquals(true, new Extend2() instanceof Extend2);
  }

  @Test
  public void instanceOf21() {
    assertEquals(true, new Extend2() instanceof Extend1);
  }

  @Test
  public void instanceOf13() {
    assertEquals(false, new Extend1() instanceof Extend3);
  }

  @Test
  public void instanceOf12() {
    assertEquals(false, new Extend1() instanceof Extend2);
  }

  @Test
  public void instanceOf11() {
    assertEquals(true, new Extend1() instanceof Extend1);
  }

  @Test
  public void isInstance33() {
    assertEquals(true, new Extend3() instanceof Extend3);
  }

  @Test
  public void isInstance32() {
    assertEquals(false, new Extend2() instanceof Extend3);
  }

  @Test
  public void isInstance31() {
    assertEquals(false, new Extend1() instanceof Extend3);
  }

  @Test
  public void isInstance23() {
    assertEquals(true, new Extend3() instanceof Extend2);
  }

  @Test
  public void isInstance22() {
    assertEquals(true, new Extend2() instanceof Extend2);
  }

  @Test
  public void isInstance21() {
    assertEquals(false, new Extend1() instanceof Extend2);
  }

  @Test
  public void isInstance13() {
    assertEquals(true, new Extend3() instanceof Extend1);
  }

  @Test
  public void isInstance12() {
    assertEquals(true, new Extend2() instanceof Extend1);
  }

  @Test
  public void isInstance11() {
    assertEquals(true, new Extend1() instanceof Extend1);
  }

  @Test
  public void isAssignableFrom33() {
    assertEquals(true, Extend3.class.isAssignableFrom(Extend3.class));
  }

  @Test
  public void isAssignableFrom32() {
    assertEquals(false, Extend3.class.isAssignableFrom(Extend2.class));
  }

  @Test
  public void isAssignableFrom31() {
    assertEquals(false, Extend3.class.isAssignableFrom(Extend1.class));
  }

  @Test
  public void isAssignableFrom23() {
    assertEquals(true, Extend2.class.isAssignableFrom(Extend3.class));
  }

  @Test
  public void isAssignableFrom22() {
    assertEquals(true, Extend2.class.isAssignableFrom(Extend2.class));
  }

  @Test
  public void isAssignableFrom21() {
    assertEquals(false, Extend2.class.isAssignableFrom(Extend1.class));
  }

  @Test
  public void isAssignableFrom13() {
    assertEquals(true, Extend1.class.isAssignableFrom(Extend3.class));
  }

  @Test
  public void isAssignableFrom12() {
    assertEquals(true, Extend1.class.isAssignableFrom(Extend2.class));
  }

  @Test
  public void isAssignableFrom11() {
    assertEquals(true, Extend1.class.isAssignableFrom(Extend1.class));
  }
}
