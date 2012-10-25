package gregbakos.webstore.dao;


public class DaoFactory {

	public static BasicDao getDao() {
		return new BasicDaoMemory();
	}

}
