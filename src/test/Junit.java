package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import collections.shoppingcart.Cart;
import collections.shoppingcart.Product;
import collections.shoppingcart.Products;
import collections.shoppingcart.UI;

class Junit {
	@Test
	void productTest() {
		Product product1 = new Product(4, "Banana", 0.99, 20);
		Product product = new Product();
		product.setName("Sake");
		product.setPid(4);
		product.setStock(10);
		product.setPrice(5.09);
		assertTrue("Sake" == product.getName());
		assertTrue(4 == product.getPid());
		assertTrue(10 == product.getStock());
		assertTrue(5.09 == product.getPrice());		
		assertEquals("Banana", product1.getName());
		assertFalse(0.999 == product1.getPrice());
		
	}
	@Test
	void productsTest() {
		
		Products products = new Products();
		Product product = new Product();
		Product product1 = products.getProduct(1);
		Product product2 = products.getProduct(1000);
		assertEquals(product2, product);
		assertNotEquals(null, products);
		assertTrue(product1.getName() == "Fair n Lovely");
	}
	
	@Test
	void cartTest() {
		
		Cart cart = new Cart();
		assertTrue(cart.getCartSize() == 0);
		cart.addProductToCartByPID(1);
		assertNotNull(cart);
		cart.removeProductByPID(1);
		assertTrue(cart.getCartSize() == 0);
		cart.addProductToCartByPID(5000);
		assertTrue(cart.getCartSize() == 1);
		cart.addProductToCartByPID(2);
		assertTrue(cart.getCartSize() == 2);
		cart.deleteCart();
		assertTrue(cart.getCartSize() == 0);

		
	}
}
