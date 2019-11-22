/*
 * @(#)SKavaTests.java		Created at 2018/2/3
 *
 * Copyright (c) ShaneKing All rights reserved.
 * ShaneKing PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sktest.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sktest.demo.ins.rel.cls.ExtendTest;
import sktest.demo.ins.rel.cls.ImplementTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExtendTest.class, ImplementTest.class})
public class DemoSuites {
}
