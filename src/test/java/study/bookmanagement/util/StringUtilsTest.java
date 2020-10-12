package study.bookmanagement.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void trim() {
		assertEquals("aaa", StringUtils.trim(" aaa"));
		assertEquals("aaa", StringUtils.trim("aaa "));
		assertEquals("a a a", StringUtils.trim("a a a"));
	}
}
