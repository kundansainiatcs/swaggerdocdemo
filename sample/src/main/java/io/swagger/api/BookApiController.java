package io.swagger.api;

import io.swagger.model.Book;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-25T06:13:59.869Z[GMT]")
@RestController
public class BookApiController implements BookApi {

    private static final Logger log = LoggerFactory.getLogger(BookApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Book>> findBooksByStatus(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter the books" ,required=true,schema=@Schema(allowableValues={ "published", "unpublished", "discontinued" }
, defaultValue="published")) @Valid @RequestParam(value = "status", required = true, defaultValue="published") List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Book>>(objectMapper.readValue("[ {\n  \"isbnNumber\" : \"ABC123XY\",\n  \"authorName\" : \"Robert\",\n  \"name\" : \"rich dad poor dad\",\n  \"id\" : 12345\n}, {\n  \"isbnNumber\" : \"ABC123XY\",\n  \"authorName\" : \"Robert\",\n  \"name\" : \"rich dad poor dad\",\n  \"id\" : 12345\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Book>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Book>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Error> saveBook(@Parameter(in = ParameterIn.DEFAULT, description = "Book object that needs to be added to the database.", required=true, schema=@Schema()) @Valid @RequestBody Book body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Error>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", Error.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Error>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Error>(HttpStatus.NOT_IMPLEMENTED);
    }

}
