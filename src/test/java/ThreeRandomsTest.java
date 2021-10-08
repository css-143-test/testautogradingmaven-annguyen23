import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ThreeRandomsTest {

	@DisplayName("helloYou passing in Blank")
	@Test 
	void Should_ReturnStringHelloBlank_When_GivenBlank () {
		String expects = "Hello Blank";
		String received = ThreeRandoms.helloYou("Blank");
		assertEquals(expects, received);
	}

}
