public class Main {
    public static void main(String[] args) throws FridayNightException {
        System.out.println("Пятница вечер");
        Girl snezhanna = new Girl("Снежанна");
        snezhanna.makeUp();
        snezhanna.dressPerfect();
        System.out.println("Я пошла! Оторвууууусь!");
        snezhanna.drink();
        snezhanna.drink();
        snezhanna.drink();
        snezhanna.drink();
        snezhanna.drink();
        try {
            snezhanna.haveFun();
        }catch (FridayNightException e){
            System.out.println(e.getMessage());
        }

    }
}