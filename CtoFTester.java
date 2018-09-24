public class CtoFTester{

	public static double ctof(int inpC){
		return inpC*(9.0/5.0)+32.0;}

	public static double ftoc(int inpF){
		return (inpF-32.0)*(5.0/9.0);}

	public static void printNum(double inp){
		System.out.println(inp);}


	public static String[] printString(){
	//add subsystem to handle string based io
	}

	public static void main(String[] args){
		printNum(ctof(0));
		printNum(ftoc(212));
    }
}
