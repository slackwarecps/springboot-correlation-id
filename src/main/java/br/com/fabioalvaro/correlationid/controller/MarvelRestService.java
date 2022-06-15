package br.com.fabioalvaro.correlationid.controller;

import br.com.fabioalvaro.correlationid.feign.clients.services.CharacterService;
import br.com.fabioalvaro.correlationid.model.character.Character;
import br.com.fabioalvaro.correlationid.model.character.Data;
import br.com.fabioalvaro.correlationid.model.character.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/marvel")
public class MarvelRestService {

    private static final Logger log = LoggerFactory.getLogger(MarvelRestService.class);

    public static final String JAVA_HOME = System.getenv("JAVA_HOME");
    public static final String MAVEN_HOME = System.getenv("MAVEN_HOME");

    @Value("${marvel.ts}")
    private String TS;
    @Value("${marvel.apikey}")
    private String APIKEY;
    @Value("${marvel.hash}")
    private String   HASH;

    private final CharacterService characterService;

    public MarvelRestService(CharacterService characterService) {
        log.info("JAVA_HOME {}",JAVA_HOME );
        log.info("MAVEN_HOME {}",MAVEN_HOME );
        this.characterService = characterService;
    }


    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/character/{id}", method = RequestMethod.GET)
    public Character getCharacter(@PathVariable String id) {
        log.info("Chamando marvel api...");

        Character retorno =  characterService.getCharacter(Integer.parseInt(id),TS,APIKEY,HASH);

        log.info("Retorno da api marvel "+ retorno);

        return retorno;

    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/character2/{id}", method = RequestMethod.GET)
    public Data getCharacter2(@PathVariable String id) {
        log.info("Chamando marvel api...");

        Root retorno =  characterService.getCharacter2(Integer.parseInt(id),TS,APIKEY,HASH);

        log.info("Retorno da api marvel "+ retorno.data);



        return retorno.data;
    }





}
