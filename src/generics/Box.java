package generics;

public class Box <T>{ // // <T> — это параметр типа
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
