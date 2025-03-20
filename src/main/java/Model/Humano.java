package Model;


public class Humano extends Ser{
    
//-------------------------------------
//Variable de instancia (v.i)
//-------------------------------------
    
    private int edad; //entre 0 y 130
    private String genero; //puede ser masculino o femenino
    private static int civilizationLevel = 1; //el nivel de civilización de cada especie
                                            //(será única para cada una de ellas)
                                            //le pondremos "static", para que TODOS 
                                            //tengan estos atributos
    
//-------------------------------------
//Sobrecarga de constructores:
//-------------------------------------

    public Humano(int edad, String genero, String name) {
        super(name);
        this.edad = edad;
        this.genero = genero;
    }
    
//-------------------------------------
//Variable de clase (v.c)
//-------------------------------------
    
//GETTER:
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }
    public static int getCivilizationLevel() {
        return civilizationLevel;
    }
    
//SETTER
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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
        return "Raza: Humano\n" + super.toString() + 
                             "\nEdad: " + edad + 
                             "\nGenero: " + genero;
    }
}
