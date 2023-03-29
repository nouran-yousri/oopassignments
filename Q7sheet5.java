import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Heba.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {

            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 500) + 1));
                output.print(" ");
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        try(

                Scanner input = new Scanner(file);
        ) {

            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }

        Collections.sort(list);

        System.out.print(list.toString());
        System.out.println();
    }
    }

