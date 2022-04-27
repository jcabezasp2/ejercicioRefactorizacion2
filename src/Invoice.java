
/**
 * Class to make invoices and apply the tax over the add value
 * @author Programador Bajeril
 */
public class Invoice {

	/**
	 * @param total is the final amount after apply the tax and a discount if is neccersary
	 * @param subtotal is the amount before apply the tax or the discount
	 * @param IVA the regular version of the tax over the add value
	 * @param IVA_REDUCED a reduced version of the tax
	 * @param SPECIAL_DISCOUNT a special discount for VIP customers
	 */
	private double total;
	private double subtotal;
	private final double IVA = 0.21;
	private final double IVA_REDUCED = 0.10;
	private final double SPECIAL_DISCOUNT = 0.04;

	/**
	 *
	 * @param subtotal is the amount before apply the tax or the discount
	 */
	public Invoice(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * this method apply a reduced version of the tax
	 */
	public void applyReducedIVA() {
		this.total = subtotal + (subtotal * IVA_REDUCED);
	}

	/**
	 *  this method apply the regular tax
	 */
	public void applyIva() {
		this.total = subtotal + (subtotal * IVA);
	}
	
	/**
	 * this method apply the regular tax and a special discount for vip customers
	 */
	public void applyIvaAndSpecialDiscount() {
		this.total = (subtotal + (subtotal * IVA)) - ((subtotal + (subtotal * IVA)) * SPECIAL_DISCOUNT);
	}

	/**
	 *
	 * @return total is the final amount after apply the tax and a discount if is neccersary
	 */
	public double getTotal() {
		return total;
	}
}
