import java.util.List;

import br.com.trixti.agix.entity.QueueLog;
import br.com.trixti.agix.service.queuelog.QueueLogService;

public class QueryTest {

	public static void main(String[] args) {
		List<QueueLog> queues = new QueueLogService().listTop10();
		queues.forEach(queue ->{
			System.out.println(queue.getCallid() + ":"+queue.getEvent()+ ":"+queue.getQueuename());
		});
		
		List<QueueLog> queues2 = new QueueLogService().listTop10();
		queues2.forEach(queue ->{
			System.out.println(queue.getCallid() + "::"+queue.getEvent()+ ":"+queue.getQueuename());
		});
	}
}
