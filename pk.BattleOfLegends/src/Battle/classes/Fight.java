
package Battle.classes;

import Battle.classes.Fighter;

public class Fight implements Battle.interfaces.IntefaceFight{
    
    //Atributos.
    private Fighter challanger,challanged;                      // Desafiante, desafiado.
    private boolean confirmed,started;                          // Luta confirmada, luta iniciada.
    private int rounds,roundCurrent;                            // Quantidade de rounds, round atual.
    private int challangerRound,challangedRound = 0;            // Quantidade de rounds ganhos.

    
    
    
    //Metodo Construtor.
    public Fight(){
        this.setConfirmed(true);
        this.setStarted(false);
    }

    
    //Metodos da interface.
    @Override
    public void arrangeFight(Fighter _challanger, Fighter _challanged, int r){
        
        this.setChallanger(_challanger);
        this.setChallanged(_challanged);
        this.setRounds(r);
        
    }
    
    
    //Começa a luta.
    @Override
    public void startFight(){
        if (this.getChallanged() != this.getChallanger()) {
        if (this.getChallanger().getCategory().equals(this.getChallanged().getCategory())){
            if (this.isConfirmed()) {
                //Se não tiver sido cancelada,a luta começara.
                System.out.println("------ FIGHT ------");
                System.out.println(" Fighter 1: " + getChallanger().getName());
                System.out.println(" Category: " + getChallanger().getCategory());
                System.out.println("     ");
                System.out.println(" Fighter 2: " + getChallanged().getName());
                System.out.println(" Category: " + getChallanged().getCategory());
                System.out.println("     ");
                System.out.println(" A.Rounds: " + getRounds());
                System.out.println("-------------------");

                //Define a luta como iniciada.
                this.setStarted(true);

                //Começa a chamada aos rounds.
                this.roundStarted();

            } else {
                System.out.println("The fight was canceled!");
            }
        } else {
            System.out.println("The fighters do not have the same category.");
                }
        } else {
            System.out.println("The fighters are the same.");
        }
    }

    //Cancela a luta.
    @Override
    public void cancelFight(){
        if (this.isConfirmed() & this.isStarted()) {
            this.setConfirmed(false);
            System.out.println("- Cancel the Fight now!");
            System.out.println("- OKAY!");
        } else {
            System.out.println("...");
        }
    }
    //...
    
    
    
    //Metodos setters e getters.
    private Fighter getChallanger() {
        return this.challanger;
    }

    private void setChallanger(Fighter Challanger) {
        this.challanger = Challanger;
    }

    private Fighter getChallanged() {
        return this.challanged;
    }

    private void setChallanged(Fighter Challanged) {
        this.challanged = Challanged;
    }

    private int getRounds() {
        return this.rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isConfirmed() {
        return confirmed;
    }

    private void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    
    private void setStarted(boolean s){
        this.started = s;
    }
    
    private boolean isStarted(){
        return this.started;
    }

    public int getChallangerRound() {
        return challangerRound;
    }

    public void setChallangerRound(int challangerRound) {
        this.challangerRound = (getChallangerRound() + challangerRound);
    }

    public int getChallangedRound() {
        return challangedRound;
    }

    public void setChallangedRound(int challangedRound) {
        this.challangedRound = (getChallangedRound() + challangedRound);
    }
    //...
    
    
    //Metodo para iniciar o round sendo chamado pelo - startFight().
    private void roundStarted(){
        roundCurrent = 1;
        
        //Cria a quantidade de rounds inseridos no - Construtor().
        for (int i = 1; i <= this.getRounds(); i++){          
            if(this.isStarted()){
                roundFight();
                roundCurrent += 1;
            } else {
                
                System.out.println("- !FIGHT ENDED!");
                break;
            }
    
        }
        
        //Metodo para analisar vencedor após o looping dos rounds terminar.
        this.analyze();
        
    }
    
    
    /*Metodo onde são gerados os rounds: consiste em gerar um numero aleatorio, de (0 a 3):
     *Quando gerado ( 0 ) o Challanger(desafiante) ganha o round, e com ( 2 ) ele da nocaute.
     *Quando gerado ( 1 ) o Challanged(desafiado) ganha o round, e com ( 3 ) ele da nocaute.
    */
    
    private void roundFight(){
    
        //Sistema random.
        double r = Math.random();
        int random = (int) Math.round((0 + r * (3 - 0)));
        
        System.out.println("\n- ROUND " + roundCurrent + "!FIGHT!");
        
        
        //Sistema de resposta de acordo com o numero (random).
        //Adiciona o numero de vitoria pra cada round, se der nocalte (2 ou 3) o looping é encerrado.
            switch (random) {
                
                case 0:
                    System.out.println("- " + this.challanger.getName() + " Win the Round " + roundCurrent + "!");
                    setChallangerRound(1);
                break;
                
                case 1:
                    System.out.println("- " + this.challanged.getName() + " Win the Round " + roundCurrent + "!");
                    setChallangedRound(1);
                break;
                
                case 2:
                    System.out.println("- WOOOW " + this.getChallanger().getName() + " knocks out " + this.getChallanged().getName() + " in the Round " + roundCurrent + "!!!");
                    setChallangerRound(10);
                    this.setStarted(false);
                break;
                
                case 3:
                    System.out.println("- WOOOW " + this.getChallanged().getName() + " knocks out " + this.getChallanger().getName() + " in the Round " + roundCurrent + "!!!");
                    setChallangedRound(10);
                    this.setStarted(false);
                break;
            }
    }
      
    
    
    // • Metodo para analisar vencedor após o looping dos rounds terminar. 
    public void analyze(){
        if (this.challangerRound > this.challangedRound){
            this.getChallanger().winFight();
            this.getChallanged().loseFight();
           
        } else if (this.challangedRound > this.challangerRound) {
            this.getChallanged().winFight();
            this.getChallanger().loseFight();
        } else {
            this.getChallanged().drawnsFight();
            this.getChallanger().drawnsFight();
        }
        
        
    }

 
}
