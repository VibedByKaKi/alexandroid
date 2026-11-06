package com.amazon.whisperjoin.provisioning.bluetooth.request.pojos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class RegistrationState {
    public static final int COMPLETING_REGISTRATION = 1;
    public static final int NOT_REGISTERED = 0;
    public static final int REGISTRATION_COMPLETE = 2;
    public static final int REGISTRATION_FAILED_OTHER = -1;
    public static final int REGISTRATION_FAILURE_SERVER_NOT_REACHABLE = -4;
    public static final int REGISTRATION_FAILURE_SERVER_UNAVAILABLE = -5;
    public static final int REGISTRATION_FAILURE_TOKEN_EXPIRED = -3;
    public static final int REGISTRATION_FAILURE_TOKEN_INVALID = -2;
    public final Integer httpCode;

    @SerializedName("msg")
    public final String message;
    public final int state;

    public RegistrationState(int i, Integer num, String str) {
        this.state = i;
        this.httpCode = num;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegistrationState)) {
            return false;
        }
        RegistrationState registrationState = (RegistrationState) obj;
        if (this.state == registrationState.state) {
            Integer num = this.httpCode;
            Integer num2 = registrationState.httpCode;
            if (num != null ? num.equals(num2) : num2 == null) {
                String str = this.message;
                String str2 = registrationState.message;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        hashCodeBuilder.append(this.state);
        Integer num = this.httpCode;
        if (num != null) {
            hashCodeBuilder.append(num);
        }
        String str = this.message;
        if (str != null) {
            hashCodeBuilder.append(str);
        }
        return hashCodeBuilder.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegistrationState(state=");
        sb.append(this.state);
        if (this.httpCode != null) {
            sb.append(", httpCode=");
            sb.append(this.httpCode.intValue());
        }
        if (this.message != null) {
            sb.append(", message=\"");
            sb.append(this.message);
            sb.append(DeviceConfigConstants.DOUBLE_QUOTE);
        }
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
