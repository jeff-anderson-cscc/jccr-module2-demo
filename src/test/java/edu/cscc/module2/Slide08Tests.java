package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jeff Anderson
 * @since 2019-08-14
 */
public class Slide08Tests {

  @Test
  @DisplayName("T01: Party has default constructor")
  public void partyHasADefaultConstructorTest () throws Exception {
    Class partyClass = Class.forName("edu.cscc.module2.Party");
    Class[] paramList = { };
    Constructor constructor = partyClass.getConstructor(paramList);
    assertNotNull(constructor);
  }

  @Test
  @DisplayName("T02: Address does not have a default constructor")
  public void addressShouldNotHaveADefaultConstructorTest () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Address");
    Class[] paramList = { };
    Constructor constructor = null;
    try {
      constructor = addressClass.getConstructor(paramList);
    } catch (NoSuchMethodException e) {
      // This is expected so return so we don't fail
      return;
    }
    fail("Address should not have a default constructor");
  }

  @Test
  @DisplayName("T03: Address properties should have a getters")
  public void addressPropertiesShouldHaveGettersTest () throws Exception {
    Class[] getterParamList = { };
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Address").getDeclaredMethod("getStreetAddress",getterParamList));
    } catch (Exception e) {
      fail("Address.getStreetAddress() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Address").getDeclaredMethod("getCity",getterParamList));
    } catch (Exception e) {
      fail("Address.getCity() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Address").getDeclaredMethod("getState",getterParamList));
    } catch (Exception e) {
      fail("Address.getState() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Address").getDeclaredMethod("getZipCode",getterParamList));
    } catch (Exception e) {
      fail("Address.getZipCode() method not present");
    }
  }

  @Test
  @DisplayName("T04: Address.streetAddress should NOT have a setter")
  public void addressStreetAddressShouldNotHaveSetterTest () throws Exception {
    Class[] setterParamList = { String.class };
    try {
      Class.forName("edu.cscc.module2.Address").getDeclaredMethod("setStreetAddress",setterParamList);
    } catch (NoSuchMethodException e) {
      // This is expected so return so we don't fail
      return;
    }
    fail("Address should not have a setStreetAddress method");
  }

  @Test
  @DisplayName("T05: Address.city should NOT have a setter")
  public void addressCityShouldNotHaveSetterTest () throws Exception {
    Class[] setterParamList = { String.class };
    try {
      Class.forName("edu.cscc.module2.Address").getDeclaredMethod("setCity",setterParamList);
    } catch (NoSuchMethodException e) {
      // This is expected so return so we don't fail
      return;
    }
    fail("Address should not have a setCity method");
  }

  @Test
  @DisplayName("T06: Address.state should NOT have a setter")
  public void addressStateShouldNotHaveSetterTest () throws Exception {
    Class[] setterParamList = { String.class };
    try {
      Class.forName("edu.cscc.module2.Address").getDeclaredMethod("setState",setterParamList);
    } catch (NoSuchMethodException e) {
      // This is expected so return so we don't fail
      return;
    }
    fail("Address should not have a setState method");
  }
  
  @Test
  @DisplayName("T07: Address.zipCode should NOT have a setter")
  public void addressZipCodeShouldNotHaveSetterTest () throws Exception {
    Class[] setterParamList = { String.class };
    try {
      Class.forName("edu.cscc.module2.Address").getDeclaredMethod("setZipCode",setterParamList);
    } catch (NoSuchMethodException e) {
      // This is expected so return so we don't fail
      return;
    }
    fail("Address should not have a setZipCode method");
  }

}
