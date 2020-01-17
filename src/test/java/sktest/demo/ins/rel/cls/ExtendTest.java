package sktest.demo.ins.rel.cls;

import org.junit.Assert;
import org.junit.Test;
import org.shaneking.demo.ins.rel.cls.Extend1;
import org.shaneking.demo.ins.rel.cls.Extend2;
import org.shaneking.demo.ins.rel.cls.Extend3;

public class ExtendTest {
  @Test
  public void instanceOf33() {
    Assert.assertEquals(true, new Extend3() instanceof Extend3);
  }

  @Test
  public void instanceOf32() {
    Assert.assertEquals(true, new Extend3() instanceof Extend2);
  }

  @Test
  public void instanceOf31() {
    Assert.assertEquals(true, new Extend3() instanceof Extend1);
  }

  @Test
  public void instanceOf23() {
    Assert.assertEquals(false, new Extend2() instanceof Extend3);
  }

  @Test
  public void instanceOf22() {
    Assert.assertEquals(true, new Extend2() instanceof Extend2);
  }

  @Test
  public void instanceOf21() {
    Assert.assertEquals(true, new Extend2() instanceof Extend1);
  }

  @Test
  public void instanceOf13() {
    Assert.assertEquals(false, new Extend1() instanceof Extend3);
  }

  @Test
  public void instanceOf12() {
    Assert.assertEquals(false, new Extend1() instanceof Extend2);
  }

  @Test
  public void instanceOf11() {
    Assert.assertEquals(true, new Extend1() instanceof Extend1);
  }

  @Test
  public void isInstance33() {
    Assert.assertEquals(true, new Extend3() instanceof Extend3);
  }

  @Test
  public void isInstance32() {
    Assert.assertEquals(false, new Extend2() instanceof Extend3);
  }

  @Test
  public void isInstance31() {
    Assert.assertEquals(false, new Extend1() instanceof Extend3);
  }

  @Test
  public void isInstance23() {
    Assert.assertEquals(true, new Extend3() instanceof Extend2);
  }

  @Test
  public void isInstance22() {
    Assert.assertEquals(true, new Extend2() instanceof Extend2);
  }

  @Test
  public void isInstance21() {
    Assert.assertEquals(false, new Extend1() instanceof Extend2);
  }

  @Test
  public void isInstance13() {
    Assert.assertEquals(true, new Extend3() instanceof Extend1);
  }

  @Test
  public void isInstance12() {
    Assert.assertEquals(true, new Extend2() instanceof Extend1);
  }

  @Test
  public void isInstance11() {
    Assert.assertEquals(true, new Extend1() instanceof Extend1);
  }

  @Test
  public void isAssignableFrom33() {
    Assert.assertEquals(true, Extend3.class.isAssignableFrom(Extend3.class));
  }

  @Test
  public void isAssignableFrom32() {
    Assert.assertEquals(false, Extend3.class.isAssignableFrom(Extend2.class));
  }

  @Test
  public void isAssignableFrom31() {
    Assert.assertEquals(false, Extend3.class.isAssignableFrom(Extend1.class));
  }

  @Test
  public void isAssignableFrom23() {
    Assert.assertEquals(true, Extend2.class.isAssignableFrom(Extend3.class));
  }

  @Test
  public void isAssignableFrom22() {
    Assert.assertEquals(true, Extend2.class.isAssignableFrom(Extend2.class));
  }

  @Test
  public void isAssignableFrom21() {
    Assert.assertEquals(false, Extend2.class.isAssignableFrom(Extend1.class));
  }

  @Test
  public void isAssignableFrom13() {
    Assert.assertEquals(true, Extend1.class.isAssignableFrom(Extend3.class));
  }

  @Test
  public void isAssignableFrom12() {
    Assert.assertEquals(true, Extend1.class.isAssignableFrom(Extend2.class));
  }

  @Test
  public void isAssignableFrom11() {
    Assert.assertEquals(true, Extend1.class.isAssignableFrom(Extend1.class));
  }
}
