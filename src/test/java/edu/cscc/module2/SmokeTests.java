package edu.cscc.module2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Jeff Anderson
 * @since 2019-08-14
 */
public class SmokeTests {

  @Test
  @DisplayName("T01: Smoke Test Runs")
  public void smokeTestRunsTest () {
    assertNotNull(new Smoke());
  }

}
