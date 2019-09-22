package net.anderson.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Anderson on 07/09/2019.
 */
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public Categoria() {

    }

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;

        if (id == categoria.id)
            if (!(!Objects.equals(nome, categoria.nome))) return true;
        return false;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }


}
