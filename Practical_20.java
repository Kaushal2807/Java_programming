import java.util.Scanner;
//import static java.lang.System.exit;

public class Practical_20 {
    int size;
    int[] arr;
    int top;

    Practical_20(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int pushedElement) {
        if (isFull()) {
            System.out.println("Stack is full..!!!");
        } else {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element := " + pushedElement);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..!!!");
        }
        else {
            int returnedTop = top;
            top--;
            System.out.print("Popped element := ");
            return returnedTop;
        }
        return 0;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty..!!!");
            return -1;
        } else {
            return arr[top];
        }
    }

    void print()
    {
        while(!isEmpty()) {
            int data = pop();
            System.out.println(data);
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements := ");
        int n = sc.nextInt();
        Practical_20 pr = new Practical_20(10);
        int ele, del, flag=0;
        System.out.println("Enter Elements := ");
        for(int i=0;i<n;i++)
        {
            ele = sc.nextInt();
            pr.push(ele);
        }
        outer:
        while (pr.top >= -1) {
            System.out.println("1.DISPLAY");
            System.out.println("2.CHANGE");
            System.out.println("3.POP");
            System.out.println("4.PEEK");
            System.out.println("5.EXIT");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    pr.print();
                    break;
                case 2:
                    System.out.println("Enter Element To Change := ");
                    del = sc.nextInt();
                    while(!pr.isEmpty()) {
                        int data;
                        data=pr.pop();
                        if(data==del) {
                            flag = 1;
                            break;
                        }
                        else{
                            pr.push(data);
                        }
                    }
                    if(flag == 0) {
                        System.out.println("Not Found..!!!");
                    }
                    else {
                        System.out.println("Enter New Element := ");
                        ele = sc.nextInt();
                        pr.push(ele);
                    }
                    while(!pr.isEmpty()) {
                        int data;
                        data = pr.pop();
                        pr.push(data);
                    }
                    break;
                case 3:
                    pr.pop();
                    break;
                case 4:
                    System.out.println("Peek Element is := " + pr.peek());
                    break;
                case 5:
                    // exit(1);
                    break outer;
                default:
                    System.out.println("Invalid Choice..!!!");
            }
        }
    }
}

