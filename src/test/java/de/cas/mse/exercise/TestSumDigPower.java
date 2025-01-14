package de.cas.mse.exercise;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSumDigPower {

	private SumDigPower sumDigPower;

	@BeforeEach
	public void setup() {
		sumDigPower = new SumDigPower();
	}

	@Test
	public void tenTo150_contains89and135() {
		assertThat(sumDigPower.getEurekaNumbers(10, 150)).containsExactly(89l, 135l);
	}

	@Test
	public void ninetyTo100_isEmpty() {
		assertThat(sumDigPower.getEurekaNumbers(90, 100)).isEmpty();
	}

	@Test
	public void zeroTo100_firstTenNumbersAnd89ShoudBeContained() {
		assertThat(sumDigPower.getEurekaNumbers(1, 100)).containsExactly(1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l, 89l);
	}

	@Test
	public void tenTo100_only89Contained() {
		assertThat(sumDigPower.getEurekaNumbers(10, 100)).containsExactly(89l);
	}

	@Test
	public void firstTenNumbers_shouldBeAllContained() {
		assertThat(sumDigPower.getEurekaNumbers(1, 10)).containsExactly(1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l);
	}
}
