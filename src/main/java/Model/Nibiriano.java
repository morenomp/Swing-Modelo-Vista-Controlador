package Model;


public class Nibiriano extends Ser{
    
//-------------------------------------
//Variable de instancia (v.i)
//-------------------------------------

    protected String floraOrFish; //comen flora roja y otros peces
    
//-------------------------------------
//Variable de clase (v.c)
//pq es comun para todos
//-------------------------------------
    protected static int civilizationLevel = 2; //el nivel de civilización de cada especie
                                            //(será única para cada una de ellas)
                                            //le pondremos "static", para que TODOS 
                                            //tengan estos atributos
    
//-------------------------------------
//Verificación de excepción:
//posiblesopciones que usaremos más 
//-------------------------------------
    public boolean esVegetariano() {
        return floraOrFish.equalsIgnoreCase("flora");
    }

    public boolean esCarnivoro() {
        return floraOrFish.equalsIgnoreCase("peces");
    }
//-------------------------------------
//Sobrecarga de constructores:
//-------------------------------------
    
    public Nibiriano(String floraOrFish, String name) {
        super(name);
        this.floraOrFish = floraOrFish;
    }
    
//-------------------------------------
//Variable de clase (v.c)
//-------------------------------------
    
//GETTER:
    public String getFloraOrFish() {
        return floraOrFish;
    }
    public static int getCivilizationLevel() {
        return civilizationLevel;
    }
    
//SETTER:
    public void setFloraOrFish(String floraOrFish) {
        this.floraOrFish = floraOrFish;
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
        return "Raza: Nibiriano\n" + super.toString() + "\nFlora o Peces: " + floraOrFish;
    }
}
