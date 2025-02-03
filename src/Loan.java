public class Loan {
    String person;
    String use;
    int amt;
    String ctry;
    
    Loan(String person, String use, int amt, String ctry) {
      this.person = person;
      this.use = use;
      this.amt = amt;
      this.ctry = ctry;
    }
    
    public String toString() {
      return String.format("Name: %s. Amount: %s Country: %s\n  Use: %s\n",
                            person, amt, ctry, use);
    }  
  }
  
