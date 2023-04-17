package cm4oopday2Update;

import java.util.Scanner;

public class TheSourCoffee {
	public static void main(String[] args) {
		// Brands
		Brand brand1 = new Brand();
		brand1.name = "Trung Nguyen";

		Brand brand2 = new Brand();
		brand2.name = "King Coffee";

		Brand brand3 = new Brand();
		brand3.name = "Phuc Long";

		Brand[] brands = { brand1, brand2, brand3 };

		// Customers
		Customer customer1 = new Customer();
		customer1.name = "Tien";

		Customer customer2 = new Customer();
		customer2.name = "Yen";

		Customer customer3 = new Customer();
		customer3.name = "Bach";

		Customer customer4 = new Customer();
		customer4.name = "Kiet";

		Customer[] customers = { customer1, customer2, customer3, customer4 };

		// Product categories of Trung Nguyen
		Product blackCoffee = new Product();
		blackCoffee.productID = "BL01";
		blackCoffee.brand = brand1;
		blackCoffee.name = "Ca phe Den";
		blackCoffee.price = 4.7;
		blackCoffee.totalQuantity = 500;

		Product brownCoffee = new Product();
		brownCoffee.productID = "BC01";
		brownCoffee.brand = brand1;
		brownCoffee.name = "Ca phe nau";
		brownCoffee.price = 5.8;
		brownCoffee.totalQuantity = 900;

		Product whiteCoffee = new Product();
		whiteCoffee.productID = "WC01";
		whiteCoffee.brand = brand1;
		whiteCoffee.name = "Bac Xiu";
		whiteCoffee.price = 7.5;
		whiteCoffee.totalQuantity = 600;

		// Product categories of King Coffee
		Product hotChoc = new Product();
		hotChoc.productID = "HC01";
		hotChoc.brand = brand2;
		hotChoc.name = "Ca cao nong";
		hotChoc.price = 7.8;
		hotChoc.totalQuantity = 800;

		Product longBlack = new Product();
		longBlack.productID = "LGB01";
		longBlack.brand = brand2;
		longBlack.name = "Ca phe pha nuoc";
		longBlack.price = 4.0;
		longBlack.totalQuantity = 200;

		Product shortBlack = new Product();
		shortBlack.productID = "SB01";
		shortBlack.brand = brand2;
		shortBlack.name = "Ca phe dam da";
		shortBlack.price = 3.0;
		shortBlack.totalQuantity = 400;

		// Products of Phuc Long
		Product instantCoffee = new Product();
		instantCoffee.productID = "IC01";
		instantCoffee.brand = brand3;
		instantCoffee.name = "Ca phe goi";
		instantCoffee.price = 10.2;
		instantCoffee.totalQuantity = 80;

		Product grindedCoffee = new Product();
		grindedCoffee.productID = "GC01";
		grindedCoffee.brand = brand3;
		grindedCoffee.name = "ca phe xay min";
		grindedCoffee.price = 8.5;
		grindedCoffee.totalQuantity = 550;

		Product rawBean = new Product();
		rawBean.productID = "RB01";
		rawBean.brand = brand3;
		rawBean.name = "Hat ca phe tuoi";
		rawBean.price = 1.5;
		rawBean.totalQuantity = 800;

		Product[] products = { blackCoffee, brownCoffee, whiteCoffee, hotChoc, longBlack, shortBlack, instantCoffee,
				grindedCoffee, rawBean };

		// Orders
		Order order1 = new Order();
		order1.orderID = 1;
		order1.datetime = "13.03.2023 16:00:07";
		order1.customer = customer2;

		Order order2 = new Order();
		order2.orderID = 2;
		order2.datetime = "14.03.2023 14:03:20";
		order2.customer = customer1;

		Order order3 = new Order();
		order3.orderID = 3;
		order3.datetime = "14.03.2023 18:20:07";
		order3.customer = customer3;

		Order order4 = new Order();
		order4.orderID = 4;
		order4.datetime = "20.03.2023 09:00:07";
		order4.customer = customer1;

		Order order5 = new Order();
		order5.orderID = 5;
		order5.datetime = "15.03.2023 10:00:30";
		order5.customer = customer3;

		Order[] orders = { order1, order2, order3, order4, order5 };

		// Order Detail 1, many products
		OrderDetail orderDetail101 = new OrderDetail();
		orderDetail101.orderDetailID = "01";
		orderDetail101.product = shortBlack;
		orderDetail101.order = order1;
		orderDetail101.quantityAtOrdered = 12;
		orderDetail101.productPriceAtOrdered = 3.5;

		OrderDetail orderDetail102 = new OrderDetail();
		orderDetail102.orderDetailID = "02";
		orderDetail102.product = longBlack;
		orderDetail102.order = order1;
		orderDetail102.quantityAtOrdered = 5;
		orderDetail102.productPriceAtOrdered = 4.7;

		OrderDetail orderDetail201 = new OrderDetail();
		orderDetail201.orderDetailID = "01";
		orderDetail201.product = whiteCoffee;
		orderDetail201.order = order2;
		orderDetail201.quantityAtOrdered = 7;
		orderDetail201.productPriceAtOrdered = 4.2;

		OrderDetail orderDetail202 = new OrderDetail();
		orderDetail202.orderDetailID = "02";
		orderDetail202.product = blackCoffee;
		orderDetail202.order = order2;
		orderDetail202.quantityAtOrdered = 5;
		orderDetail202.productPriceAtOrdered = 3.5;

		OrderDetail orderDetail3 = new OrderDetail();
		orderDetail3.product = rawBean;
		orderDetail3.order = order3;
		orderDetail3.quantityAtOrdered = 3;
		orderDetail3.productPriceAtOrdered = 5.3;

		OrderDetail orderDetail4 = new OrderDetail();
		orderDetail4.product = instantCoffee;
		orderDetail4.order = order4;
		orderDetail4.quantityAtOrdered = 2;
		orderDetail4.productPriceAtOrdered = 2.0;

		OrderDetail orderDetail501 = new OrderDetail();
		orderDetail501.product = shortBlack;
		orderDetail501.order = order5;
		orderDetail501.quantityAtOrdered = 1;
		orderDetail501.productPriceAtOrdered = 3.5;

		OrderDetail orderDetail502 = new OrderDetail();
		orderDetail502.product = whiteCoffee;
		orderDetail502.order = order5;
		orderDetail502.quantityAtOrdered = 2;
		orderDetail502.productPriceAtOrdered = 4.5;

		OrderDetail orderDetail503 = new OrderDetail();
		orderDetail503.product = hotChoc;
		orderDetail503.order = order5;
		orderDetail503.quantityAtOrdered = 1;
		orderDetail503.productPriceAtOrdered = 4.8;

		OrderDetail[] orderDetails = { orderDetail101, orderDetail102, orderDetail201, orderDetail202, orderDetail3,
				orderDetail4, orderDetail501, orderDetail502, orderDetail503 };

		// Input order code to see order details
		System.out.println("Enter order code: ");

		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();

		getOrderDetails(orders, code, orderDetails);

	}

	public static void getOrderDetails(Order[] orders, int enteredcode, OrderDetail[] orderDetails) {
		for (Order order : orders) {
			if (enteredcode == order.orderID) {
				System.out.println("Order code: " + order.orderID);
				System.out.println("Date: " + order.datetime);
				System.out.println("Customer: " + order.customer.name + "\n");
				System.out.println("Product List: ");
				System.out.println("----------------");
				for (OrderDetail orderDetail : orderDetails) {
					if (order.orderID == orderDetail.order.orderID) {
						System.out.println(orderDetail.product.name + " : " + orderDetail.quantityAtOrdered + " x "
								+ orderDetail.productPriceAtOrdered + " = "
								+ Math.round(orderDetail.getSubTotal() * 100.0) / 100.0);
						System.out.println("----------------");
						order.total += Math.round(orderDetail.getSubTotal() * 100.0) / 100.0;

					}
				}
				System.out.println("Total Bill: " + "$" + order.total);
				System.out.println("----------Thank you---------");
				break;
			}

		}
	}
}
