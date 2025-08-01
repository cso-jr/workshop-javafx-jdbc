package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		
		return dao.findAll();
	}
	
	// para numa unica ação, se não tiver id, é inserção, e se já tiver id, é atualização
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
	
}
