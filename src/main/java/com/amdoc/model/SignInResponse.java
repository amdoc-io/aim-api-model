package com.amdoc.model;

import com.amdoc.pojo.DocAccount;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignInResponse {
    String authToken;
    DocAccount account;
    ZonedDateTime createdAt;
}
