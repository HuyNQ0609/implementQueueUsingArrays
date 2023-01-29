public class MyQueue {
    private final int capacity;
    protected final int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        return currentSize == capacity;
    }

    public boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int item) {
        if(isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
