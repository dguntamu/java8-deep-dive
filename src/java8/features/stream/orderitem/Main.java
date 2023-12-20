package java8.features.stream.orderitem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				new Order(101,Arrays.asList(
						new Item(201,"Biryani",200),
						new Item(202,"Chicken",250),
						new Item(201,"chilli",300),
						new Item(201,"Roti",150))),
				new Order(102,Arrays.asList(
						new Item(201,"102-item1",200),
						new Item(202,"102-item2",250),
						new Item(201,"102-item3",300),
						new Item(201,"102-item4",150))),
				new Order(103,Arrays.asList(
						new Item(201,"103-item1",200),
						new Item(202,"103-item2",250),
						new Item(201,"103-item3",300),
						new Item(201,"103-item4",150))),
				new Order(104,Arrays.asList(
						new Item(201,"104-item1",200),
						new Item(202,"104-item2",250),
						new Item(201,"104-item3",300),
						new Item(201,"104-item4",150))));
		
		Map<Integer,List<Item>> filteredOrders = orders.stream()
				.flatMap(order -> order.getItems().stream())
				.filter(item -> item.getPrice() > 200)
				.collect(Collectors.toMap(Order::getOrderId, item));
	}
}
