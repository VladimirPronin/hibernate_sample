package com.pronin.hibernate_sample.controllers;

import com.pronin.hibernate_sample.model.Client;
import com.pronin.hibernate_sample.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(path = "/client")
    public List<Client> getAllClients() {
        return clientService.findAll();
    }

    @PostMapping(path = "/client")
    public Client addClient(@RequestParam String name) {
        Client client = new Client();
        client.setName(name);
        return clientService.save(client);
    }

    @GetMapping(path = "/client/{id}")
    public Optional<Client> getClientByID(@PathVariable("id") Long id) {
        return clientService.findById(id);
    }

    @DeleteMapping(path = "client/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        clientService.deleteById(id);
        return "Client " + id + " deleted";
    }
}
