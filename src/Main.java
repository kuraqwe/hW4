public class Main {
    public static void main(String[] args) {
        int userAge = 14;
        if (userAge >= 18) {
            System.out.println("Поздравляю, вы совершеннолетний!");             //the first task
        }
        if (userAge < 18){
            System.out.println("Увы, нужно еще немного подождать(");
        }

        int humanAge = 20;
        if ((humanAge >= 7) && (humanAge < 18)){
            System.out.println("Ты ходишь в школу");
        }
        if ((humanAge >= 18) && (humanAge < 24)){                               //the second task
            System.out.println("иди в универ");
        }
        if (humanAge >= 24){
            System.out.println("пора искать первую работу");
        }

        int numberOfSeats = 60;
        int numberOfPassengers = 40;
        if (numberOfPassengers < numberOfSeats){
            System.out.println("сидячие места есть");
        }
        if (numberOfPassengers > numberOfSeats){
            System.out.println("сидячих мест нет");
        }

        int userAge1 = 14;
        if (userAge1 >= 18) {
            System.out.println("Поздравляю, вы совершеннолетний!");             //the fourth task
        }
        else{
            System.out.println("Увы, нужно еще немного подождать(");
        }

        int humanAge1 = 20;
        if (humanAge1 >= 7){
            System.out.println("Ты ходишь в школу");
        }
        if ((humanAge1 >= 18) && (humanAge1 < 24)){                               //the fifth task
            System.out.println("иди в универ");
        }
        else{
            System.out.println("пора искать первую работу");
        }

        int numberOfSeats1 = 60;
        int numberOfPassengers1 = 40;
        if (numberOfPassengers1 > numberOfSeats1){
            System.out.println("сидячих мест нет");                             //the sixth task
        }else{
            System.out.println("сидячие места есть");
        }

        int age = 21;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ.");               //the seventh task
        }
        if (age >= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

        int kidAge = 6;
        if (kidAge <= 5){
            System.out.println("Ты не можешь кататься на аттракционе.");
        }
        if (kidAge > 5 && kidAge < 14){
            System.out.println("Ты можешь кататься только в спопровождении взрослого.");                        //the eighth task
        }
        if (kidAge >= 14){
            System.out.println("Ты уже взрослый и можешь кататься сам.");
        }

        int one = 15;
        int two = 20;
        int three = 7;
        if (one > two && one > three){
            System.out.println("Наибольшее число one = " + one);
        }
        if (two > one && two > three){
            System.out.println("Наибольшее число two = " + two);                            //the ninth task
        }
        if (three > one && three > two){
            System.out.println("Наибольшее число three = " + three);
        }
    }
}