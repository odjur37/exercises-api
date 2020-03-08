package org.openapitools.api;

import com.triplewill.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Validated
public interface UserApi {

	default Optional<NativeWebRequest> getRequest() {
		return Optional.empty();
	}

	@RequestMapping(value = "/participants", produces = { "application/json" }, method = RequestMethod.GET)
	default ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/participants", consumes = {
			"application/json" }, method = RequestMethod.PUT)
	default ResponseEntity<Void> updateUserDates(@RequestParam(value = "userId", required = true) Long id,
                                                 @RequestBody String[] dates){
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}
	
}
