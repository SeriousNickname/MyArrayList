package Papka;
//import MyNewArrayList.src.Papka.MyNewArrayList;

/*
 * Здесь просто приведена проверка работоспособности методов
 * */
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> dinamicMassive = new MyArrayList<>();

        dinamicMassive.add(1);
        dinamicMassive.add(2);
        dinamicMassive.add(3);
        dinamicMassive.add(4);
        dinamicMassive.add(5);

        dinamicMassive.add(2, 66);
        dinamicMassive.show();


        dinamicMassive.delete(5);
        dinamicMassive.show();

        dinamicMassive.add(6);
        dinamicMassive.add(7);
        dinamicMassive.add(8);
        dinamicMassive.add(9);
        dinamicMassive.add(10);
        dinamicMassive.show();

        dinamicMassive.add(11);
        dinamicMassive.add(12);
        dinamicMassive.add(13);
        dinamicMassive.add(17, 876);
        dinamicMassive.show();

        dinamicMassive.add(20, 1234);
        dinamicMassive.show();

        System.out.println(dinamicMassive.get(0));
        System.out.println(dinamicMassive.get(4));


        dinamicMassive.delete(2347);


    }
}