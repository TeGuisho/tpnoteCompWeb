public class Groupe{
    private static int tarifAdulte = 10;
    private static int tarifJeune = 4;
    private List<Personne> membres;
    private int tarifGlobal;
    private int nbJeune;
    private int nbAdulte;

    public Groupe(){
        this.membres = new ArrayList<Personne> ();
        tarifGlobal = 0;
        nbAdulte = 0;
        nbJeune = 0;
    }


    public void Ajouter(Personne p){
        if (p.getAge()>18){
            nbAdulte++
        } else{
            nbJeune++;
        }
        this.membres.add(p)
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