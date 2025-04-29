package Papka;


public class MyNewArrayList<T> {
    int capacity, size, index;
    T[] content;


    public MyNewArrayList() {
        content = (T[]) new Object[10]; // дефолтный конструктор
    }

    public MyNewArrayList(int capacity) {
        if (capacity <=0) {
            throw new IllegalArgumentException("Некорректная ёмкость");
        }else{
            content = (T[]) new Object[capacity];
        }

    }


    public void add(T element){
        /* if (size == capacity) { // проверка на наличие ёмкости
            int doubleCapacity = capacity * 2;
            MyNewArrayList dinamicMassive = new MyNewArrayList(doubleCapacity); // создаём в 2 раза больший массив и переносим туда все данные
            for (int i = 0; i < size; i++) {
                dinamicMassive.content[i] = content[i];
            }
            content = dinamicMassive.content;
        } */

        content[ size++ ] = element;
    }


    public void add(int index, T element) {
        //

        for (int i = size; i > index ; i--) { //Идём с конца, сдвигаем все элементы в хранилище на 1 в право, чтобы освободить место для нового элемента
            content[i] = content[ i-1 ];
        }
        size++;
        content[index] = element;

    }

    public void deleteLast() {
    }


    public void delete(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Некорректный индекс"); //проверка что индекс ннаходится в ёмкости массива
        }else{
            for (int i = index; i < size; i++) { //Идём с начала, сдвигаем все элементы в хранилище на 1 в лево, чтобы перекрыть удляемый элемент
                content[i] = content[ i+1 ];
                //size--;

            }

        }
    }

    public T get(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Некорректный индекс"); //проверка что индекс ннаходится в ёмкости массива
        }else {
            return content[index];
        }
    }


    public void show(){
        for (T element: content){
            System.out.print(element + ", ");
        }
    }

}