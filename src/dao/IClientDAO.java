package dao;

import java.util.Collection;

import domain.Client;

public interface IClientDAO {
	
	public Boolean register(Client client);
	
	public void delete(String cpf);
	
	public void modify(Client client);
	
	public Client search(String cpf);
}
