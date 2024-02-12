public class Lion extends Animal {
    public void zhiv(int animal) {
        if (animal < 5) {
            System.out.print(" Бимбо дико ГАВкал,");
        } else {
            System.out.print(" Бимбо дико МЯУкал ");
        }
    }

    public void ElseDoSmt() {
        System.out.print(", пугая всех вокруг ");
    }

    @Override
    public void run() {
        System.out.println("Лев бежит");
    }

    @Override
    public void sound() {
        System.out.println("Лев рычит");
    }

    @Override
    public void drink() {
        System.out.println("Лев пьет");
    }
}
