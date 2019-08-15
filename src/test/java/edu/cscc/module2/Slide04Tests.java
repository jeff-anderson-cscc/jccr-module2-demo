package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Jeff Anderson
 * @since 2019-08-14
 */
public class Slide04Tests {

  @Test
  @DisplayName("T01: Class edu.cscc.module2.Party exists")
  public void classPartyExistsInClasspathTest () throws Exception {
    assertNotNull(Class.forName("edu.cscc.module2.Party").newInstance());
  }

  @Test
  @DisplayName("T02: Party can be instantiated")
  public void partyCanBeInstantiatedTest() {
    // Uncomment this statement to run:
    // assertNotNull(new edu.cscc.module2.Party());
  }

  @Test
  @DisplayName("T03: Class edu.cscc.module2.Organization exists")
  public void classOrganizationExistsInClasspathTest () {
    Class organization;
    try {
      organization = Class.forName("edu.cscc.module2.Organization");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.Organization does not exist");
    }
  }

  @Test
  @DisplayName("T04: Organization extends Party")
  public void organizationExtendsPartyTest () {

    Class organization = null;
    Class party = null;
    try {
      organization = Class.forName("edu.cscc.module2.Organization");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.Organization does not exist");
    }
    try {
      party = Class.forName("edu.cscc.module2.Party");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.Party does not exist");
    }

    try {
      assertNotNull(organization.asSubclass(party));
    } catch (ClassCastException classCastException) {
      fail("Class Organization does not extend Party");
    }
  }


  @Test
  @DisplayName("T05: Class edu.cscc.module2.Person exists")
  public void classPersonExistsInClasspathTest () {
    Class person;
    try {
      person = Class.forName("edu.cscc.module2.Person");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.Person does not exist");
    }
  }

  @Test
  @DisplayName("T06: Person extends Party")
  public void PersonExtendsPartyTest () {

    Class person = null;
    Class party = null;
    try {
      person = Class.forName("edu.cscc.module2.Person");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.Person does not exist");
    }
    try {
      party = Class.forName("edu.cscc.module2.Party");
    } catch (ClassNotFoundException classNotFoundException) {
      fail("Class edu.cscc.module2.Party does not exist");
    }

    try {
      assertNotNull(person.asSubclass(party));
    } catch (ClassCastException classCastException) {
      fail("Class Person does not extend Party");
    }
  }

  @Test
  @DisplayName("T07: Class edu.cscc.module2.Address exists")
  public void classAddressExistsInClasspathTest () {
    Class person;
    try {
      person = Class.forName("edu.cscc.module2.Address");
    }
    catch (ClassNotFoundException exception) {
      fail("Class edu.cscc.module2.Address does not exist");
    }
  }



}
