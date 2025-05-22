package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import domain.Client;

public class ClientMapDAO implements IClientDAO {

	private Map<String, Client> map;
	
	public ClientMapDAO() {
		this.map = new HashMap<>();
	}
	
	@Override
	public Boolean register(Client client) {
		if (this.map.containsKey(client.getCpf())) {
			return false;
		}
		this.map.put(client.getCpf(), client);
		return true;
	}

	@Override
	public void delete(String cpf) {
		Client registeredClient = this.map.get(cpf);
		
		if (registeredClient != null) {
			this.map.remove(cpf, registeredClient);
		}
	}

	@Override
	public void modify(Client client) {
		Client registeredClient = this.map.get(client.getCpf());
		
		if (registeredClient != null) {
			registeredClient.setName(client.getName());
			registeredClient.setPhoneNumber(client.getPhoneNumber());
			registeredClient.setAddressNumber(client.getAddressNumber());
			registeredClient.setAddress(client.getAddress());
			registeredClient.setCity(client.getCity());
			registeredClient.setState(client.getState());
		}
	}

	@Override
	public Client search(String cpf) {
		return this.map.get(cpf);
	}
}
