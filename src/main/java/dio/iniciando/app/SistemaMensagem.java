package dio.iniciando.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Remetente: " + remetente.getNome()
                + "\nEmail: " + remetente.getEmail() + "\ntelefone " + remetente.getTelefones());
        System.out.println("Cadastro aprovado.");
    }
}
