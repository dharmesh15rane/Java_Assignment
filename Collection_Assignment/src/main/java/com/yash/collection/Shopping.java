package com.yash.collection;

import java.util.Objects;

public class Shopping {
        @Override
	public int hashCode() {
		return Objects.hash(product_id, product_name, product_price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shopping other = (Shopping) obj;
		return product_id == other.product_id && Objects.equals(product_name, other.product_name)
				&& product_price == other.product_price;
	}
	  public int product_id;
      public  String product_name;
      public  int product_price;
      
		public Shopping(int product_id, String product_name, int product_price) {
			super();
			this.product_id = product_id;
			this.product_name = product_name;
			this.product_price = product_price;
		}
		@Override
		public String toString() {
			return "Shopping [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
					+ product_price + "]";
		}
	
		
        
}
