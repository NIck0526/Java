package reference.self;
import reference.self.ProductVOSelf;
public class ProductVOService {
	
	public class ProductStoreService{
	

	public void printAllProduct(ProductVOSelf[] pros) {
		for(ProductVOSelf v : pros)
			System.out.println(v.getModel());
	}//end 1
	
	public int getTotalPrice(ProductVOSelf[] pros) {
		int total =0;
	for(ProductVOSelf v : pros){
		total += v.getPrice();
		
		return total;
			
	}//end 2
	
	public int getAvgPrice(ProductVOSelf[] pros) {
		return getTotalPrice(pros)/pros.length;
		
	}//end 3
	
	public ProductVOSelf[] getOverAvgPrice(ProductVOSelf[] pros) {
		ProductVOSelf[] temp = new ProductVOSelf[pros.length];
		for(int i =0; i<temp.length; i++) {
			if(pros[i].getPrice() >= getAvgPrice(pros)) {
				temp[i]=pros[i];
			}
		}
	}
	}
	}

}
