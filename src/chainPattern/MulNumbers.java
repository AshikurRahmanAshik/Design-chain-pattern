package chainPattern;

public class MulNumbers implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		
		this.nextInChain = nextChain;
		
	}

	@Override
	public double calculate(Numbers requests) {
		
		if(requests.getCalculationWanted() == "Mul") {
			return requests.getNumber1() * requests.getNumber2();
		}
		
		else {
			nextInChain.calculate(requests);
		}
		
		return 0;
		
	}

}
