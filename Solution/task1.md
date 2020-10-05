## Task 1.1
![task1.1](https://github.com/ppc-ntu-khpi/35-first-lab-ilr00743/blob/master/Solution/task1.1.png "task1.1")

``` java
public class Shirt {
  public int shirtID = 0; // стандартне значення номера моделі сорочки
  public String description = "-description required-"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public char colorCode = 'U';
  public double price = 0.0; // стандартна вартість сорочки
  public int quantityInStock = 0; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу
```
## Task 1.2
![task1.2](https://github.com/ppc-ntu-khpi/35-first-lab-ilr00743/blob/master/Solution/task1.2.png "task1.2")

``` java
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
```
