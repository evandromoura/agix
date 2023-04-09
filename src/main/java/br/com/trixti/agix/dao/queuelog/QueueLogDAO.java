package br.com.trixti.agix.dao.queuelog;

import java.util.List;

import br.com.trixti.agix.dao.AbstractDAO;
import br.com.trixti.agix.entity.QueueLog;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class QueueLogDAO extends AbstractDAO<QueueLog> {

	
	public List<QueueLog> listarTop10(){
		CriteriaQuery<QueueLog> criteria = getCriteriaBuilder().createQuery(QueueLog.class);
		Root<QueueLog>  root = criteria.from(QueueLog.class);
		return getManager().createQuery(criteria.select(root).orderBy(getCriteriaBuilder().desc(root.get("id")))).setMaxResults(10).getResultList();
	}
	
	
	public List<QueueLog> recuperarPorUniqueid(String uniqueid){
		CriteriaQuery<QueueLog> criteria = getCriteriaBuilder().createQuery(QueueLog.class);
		Root<QueueLog>  root = criteria.from(QueueLog.class);
		return getManager().createQuery(criteria.select(root).where(getCriteriaBuilder().equal(root.get("callid"), uniqueid)).orderBy(getCriteriaBuilder().desc(root.get("id")))).setMaxResults(10).getResultList();
	}
	
	
}
