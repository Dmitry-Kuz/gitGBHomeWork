package lesson4.HomeWork4;

public class Main {
    public static void main(String[] args) {

        Employee[] emplArr = new Employee[5];

        emplArr[0] = new Employee("Иванов",
                "Иван",
                "Иванович",
                "Ген-Директор",
                997701,
                50000,
                50);
        emplArr[1] = new Employee("Николаев",
                "Николай",
                "Николаевич",
                "Коммерческий-Директор",
                997702,
                45000,
                44);
        emplArr[2] = new Employee("Петров",
                "Петр",
                "Петрович",
                "Директор-Производства",
                997703,
                40000,
                39);
        emplArr[3] = new Employee("Петрова",
                "Анна",
                "Петровна",
                "Главный-Бухгалтер",
                997704,
                35000,
                46);
        emplArr[4] = new Employee("Николаева",
                "Людмила",
                "Николаевна",
                "Старший-Менеджер",
                997705,
                35000,
                38);



        emplArr[3].setName("Наталья");

        for (int i = 0; i < emplArr.length ; i++) {

            emplArr[i].raiseSalary(5000, 45);

            if(emplArr[i].getAge() > 40) {
                emplArr[i].outSNM();
                emplArr[i].outPosition();
                emplArr[i].outSalsry();
                emplArr[i].outTelephone();
                System.out.println();
            }
        }
    }
}
