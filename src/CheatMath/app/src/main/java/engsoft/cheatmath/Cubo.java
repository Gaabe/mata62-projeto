package engsoft.cheatmath;

public class Cubo{
    private int aresta;

    public void Cubo(int aresta){
        this.setAresta(aresta);
    }
    public int calculate_volume(){
        return this.getAresta() * this.getAresta() * this.getAresta();
    }

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }
}
