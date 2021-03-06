/**
 * 
 */

/**
 * @author maddierook
 *
 */

//import Scanner functionality for interactive console
import java.util.*;

public class Accuracy_Precision_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program functionality
		System.out.println("This program calculates accuracy via Percent Error and precision via SEM and RAD.");
		System.out.println();
		
		//request calculated average and literature value
	//TODO What does "resource leak: consoleAverage never closed" mean? see also for console requests below.
		Scanner consoleAverage = new Scanner(System.in);
		System.out.print("What is the calculated average?: ");
		double calculatedAverage = consoleAverage.nextDouble();
			/* calcualtedAverage = 1.063 */
		Scanner consoleLiteratureValue = new Scanner(System.in);
		System.out.print("What is the literature value?: ");
		double literatureValue = consoleLiteratureValue.nextDouble();
			/* literatureValue = 1.00 */

		//accuracy method
		accuracy(calculatedAverage, literatureValue);
		
		//output percent error
		double percentError = accuracy(calculatedAverage, literatureValue);
		System.out.println();
		System.out.println("Accuracy, via Percent Error:");
		System.out.println("For a calcualted average of " + calculatedAverage);
		System.out.println("and a literature value of " + literatureValue);
		System.out.println("the Percent Error is " + percentError + "%.");
		System.out.println();
		
		//request number of trials
		Scanner consoleNumberOfTrials = new Scanner(System.in);
		System.out.print("What is the number of trials?: ");
		int numberOfTrials = consoleNumberOfTrials.nextInt();
		
		//request value of each trial
		Scanner consoleTrialValues = new Scanner(System.in);
		System.out.println("What is the value of each trial?");
		double x1 = consoleTrialValues.nextDouble();
		double x2 = consoleTrialValues.nextDouble();
		double x3 = consoleTrialValues.nextDouble();
		double x4 = consoleTrialValues.nextDouble();
		double x5 = consoleTrialValues.nextDouble();
		double x6 = consoleTrialValues.nextDouble();
		double x7 = consoleTrialValues.nextDouble();
		double x8 = consoleTrialValues.nextDouble();
		double x9 = consoleTrialValues.nextDouble();
		System.out.println();
			/*x1 = 1.300;
			x2 = 1.200;
			x3 = 1.100;
			x4 = 0.980;
			x5 = 1.010;
			x6 = 0.950;
			x7 = 1.045;
			x8 = 0.990;
			x9 = 0.990; */
		
		//precision methods
		precisionSEM(calculatedAverage, numberOfTrials, x1, x2, x3, x4, x5, x6, x7, x8, x9);
		precisionRAD(calculatedAverage, numberOfTrials, x1, x2, x3, x4, x5, x6, x7, x8, x9);
		
		//output standard error of the mean
		double standardError = precisionSEM(calculatedAverage, numberOfTrials, x1, x2, x3, x4, x5, x6, x7, x8, x9);
		System.out.println("Precision, via Standard Error of the Mean:");
		System.out.println("For a calculated average of " + calculatedAverage);
		System.out.println("the Standard Error of the Mean of these " + numberOfTrials + " trials is ±" + standardError + ".");
		System.out.println();
		
		//output relative average deviation
		double relativeAverageDeviation = precisionRAD(calculatedAverage, numberOfTrials, x1, x2, x3, x4, x5, x6, x7, x8, x9);
		System.out.println("Precision, via Percent Relative Average Deviation:");
		System.out.println("For a calculated average of " + calculatedAverage);
		System.out.println("the Percent Relative Average Deviation of these " + numberOfTrials + " trials is " + relativeAverageDeviation + "%.");
	}
	
	public static double accuracy(double calculatedAverage, double literatureValue) {
		//calculates percent error, as a measure of accuracy
		
		// define PercentError-specific variables
		double percentError;
		
		//calculate percent error
		percentError = ((Math.abs(calculatedAverage - literatureValue) / literatureValue) * 100);
			return percentError; //returns calculation to the main method to print
	}	
		
	public static double precisionSEM(double calculatedAverage, int numberOfTrials, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9) {
		//calculates standard error of the mean, as a measure of precision
		
		//define SEM-specific variables
		double sumOfSquares;
		double standardDeviation;
		double standardError;
				
		//calculate sum of squares
		sumOfSquares = ((x1 - calculatedAverage)*(x1 - calculatedAverage) + (x2 - calculatedAverage)*(x2 - calculatedAverage) + (x3 - calculatedAverage)*(x3 - calculatedAverage) + (x4 - calculatedAverage)*(x4 - calculatedAverage) + (x5 - calculatedAverage)*(x5 - calculatedAverage) + (x6 - calculatedAverage)*(x6 - calculatedAverage) + (x7 - calculatedAverage)*(x7 - calculatedAverage) + (x8 - calculatedAverage)*(x8 - calculatedAverage) + (x9 - calculatedAverage)*(x9 - calculatedAverage));

		//calculate standard error of the mean
		standardDeviation = (Math.sqrt(sumOfSquares / (numberOfTrials - 1) ));
		standardError = (standardDeviation / Math.sqrt(numberOfTrials));
			return standardError; //returns calculation to the main method to print	
	}

	public static double precisionRAD(double calculatedAverage, int numberOfTrials, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9) {
		//calculates percent relative average deviation, as a measure of precision
		
		//define RAD-specific variables
		double averageDeviations;
		double relativeAverageDeviation;
		
		//calculate average deviations
		averageDeviations = (Math.abs(calculatedAverage - x1) + Math.abs(calculatedAverage - x2) + Math.abs(calculatedAverage - x3) + Math.abs(calculatedAverage - x4) + Math.abs(calculatedAverage - x5) + Math.abs(calculatedAverage - x6) + Math.abs(calculatedAverage - x7) + Math.abs(calculatedAverage - x8) + Math.abs(calculatedAverage - x9)) / numberOfTrials;
		
		//calculate percent RAD
		relativeAverageDeviation = (averageDeviations / calculatedAverage) * 100;
			return relativeAverageDeviation; //returns calculation to the main method to print
	}
}
