package colecao;

import java.util.Objects;

public class Usuario {
    String name;

    Usuario(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "meu nome é: " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return name.equals(usuario.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
