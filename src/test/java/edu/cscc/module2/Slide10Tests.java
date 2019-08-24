package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Jeff Anderson
 * @since 2019-08-15
 */
public class Slide10Tests {

  @Test
  @DisplayName("T01 interface edu.cscc.module2.TwoDimensionalObject exists")
  public void test01 () {
    Class twoDimObj = null;
    try {
      twoDimObj = Class.forName("edu.cscc.module2.TwoDimensionalObject");
    }
    catch (ClassNotFoundException exception) {
      fail("Interface edu.cscc.module2.TwoDimensionalObject does not exist");
    }
    assertTrue(twoDimObj.isInterface(),"TwoDimensionalObject should be an interface");
  }

  @Test
  @DisplayName("T02 TwoDimensionalObject should have a String getDisplayName() method")
  public void test02 () throws Exception {
    Class[] getterParamList = { };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.TwoDimensionalObject").getDeclaredMethod("getDisplayName",getterParamList);
    } catch (Exception e) {
      fail("TwoDimensionalObject.getDisplayName() method not present");
    }
    assertNotNull(method);
    assertTrue(method.getReturnType().getCanonicalName().equals("java.lang.String"));
  }

  @Test
  @DisplayName("T03 getDisplayName() should have a default impelentation")
  public void test03 () throws Exception {
    Class[] getterParamList = { };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.TwoDimensionalObject").getDeclaredMethod("getDisplayName",getterParamList);
    } catch (Exception e) {
      fail("TwoDimensionalObject.getDisplayName() method not present");
    }
    assertNotNull(method);
    assertTrue(method.isDefault());
  }

  @Test
  @DisplayName("T04 class edu.cscc.module2.Square exists")
  public void test04 () {
    Class twoDimObj = null;
    try {
      twoDimObj = Class.forName("edu.cscc.module2.Square");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.Square does not exist");
    }
  }

  @Test
  @DisplayName("T05 Square implements TwoDimensionalObject")
  public void test05 () {
    Class twoDimObj = null;
    try {
      twoDimObj = Class.forName("edu.cscc.module2.Square");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.Square does not exist");
    }
    assertTrue(twoDimObj.getInterfaces().length > 0, "Square doesn't implement any interfaces");
    twoDimObj.getInterfaces()[0].getCanonicalName().equals("edu.cscc.module2.TwoDimensionalObject");
  }

  @Test
  @DisplayName("T06 getDisplayName() on Square returns default value of \"2D Object\"")
  public void test06 () {
    fail("Uncomment the code below then remove this statement");
    /*
    Square square = new Square();
    assertEquals("2D Object", square.getDisplayName());
    */
  }

  @Test
  @DisplayName("T07 TwoDimensionalObject should have a double getArea() method")
  public void test07 () throws Exception {
    Class[] getterParamList = { };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.TwoDimensionalObject").getDeclaredMethod("getArea",getterParamList);
    } catch (Exception e) {
      fail("TwoDimensionalObject.getArea() method not present");
    }
    assertNotNull(method);
    assertTrue(method.getReturnType().getCanonicalName().equals("double"));
    assertFalse(method.isDefault());
  }

  @Test
  @DisplayName("T08 Square has double sideLength field")
  public void test08 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Square");
    Field field = addressClass.getDeclaredField("sideLength");
    assertNotNull(field);
    assertEquals("double", field.getGenericType().getTypeName(),"sideLength should be type double");
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Square").getDeclaredField("sideLength").getModifiers()),"sideLength should be private");
  }

  @Test
  @DisplayName("T09 Square.sideLength should have a getter and setter")
  public void test09 () throws Exception {
    Class[] getterParamList = { };
    Class[] setterParamList = { double.class };
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Square").getDeclaredMethod("getSideLength",getterParamList));
    } catch (Exception e) {
      fail("Square.getSideLength() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Square").getDeclaredMethod("setSideLength",setterParamList));
    } catch (Exception e) {
      fail("Square.setSideWidth(String setSideLength() method not present");
    }
  }

  @Test
  @DisplayName("T10 getArea() computes proper area")
  public void test10 () {
    fail("Uncomment the code below then remove this statement");
    /*
    Square square = new Square();
    square.setSideLength(2.0);
    assertEquals(4.0, square.getArea());
    square.setSideLength(4.5);
    assertEquals(20.25, square.getArea());
    */
  }


  @Test
  @DisplayName("T11 Rectangle exists and implements TwoDimensionalObject")
  public void test11 () {
    Class twoDimObj = null;
    try {
      twoDimObj = Class.forName("edu.cscc.module2.Rectangle");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.Rectangle does not exist");
    }
    assertTrue(twoDimObj.getInterfaces().length > 0, "Rectangle doesn't implement any interfaces");
    twoDimObj.getInterfaces()[0].getCanonicalName().equals("edu.cscc.module2.TwoDimensionalObject");
  }

  @Test
  @DisplayName("T12 Rectangle has double width field")
  public void test12 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Rectangle");
    Field field = addressClass.getDeclaredField("width");
    assertNotNull(field);
    assertEquals("double", field.getGenericType().getTypeName(),"width should be type double");
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Rectangle").getDeclaredField("width").getModifiers()),"width should be private");
  }

  @Test
  @DisplayName("T13 Rectangle has double height field")
  public void test13 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Rectangle");
    Field field = addressClass.getDeclaredField("height");
    assertNotNull(field);
    assertEquals("double", field.getGenericType().getTypeName(),"height should be type double");
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Rectangle").getDeclaredField("height").getModifiers()),"height should be private");
  }

  @Test
  @DisplayName("T14 Rectangle has a 2 double parameter constructor")
  public void test14 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Rectangle");
    Class[] paramList = { double.class, double.class };
    Constructor constructor = addressClass.getConstructor(paramList);
    assertNotNull(constructor);
  }

  @Test
  @DisplayName("T15 getArea() computes proper area")
  public void test15 () {
    fail("Uncomment the code below then remove this statement");
    /*
    Rectangle rectangle = new Rectangle(2.0, 3);
    assertEquals(6.0, rectangle.getArea());
    rectangle = new Rectangle(4, 1);
    assertEquals(4.0, rectangle.getArea());
    */
  }

  @Test
  @DisplayName("T16 getDisplayName() on Rectangle returns value of \"Rectangle\"")
  public void test16 () {
    fail("Uncomment the code below then remove this statement");
    /*
    Rectangle rectangle = new Rectangle(0, 0);
    assertEquals("Rectangle", rectangle.getDisplayName());
    */
  }




}
