package Interfaces;

import Classes.Actor;

public interface IQueueBehavior {
    /**
     * @param actor adds to the queue
     */
    void takeInQueue(Actor actor);
    /**
     * 
     */
    void releaseFromQueue();
    /**
     * take order
     */
    void takeOrder();
    /**
     * give order
     */
    void giveOrder();
}