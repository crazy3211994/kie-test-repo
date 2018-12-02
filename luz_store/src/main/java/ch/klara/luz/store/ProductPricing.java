package ch.klara.luz.store;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProductPricing implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String productCode;
	private int volume;
	private java.lang.String pricePlan;
	private java.math.BigDecimal price;

	public ProductPricing() {
	}

	public java.lang.String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(java.lang.String productCode) {
		this.productCode = productCode;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public java.lang.String getPricePlan() {
		return this.pricePlan;
	}

	public void setPricePlan(java.lang.String pricePlan) {
		this.pricePlan = pricePlan;
	}

	public java.math.BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}

	public ProductPricing(java.lang.String productCode, int volume,
			java.lang.String pricePlan, java.math.BigDecimal price) {
		this.productCode = productCode;
		this.volume = volume;
		this.pricePlan = pricePlan;
		this.price = price;
	}

}