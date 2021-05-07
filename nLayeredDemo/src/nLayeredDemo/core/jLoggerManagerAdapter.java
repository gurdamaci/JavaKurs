package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class jLoggerManagerAdapter implements LoggerService {

	private JLoggerManager jloggerService;
	public jLoggerManagerAdapter(JLoggerManager jloggerService) {
		super();
		this.jloggerService = jloggerService;
	}
	@Override
	public void Log(String message) {
		jloggerService.log(message);
		
	}

}
