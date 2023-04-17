package cm4oopday2Update;

public class OrderDetail {
	Product product;
	Order order;
	
	int quantityAtOrdered;
	double productPriceAtOrdered;
	public String orderDetailID;
	
	public double getSubTotal() {
		return this.quantityAtOrdered*this.productPriceAtOrdered;
	}

}
