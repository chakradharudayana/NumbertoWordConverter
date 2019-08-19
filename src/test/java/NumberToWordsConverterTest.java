import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberToWordsConverterTest {
	
	@Test
    public void saveTest()
    {
		NumberToWordsConverter nwc=new NumberToWordsConverter();
		String firstResult=nwc.numberToWord(45673);
		assertEquals("forty-five thousand six hundred seventy-three",firstResult);
		
		String secondResult=nwc.numberToWord(-3424);
		
		assertEquals("minus three thousand four hundred twenty-four",secondResult);
    }
}
