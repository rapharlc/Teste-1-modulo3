package programa;
    import classes.Aeronave;
    import classes.Pessoa;
    
    public class App{
        public static void main(String[] args) {
            Pessoa piloto = new Pessoa("Raphael", "12345678901", 'm'); 
            Aeronave aviao = new Aeronave("PT 1717", piloto);
    
            
            System.out.println("PASSAGEIRO: Vamos decolar, acelera piloto!!!");
            System.out.println("PILOTO: Ok, aperte os cintos!!!");
            piloto.acelerar(100);
            
    
            System.out.printf("O avião decolou e estamos a %s km/h", aviao.getVelocidadeAtual());
    
        }
        
    
    
    }

