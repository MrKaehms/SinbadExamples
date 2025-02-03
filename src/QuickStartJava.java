import core.data.*;

public class QuickStartJava {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("http://api.kivaws.org/v1/loans/newest.json");
        ds.load();
        ds.printUsageString();

     //   System.out.printf("Name: %s. Amount: %s Country: %s\n  Use: %s\n",
   // ds.fetchString("loans/name"),
    //ds.fetchInt("loans/loan_amount"),
   // ds.fetchString("loans/location/country"),
   //
   // ds.fetchString("loans/use"));
   Loan kiva = ds.fetch("Loan",  "loans/name", "loans/use",
                              "loans/loan_amount", "loans/location/country");
System.out.println( kiva.toString() ); 

        
    }
}