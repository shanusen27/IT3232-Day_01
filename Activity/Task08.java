
class Product {
    String id, name;
    double price;
    int quantity;

    Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(id + " | " + name + " | Rs" + price + " | Qty: " + quantity);
    }
}


class RetailStore {
    Product[] products = new Product[5]; 
    int count = 0; 

    void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
            System.out.println(p.name + " added.");
        } else {
            System.out.println("Store is full! Cannot add more products.");
        }
    }

    void editProduct(String id, double price, int quantity) {
        for (int i = 0; i < count; i++) {
            if (products[i].id.equals(id)) {
                products[i].price = price;
                products[i].quantity = quantity;
                System.out.println(products[i].name + " updated.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    void deleteProduct(String id) {
        for (int i = 0; i < count; i++) {
            if (products[i].id.equals(id)) {
                System.out.println(products[i].name + " deleted.");
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1]; 
                }
                products[--count] = null; 
                return;
            }
        }
        System.out.println("Product not found.");
    }

    void displayAll() {
        System.out.println("\nAvailable Products:");
        if (count == 0) {
            System.out.println("No products available.");
        } else {
            for (int i = 0; i < count; i++) {
                products[i].display();
            }
        }
    }
}


public class Task08 {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        
        store.addProduct(new Product("F001", "Apple", 1.99, 50));
        store.addProduct(new Product("V001", "Carrot", 0.89, 100));
        store.addProduct(new Product("G001", "Rice", 10.99, 20));

        
        store.displayAll();

        
        store.editProduct("F001", 2.49, 60);

        
        store.deleteProduct("V001");

        
        store.displayAll();
    }
}
