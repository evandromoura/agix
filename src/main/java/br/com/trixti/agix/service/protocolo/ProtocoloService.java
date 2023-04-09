package br.com.trixti.agix.service.protocolo;

import java.util.List;

import br.com.trixti.agix.dao.AbstractDAO;
import br.com.trixti.agix.dao.queuelog.QueueLogDAO;
import br.com.trixti.agix.entity.QueueLog;
import br.com.trixti.agix.service.AbstractService;

public class ProtocoloService extends AbstractService<QueueLog> {

	private QueueLogDAO queueLogDAO = new QueueLogDAO();
	
	@Override
	public AbstractDAO<QueueLog> getDAO() {
		return queueLogDAO;
	}
	
	public List<QueueLog> listTop10(){
		return queueLogDAO.listarTop10();
	}

}
