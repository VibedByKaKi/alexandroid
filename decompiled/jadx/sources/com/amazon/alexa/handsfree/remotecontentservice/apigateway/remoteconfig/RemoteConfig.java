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
public class RemoteConfig {

    @JsonProperty("handsFreeSetupProperties")
    private HandsFreeSetupProperties mHandsFreeSetupProperties;

    @JsonProperty("version")
    private String mVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RemoteConfig remoteConfig = (RemoteConfig) obj;
            if (Objects.equals(this.mHandsFreeSetupProperties, remoteConfig.mHandsFreeSetupProperties) && Objects.equals(this.mVersion, remoteConfig.mVersion)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public HandsFreeSetupProperties getHandsFreeSetupProperties() {
        return this.mHandsFreeSetupProperties;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return Objects.hash(this.mHandsFreeSetupProperties, this.mVersion);
    }

    @VisibleForTesting
    public void setHandsFreeSetupProperties(@Nullable HandsFreeSetupProperties handsFreeSetupProperties) {
        this.mHandsFreeSetupProperties = handsFreeSetupProperties;
    }

    @VisibleForTesting
    public void setVersion(String str) {
        this.mVersion = str;
    }
}
