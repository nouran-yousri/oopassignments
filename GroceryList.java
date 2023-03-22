import java.util.ArrayList;

public class GroceryList {
    GroceryItemOrder[]list;
    int size;
    public GroceryList(){list=new GroceryItemOrder[10];
    size=0;}
    public void add(GroceryItemOrder item) {
       list[size]=item;
       size++;

    }
        public double getTotalCost(){
             double totalcost=0;
             for(int i=0;i<size;i++){
                 totalcost+=list[i].getcost();
             }
             return totalcost;
        }
    }



