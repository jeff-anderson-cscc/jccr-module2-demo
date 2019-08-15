package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jeff Anderson
 * @since 2019-08-14
 */
public class Slide06Tests {

  @Test
  @DisplayName("T01: Address has a 4 String parameter constructor")
  public void addressHasANonDefaultConstructorTest () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Address");
    Class[] paramList = { String.class, String.class, String.class, String.class };
    Constructor constructor = addressClass.getConstructor(paramList);
    assertNotNull(constructor);
  }

  @Test
  @DisplayName("T02: Address.streetAddress should be private")
  public void streetAddressShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Address").getDeclaredField("streetAddress").getModifiers()));
  }

  @Test
  @DisplayName("T03: Address.city should be private")
  public void cityShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Address").getDeclaredField("city").getModifiers()));
  }

  @Test
  @DisplayName("T04: Address.state should be private")
  public void stateShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Address").getDeclaredField("state").getModifiers()));
  }

  @Test
  @DisplayName("T05: Address.zipCode should be private")
  public void zipCodeShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Address").getDeclaredField("zipCode").getModifiers()));
  }


}
