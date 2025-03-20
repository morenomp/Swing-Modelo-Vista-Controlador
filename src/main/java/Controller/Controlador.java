package Controller;

import static MiLibreria.MyAPI.*;
import Model.*;
import java.util.HashSet;

/*
CONTROLADOR

*/
public class Controlador {

//HashSet Planeta
    private static HashSet<Planeta> allPlanet = new HashSet<>();

//GETTER
    public static HashSet<Planeta> getAllPlanet() {
        return allPlanet;
    }

//------------------------------------------------
// Verificación de si existe o no un planeta en hashset
    
    /**
     * Busca si existe o no un planeta en hashset
     * @return 
     */
    
    public static boolean okPlanets(){
        return allPlanet.isEmpty();
    }
    
//------------------------------------------------
// Verificación de si existe o no un ser en hashset
    
    /**
     * Busca si existe o no un ser en hashset
     * @return 
     */
    
    public static boolean okBeing(){
        
        for (Planeta p : allPlanet) {
            
            System.out.println(p.getPopulation().isEmpty());
            if (!p.getPopulation().isEmpty()) { // SI la población ESTÁ vacía
                
                return true;
            }
        }
        
        //SI la población NO está vacía, pues develve true
        return false;
    }
    
//------------------------------------------------
// Verificación del nombre Planeta
    
    /**
     * Busca un planeta por su nombre en la lista de planetas registrados
     * @param planet
     * @return 
     */
    
    public static Planeta getPlanetByName(Planeta planet) {
        
        //SI el planeta ya está en el HashSet allPlanet
        if (allPlanet.contains(planet)) {
            
            //devolverá el planeta
            for(Planeta p : allPlanet){
                
                if(p.equals(planet)){
                    
                    return p;
                }  
            } 
        }

        //SI NO existe, nos lo devolverá vacio
        //es decir que no ha encontrado ningún planeta igual
        return null;
    }

//------------------------------------------------
// Verificación del nombre Ser
    
    /**
     * Busca un ser a traves de la población, mirando en todos los planetas registrados
     * @param ser
     * @return 
     */
    
    public static Ser getSerByName(Ser ser) {
        for (Planeta planet : allPlanet) {
            
            //verificaremos si ya existe alguien con ese nombre
            //(aunque con hashset no haria falta ya que no admite duplicados)
            //if (planet.getPopulation().contains(ser)) {
                for (Ser s : planet.getPopulation()) {
                    
                    //compararemos entre los nombres de los seres que existen
                    //ya que si no solo nos retornaria el primer ser de la lista
                    if (s.getName().equalsIgnoreCase(ser.getName())) {
                        
                        //si existe alguien ya, nos devolverá el nombre
                        //al igual que en el código de "getPlanetByName" solo retornaremos 
                        //el nombre, ya que HashSet no admite duplicados, así que no hace 
                        //falta esa clase de verificaciones
                        return s;
                    }
                }
            //}
        }
        
        //SI NO existe, nos lo devolverá vacio
        //es decir que no ha encontrado ningún ser igual
        return null;
    }
    
//------------------------------------------------
// Verificación de las reglas establecidas en el universo
    
    /**
     * Valida si un ser puede habitar en un planeta, todo a traves de sus 
     * características y restricciones
     * @param s
     * @param p
     * @return 
     */
    
    //Con "throws SerException" permitirá excepciones tipo SerException
    public static boolean validateBeingAndPlanet(Ser s, Planeta p) throws SerException {

    //-----------------------------
    //verificaremos antes de nada si el planeta tiene espacio o no
    //-----------------------------
//        if (p == null) {
//            System.out.println("[ERROR] [X] El planeta no existe o no fue encontrado.");
//            return false;
//        }
        
        //SI el tamaño de la población no supera el máximo de población del planeta, seguirá adelante
        System.out.println(p.getPopulation());
        if (p.getPopulation().size() <  p.getPopulationMax()) {
            
        //-----------------------------
        //los Andoriano y Vulcanianos no pueden ir en el mismo planeta
        //-----------------------------
    
            //SI algún ser que sea andoriano
            if (s instanceof Andoriano) {

                for (Ser existente : p.getPopulation()) {

                    //coincide en el mismo lugar que un vulcaniano
                    if (existente instanceof Vulcaniano) {

                        //devolverá false
                        return false;
                    }
                }
            //SI algún ser que sea vulcaniano
            } else if (s instanceof Vulcaniano) {

                for (Ser existente : p.getPopulation()) {

                    //coincide en el mismo lugar que un andoriano
                    if (existente instanceof Andoriano) {

                        //devolverá false
                        return false;
                        
                    }
                }
            }
        
        //-----------------------------
        //los humanos pueden vivir en cualquier planeta
        //-----------------------------
            if (s instanceof Humano) {
                return true;
            }
            //realmente es una condición sin sentido,ya que pueden estar en 
            //todos los planetas así que como tal NO tienen condición.
            //pero para evitar futuros posibles problemas lo pondremos

        //-----------------------------
        //los klingon no pueden vivir en ningún planeta de clima cálido
        //-----------------------------
            //SI encuentra un ser klingon en un planeta calido hará lo siguiente
            if (s instanceof Klingon && p.getClime().equals("calido")) {

                System.out.println("[ERROR] [X] Los Klingon no pueden vivir en planetas de clima calido.");
                return false; //retornará false
            }

        //-----------------------------
        //los nibirianos “vegetarianos” sólo pueden vivir en los planetas que dispongan de flora roja
        //Y
        //los que se alimentan de seres acuáticos no pueden vivir en planetas que no dispongan de ellos
        //-----------------------------
            //verificaremos que "s" es un Nibiriano
            if (s instanceof Nibiriano) {  
                Nibiriano n = (Nibiriano) s;

                // Si es vegetariano, necesita flora roja
                if (n.esVegetariano() && !p.isFlora()) { 

                    System.out.println("[ERROR] [X] Los Nibirianos vegetarianos solo pueden vivir en planetas con flora roja");
                    return false; //retornará false
                    
                }else if (n.esCarnivoro() && !p.isAquatic()) { 

                    System.out.println("[ERROR] [X] Los Nibirianos que comen seres acuaticos solo pueden vivir en planetas con agua");
                    return false; //retornará false
                }
            }

        //-----------------------------
        //los Ferengi no pueden vivir en planetas fríos
        //-----------------------------
            if (s instanceof Ferengi && p.getClime().equals("frio")) {

                System.out.println("[ERROR] [X] Los Ferengi no pueden vivir en planetas frios");
                return false;
            }
            
            return true;
        
        //SI el tamaño de la población máxima (populationMax) supera el máximo de población del planeta
        } else{
            
            System.out.println("[!] El planeta a llegado a su capacidad máxima ");
            System.out.println("[!] Elimine seres o cree otro planeta ");
            return false;
        }
    }

//------------------------------------------------
// Crear planeta
    
    /**
     * Crea un nuevo planeta pidiendo los datos al usuario y lo añade 
     * a la lista de planetas.
     * 
     * Datos solicitados: 
     *      - Nombre del planeta
     *      - Capacidad máxima de población
     *      - Galaxia a la que pertenece
     *      - Tipo de clima (frío, cálido o templado)
     *      - Flora roja si o no
     *      - Seres acuáticos si o no
     * 
     * @param p
     * @throws Model.PlanetaException
     */
    
    //Con "throws PlanetaException" permitirá excepciones tipo PlanetaException
    public static void createPlanet(Planeta p) throws PlanetaException{
        
        System.out.println("[OK] Continua");

        //Añadimos los datos a "sendPlanet" (y a un planeta)
        Planeta sendPlanet = new Planeta(p.getName(), p.getGalaxy(), p.getPopulationMax(), p.getClime(), p.isFlora(), p.isAquatic());
            
        //y tras esto añadimos ese planeta al HashSet planeta
        if(!allPlanet.add(sendPlanet)){
                
            throw new PlanetaException("[X] El planeta " + p.getName() + " ya existe");
        }
    }
}