package Papka;
/**
 * Класс MyArrayList - это моя попытка создать собственную реализацию ArrayList, для лучшего понимания его работы, в рамках домашнего задания.
 * */

public class MyArrayList<T> {
    int capacity, size, index;
    T[] content;


    /**
     * Дефолтный конструктор
     * */
    public MyArrayList() {
        content = (T[]) new Object[10]; //
    }

    public MyArrayList(int capacity) {
        if (capacity <=0) {
            throw new IllegalArgumentException("Некорректная ёмкость");
        }else{
            content = (T[]) new Object[capacity];
        }
    }

    /**
     * Метод добавления элемента в массив в конец массива
     * */
    public void add(T element){
        if (size == content.length) { // проверка на наличие ёмкости
            doubling();
        }
        content[ size++ ] = element;
    }

    /**
     * Метод добавления элемента в массив в ячейку под индексом
     * */
    public void add(int index, T element) {
        if (size == content.length) { // проверка на наличие ёмкости
            doubling();
        }
        for (int i = size; i > index ; i--) { //Идём с конца, сдвигаем все элементы в хранилище на 1 в право, чтобы освободить место для нового элемента
            content[i] = content[ i-1 ];
        }
        size++;
        content[index] = element;
    }

    public void doubling(){
        T[] doubleContent = (T[]) new Object[(content.length * 2)];     // создаём в 2 раза больший массив и переносим туда все данные
        System.arraycopy(content,
                0,
                doubleContent,
                0,
                size); //Посмотрел System.arraycopy в реализации java.util, не знал про этот метод
    }

    public void deleteLast() {

    }

    /**
     *   Метод удаления элемента из массива по индексу
     * */
    public void delete(int index){
        if (index < 0 || index >= size) { // исправлена ошибка, связанная с индексом
            throw new IllegalArgumentException("Некорректный индекс"); //проверка, что индекс находится в ёмкости массива
        }else{
            for (int i = index; i < size; i++) { //Идём с начала, сдвигаем все элементы в хранилище на 1 в лево, чтобы перекрыть удаляемый элемент
                content[i] = content[ i+1 ];
            }
            size--;
        }
    }

    /**
     * Метод получения элемента из массива по индексоу
     * */
    public T get(int index){
        if (index < 0 || index >= size) {   // исправлена ошибка, связанная с индексом
            throw new IllegalArgumentException("Некорректный индекс"); //проверка, что индекс находится в ёмкости массива
        }else {
            return content[index];
        }
    }

    /**
     * Метод вывода всех элементов массива, нужен для отладки
     * */
    public void show(){
        for (T element: content){
            System.out.print(element + ", ");
        }
        System.out.print("Размер: " + size());
        System.out.print(". Ёмкость: " + content.length + "\n");
    }

    /**
     * Метод возвращает размер
     * */
    public int size() { return size; }


}}