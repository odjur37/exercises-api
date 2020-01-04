package org.openapitools.api;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import com.triplewill.model.User;

@Validated
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }
    
    @RequestMapping(value = "/participants",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<User>> getUsers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"exercises\" : 0, \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/participants",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateUser(@RequestParam(value="userId", required=true)  Long id, 
    										@RequestParam(value="action", required=true)  String action ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
