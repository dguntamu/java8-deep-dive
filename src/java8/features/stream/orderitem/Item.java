package java8.features.stream.orderitem;

public class Item {
	private Integer itemId;
	private Integer price;
	private String name;

	public Item(Integer itemId, String name, Integer price) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + ", name=" + name + "]";
	}

}
