
public class Shirt {

    public int shirtID = 17; // ���������� �������� ������ ����� �������
    public String description = "������ ����������� ������"; // ����������� ���� �������
    // ���� �������: R=��������, B=����, G=�������, U=�������
    public String colorCode = "��������";
    public double price = 18.70; // ���������� ������� �������
    public int quantityInStock = 5; // ���������� ������� �� �����

    // ��� ����� ������ �������� ��� ���������� ��� ������� �� �����
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // ����� ������ displayShirtInformation
} // ����� ����� �����
