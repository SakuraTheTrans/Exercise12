class StackFullException extends Exception {}

class StackEmptyException extends Exception {}

class Queue<E> {
    private E[] elements;
    private int index = 0;
    private int size;

    Queue(int size){
        elements = (E[]) new Object[size];
        this.size = size;
    }

    public void enqueue(E element) throws StackFullException {
        if (index >= size) {
            throw new StackFullException();
        }

        elements[index] = element;
        index++;
    }

    E dequeue() throws StackEmptyException {
        if (index == 0) {
            throw new StackEmptyException();
        }
        
        E returnElement = elements[0];

        for (int i = 1; i < index; i++) {
            elements[i - 1] = elements[i];
        }
        
        index--;
        return returnElement;
    }
    
    public void test(){
        System.out.println("Hello World");
    }
}