package OPP.Generics;

public class Products<T, U> {
    T item;
    U price;
    Products(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public U getPrice() {
        return price;
    }
}
