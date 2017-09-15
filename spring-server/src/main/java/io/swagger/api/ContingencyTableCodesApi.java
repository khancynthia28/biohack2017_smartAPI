/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-15T01:13:33.603Z")

@Api(value = "contingencyTableCodes", description = "the contingencyTableCodes API")
public interface ContingencyTableCodesApi {

    @ApiOperation(value = "Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.", notes = "Makes drug/outcome coded query and returns two by two contingency table.", response = Void.class, tags={ "contingencyTable", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Void.class) })
    
    @RequestMapping(value = "/contingencyTableCodes",
        method = RequestMethod.GET)
    ResponseEntity<Void> contingencyTableCodes( @NotNull@ApiParam(value = "RxNorm drug code for search", required = true) @RequestParam(value = "drugCode", required = true) String drugCode, @NotNull@ApiParam(value = "SNOMEDCT outcome code for search", required = true) @RequestParam(value = "outcomeCode", required = true) String outcomeCode);

}
