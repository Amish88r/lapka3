public class Parrot extends Animal {
    @Override
    public void run() {
        System.out.println("Папуга летит");
    }

    @Override
    public void sound() {
        System.out.println("Папуга каркает");
    }

    @Override
    public void drink() {
        System.out.println("Папуга пьет клювом");
    }
}
