package by.bsuir.factory.games;

import by.bsuir.games.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by Koshelek on 04.04.2017.
 */
public class FactoryGames {
    Map<String,Supplier<Game>> factoryMap = new HashMap<>();

    public FactoryGames(){
        factoryMap.put("Activegame",()->new Activegame());
        factoryMap.put("Boardgame",()->new Boardgame());
        factoryMap.put("Cardgame",()->new Cardgame());
        factoryMap.put("Game",()->new Game());
        factoryMap.put("Logicalgame",()->new Logicalgame());
        factoryMap.put("Roleplaygame",()->new Roleplaygame());
        factoryMap.put("Tabletopgame",()->new Tabletopgame());
        factoryMap.put("Videogame",()->new Videogame());
    }

    public Game getGameByName(String name){
        return factoryMap.get(name).get();
    }
}
