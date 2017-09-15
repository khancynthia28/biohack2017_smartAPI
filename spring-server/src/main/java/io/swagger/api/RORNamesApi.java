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

@Api(value = "RORNames", description = "the RORNames API")
public interface RORNamesApi {

    @ApiOperation(value = "Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.", notes = "Returns the Reporting Odds Ratio (ROR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. & Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)", response = Void.class, tags={ "reportingOddsRatio", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Void.class) })
    
    @RequestMapping(value = "/RORNames",
        method = RequestMethod.GET)
    ResponseEntity<Void> rorNames( @NotNull@ApiParam(value = "RxNorm drug name for search", required = true) @RequestParam(value = "drugName", required = true) String drugName, @NotNull@ApiParam(value = "SNOMEDCT outcome name for search", required = true) @RequestParam(value = "outcomeName", required = true) String outcomeName);

}
