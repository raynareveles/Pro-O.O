public class BMW extends Carro {
    private double velocidade;

    public BMW(double velocidade){
        
        this.velocidade = velocidade;
    }


    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public double getVelocidade(){
        return velocidade;
    }


    public void imprimir(){
        System.out.printf("BMW de cor: %s, com %d acentos e velocidade %.2f",getCor(),getNum_acentos(),velocidade);
    }
  
}
