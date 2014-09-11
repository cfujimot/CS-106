/**
 * 
 */

/**
 * @author maddierook
 *
 */
public class Accuracy_Precision_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program functionality
				System.out.println("This program calculates the accuracy and precision of a P-20 micropipette, using the literature density of water.");
				System.out.println();
		
		//define measured average density of water for this trial
		double calculatedAverage;
		calculatedAverage = 1.063;
		
		//following methods
		accuracy(calculatedAverage);
		precision(calculatedAverage);
		
	}
	
	public static void accuracy(double calculatedAverage) {
		//calculates percent error, as a measure of accuracy
		
		// define accuracy-specific variables
		double exactValue;
		double percentError;
		
		//calculate percent error for density of water
		exactValue = 1.00;
		percentError = ((Math.abs(calculatedAverage - exactValue) / exactValue) * 100);
		
		//output percent error
		System.out.println("Accuracy, via Percent Error:");
		System.out.println("For a Mean calculated density of " + calculatedAverage + " grams per milliliter,");
		System.out.println("and a literature value of " + exactValue + " grams per milliliter,");
		System.out.println("the Percent Error is " + percentError + "%.");
		System.out.println();
	}	
		
	public static void precision(double calculatedAverage) {
		//calculates standard error of the mean, as a measure of precision
		
		//define precision-specific variables
		double averageValue;
		double x1;
		double x2;
		double x3;
		double x4;
		double x5;
		double x6; 
		double x7;
		double x8;
		double x9;
		double sumOfSquares;
		double standardDeviation;
		double standardError;
		int numberOfTrials;
				
		//calculate sum of squares
		x1 = 1.300;
		x2 = 1.200;
		x3 = 1.100;
		x4 = 0.980;
		x5 = 1.010;
		x6 = 0.950;
		x7 = 1.045;
		x8 = 0.990;
		x9 = 0.990;
		averageValue = 1.063;
		sumOfSquares = ((x1 - averageValue)*(x1 - averageValue) + (x2 - averageValue)*(x2 - averageValue) + (x3 - averageValue)*(x3 - averageValue) + (x4 - averageValue)*(x4 - averageValue) + (x5 - averageValue)*(x5 - averageValue) + (x6 - averageValue)*(x6 - averageValue) + (x7 - averageValue)*(x7 - averageValue) + (x8 - averageValue)*(x8 - averageValue) + (x9 - averageValue)*(x9 - averageValue));

		//calculate standard error of the mean for density of water
		numberOfTrials = 9;
		standardDeviation = (Math.sqrt(sumOfSquares / (numberOfTrials - 1) ));
		standardError = (standardDeviation / Math.sqrt(numberOfTrials));
				
		//output standard error of the mean
		System.out.println("Precision, via Standard Error of the Mean:");
		System.out.println("For a Mean calculated density of " + averageValue + " grams per milliliter,");
		System.out.println("the Standard Deviation of the 9 defined trials is " + standardDeviation + ", ");
		System.out.println("and the Standard Error of the Mean is ±" + standardError + ".");
	}

}
