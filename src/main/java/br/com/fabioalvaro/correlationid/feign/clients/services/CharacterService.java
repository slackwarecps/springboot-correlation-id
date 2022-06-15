package br.com.fabioalvaro.correlationid.feign.clients.services;


import br.com.fabioalvaro.correlationid.model.character.Character;
import br.com.fabioalvaro.correlationid.model.character.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "characterService",url = "http://gateway.marvel.com")
public interface CharacterService {



    @RequestMapping("/v1/public/characters/{id}?ts={TS}&apikey={APIKEY}&hash={HASH}")
    Character getCharacter(@PathVariable("id") int id,
                           @PathVariable("TS") String TS,
                           @PathVariable("APIKEY") String APIKEY,
                           @PathVariable("HASH") String HASH) ;


    @RequestMapping("/v1/public/characters/{id}?ts={TS}&apikey={APIKEY}&hash={HASH}")
    Root getCharacter2(@PathVariable("id") int id,
                       @PathVariable("TS") String TS,
                       @PathVariable("APIKEY") String APIKEY,
                       @PathVariable("HASH") String HASH) ;

}
