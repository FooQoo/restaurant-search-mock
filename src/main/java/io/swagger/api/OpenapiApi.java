/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.42).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T14:40:17.714141527Z[GMT]")
@Validated
public interface OpenapiApi {

    @Operation(summary = "Search for restaurants by various criteria", description = "", security = {
        @SecurityRequirement(name = "OAuth2", scopes = {
            "read"        })    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful restaurant search", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid input detected"),
        
        @ApiResponse(responseCode = "500", description = "Unexpected error occurred"),
        
        @ApiResponse(responseCode = "503", description = "Service is in an unstable state") })
    @RequestMapping(value = "/openai/search/restaurant",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> openapiSearchRestaurantGet(@Parameter(in = ParameterIn.QUERY, description = "Keyword search (keywords can be separated by space), area and genre information can also be specified" ,schema=@Schema()) @Valid @RequestParam(value = "query", required = false) String query, @Parameter(in = ParameterIn.QUERY, description = "Desired reservation date" ,schema=@Schema()) @Valid @RequestParam(value = "date", required = false) LocalDate date, @Parameter(in = ParameterIn.QUERY, description = "Desired reservation date and time" ,schema=@Schema()) @Valid @RequestParam(value = "datetime", required = false) OffsetDateTime datetime, @Min(1)@Parameter(in = ParameterIn.QUERY, description = "Number of people for the reservation" ,schema=@Schema(allowableValues={ "1" }, minimum="1"
)) @Valid @RequestParam(value = "person", required = false) Integer person);

}
