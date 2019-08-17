package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jeff Anderson
 * @since 2019-08-16
 */
public class Slide11Tests {

  @Test
  @DisplayName("T01 class edu.cscc.module2.ThreeDimensionalObject exists")
  public void test01 () {
    Class threeDimObj = null;
    try {
      threeDimObj = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.ThreeDimensionalObject does not exist");
    }
    assertFalse(threeDimObj.isInterface(),"ThreeDimensionalObject should not be an interface");
  }

  @Test
  @DisplayName("T02 ThreeDimensionalObject should have an abstract String getDisplayName() method")
  public void test02 () throws Exception {
    Class[] getterParamList = { };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.ThreeDimensionalObject").getDeclaredMethod("getDisplayName",getterParamList);
    } catch (Exception e) {
      fail("ThreeDimensionalObject.getDisplayName() method not present");
    }
    assertNotNull(method);
    assertTrue(method.getReturnType().getCanonicalName().equals("java.lang.String"),"ThreeDimensionalObject.getDisplayName() should return String");
    assertTrue(Modifier.isAbstract(method.getModifiers()),"ThreeDimensionalObject.getDisplayName() is not abstract");
  }

  @Test
  @DisplayName("T03 ThreeDimensionalObject has a private double width field")
  public void test03 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    Field field = addressClass.getDeclaredField("width");
    assertNotNull(field);
    assertEquals("double", field.getGenericType().getTypeName(),"width should be type double");
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.ThreeDimensionalObject").getDeclaredField("width").getModifiers()),"width should be private");
  }

  @Test
  @DisplayName("T04 ThreeDimensionalObject has a private double height field")
  public void test04 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    Field field = addressClass.getDeclaredField("height");
    assertNotNull(field);
    assertEquals("double", field.getGenericType().getTypeName(),"height should be type double");
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.ThreeDimensionalObject").getDeclaredField("height").getModifiers()),"height should be private");
  }

  @Test
  @DisplayName("T05 ThreeDimensionalObject has a private double depth field")
  public void test05 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    Field field = addressClass.getDeclaredField("depth");
    assertNotNull(field);
    assertEquals("double", field.getGenericType().getTypeName(),"depth should be type double");
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.ThreeDimensionalObject").getDeclaredField("depth").getModifiers()),"depth should be private");
  }

  @Test
  @DisplayName("T06 ThreeDimensionalObject has a protected 3 double parameter constructor")
  public void test06 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    Class[] paramList = { double.class, double.class, double.class };
    Constructor constructor = null;
    try {
      constructor = addressClass.getDeclaredConstructor(paramList);
    } catch (NoSuchMethodException e) {
      fail("ThreeDimensionalObject(double height, double width, double depth) constructor not present");
    }
    assertNotNull(constructor);
    assertTrue(Modifier.isProtected(constructor.getModifiers()),"constructor should be protected");
  }

  @Test
  @DisplayName("T07 ThreeDimensionalObject should have a public double getArea() method")
  public void test07 () throws Exception {
    Class[] getterParamList = { };
    Method method = null;
    try {
      method = Class.forName("edu.cscc.module2.ThreeDimensionalObject").getDeclaredMethod("getArea",getterParamList);
    } catch (Exception e) {
      fail("ThreeDimensionalObject.getArea() method not present");
    }
    assertNotNull(method, "ThreeDimensionalObject.getArea() method not present");
    assertTrue(method.getReturnType().getCanonicalName().equals("double"),"ThreeDimensionalObject.getArea() should return a double");
    assertTrue(Modifier.isPublic(method.getModifiers()),"ThreeDimensionalObject.getArea() should be public");
  }

  @Test
  @DisplayName("T08 Class edu.cscc.module2.SquareBox exists")
  public void test08 () {
    Class squareBox;
    try {
      squareBox = Class.forName("edu.cscc.module2.SquareBox");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.SquareBox does not exist");
    }
  }

  @Test
  @DisplayName("T09 SquareBox(double sideLength) constructor exists")
  public void test09 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.SquareBox");
    Class[] paramList = { double.class };
    Constructor constructor = null;
    try {
      constructor = addressClass.getDeclaredConstructor(paramList);
    } catch (NoSuchMethodException e) {
      fail("SquareBox(double sideLength) constructor not present");
    }
    assertNotNull(constructor);
    assertTrue(Modifier.isPublic(constructor.getModifiers()),"constructor should be public");
  }

  /*
   * NOTE: to get the test below working, you will need to:
   * 1. Add this code to the constructor:  super(sideLength, sideLength, sideLength);
   * 2. Provide an implementation of getDisplayName() -- Just return null for now
   */

  @Test
  @DisplayName("T10 SquareBox extends ThreeDimensionalObject")
  public void test10 () {

    Class squareBox = null;
    Class threeDimensionalObject = null;
    try {
      squareBox = Class.forName("edu.cscc.module2.SquareBox");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.SquareBox does not exist");
    }
    try {
      threeDimensionalObject = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.ThreeDimensionalObject does not exist");
    }

    try {
      assertNotNull(squareBox.asSubclass(threeDimensionalObject));
    } catch (ClassCastException classCastException) {
      fail("Class SquareBox does not extend ThreeDimensionalObject");
    }
  }

  @Test
  @DisplayName("T11 squareBox.getArea() computes proper area")
  public void test11 () {
    // TODO: UNCOMMENT Before Running:
//    SquareBox squareBox = new SquareBox(2.0);
//    assertEquals(8.0, squareBox.getArea());
//    squareBox = new SquareBox(3.0);
//    assertEquals(27.0, squareBox.getArea());
  }

  @Test
  @DisplayName("T12 squareBox.getDisplayName() returns \"Square Box\"")
  public void test12 () {
    // TODO: UNCOMMENT Before Running:
//    SquareBox squareBox = new SquareBox(2.0);
//    assertEquals("Square Box", squareBox.getDisplayName());
  }

  @Test
  @DisplayName("T13 Class edu.cscc.module2.RectangularBox exists")
  public void test13 () {
    Class rectangularBox;
    try {
      rectangularBox = Class.forName("edu.cscc.module2.RectangularBox");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.RectangularBox does not exist");
    }
  }

  @Test
  @DisplayName("T14 RectangularBox(double height, double width, double depth) constructor exists")
  public void test14 () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.RectangularBox");
    Class[] paramList = { double.class, double.class, double.class };
    Constructor constructor = null;
    try {
      constructor = addressClass.getDeclaredConstructor(paramList);
    } catch (NoSuchMethodException e) {
      fail("RectangularBox(double height, double width, double depth) constructor not present");
    }
    assertNotNull(constructor);
    assertTrue(Modifier.isPublic(constructor.getModifiers()),"constructor should be public");
  }

  /*
   * NOTE: to get the test below working, you will need to:
   * 1. Add this code to the constructor:  super(height, width, depth);
   * 2. Provide an implementation of getDisplayName() -- Just return null for now
   */

  @Test
  @DisplayName("T15 RectangularBox extends ThreeDimensionalObject")
  public void test15 () {

    Class rectangularBox = null;
    Class threeDimensionalObject = null;
    try {
      rectangularBox = Class.forName("edu.cscc.module2.RectangularBox");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.RectangularBox does not exist");
    }
    try {
      threeDimensionalObject = Class.forName("edu.cscc.module2.ThreeDimensionalObject");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.ThreeDimensionalObject does not exist");
    }

    try {
      assertNotNull(rectangularBox.asSubclass(threeDimensionalObject));
    } catch (ClassCastException classCastException) {
      fail("Class RectangularBox does not extend ThreeDimensionalObject");
    }
  }

  @Test
  @DisplayName("T16 rectangularBox.getArea() computes proper area")
  public void test16 () {
    // TODO: UNCOMMENT Before Running:
//    RectangularBox rectangularBox = new RectangularBox(2.0, 1, 2.0);
//    assertEquals(4.0, rectangularBox.getArea());
//    rectangularBox = new RectangularBox(2.0,3.0, 4.0);
//    assertEquals(24.0, rectangularBox.getArea());
  }

  @Test
  @DisplayName("T17 rectangularBox.getDisplayName() returns \"Rectangular Box\"")
  public void test17 () {
    // TODO: UNCOMMENT Before Running:
//    RectangularBox rectangularBox = new RectangularBox(2.0,3.0, 4.0);
//    assertEquals("Rectangular Box", rectangularBox.getDisplayName());
  }


}
