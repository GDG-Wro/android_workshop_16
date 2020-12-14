package pl.gdg.myapplication;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeValidatorTest {

  private RangeValidator cut = new RangeValidator();

  /**
   * {@link RangeValidator#isValid(int)}
   */

  @Test
  public void fifty_isValid_returnsTrue() {
    assertThat(cut.isValid(50)).isTrue();
  }

  @Test
  public void twoHundred_isValid_returnsFalse() {
    assertThat(cut.isValid(200)).isFalse();
  }

  @Test
  public void hundred_isValid_returnsTrue() {
    assertThat(cut.isValid(100)).isTrue();
  }

  @Test
  public void zero_isValid_returnsFalse() {
    assertThat(cut.isValid(0)).isFalse();
  }
}
