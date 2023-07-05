import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromoClient;
import Classes.SpecialClient;


public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
       Market magnit = new Market();
       Actor client1 = new OrdinaryClient("Boris");
       Actor client2 = new SpecialClient("prezident",1001);
       Actor p = new PensionerClient("Sergey Nikolay",1111);
       Actor promoClient=new PromoClient("Vanya", "Skidka 50%", 12211, 5);
       

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(promoClient);
        magnit.proleztBezOcheredy(promoClient);
        magnit.galyaOtmena(promoClient);

        

        magnit.update();
    }
}
