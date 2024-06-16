package br.com.projeto.teste.projetoTeste.request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.math.BigDecimal;


//Externalizou  a class para o mundo fora do prórpio sistema
@RestController
public class Salarios {

    private BigDecimal seuSalarioDeProgramador = new BigDecimal("10.00");

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
    path = "salario-programador", produces = PageAttributes.MediaType)
    public void contextLoads() {
        System.out.println("começando o debug");
        System.out.printf("o salário de programador é " + seuSalarioDeProgramador);
        System.out.printf("Fim do debug");
    }

}
