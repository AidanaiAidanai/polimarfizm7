package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animal ={
                new Dog("Tuzik",5),
                new Cow("Chomok",6)
        };
        for (Animal ani :animal) {
           // System.out.println(ani+" ");
            System.out.println(ani.getName()+" ");
            ani.met();
        }

       Dog it = new Dog("ak dosh", 6);
        System.out.println("Types "+it.getClass().getSimpleName());
        it.met();


        Animal janubar = new Animal("animals", 8);
        System.out.println("Types "+janubar.getClass().getSimpleName());
        janubar.met();

        Cow cow = new Cow("kuyruk",6);
        System.out.println("Types "+cow.getClass().getSimpleName());
        cow.met();

        
        overload(1,2,3,4);
        over("Aidana", "Mamatberdieva");
    }

        public static void overload(){
            System.out.println();
        }
        public static void overload(int a){
            System.out.println("a");
        }
    public static void overload(int a, int b){
        System.out.println("b");
    }
    public static void overload(int a, int b, int c){
        System.out.println("c");
    }
    public static void overload(int a, int b,int c, int d){
        System.out.println("d");
    }
    public static void over(String name,String value){
        System.out.println(name + value);
    }
}
