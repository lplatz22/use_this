package petstorefeedback.services.impl;

import java.util.*;

import petstorefeedback.model.*;

import petstorefeedback.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GetFeedbackImpl implements GetFeedbackI {

	@Override
	public GetFeedbackResponseWrapper execute(GetFeedbackP pojo){
		//TODO
		return new GetFeedbackResponseWrapper();
	}

	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}