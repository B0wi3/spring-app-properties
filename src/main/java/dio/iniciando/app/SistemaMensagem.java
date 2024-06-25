package dio.iniciando.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${nome:DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Remetente: " + nome
                + "\nEmail: " + email + "\ntelefone " + telefones);
        System.out.println("Cadastro aprovado.");
    }
}
