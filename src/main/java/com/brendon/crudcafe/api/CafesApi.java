/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.brendon.crudcafe.api;

import com.brendon.crudcafe.model.Cafe;
import com.brendon.crudcafe.model.Error;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Controller
@Tag(name = "cafe", description = "the cafe API")
public interface CafesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /cafes : Create a cafe
     *
     * @param cafe  (required)
     * @return Null response (status code 201)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "createCafe",
        summary = "Create a cafe",
        tags = { "cafe" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Null response"),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/cafes",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createCafe(
        @Parameter(name = "Cafe", description = "", required = true) @Valid @RequestBody Cafe cafe
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cafes : List all cafes
     *
     * @param limit How many items to return at one time (max 100) (optional)
     * @return A paged array of cafes (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "listCafes",
        summary = "List all cafes",
        tags = { "cafes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A paged array of cafes", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Cafe.class)))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cafes",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Cafe>> listCafes(
        @Max(100) @Parameter(name = "limit", description = "How many items to return at one time (max 100)", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }, { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }, { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }, { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }, { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cafes/{cafeId} : Info for a specific cafe
     *
     * @param cafeId The id of the cafe to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "showCafeById",
        summary = "Info for a specific cafe",
        tags = { "cafes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Cafe.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cafes/{cafeId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Cafe> showCafeById(
        @Parameter(name = "cafeId", description = "The id of the cafe to retrieve", required = true, in = ParameterIn.PATH) @PathVariable("cafeId") String cafeId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
