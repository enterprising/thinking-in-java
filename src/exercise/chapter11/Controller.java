package exercise.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by peng.tan on 17/6/29.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void run() {
        while(eventList.size() > 0)
            // Make a copy so you're not modifying the list
            // while you're selecting the elements in it:
            for(Event e : new ArrayList<Event>(eventList))
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
    private List<Event> enventList2 = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run2(){
        while (enventList2.size()>0){
            for (Event e:new LinkedList<Event>(enventList2)
                 ) {
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    enventList2.remove(e);
                }
            }
            Iterator it = enventList2.iterator();
            while(it.hasNext())
                System.out.println(it.next());
        }
    }
}
