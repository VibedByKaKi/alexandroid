package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
/* loaded from: classes17.dex */
public class LocalAppVersions {

    @JsonProperty("dspAppVersion")
    private Integer mDspAppVersion;

    @JsonProperty("falcoVersion")
    private Integer mFalcoVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocalAppVersions localAppVersions = (LocalAppVersions) obj;
            if (Objects.equals(this.mDspAppVersion, localAppVersions.mDspAppVersion) && Objects.equals(this.mFalcoVersion, localAppVersions.mFalcoVersion)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Integer getDspAppVersion() {
        return this.mDspAppVersion;
    }

    @Nullable
    public Integer getFalcoVersion() {
        return this.mFalcoVersion;
    }

    public int hashCode() {
        return Objects.hash(this.mDspAppVersion, this.mFalcoVersion);
    }

    @VisibleForTesting
    public void setDspAppVersion(@Nullable Integer num) {
        this.mDspAppVersion = num;
    }

    @VisibleForTesting
    public void setFalcoVersion(@Nullable Integer num) {
        this.mFalcoVersion = num;
    }
}
