package com.evi.Logs;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import com.evi.DB.ConnPool;
import com.evi.Main.Utils;



public class Logger {
	
	Connection conn; 
	ConnPool connPool;

	public Logger(Connection conn, ConnPool connPool) {
		super();
		this.conn = conn;
		this.connPool = connPool;
	} 
	
	public Logger() { 
		
	}
	
	
	public static void log ( String log ) throws IOException { 
		
		//TODO write the log to SUMO logic 
		Utils.writeLogFile(log);
	}
	
	public void getLogs() throws IOException{

		//TODO retrieve all the logs from the cloud 
		
		ArrayList<String> logs = new ArrayList<String>(); 
        String rowLogs = Utils.readLogFile();
        System.out.println(rowLogs);

		 
	}
	
	
	

}
