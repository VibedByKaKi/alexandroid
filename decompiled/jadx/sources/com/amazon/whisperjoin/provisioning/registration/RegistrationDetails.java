package com.amazon.whisperjoin.provisioning.registration;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.google.gson.annotations.SerializedName;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class RegistrationDetails implements Validatable {
    public static final int COMPLETING_REGISTRATION = 1;
    public static final int NOT_REGISTERED = 0;
    public static final int REGISTRATION_COMPLETE = 2;
    public static final int REGISTRATION_FAILED_OTHER = -1;
    public static final int REGISTRATION_FAILURE_SERVER_ERROR = -5;
    public static final int REGISTRATION_FAILURE_SERVER_NOT_REACHABLE = -4;
    public static final int REGISTRATION_FAILURE_TOKEN_EXPIRED = -3;
    public static final int REGISTRATION_FAILURE_TOKEN_INVALID = -2;
    private Integer httpCode;

    @SerializedName("msg")
    private String message;
    private Integer state;

    public boolean canEqual(Object obj) {
        return obj instanceof RegistrationDetails;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegistrationDetails)) {
            return false;
        }
        RegistrationDetails registrationDetails = (RegistrationDetails) obj;
        if (!registrationDetails.canEqual(this)) {
            return false;
        }
        Integer state = getState();
        Integer state2 = registrationDetails.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        Integer httpCode = getHttpCode();
        Integer httpCode2 = registrationDetails.getHttpCode();
        if (httpCode != null ? !httpCode.equals(httpCode2) : httpCode2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = registrationDetails.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public Integer getHttpCode() {
        return this.httpCode;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getState() {
        return this.state;
    }

    public int hashCode() {
        Integer state = getState();
        int hashCode = state == null ? 43 : state.hashCode();
        Integer httpCode = getHttpCode();
        int i = (hashCode + 59) * 59;
        int hashCode2 = httpCode == null ? 43 : httpCode.hashCode();
        String message = getMessage();
        return ((i + hashCode2) * 59) + (message != null ? message.hashCode() : 43);
    }

    public void setHttpCode(Integer num) {
        this.httpCode = num;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setState(Integer num) {
        this.state = num;
    }

    public String toString() {
        return "RegistrationDetails(state=" + getState() + ", message=" + getMessage() + ", httpCode=" + getHttpCode() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        Integer num = this.httpCode;
        if (num == null || num.intValue() >= 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Http code cannot be negative. Please use InputValidator methods to validate parameters.");
    }
}
