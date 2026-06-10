package personne;

public class Ressources {
	
	private static Ressources _instance;
	private Groupe groups;
	
	public Ressources() {
		// Logique d'ajout de groupe
		// init
		groups = new Groupe();
	}
	
	public static Ressources Init() {
		if (_instance == null)   {
			_instance = new Ressources();
		}
		return _instance;
	}
	
	public static Ressources getInstance() {
		return _instance;
	}
	
	public Groupe getGroupe() {
		return groups;
	}
}