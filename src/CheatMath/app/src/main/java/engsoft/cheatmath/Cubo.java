package engsoft.cheatmath;

public class Cubo{
    private int aresta;

    public void Cubo(int aresta){
        this.setAresta(aresta);
    }

    public int calculate_volume(){
        return this.getAresta() * this.getAresta() * this.getAresta();
    }

    public String show_result(){
        String result = "Volume -> V    Aresta -> l \n" +
                "V = a³ \n" +
                "V = 3³ \n" +
                "V = " + Integer.toString(calculate_volume());
        return result;
    }

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }
}
