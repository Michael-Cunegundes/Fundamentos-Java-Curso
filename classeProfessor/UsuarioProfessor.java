package classeProfessor;

public class UsuarioProfessor {

    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        if (objeto instanceof UsuarioProfessor) {
            UsuarioProfessor outro = (UsuarioProfessor) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }

    }

    public int hashCode() {
        return 0;

    }
}
