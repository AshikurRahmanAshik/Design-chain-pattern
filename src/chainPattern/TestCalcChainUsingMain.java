package chainPattern;

public class TestCalcChainUsingMain {

	public static void main(String[] args) {
		
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MulNumbers();
		Chain chainCalc4 = new DivNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers requests1 = new Numbers(4, 2, "Add");
		chainCalc1.calculate(requests1);
		
		Numbers request2 = new Numbers(4, 2, "Sub");
		chainCalc1.calculate(request2);
		
		Numbers request3 = new Numbers(4, 2, "Mul");
		chainCalc1.calculate(request3);
		
		Numbers request4 = new Numbers(4, 2, "Div");
		chainCalc1.calculate(request4);
		
	}

}
