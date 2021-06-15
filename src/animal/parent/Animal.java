package animal.parent;

public class Animal {
	private boolean backbone;
	private String habitat;
	private String respiration;
	
	
	public Animal(){
		this.backbone = true;
		this.habitat = "land";
		this.respiration = "lungs";
	}
	public Animal(boolean backbone, String habitat, String respiration) {
		this.backbone = backbone;
		this.habitat = habitat;
		this.respiration = respiration;
	}
	
	public boolean isBackbone() {
		return backbone;
	}
	
	public String getHabitat() {
		return habitat;
	}
	public String getRespiration() {
		return respiration;
	}

}
