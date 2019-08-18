package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jeff Anderson
 * @since 2019-08-17
 */
public class Slide12Tests {

  @Test
  @DisplayName("T01 class edu.cscc.module2.StringPrinter exists")
  public void test01 () {
    Class stringPrinter = null;
    try {
      stringPrinter = Class.forName("edu.cscc.module2.StringPrinter");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.StringPrinter does not exist");
    }
    assertFalse(stringPrinter.isInterface(),"StringPrinter should not be an interface");
  }

  @Test
  @DisplayName("T02 StringPrinter should have a publc void printString(String s1) method")
  public void test02 () throws Exception {
    Class[] getterParamList = { String.class };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.StringPrinter").getDeclaredMethod("printString",getterParamList);
    } catch (Exception e) {
      fail("StringPrinter.printString(String s1) method not present");
    }
    assertNotNull(method);
    assertTrue(method.getReturnType().getCanonicalName().equals("void"),"printString(String s1) should return void");
    assertTrue(Modifier.isPublic(method.getModifiers()),"printString(String s1) is not public");
  }

  @Test
  @DisplayName("T03 StringPrinter should have a publc void printString(String s1, String s2) method")
  public void test03 () throws Exception {
    Class[] getterParamList = { String.class, String.class };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.StringPrinter").getDeclaredMethod("printString",getterParamList);
    } catch (Exception e) {
      fail("StringPrinter.printString(String s1, String s2) method not present");
    }
    assertNotNull(method);
    assertTrue(method.getReturnType().getCanonicalName().equals("void"),"printString(String s1, String s2) should return void");
    assertTrue(Modifier.isPublic(method.getModifiers()),"printString(String s1, String s2) is not public");
  }

  @Test
  @DisplayName("T04 StringPrinter should have a publc void printString(String ...strings) method")
  public void test04 () throws Exception {
    Class[] getterParamList = { String[].class };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.StringPrinter").getDeclaredMethod("printString",getterParamList);
    } catch (Exception e) {
      fail("StringPrinter.printString(String ...strings) method not present");
    }
    assertNotNull(method);
    assertTrue(method.getReturnType().getCanonicalName().equals("void"),"printString(String ...strings) should return void");
    assertTrue(Modifier.isPublic(method.getModifiers()),"printString(String ...strings) is not public");
  }


}
