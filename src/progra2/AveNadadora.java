package progra2;

public class AveNadadora extends AveVoladora {
	
	private String color;
	
		public AveNadadora (Double peso, String color) {
			super(peso);
			this.color=color;
			
		}

		public Boolean aveQueNada () {
			return true;
		}
		
		public String colorDelAve () {
			return color;
		}

		
}
