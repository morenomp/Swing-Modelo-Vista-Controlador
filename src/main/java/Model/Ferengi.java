package Model;


public class Ferengi extends Ser{
    
//-------------------------------------
//Variable de instancia (v.i)
//-------------------------------------

    private int gold; //cantidad de oro (nunca será negativo)
    private static int civilizationLevel = 1; //el nivel de civilización de cada especie
                                            //(será única para cada una de ellas)
                                            //le pondremos "static", para que TODOS 
                                            //tengan estos atributos
//-------------------------------------
//Sobrecarga de constructores:
//-------------------------------------
    
    public Ferengi(int gold, String name) {
        super(name);
        this.gold = gold;
    }
    
//-------------------------------------
//Variable de clase (v.c)
//-------------------------------------
    
//GETTER:
    public int getGold() {
        return gold;
    }
    public static int getCivilizationLevel() {
        return civilizationLevel;
    }
    
//SETTER:
    public void setGold(int gold) {
        this.gold = gold;
    }
    
//-------------------------------------
//OVERRIDE
//-------------------------------------
       
    /**
     * Devuelve datos sobrescribiendo el metodo del padre
     * 
     * @return 
     */
    
    @Override
    public String toString() {
        //con super.toSrting() llamamos al padre (Ser)
        return "Raza: Ferengi\n" + super.toString() + "\nOro: " + gold;
    }
}
