/***
 * Main class for DataParser
 * @author Suryan Bhatia
 */
public class Main {
    public static void main(String[] args) {
        //Test of Utils
        /*String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        System.out.println(data);*/
        Utils test = new Utils();
        String data2016 = test.readFileAsString("data/2016_Presidential_Results.csv");
        System.out.println(test.parse2016ElectionResults(data2016));
    }
}
