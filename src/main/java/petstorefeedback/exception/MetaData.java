package petstorefeedback.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import petstorefeedback.exception.ApiExceptionResponse;
import petstorefeedback.exception.ErrorStatusCode;
import petstorefeedback.model.*;

public class MetaData {

	public final static Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
			
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();

		 apiExceptions.put("getFeedback",responses);

		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,ErrorResponse.class,"Invalid input"));

		 apiExceptions.put("createFeedback",responses);

		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
