package com.amdoc.model;

import com.amdoc.pojo.DocDeployment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDeploymentsByOrganizationIdResponse {
    List<DocDeployment> docDeployments;
}
