package sktest.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sktest.demo.ins.rel.cls.ExtendTest;
import sktest.demo.ins.rel.cls.ImplementTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExtendTest.class, ImplementTest.class})
public class DemoSuites {
}
