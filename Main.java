package Papka;
//import MyNewArrayList.src.Papka.MyNewArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyNewArrayList<Integer> dinamicMassive = new MyNewArrayList<>();

            dinamicMassive.add(1);
            dinamicMassive.add(2);
            dinamicMassive.add(3);
            dinamicMassive.add(4);
            dinamicMassive.add(5);
            dinamicMassive.add(2, 66);
            dinamicMassive.delete(2);

            dinamicMassive.show();


            System.out.println("\n" + dinamicMassive.get(0));




    }
}