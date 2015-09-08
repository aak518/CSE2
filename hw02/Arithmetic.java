// Anas Kamal
// hw 02
// Arithmetic

// this program will calculate 1.the subtotal cost for each kind of item
// 2. the sales tax for each kind
// 3. The total Cost of purchases
// 4. The Total with the tax 

// first assign the class
public class Arithmetic{
    
    // add main method
    public static void main(String[] args) {
        
        int Socks=3;    //Number of pairs of socks
        double SockCost$=2.58;  // cost of each pair of socks
        
        int Glasses=6; // number of glasses
        double GlassCost$=2.29; // cost of each glass
        
        int Envelopes=1; // number of envelopes
        double EnvelopeCost$=3.25; //cost of each envelope
        
        double tax=.06; //percent tax
        
        double Socktax = (int)Math.round((tax*Socks*SockCost$) * 100)/(double)100; // have the tax be two decimal places for socks
        double Glasstax = (int)Math.round((tax*Glasses*GlassCost$) * 100)/(double)100;  // have the tax two decimal places for glasses
        double Envelopetax = (int)Math.round((tax*Envelopes*EnvelopeCost$) * 100)/(double)100; // have teh tax two decimal places for enevelopes
        
        double Allsubtotal = (int)Math.round((Socks*SockCost$+Glasses*GlassCost$+Envelopes*EnvelopeCost$) * 100)/(double)100; // give value for the subtotal of all items
        
        double Alltotal = (int)Math.round((Allsubtotal+Socktax+Glasstax+Envelopetax) * 100)/(double)100; // give value to complete Total
    
        // print the subtotal cost for each item
        System.out.println("The subtotal for the socks is "+ Socks*SockCost$ +" And the tax is "+ Socktax); // print subtotal of socks and taxes
        System.out.println("The subtotal for the Glasses is"+ Glasses*GlassCost$ +" And the tax is "+ Glasstax); // print subtotal of glasses and taxes
        System.out.println("The subtotal for the Envelope is"+ Envelopes*EnvelopeCost$ +" And the tax is "+ Envelopetax); // print subtotal of envelopes and taxes
        System.out.println("The subtotal for all items is "+ Allsubtotal); // print out subtotal for all items
        System.out.println("The Total for all items is "+ Alltotal); // print out the complete total of all items
        
        
    }
}