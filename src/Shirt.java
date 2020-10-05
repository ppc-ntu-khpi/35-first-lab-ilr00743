
public class Shirt {

    public int shirtID = 17; // стандартне значення номера моделі сорочки
    public String description = "Просто бомбическая рубаха"; // стандартний опис сорочки
    // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
    public String colorCode = "Червоний";
    public double price = 18.70; // стандартна вартість сорочки
    public int quantityInStock = 5; // стандартна кількість на складі

    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation
} // кінець опису класу
