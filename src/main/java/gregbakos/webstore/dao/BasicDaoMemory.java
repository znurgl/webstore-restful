package gregbakos.webstore.dao;

import gregbakos.webstore.domain.BasicEntity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BasicDaoMemory implements BasicDao<BasicEntity> {

	private Map<Integer, BasicEntity> customerDB = new ConcurrentHashMap<Integer, BasicEntity>();
	private AtomicInteger idCounter = new AtomicInteger();

	public void create(BasicEntity obj) {
		obj.setId(idCounter.incrementAndGet());
		customerDB.put(obj.getId(), obj);
	}

	public BasicEntity readById(int id) {
		return customerDB.get(id);
	}

	public void update(BasicEntity obj) {
		customerDB.remove(obj.getId());
		customerDB.put(obj.getId(), obj);

	}

	public void delete(BasicEntity obj) {
		customerDB.remove(obj.getId());
	}

}
