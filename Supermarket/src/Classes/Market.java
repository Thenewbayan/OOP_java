package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IMarketBehavior;
import Interfaces.IQueueBehavior;
import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;



public class Market implements iActorBehaviuor, IMarketBehavior,IQueueBehavior, iReturnOrder {

    private List<iActorBehaviuor> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
    }



    
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    
    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for(iActorBehaviuor actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviuor actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }

   
    @Override
    public void takeOrder() {
        for(iActorBehaviuor actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }




    public List<iActorBehaviuor> getQueue() {
        return queue;
    }




    public void setQueue(List<iActorBehaviuor> queue) {
        this.queue = queue;
    }




    @Override
    public void galyaOtmena(Actor actor) {
        System.out.println(actor.getActor().getName()+" клиент хочет вернуть товар, ГАЛЯ! ОТМЕНА!!! ");    
        
    }




    @Override
    public void proleztBezOcheredy(Actor actor) {
        queue.add(0, actor);//добавляем клиента в начало очереди
        System.out.println(actor.getActor().getName()+" клиент влез без очереди ");
                
    }
    
}