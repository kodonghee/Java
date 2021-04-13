package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Integer>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        ArrayList<Pokemon> p = new ArrayList<>();
        for (int cp : pokemons.get(name)){
            p.add(new Pokemon(name, cp));
        }
        return p;
    }

    public void add(Pokemon pokemon) {
        int cnt = 0;
        ArrayList <Integer> cp = new ArrayList<>();
        for (String key : pokemons.keySet()){
            if (key.equals(pokemon.name)){
                cnt += 1;
                pokemons.get(key).add(pokemon.cp);
                break;
            }}
        if (cnt == 0) {
            cp.add(pokemon.cp);
            pokemons.put(pokemon.name, cp);
        }
    }

    public Pokemon getStrongest(String name) {
        if (pokemons.get(name) == null){
            return null;
        }
        int max = 0;
        for (int i: pokemons.get(name)){
            if (i > max){
                max = i;
            }
        }
        return new Pokemon(name, max);
    }

    public Pokemon getStrongest() {
        int max = 0;
        String name = "";
        for (String key: pokemons.keySet()){
            if (getStrongest(key).cp > max){
                name = key;
                max = getStrongest(key).cp;
            }
        }
        return new Pokemon(name, max);
    }
}