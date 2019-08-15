package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Jeff Anderson
 * @since 2019-08-14
 */
public class Slide05Tests {

  @Test
  @DisplayName("T01: Address has a streetAddress field")
  public void streetHasStreetAddressFieldTest () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Address");
    Field field = addressClass.getDeclaredField("streetAddress");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T02: Address has a city field")
  public void streetHasCityFieldTest () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Address");
    Field field = addressClass.getDeclaredField("city");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T03: Address has a state field")
  public void streetHasStateFieldTest () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Address");
    Field field = addressClass.getDeclaredField("state");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T04: Address has a zipCode field")
  public void streetHasZipcodeFieldTest () throws Exception {
    Class addressClass = Class.forName("edu.cscc.module2.Address");
    Field field = addressClass.getDeclaredField("zipCode");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T05: Party has a mailingAddress field")
  public void partyHasMailingAddressFieldTest () throws Exception {
    Class partyClass = Class.forName("edu.cscc.module2.Party");
    Field field = partyClass.getDeclaredField("mailingAddress");
    assertNotNull(field);
    assertEquals("edu.cscc.module2.Address", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T06: Person has a firstName field")
  public void personHasFirstNameTest () throws Exception {
    Class personClass = Class.forName("edu.cscc.module2.Person");
    Field field = personClass.getDeclaredField("firstName");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T07: Person has a lastName field")
  public void personHasLastNameTest () throws Exception {
    Class personClass = Class.forName("edu.cscc.module2.Person");
    Field field = personClass.getDeclaredField("lastName");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

  @Test
  @DisplayName("T07: Person has a lastName field")
  public void organizationHasLegalNameTest () throws Exception {
    Class organizationClass = Class.forName("edu.cscc.module2.Organization");
    Field field = organizationClass.getDeclaredField("legalName");
    assertNotNull(field);
    assertEquals("java.lang.String", field.getGenericType().getTypeName());
  }

}
