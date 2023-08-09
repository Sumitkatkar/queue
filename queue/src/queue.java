public class queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    void enqueue(int data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else{
            System.out.println("queue is full");
        }
    }

    int dequeue() {
        int data = queue[front];
        if (!empty()) {
            front = (front + 1) % 5;
            size--;
        }
        else {
            System.out.println("queue is already empty");
        }
        return data;
    }

    void show(){
        for(int i=0; i<size; i++){
            System.out.print(queue[(front+i) %5] + " ");
        }
        System.out.println();
    }

    int size(){
        return size;
    }

    boolean empty(){
        return size<=0;
    }
    boolean isFull(){
        return size == 5;
    }

}
