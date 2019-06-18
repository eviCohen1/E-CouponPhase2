package com.evi.Exceptions;

import java.io.IOException;

import com.evi.Logs.*;


public class UpdateException extends Exception{
	
	public UpdateException ( String massage ) throws IOException { 
		super(massage); 
		loggerMassage();
		
		
	}
	
	public void loggerMassage() throws IOException {

		Log log = new Log();
		Logger.log(Log.Error(getMessage(), getStackTrace()));
		
	}

}
