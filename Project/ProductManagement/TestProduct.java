package ProductManagement;

public class TestProduct {
    public static void main(String[] args) {
        // Create an ElectronicsProduct
        ElectronicsProduct electronicsProduct = new ElectronicsProduct();
        System.out.println("Electronics Product ID: " + electronicsProduct.id);
        System.out.println("Electronics Product Name: " + electronicsProduct.name);
        System.out.println("Electronics Product Price: " + electronicsProduct.price);
        System.out.println("Category: " + electronicsProduct.getCategory());
        System.out.println();

        // Create a ToyProduct
        ToyProduct toyProduct = new ToyProduct();
        System.out.println("Toy Product ID: " + toyProduct.id);
        System.out.println("Toy Product Name: " + toyProduct.name);
        System.out.println("Toy Product Price: " + toyProduct.price);
        System.out.println("Category: " + toyProduct.getCategory());
    }

}

