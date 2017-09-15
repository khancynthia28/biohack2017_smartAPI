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

@Api(value = "RORCodes", description = "the RORCodes API")
public interface RORCodesApi {

    @ApiOperation(value = "Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.", notes = "Returns the Reporting Odds Ratio (ROR) for the drug/outcome coded query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. & Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)", response = Void.class, tags={ "reportingOddsRatio", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Void.class) })
    
    @RequestMapping(value = "/RORCodes",
        method = RequestMethod.GET)
    ResponseEntity<Void> rorCodes( @NotNull@ApiParam(value = "RxNorm drug code for search", required = true) @RequestParam(value = "drugCode", required = true) String drugCode, @NotNull@ApiParam(value = "SNOMEDCT outcome code for search", required = true) @RequestParam(value = "outcomeCode", required = true) String outcomeCode);

}
