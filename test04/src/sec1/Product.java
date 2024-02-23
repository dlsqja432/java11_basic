package sec1;

public class Product {
	private String pName;
	private int pCode;
	private int price;
	private int size;
	private int amount;
	private String remark;
	
	/*
	 * 메소드 오버로드(Method Overload)
	 */
	public void print() {
		System.out.println("제품정보");
	}
	
	public void print(String pname) {
		System.out.println("제품이름 : " + pname);
	}
	
	public void print(int mount) {
		System.out.println("제품수량 : " + amount);
	}
	
	public void print(int mount, String pname) {
		System.out.println("제품수량 : " + amount);
		System.out.println("제품이름 : " + pname);
	}
	
	public void print(String pname, int mount) {
		System.out.println("제품이름 : " + pname);
		System.out.println("제품수량 : " + amount);
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pCode=" + pCode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
	
	
}
