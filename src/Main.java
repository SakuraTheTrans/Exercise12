public class Main {
    public static void main(String[] args) {
        // Kinda hated this ;w;

        Queue<String> strings = new Queue<>(3);
        try{
            strings.enqueue("Goodbye");
            strings.enqueue("World");
            strings.enqueue("!!!");
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }

    }
}