package practice;

public class WorkWithAnimals {

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("fido");
        System.out.println(fido.getName());

        fido.digHole();
        fido.setWeight(-1);
    }
}
