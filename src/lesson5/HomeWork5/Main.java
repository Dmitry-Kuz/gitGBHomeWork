package lesson5.HomeWork5;

import sun.text.resources.cldr.gd.FormatData_gd;

public class Main {







    public static void main(String[] args) {



            Dog dog = new Dog("Собака", 500, 0.5f, 10);
            Bird bird = new Bird("Птица", 5, 2, 1);
            Horse horse = new Horse("Лошадь", 1500, 100, 3);
            Cat cat = new Cat("Кошка", 200, 2, 9);
            Dog dog1 = new Dog("Маленькая Собака", 400, 0.5f, 8);


            Animals[] array = {dog, bird, horse, cat, dog1};


            for (int i = 0; i <array.length ; i++) {

                int run1 =  (int) (Math.random() *2000);
                float sail1 =  (float) (Math.random() * 10 );
                int jamp1 =  (int) (Math.random() * 20);

                if (array[i].canRun(run1)) System.out.println(array[i].getType() + " " + run1 + " м. добежала");
                else System.out.println(array[i].getType() + " " + run1 +  " м. не добежала");

                    if (array[i].canSail(sail1) == "can not swim")
                        System.out.println(array[i].getType() + " " + sail1 +  " м. не доплыла т.к. не может плавать");
                    else if(array[i].canSail(sail1) == "true")
                        System.out.println(array[i].getType() + " " + sail1 +  " м.  доплыла");
                        else  System.out.println(array[i].getType() + " " + sail1 +  " м. не доплыла");

                        if (array[i].canJump(jamp1)) {
                            System.out.println(array[i].getType() + " " + jamp1 +  " м. перепрыгнула");
                        } else System.out.println(array[i].getType() + " " + jamp1 +  " м. не перепрыгнула");


            }



    }

}


