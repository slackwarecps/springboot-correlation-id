package br.com.fabioalvaro.correlationid.feign.clients.services;


import br.com.fabioalvaro.correlationid.model.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cepService", url = "https://api.postmon.com.br")
public interface CepService {


    @RequestMapping("/v1/cep/{cep}")
    CepResponse getCep(@PathVariable("cep") String cep) ;


}
