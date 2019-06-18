package com.evi.Exceptions;

import java.io.IOException;

import com.evi.Logs.*;



public class CreateException extends Exception{
	
	public CreateException (String massage) throws IOException  { 
	
		super(massage);
		loggerMassage();
		
	}
	
	public void loggerMassage() throws IOException {
		
		Log log = new Log(); 
		Logger.log(Log.Error(getMessage(), getStackTrace()));

	}

}
