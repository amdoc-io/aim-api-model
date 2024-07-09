package com.amdoc.model;

import com.amdoc.pojo.Infrastructure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetInfrastructureByOrganizationIdResponse {
    Infrastructure infrastructure;
}
