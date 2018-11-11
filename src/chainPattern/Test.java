package chainPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import chainPattern.AddNumbers;
import chainPattern.Chain;
import chainPattern.DivNumbers;
import chainPattern.MulNumbers;
import chainPattern.Numbers;
import chainPattern.SubNumbers;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MulNumbers();
		Chain chainCalc4 = new DivNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request1 = new Numbers(4, 2, "Add");
		assertEquals(6,chainCalc1.calculate(request1));
		
		Numbers request2 = new Numbers(4, 2, "Sub");
		assertEquals(2,chainCalc2.calculate(request2));
		
		Numbers request3 = new Numbers(4, 2, "Mul");
		assertEquals(8,chainCalc3.calculate(request3));
		
		Numbers request4 = new Numbers(4, 2, "Div");
		assertEquals(2,chainCalc4.calculate(request4));
	}

}
