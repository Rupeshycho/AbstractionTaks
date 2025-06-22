abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky!");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins cannot fly, but they swim like champs!");
    }
}
