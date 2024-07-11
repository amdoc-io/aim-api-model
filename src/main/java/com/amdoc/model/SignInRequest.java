package com.amdoc.model;

import com.amdoc.type.AuthType;
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
public class SignInRequest {
    String email;
    AuthType authType;
    String firstName;
    String lastName;
    Boolean isEmailVerified;
    String accessToken;
    String externalId;
}
