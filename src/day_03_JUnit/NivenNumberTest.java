package day_03_JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import day_03.NivenNumber;

public class NivenNumberTest {

	@Test
	void testTrueCases() {
		assertTrue(NivenNumber.isNivenNumber(18)); // 1+8=9, 18%9==0
		assertTrue(NivenNumber.isNivenNumber(12)); // 1+2=3, 12%3==0

	}

	@Test
	void testFalseCases() {
		assertFalse(NivenNumber.isNivenNumber(19)); // 1+9=10, 19%10!=0
		assertFalse(NivenNumber.isNivenNumber(23)); // 2+3=5, 23%5!=0
	}

	@Test
	void testEdgeCases() {
		assertFalse(NivenNumber.isNivenNumber(0)); // edge case
		assertTrue(NivenNumber.isNivenNumber(1)); // 1%1==0
	}
}
