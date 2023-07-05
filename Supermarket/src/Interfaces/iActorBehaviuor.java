package Interfaces;

import Classes.Actor;

public interface iActorBehaviuor {

    /**
     * @return true if take order
     */
    public boolean isTakeOrder() ;
    /**
     * @return true if make order
     */
    public boolean isMakeOrder() ;
    /**
     * @param takeOrder if true - take order, and not take if false
     */
    public void setTakeOrder(boolean takeOrder) ;
   /**
     * @param makeOrder if true - make order, and not make if false
     */
     public void setMakeOrder(boolean makeOrder) ;
    /**
     * @return type reference
     */
    Actor getActor();
    
}
