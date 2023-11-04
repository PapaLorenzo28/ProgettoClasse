public class ClasseTask {
	// Attributi
	private String Task;
	private String Dipendente;
	private int Priorita; 
	
	public ClasseTask() {
		
	}
	
	public ClasseTask(String Task, String Dipendente) {
		this.Task = Task;
		this.Dipendente = Dipendente;
	}	
	
	public ClasseTask(String Task, String DipendenteAssegnato, int Priorita) {
		this.Task = Task;
		this.Dipendente = Dipendente;
		this.Priorita = Priorita
	}
	
	public void SetTask(String Task) {
		this.Task = Task;
	}
	
	public String GetTask() {
		return this.Task;
	}	
	
	public void SetDipendente(String Dipendente) {
		this.Dipendente = Dipendente;
	}
	
	public String GetDipendente() {
		return this.Dipendente;
	}	
	
	public void SetPriorita(int Priorita) {
		this.Priorita = Priorita;
	}
	
	public int GetPriorita() {
		return this.Priorita;
	}
	
	public String ToString() {
		return (Priorita + ". " + Task + " - " + Dipendente);
	}
	
}