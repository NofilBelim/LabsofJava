package Lab5;
interface QueueImpl{
    void insert(int value) ;
    void delete() ;
    void display();

}

class QueueDemo implements QueueImpl{
    private int []queue=new int[10];
    private int front=-1;
    private int rear=-1;

    @Override
    public void insert(int value) {
        try {
            if (rear == 9) {
                throw new Exception("Oueue OverFlow cannot insert");
            }

            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void delete() {
        try{
            if(front==-1 || front>rear){
                throw new Exception("Queue UnderFlow Cannot Delete");

            }
            int deleted=queue[front];
            front++;
            System.out.println(deleted+" deleted");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    @Override
    public void display() {
        if(front==-1 || front>rear){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("queue elements");
        for (int i=front;i<=rear;i++){
            System.out.println(queue[i]+" ");
        }
        System.out.println();
    }

}


public class Q1{
    static void main(String[] args) {
        QueueDemo q= new QueueDemo();
        for(int i=1;i<=10;i++){
            q.insert(i);
        }
        q.display();
        q.insert(11);
        for (int i=1;i<=10;i++){
            q.delete();
        }
        q.display();
        q.delete();
    }
}
