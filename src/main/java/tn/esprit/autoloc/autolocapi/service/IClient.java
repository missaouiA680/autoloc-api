package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Client;
import java.util.List;

public interface IClient {
    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long idClient);
    List<Client> getAllClients();
    Client getClientById(Long idClient);
}
