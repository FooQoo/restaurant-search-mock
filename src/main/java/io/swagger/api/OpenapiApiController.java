package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.RestaurantList;
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

    public ResponseEntity<RestaurantList> openapiSearchRestaurantGet(@Parameter(in = ParameterIn.QUERY, description = "Keyword search (keywords can be separated by space), area and genre information can also be specified", schema = @Schema()) @Valid @RequestParam(value = "query", required = false) String query, @Parameter(in = ParameterIn.QUERY, description = "Desired reservation date", schema = @Schema()) @Valid @RequestParam(value = "date", required = false) LocalDate datetime, @Min(1) @Parameter(in = ParameterIn.QUERY, description = "Number of people for the reservation", schema = @Schema(allowableValues = {"1"}, minimum = "1"
    )) @Valid @RequestParam(value = "person", required = false) Integer person) {

        try {
            return new ResponseEntity<RestaurantList>(objectMapper.readValue("{\n  \"restaurantList\" : [ {\n    \"address\" : \"東京都\",\n    \"rating\" : 0.4004141,\n    \"genre\" : \"居酒屋\",\n    \"name\" : \"居酒屋龍\"\n  }, {\n    \"address\" : \"大阪府\",\n    \"rating\" : 0.4004141,\n    \"genre\" : \"ラーメン\",\n    \"name\" : \"ラーメン虎\"\n  } ]\n}", RestaurantList.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<RestaurantList>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
