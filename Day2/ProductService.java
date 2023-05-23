import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name))
                return p;
        }

        return null;
    }

    public Product getProductPlace(String place) {
        for (Product p : products) {
            if (p.getPlace().equals(place))
                return p;
        }

        return null;
    }
    //Assignment part 3..........................

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();

        List<Product> prods = products.stream()
                .filter(p -> p.getName().toLowerCase().contains(str)
                        || p.getType().toLowerCase().contains(str)
                        || p.getPlace().toLowerCase().contains(str))
                .collect(Collectors.toList());

        return prods;
    }

    public List<Product> getProductOutOfWarrant(String black) {
        List<Product> pro = new ArrayList<>();

        for (Product p : products) {
            if (p.getWarranty() < 2023) {
                pro.add(p);
            }
        }
        return pro;

    }
}