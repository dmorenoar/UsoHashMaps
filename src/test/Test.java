/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author dmorenoar
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, Videojuego> mapGames = new HashMap<Integer,Videojuego>();
     
        Videojuego v1 = new Videojuego("The legend of Zelda", 19.99, "RPG");
        /*Aprovechamos y creamos un id en Videojuego 
        que nos servirá para controlar el identificador 
        único para cada videojuego. Lo hacemos usando la instancia de clase*/
        
        /*Hemos de tener en cuenta que si usamos el ID y primero creamos
            los videojuegos y finalmente los introducimos el ID será 4 y por lo tanto
        únicamente entrará 1, ya que se considerará que stamos actualizando el
        videojuego con ID 4
        */

        mapGames.put(Videojuego.getId(), v1);
        Videojuego v2 = new Videojuego("Super Mario Bros", 24.99, "PLATAFORMAS");
        mapGames.put(Videojuego.getId(), v2);
        Videojuego v3 = new Videojuego("Mega Man", 33.85, "PLATAFORMAS");
        mapGames.put(Videojuego.getId(), v3);
        Videojuego v4 = new Videojuego("Arkanoid", 7.99, "ARCADE");
        mapGames.put(Videojuego.getId(), v4);
    
        //Mostramos el tamaño del HashMap
        System.out.println("Tam:" + mapGames.size());
        
        //Recorremos el HashMap con un iterator
        Iterator it = mapGames.entrySet().iterator();
        while(it.hasNext()){ //Mientras haya valores
            //Podríamos usar únicamente HasMap.Entry sin indicar el tipo
            HashMap.Entry<Integer,Videojuego> game = (HashMap.Entry<Integer,Videojuego>) it.next();
            System.out.println("ID: " + game.getKey() + ";" + "Titulo: " + game.getValue());
        }
        
        //Borramos un registro del hasmap con id 1
        mapGames.remove(1);
        
        //Preguntamos si existe una KEY específica
        System.out.println("Existe el juego con ID 1?" + mapGames.containsKey(1) );
        
        //Preguntamos si el HashMap contiene un elemento específico del objeto
        //Al guardar un Videojuego(objeto) no podemos buscar por nombre directamente
        System.out.println("Existe el juego Arkanoid?" + mapGames.containsValue("Arkanoid"));
        System.out.println("Existe el juego Arkanoid?" + mapGames.containsValue(v4));
        
        //Recorremos y preguntamos si existe un juego con nombre Arkanoid
        String juegoBuscar = "Arkanoid";
        for(Map.Entry<Integer,Videojuego> entry : mapGames.entrySet()){
            if(entry.getValue().getTitulo().equals(juegoBuscar)){
                System.out.println("El juego existe");
            }
        }
        //Recorremos el HashMap con for each
        for(Map.Entry<Integer,Videojuego> entry: mapGames.entrySet()){
            System.out.println("ID: " + entry.getKey() + ";" + "Título: " + entry.getValue());
            
        }
        
    }
    
}
