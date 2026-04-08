package classe;


import java.util.Objects;

public class Usuario {
    String name;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;

        // formas diferentes de fazer a mesma coisa!
       // return Objects.equals(name, usuario.name) && Objects.equals(email, usuario.email);
        //return usuario.name.equals(this.name) && usuario.email.equals(this.email);
        return usuario.name.equals(name) && usuario.email.equals(email);
    }

    //    @Override
//    public boolean equals(Object object) {
//        if (object instanceof Usuario){
//            Usuario outros = (Usuario) object;
//            boolean nomeIgual = outros.name.equals(this.name);
//            boolean emailIgual = outros.email.equals(this.email);
//            return nomeIgual && emailIgual;
//        }else {
//            return false;
//        }
//    }

    //Forma mais gênerica!
//    public boolean equals(Object objeto){
//        Usuario outros = (Usuario) objeto;
//
//        boolean nomeIgual = outros.name.equals(this.name);
//        boolean emailIgual = outros.email.equals(this.email);
//
//        return nomeIgual && emailIgual;
//    }
}
