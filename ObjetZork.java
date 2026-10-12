public class ObjetZork {
    //----------------------Attributes--------------------------------------------------
    private String name;
    private String description;
    private int weight;
    private boolean transportable;

    //----------------------Constructor method--------------------------------------------

    /**
     *
     *  Crée et initialise un objet du jeu .
     *  @requires n != null
     *
     *
     */

    public ObjetZork(String n, String d, int w, boolean t) {
        name = n;
        description = d;
        weight = w;
        transportable = t;
    }

    //----------------------Methods-------------------------------------------------------
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getTransportable() {
        return transportable;
    }

    public void setName(String n) {
        name = n;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public void setTransportable(boolean t) {
        transportable = t;
    }

    //public int hashcode() {
    //return this.hashCode();
    //}

}