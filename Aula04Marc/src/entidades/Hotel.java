package entidades;

public class Hotel {
	public String Nome;
	public String Email;
	public int Quarto;
	
	public Hotel() {
		this.Nome = new String();
		this.Email = new String();
	}

	@Override
	public String toString() {
		return "Quarto " + this.Quarto + ": " + this.Nome + ", e-mail: " + this.Nome;
	}
	
	
}
