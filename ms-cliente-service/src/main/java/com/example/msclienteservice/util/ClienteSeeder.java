package com.example.msclienteservice.util;


import com.example.msclienteservice.entity.Cliente;
import com.example.msclienteservice.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClienteSeeder implements CommandLineRunner {

    private final ClienteRepository clienteRepository;

    public ClienteSeeder(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen datos para no duplicar
        if (clienteRepository.count() == 0) {
            Cliente cat1 = new Cliente(null, "Jose", "11223342");
            Cliente cat2 = new Cliente(null, "Armando", "11223342");

            clienteRepository.save(cat1);
            clienteRepository.save(cat2);


            System.out.println("Datos de cliente insertados correctamente.");
        } else {
            System.out.println("Las cliente ya existen, no se insertaron datos.");
        }
    }
}

