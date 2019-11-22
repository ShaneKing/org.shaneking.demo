package sktest.demo.ins.rel.cls;

import org.junit.Assert;
import org.junit.Test;
import org.shaneking.demo.ins.rel.cls.Child;
import org.shaneking.demo.ins.rel.cls.It;
import org.shaneking.demo.ins.rel.cls.Parent;

public class InsRelClsTest {

  @Test
  public void instanceOf_cc() {
    Assert.assertEquals(true, new Child() instanceof Child);
  }

  @Test
  public void instanceOf_ci() {
    Assert.assertEquals(true, new Child() instanceof It);
  }

  @Test
  public void instanceOf_cp() {
    Assert.assertEquals(true, new Child() instanceof Parent);
  }

  @Test
  public void instanceOf_ic() {
    Assert.assertEquals(false, new It() instanceof Child);
  }

  @Test
  public void instanceOf_ii() {
    Assert.assertEquals(true, new It() instanceof It);
  }

  @Test
  public void instanceOf_ip() {
    Assert.assertEquals(true, new It() instanceof Parent);
  }

  @Test
  public void instanceOf_pc() {
    Assert.assertEquals(false, new Parent() instanceof Child);
  }

  @Test
  public void instanceOf_pi() {
    Assert.assertEquals(false, new Parent() instanceof It);
  }

  @Test
  public void instanceOf_pp() {
    Assert.assertEquals(true, new Parent() instanceof Parent);
  }


  @Test
  public void isInstance_cc() {
    Assert.assertEquals(true, new Child() instanceof Child);
  }

  @Test
  public void isInstance_ci() {
    Assert.assertEquals(false, new It() instanceof Child);
  }

  @Test
  public void isInstance_cp() {
    Assert.assertEquals(false, new Parent() instanceof Child);
  }

  @Test
  public void isInstance_ic() {
    Assert.assertEquals(true, new Child() instanceof It);
  }

  @Test
  public void isInstance_ii() {
    Assert.assertEquals(true, new It() instanceof It);
  }

  @Test
  public void isInstance_ip() {
    Assert.assertEquals(false, new Parent() instanceof It);
  }

  @Test
  public void isInstance_pc() {
    Assert.assertEquals(true, new Child() instanceof Parent);
  }

  @Test
  public void isInstance_pi() {
    Assert.assertEquals(true, new It() instanceof Parent);
  }

  @Test
  public void isInstance_pp() {
    Assert.assertEquals(true, new Parent() instanceof Parent);
  }


  @Test
  public void isAssignableFrom_cc() {
    Assert.assertEquals(true, Child.class.isAssignableFrom(Child.class));
  }

  @Test
  public void isAssignableFrom_ci() {
    Assert.assertEquals(false, Child.class.isAssignableFrom(It.class));
  }

  @Test
  public void isAssignableFrom_cp() {
    Assert.assertEquals(false, Child.class.isAssignableFrom(Parent.class));
  }

  @Test
  public void isAssignableFrom_ic() {
    Assert.assertEquals(true, It.class.isAssignableFrom(Child.class));
  }

  @Test
  public void isAssignableFrom_ii() {
    Assert.assertEquals(true, It.class.isAssignableFrom(It.class));
  }

  @Test
  public void isAssignableFrom_ip() {
    Assert.assertEquals(false, It.class.isAssignableFrom(Parent.class));
  }

  @Test
  public void isAssignableFrom_pc() {
    Assert.assertEquals(true, Parent.class.isAssignableFrom(Child.class));
  }

  @Test
  public void isAssignableFrom_pi() {
    Assert.assertEquals(true, Parent.class.isAssignableFrom(It.class));
  }

  @Test
  public void isAssignableFrom_pp() {
    Assert.assertEquals(true, Parent.class.isAssignableFrom(Parent.class));
  }
}
