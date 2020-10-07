package E2;

public class JocDaus {
    Dau d1 ;
    Dau d2 ;
    Dau d3 ;

    public JocDaus() {
        d1 = new Dau();
        d2 = new Dau();
        d3 = new Dau();
    }
    public boolean jugar(){
        d1.tirar();
        d2.tirar();
        d3.tirar();
        System.out.println("dau 1: "+d1.getValor()+" dau 2: "+d2.getValor()+" dau 3: "+d3.getValor());
        return (d1.getValor() == d2.getValor()) && (d1.getValor() == d3.getValor());

        
        
    }
}
