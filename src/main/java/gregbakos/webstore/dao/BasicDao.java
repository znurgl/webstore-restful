package gregbakos.webstore.dao;


public interface BasicDao<T> {

	public void create(T obj);

	public T readById(int id);

	public void update(T obj);

	public void delete(T obj);

}
