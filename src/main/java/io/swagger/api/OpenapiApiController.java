package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.InlineResponse200;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T14:40:17.714141527Z[GMT]")
@RestController
public class OpenapiApiController implements OpenapiApi {

    private static final Logger log = LoggerFactory.getLogger(OpenapiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OpenapiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> openapiSearchRestaurantGet(@Parameter(in = ParameterIn.QUERY, description = "Keyword search (keywords can be separated by space), area and genre information can also be specified", schema = @Schema()) @Valid @RequestParam(value = "query", required = false) String query, @Parameter(in = ParameterIn.QUERY, description = "Desired reservation date", schema = @Schema()) @Valid @RequestParam(value = "date", required = false) LocalDate date, @Parameter(in = ParameterIn.QUERY, description = "Desired reservation date and time", schema = @Schema()) @Valid @RequestParam(value = "datetime", required = false) OffsetDateTime datetime, @Min(1) @Parameter(in = ParameterIn.QUERY, description = "Number of people for the reservation", schema = @Schema(allowableValues = {"1"}, minimum = "1"
    )) @Valid @RequestParam(value = "person", required = false) Integer person) {

        try {
            return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"Results\" : [ {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Address\" : \"Address\",\n    \"Rating\" : 0.4004141,\n    \"Genre\" : \"Genre\",\n    \"Name\" : \"Name\"\n  } ]\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
