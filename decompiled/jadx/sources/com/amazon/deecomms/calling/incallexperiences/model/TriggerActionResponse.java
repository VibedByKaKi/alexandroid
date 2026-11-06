package com.amazon.deecomms.calling.incallexperiences.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TriggerActionResponse {

    @JsonProperty("statusCode")
    private String triggerStatusCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TriggerStatusCode {
        SUCCESS("Success"),
        VPC_IS_REQUIRED("VpcIsRequired"),
        AMC_OPT_IN_REQUIRED("AmcOptInRequired"),
        UNKNOWN("unknown");

        private String value;

        TriggerStatusCode(String str) {
            this.value = str;
        }

        public static TriggerStatusCode lookUp(String str) {
            for (TriggerStatusCode triggerStatusCode : values()) {
                if (triggerStatusCode.getValue().equalsIgnoreCase(str)) {
                    return triggerStatusCode;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }
    }

    public TriggerStatusCode getTriggerStatusCode() {
        TriggerStatusCode lookUp = TriggerStatusCode.lookUp(this.triggerStatusCode);
        return lookUp != null ? lookUp : this.triggerStatusCode.toLowerCase().startsWith("amc") ? TriggerStatusCode.AMC_OPT_IN_REQUIRED : this.triggerStatusCode.toLowerCase().startsWith("vpc") ? TriggerStatusCode.VPC_IS_REQUIRED : TriggerStatusCode.UNKNOWN;
    }

    public void setTriggerStatusCode(String str) {
        this.triggerStatusCode = str;
    }
}
