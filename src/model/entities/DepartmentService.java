package model.entities;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class DepartmentService {

	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		
		return dao.findAll();
	}
	
	// para numa unica ação, se não tiver id, é inserção, e se já tiver id, é atualização
	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
	
}
