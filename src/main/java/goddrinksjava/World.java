package goddrinksjava;

import goddrinksjava.internal.MyInterface;

import java.util.ArrayList;
import java.util.List;

public class World {
    private final int id;
    private final List<Thing> things = new ArrayList<>();

    public World(int id) {
        this.id = id;
    }
    
    public void addThing(Thing thing) {
        things.add(thing);
    }
    
    public void startSimulation() {
        
    }
    
    public void timeTravelForTwo(String era, int year, Thing me, Thing you) {
        
    }
    
    public void unite(Thing me, Thing you) {
        
    }
    
    public void lockThing(Thing thing) {
        
    }
    
    public Thing getGod() {
        return things.getFirst();
    }
    
    void procreate(Thing me, Thing you) {
        
    }
    
    void makeHigh(Thing who) {
        
    }
    
    void unlock(Thing who) {
        
    }
    
    void removeThing(Thing who) {
        
    }
    
    void announce(String message) {
        
    }

    void announce(String message, String language) {
        
    }
    
    void runExecution() {
        
    }
    
    boolean isExecutableBy(Thing who) {
        return true;
    }
    
    int getThingIndex(Thing who) {
        return 0;
    }
    
    void execute(Thing who) {
        MyInterface myInterface = new MyInterface();
        myInterface.run();
    }
}
