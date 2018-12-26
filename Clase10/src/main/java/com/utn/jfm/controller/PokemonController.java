package com.utn.jfm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.jfm.beans.Pokemon;
import com.utn.jfm.dao.PokemonDAOImpl;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonDAOImpl pokemonDAOImpl;
	
	@RequestMapping ("/pokemons")
	public List<Pokemon> getAllPokemon(){
		return pokemonDAOImpl.verPokemones();
	}

}
