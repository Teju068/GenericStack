package genericstack;

import static genericstack.Utils.printf;

import java.util.Scanner;

public class GenStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        do {
            printf("*****Generic Stack********");
            printf("Enter you choice ==>");
            printf("1 for Push");
            printf("2 for Pop");
            printf("3 for peek");
            printf("4 for Traverse");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printf("Enter the data which you want to insert");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    int poppedData = stack.pop();
                    printf("Data : " + poppedData);
                    break;
                case 3:
                    int topData = stack.peek();
                    printf("Check Data : " + topData);
                    break;
                case 4:
                    //TODO
                    break;
            }
        } while (true);
    }

}
