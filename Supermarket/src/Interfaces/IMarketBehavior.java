package Interfaces;

import java.util.List;

import Classes.Actor;

public interface IMarketBehavior {
    /**
     * @param actor adds to the market
     */
    void acceptToMarket(Actor actor);
    /**
     * @param actor leave the store
     */
    void releaseFromMarket(List<Actor> actor);
    /**
     * 
     */
    void update();
}