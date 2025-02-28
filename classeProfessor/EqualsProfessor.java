package classeProfessor;

import javax.xml.crypto.Data;
import java.util.Date;

public class EqualsProfessor {

    public static void main(String[] args) {

        UsuarioProfessor u1 = new UsuarioProfessor();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        UsuarioProfessor u2 = new UsuarioProfessor();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";


        System.out.println(u1 == u2);

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));

    }
}
