import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        number=input.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        while(number!=0){
            list.add(number);
            number=input.nextInt();
        }
        System.out.println("The Max number"+max(list));
        Scanner s=new Scanner(System.in);
        int numbers=input.nextInt();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<list2.size();i++){
            list.add(numbers);
        }
        sort(list);
        System.out.println(list);

    }
    public static Integer max(ArrayList<Integer>list){
        if(list.size()==0)
            return null;
        int max=list.get(0);
       for(int i=0;i<list.size();i++){
           if(list.get(i)>max)
               max=list.get(i);
    }
       return max;

}
public static void sort(ArrayList<Integer>list){
    for (int i = 0; i < list.size() - 1; i++) {
        int min = list.get(i);
        int index = i;

        for (int j = i + 1; j < list.size(); j++) {
            if (min > list.get(j)) {
                min= list.get(j);
                index = j;
            }
        }

        if (index != i) {
            list.set(index, list.get(i));
            list.set(i, min);
        }
    }
}

}