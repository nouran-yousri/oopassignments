public class Main {
    public static void main(String[] args) {
      GroceryList g=new GroceryList();
      GroceryItemOrder o=new GroceryItemOrder("chipsy",5.5);
      o.setQuantity(2);
      System.out.println(o.getcost());
      g.add(o);
      GroceryItemOrder o2=new GroceryItemOrder("bread",10.75);
        o2.setQuantity(3);
        System.out.println(o2.getcost());
      g.add(o2);
      System.out.println("TotalCost="+g.getTotalCost());

    }
}