package security.generic.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface Gnericdao<T> {
	
	public List<T> findall();
	public void save(T t);
	public void delete(T t);
	public List<T> findByCriteria(DetachedCriteria c);

}
