package Classes;

import java.util.List;

import Interfaces.IMarketBehavior;
import Interfaces.IQueueBehavior;
import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class PromoClient extends Actor implements iActorBehaviuor, IMarketBehavior, IQueueBehavior, iReturnOrder{
    private String promoName;
    private int promoID;
    private int promoQuantity;
    
    public PromoClient(String name, String promoName, int promoID, int promoQuantity) {
        super(name);
        this.promoName = promoName;
        this.promoID = promoID;
        this.promoQuantity = promoQuantity;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public int getPromoID() {
        return promoID;
    }

    public void setPromoID(int promoID) {
        this.promoID = promoID;
    }

    public int getPromoQuantity() {
        return promoQuantity;
    }

    public void setPromoQuantity(int promoQuantity) {
        this.promoQuantity = promoQuantity;
    }

    @Override
    public String toString() {
        return "PromoClient [promoName=" + promoName + ", promoID=" + promoID + ", promoQuantity=" + promoQuantity
                + "]";
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }
   
    }

   