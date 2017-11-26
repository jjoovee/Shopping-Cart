package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    List<Product> cartItems = new ArrayList<Product>();
    
    public int getCartSize() {
    	
    	return cartItems.size();
    }
    public void deleteCart() {
    	cartItems.removeAll(cartItems);
    }
    
    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);
    }
    
    private Product getProductByProductID(int pid) {
        Product product = new Product();
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int pid) {
        Product prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    public void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }
    
}