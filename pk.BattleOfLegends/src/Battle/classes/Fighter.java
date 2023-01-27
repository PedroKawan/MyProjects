package Battle.classes;


public class Fighter implements Battle.interfaces.InterfaceFighter{
    
    //Atributos.
    private String name;                // Nome.
    private String nationality;         // Nacionalidade.
    private int age;                    // Idade.
    private double height;              // Altura.
    private double weight;              // Peso.
    private String category;            // Categoria.
    private int victories;              // Vitorias.
    private int defeats;                // Derrotas.
    private int drawns;                 // Empates.

    
    
    //Metodos da interface.
    
    //Registra um lutador.
    @Override
    public void register(String _name, String _nationality, int _age, double _height, double _weight, int _victories, int _defeats, int _drawns){
        
        this.setName(_name);
        this.setNationality(_nationality);
        this.setAge(_age);
        this.setHeight(_height);
        this.setWeight(_weight);
        this.setVictories(_victories);
        this.setDefeats(_defeats);
        this.setDrawns(_drawns);
        
    }
    
    //Imprime um pequeno status.
    @Override
    public void status(){
        System.out.println("\n- " + this.getName() + " -");
        System.out.println("Category " + this.getCategory());
        System.out.println(this.getVictories() + " vitories");
        System.out.println(this.getDefeats() + " defeats");
        System.out.println(this.getDrawns() + " drawns");
    }
    
    //Imprime uma Apresentação do lutador -> toString().
    @Override
    public void introduceFighter(){
        System.out.println(this.toString());
    }
    //...
    
    
    
    //Metodos getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    //Define a categoria de acordo com o peso.
    private void setCategory() {
        if (this.getWeight() < 52.2) {
            this.category ="Invalido";
        }else if ((this.getWeight() <= 65.7)){
            this.category ="Galo";
        } else if(this.getWeight() <= 70.3){
            this.category ="Leve";
        } else if (this.getWeight() <= 89.5){
            this.category ="Medio";
        } else if (this.getWeight() <= 120.2){
            this.category ="Pesado";
        } else {
            this.category = "Invalido";
        }
    }
    
    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDrawns() {
        return drawns;
    }

    public void setDrawns(int drawns) {
        this.drawns = drawns;
    }
    //...
    
    
    
    
    //Metodo toString - para Emergência.
    public String toString(){
        String status;
        status = "\n---- UEC FIGHTER ----"
                + "\nName: " + this.getName()
                + "\nNacionality: " + this.getNationality()
                + "\nAge: " + this.getAge()
                + "\nheight: " + String.format("%.2fKg",this.getHeight())
                + "\nWeight: " + String.format("%.1fKg",this.getWeight())
                + "\nCategory: " + this.getCategory()
                + "\nVictories: " + this.getVictories()
                + "\nDefeats: " + this.getDefeats()
                + "\nDrawns: " + this.getDrawns() + "\n";
        return status;
    }
    //...
    
    
    
    
    //Metodos vitoria, derrota, empate -> são chamados após a análise, feita com o termino do looping dos rounds.
    public void winFight(){
        this.setVictories(this.getVictories() + 1);
    }
    
    public void loseFight(){
        this.setDefeats(this.getDefeats() + 1);
    }
    
    public void drawnsFight(){
        this.setDrawns(this.getDrawns() + 1);   
    }
}
