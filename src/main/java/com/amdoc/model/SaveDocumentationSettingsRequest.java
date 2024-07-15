package com.amdoc.model;

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
public class SaveDocumentationSettingsRequest {
    String brandName;
    String logoImg;
    String brandColor;
    String homepageUrl;
    String privacyPolicyUrl;
    String callToActionName;
    String callToActionUrl;
    String infoEmail;
    String supportEmail;
    String careerEmail;
    String socialLinks;
}
