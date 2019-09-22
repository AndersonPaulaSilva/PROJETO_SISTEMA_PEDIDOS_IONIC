package net.anderson.resources;

import net.anderson.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anderson on 07/09/2019.
 */

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> Listar(){

        Categoria categoria1 = new Categoria(1,"INFORMATICA");
        Categoria categoria2 = new Categoria(2,"ESCRITORIO");
        Categoria categoria3 = new Categoria(3,"FARMACIA");
        Categoria categoria4 = new Categoria(4,"FACULDADE");
        Categoria categoria5 = new Categoria(5,"MERCADO");
        Categoria categoria6 = new Categoria(6,"LOJA");


        List<Categoria> lista = new ArrayList<>();

        lista.add(categoria1);
        lista.add(categoria2);
        lista.add(categoria3);
        lista.add(categoria4);
        lista.add(categoria5);
        lista.add(categoria6);


        return lista;
    }

}
