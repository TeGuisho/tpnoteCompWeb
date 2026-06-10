package personne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groupe{
    private static int tarifAdulte = 10;
    private static int tarifJeune = 4;
    private List<Personne> membres;
    private Map<Integer, Personne> membresMap;
    private int tarifGlobal;
    private int nbJeune;
    private int nbAdulte;

    private static int ID = 0;
    
    public Groupe(){
    
        this.membres = new ArrayList<Personne> ();
        this.membresMap = new HashMap<Integer, Personne>();
        tarifGlobal = 0;
        nbAdulte = 0;
        nbJeune = 0;
    }


    public void Ajouter(Personne p){
        if (p.getAge()>18){
            nbAdulte++;
        } else{
            nbJeune++;
        }
        this.membres.add(p);
        this.membresMap.put(ID++, p);
        this.tarifGlobal = this.calculTarif();
    }

    public List<Personne> GetAll(){
        return this.membres;
    }

    private int calculTarif(){
        return nbAdulte * tarifJeune + nbAdulte * tarifAdulte;
    }

    public int getTarifGlobal(){
        return this.tarifGlobal;
    }


}