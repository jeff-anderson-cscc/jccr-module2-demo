package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jeff Anderson
 * @since 2019-08-14
 */
public class Slide07Tests {

  @Test
  @DisplayName("T01: Party.mailingAddress should be private")
  public void partyMalingAddressShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Party").getDeclaredField("mailingAddress").getModifiers()));
  }

  @Test
  @DisplayName("T02: Organization.legalName should be private")
  public void organizationLegalNameShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Organization").getDeclaredField("legalName").getModifiers()));
  }

  @Test
  @DisplayName("T03: Person.firstName should be private")
  public void personFirstNameShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Person").getDeclaredField("firstName").getModifiers()));
  }

  @Test
  @DisplayName("T04: Person.lastName should be private")
  public void personLastNameShouldBePrivateTest () throws Exception {
    assertTrue(Modifier.isPrivate(Class.forName("edu.cscc.module2.Person").getDeclaredField("lastName").getModifiers()));
  }

  @Test
  @DisplayName("T05: Party.mailingAddress should have a getter and setter")
  public void partyMalingAddressShouldHaveGetAndSetTest () throws Exception {
    fail("Uncomment the code below then remove this statement");
    /*
    Class[] getterParamList = { };
    Class[] setterParamList = { edu.cscc.module2.Address.class };
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Party").getDeclaredMethod("getMailingAddress",getterParamList));
    } catch (Exception e) {
      fail("Party.getMailingAddress() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Party").getDeclaredMethod("setMailingAddress",setterParamList));
    } catch (Exception e) {
      fail("Party.setMailingAddress(Address mailingAddress) method not present");
    }
    */
  }

  @Test
  @DisplayName("T06: Organization.legalName should have a getter and setter")
  public void organizationLegalNameShouldHaveGetAndSetTest () throws Exception {
    Class[] getterParamList = { };
    Class[] setterParamList = { String.class };
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Organization").getDeclaredMethod("getLegalName",getterParamList));
    } catch (Exception e) {
      fail("Organization.getLegalName() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Organization").getDeclaredMethod("setLegalName",setterParamList));
    } catch (Exception e) {
      fail("Organization.setLegalName(String legalName) method not present");
    }
  }

  @Test
  @DisplayName("T07: Person.firstName should have a getter and setter")
  public void personFirstNameShouldHaveGetAndSetTest () throws Exception {
    Class[] getterParamList = { };
    Class[] setterParamList = { String.class };
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Person").getDeclaredMethod("getFirstName",getterParamList));
    } catch (Exception e) {
      fail("Person.getFirstName() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Person").getDeclaredMethod("setFirstName",setterParamList));
    } catch (Exception e) {
      fail("Person.setFirstName(String firstName) method not present");
    }
  }

  @Test
  @DisplayName("T08: Person.lastName should have a getter and setter")
  public void personLastNameShouldHaveGetAndSetTest () throws Exception {
    Class[] getterParamList = { };
    Class[] setterParamList = { String.class };
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Person").getDeclaredMethod("getLastName",getterParamList));
    } catch (Exception e) {
      fail("Person.getLastName() method not present");
    }
    try {
      assertNotNull(Class.forName("edu.cscc.module2.Person").getDeclaredMethod("setLastName",setterParamList));
    } catch (Exception e) {
      fail("Person.setLastName(String lastName) method not present");
    }
  }


}
