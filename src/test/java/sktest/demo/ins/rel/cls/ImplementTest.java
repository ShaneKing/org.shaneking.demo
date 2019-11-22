package sktest.demo.ins.rel.cls;

import org.junit.Assert;
import org.junit.Test;
import org.shaneking.demo.ins.rel.cls.Implement1;
import org.shaneking.demo.ins.rel.cls.Implement2;
import org.shaneking.demo.ins.rel.cls.Implement3;
import org.shaneking.demo.ins.rel.cls.Implement4;

public class ImplementTest {

  @Test
  public void instanceOf44() {
    Assert.assertEquals(true, new Implement4() instanceof Implement4);
  }

  @Test
  public void instanceOf43() {
    Assert.assertEquals(true, new Implement4() instanceof Implement3);
  }

  @Test
  public void instanceOf42() {
    Assert.assertEquals(true, new Implement4() instanceof Implement2);
  }

  @Test
  public void instanceOf41() {
    Assert.assertEquals(true, new Implement4() instanceof Implement1);
  }

  @Test
  public void instanceOf34() {
    Assert.assertEquals(false, new Implement3() instanceof Implement4);
  }

  @Test
  public void instanceOf33() {
    Assert.assertEquals(true, new Implement3() instanceof Implement3);
  }

  @Test
  public void instanceOf32() {
    Assert.assertEquals(true, new Implement3() instanceof Implement2);
  }

  @Test
  public void instanceOf31() {
    Assert.assertEquals(true, new Implement3() instanceof Implement1);
  }


  @Test
  public void isInstance44() {
    Assert.assertEquals(true, new Implement4() instanceof Implement4);
  }

  @Test
  public void isInstance43() {
    Assert.assertEquals(false, new Implement3() instanceof Implement4);
  }


  @Test
  public void isInstance34() {
    Assert.assertEquals(true, new Implement4() instanceof Implement3);
  }

  @Test
  public void isInstance33() {
    Assert.assertEquals(true, new Implement3() instanceof Implement3);
  }

  @Test
  public void isInstance24() {
    Assert.assertEquals(true, new Implement4() instanceof Implement2);
  }

  @Test
  public void isInstance23() {
    Assert.assertEquals(true, new Implement3() instanceof Implement2);
  }

  @Test
  public void isInstance14() {
    Assert.assertEquals(true, new Implement4() instanceof Implement1);
  }

  @Test
  public void isInstance13() {
    Assert.assertEquals(true, new Implement3() instanceof Implement1);
  }


  @Test
  public void isAssignableFrom44() {
    Assert.assertEquals(true, Implement4.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom43() {
    Assert.assertEquals(false, Implement4.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom42() {
    Assert.assertEquals(false, Implement4.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom41() {
    Assert.assertEquals(false, Implement4.class.isAssignableFrom(Implement1.class));
  }

  @Test
  public void isAssignableFrom34() {
    Assert.assertEquals(true, Implement3.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom33() {
    Assert.assertEquals(true, Implement3.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom32() {
    Assert.assertEquals(false, Implement3.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom31() {
    Assert.assertEquals(false, Implement3.class.isAssignableFrom(Implement1.class));
  }

  @Test
  public void isAssignableFrom24() {
    Assert.assertEquals(true, Implement2.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom23() {
    Assert.assertEquals(true, Implement2.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom22() {
    Assert.assertEquals(true, Implement2.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom21() {
    Assert.assertEquals(false, Implement2.class.isAssignableFrom(Implement1.class));
  }

  @Test
  public void isAssignableFrom14() {
    Assert.assertEquals(true, Implement1.class.isAssignableFrom(Implement4.class));
  }

  @Test
  public void isAssignableFrom13() {
    Assert.assertEquals(true, Implement1.class.isAssignableFrom(Implement3.class));
  }

  @Test
  public void isAssignableFrom12() {
    Assert.assertEquals(true, Implement1.class.isAssignableFrom(Implement2.class));
  }

  @Test
  public void isAssignableFrom11() {
    Assert.assertEquals(true, Implement1.class.isAssignableFrom(Implement1.class));
  }
}
