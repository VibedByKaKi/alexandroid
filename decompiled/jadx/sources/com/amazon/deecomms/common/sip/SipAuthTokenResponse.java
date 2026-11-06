package com.amazon.deecomms.common.sip;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.deecomms.auth.AuthTokenHelper;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import org.apache.commons.lang3.time.TimeZones;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public class SipAuthTokenResponse {

    @JsonProperty("authToken")
    private AuthToken authToken;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AuthToken {
        public static final int INVALID_TIME_ATTRIBUTE_IN_JSON = 0;

        @JsonProperty("created")
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", shape = JsonFormat.Shape.STRING, timezone = TimeZones.GMT_ID)
        private Date createdDate;

        @JsonProperty(FragmentMetaData.EXPIRATION)
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", shape = JsonFormat.Shape.STRING, timezone = TimeZones.GMT_ID)
        private Date expirationDate;

        @JsonProperty("value")
        private String tokenValue;

        public Date getCreatedDate() {
            return this.createdDate;
        }

        public long getEpochTokenCreatedTimeInMillis() {
            Date date = this.createdDate;
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        }

        public long getEpochTokenExpirationTimeInMillis() {
            Date date = this.expirationDate;
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        }

        public Date getExpirationDate() {
            return this.expirationDate;
        }

        public long getExpiresIn() {
            long epochTokenCreatedTimeInMillis = getEpochTokenCreatedTimeInMillis();
            if (epochTokenCreatedTimeInMillis == 0) {
                return 3600000L;
            }
            return getEpochTokenExpirationTimeInMillis() - epochTokenCreatedTimeInMillis;
        }

        public String getTokenValue() {
            return this.tokenValue;
        }

        public void setCreatedDate(Date date) {
            this.createdDate = date;
        }

        public void setExpirationDate(Date date) {
            this.expirationDate = date;
        }

        public String toString() {
            return "AuthToken: value=" + AuthTokenHelper.sensitive(this.tokenValue) + ", expiration=" + this.expirationDate + ", expiresIn=" + getExpiresIn() + ", created=" + this.createdDate;
        }
    }

    public AuthToken getAuthToken() {
        return this.authToken;
    }
}
