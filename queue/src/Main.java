public class Main {
    public static void main(String[] args) {

       queue q1 = new queue();
        System.out.println("is Empty = "+q1.empty());
        System.out.println("size of queue = "+q1.size());


        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.show();

//        q1.dequeue();
//        q1.show();
//
//        q1.dequeue();
//        q1.show();

        q1.enqueue(60);
        q1.enqueue(70);
        q1.show();

        System.out.println("size of queue = "+q1.size());

        System.out.println("is empty = "+q1.empty());

     System.out.println("is Full = "+q1.isFull());

    }
}