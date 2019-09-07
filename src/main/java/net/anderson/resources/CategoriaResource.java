package net.anderson.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anderson on 07/09/2019.
 */

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String Listar(){
        return "TESTE DE REST OK - ANDERSON PAULA SILVA!!!";
    }

}
