import java.util.Scanner;

public class AnimalDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String asnwer = new String();
        System.out.print("Want to hear a dog barking (yes/no) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("yes")) {
            Animal charlie = new Dog();
            charlie.printImage();
            charlie.makeSound();
            charlie.makeMove();
        }

        System.out.print("Want to hear a cat meowing (yes/no) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("yes")) {
            Animal kuzzi = new Cat();
            kuzzi.printImage();
            kuzzi.makeSound();
            kuzzi.makeMove();
        }

        System.out.print("Want to hear a chicken cluck (yes/no) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("yes")) {
            Animal chicken = new Chicken();
            chicken.printImage();
            chicken.makeSound();
            chicken.makeMove();
        }

        System.out.print("Want to hear a hamster squeak (yes/no) ? ");
        asnwer = scan.nextLine();
        if (asnwer.equals("yes")) {
            Animal Hamster = new Hamster();
            Hamster.printImage();
            Hamster.makeSound();
            Hamster.makeMove();
        }
    }
}