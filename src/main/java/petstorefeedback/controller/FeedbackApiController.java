package petstorefeedback.controller;
import org.springframework.beans.factory.annotation.Autowired;
import petstorefeedback.services.*;
import petstorefeedback.model.*;
import javax.servlet.http.HttpServletRequest;


import petstorefeedback.model.ErrorResponse;
import petstorefeedback.model.Feedback;
import petstorefeedback.model.FeedbackInput;
import petstorefeedback.model.SuccessfulResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-03T20:20:53.054Z")

@Controller
public class FeedbackApiController implements FeedbackApi {
	@Autowired
	 private CreateFeedbackI createFeedbackI;
	@Autowired
	 private GetFeedbackI getFeedbackI;


    private static final Logger log = LoggerFactory.getLogger(FeedbackApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FeedbackApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SuccessfulResponse> createFeedback(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody FeedbackInput body) {

	request.setAttribute("operationId","createFeedback");
	CreateFeedbackResponseWrapper res = createFeedbackI.execute(new CreateFeedbackP(body));
return new ResponseEntity<SuccessfulResponse>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<List<Feedback>> getFeedback() {

	request.setAttribute("operationId","getFeedback");
	GetFeedbackResponseWrapper res = getFeedbackI.execute(new GetFeedbackP());
return new ResponseEntity<List<Feedback>>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

}
