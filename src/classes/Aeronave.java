package classes;
public class Aeronave {
        //#region Atributos
        private int quantidadePassageiros;
        private String numeroSerie;
        private String modelo;
        private int velocidadeAtual;
        private Pessoa piloto;
        //#endregion
    
        //#region Getters / Setters
        public int getQuantidadePassageiros() {
            return quantidadePassageiros;
        }
    
        public void setQuantidadePassageiros(int quantidadePassageiros) {
            this.quantidadePassageiros = quantidadePassageiros;
        }
    
        public String getNumeroSerie() {
            return numeroSerie;
        }
    
        public void setNumeroSerie(String numeroSerie) {
            this.numeroSerie = numeroSerie;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public Pessoa getPiloto() {
            return piloto;
        }
    
        public void setPiloto(Pessoa piloto) {
            this.piloto = piloto;
        }
        //#endregion
    
        //#region Construtores
        public Aeronave() {}
    
        public int getVelocidadeAtual() {
            return velocidadeAtual;
        }
    
        public void setVelocidadeAtual(int velocidadeAtual) {
            this.velocidadeAtual = velocidadeAtual;
        }
    
        public Aeronave(String numeroSerie) {
            this.numeroSerie = numeroSerie;
        }
    
        public Aeronave(Pessoa piloto){
            setPiloto(piloto);
            piloto.setAviao(this);
        }
        
        public Aeronave(String numeroSerie, Pessoa piloto) {
            setNumeroSerie(numeroSerie);
            setPiloto(piloto);
            piloto.setAviao(this);
            
            
        }
    
        
        
        //#endregion
    
        void acelerar(){
            velocidadeAtual++;
        }
    
        void acelerar(int limite){
            for (int i = velocidadeAtual; i < limite; i++) {
                acelerar();
            }
        }
    }
      

