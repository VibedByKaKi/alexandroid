package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
/* loaded from: classes17.dex */
public class NotificationsFrequencyConfig {

    @JsonProperty("intervals")
    private List<Long> mIntervals = new ArrayList();

    @JsonProperty("type")
    private String mType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NotificationsFrequencyConfig notificationsFrequencyConfig = (NotificationsFrequencyConfig) obj;
            if (Objects.equals(this.mType, notificationsFrequencyConfig.mType) && Objects.equals(this.mIntervals, notificationsFrequencyConfig.mIntervals)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public List<Long> getIntervals() {
        return this.mIntervals;
    }

    @Nullable
    public String getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(this.mType, this.mIntervals);
    }

    @VisibleForTesting
    public void setIntervals(@Nullable List<Long> list) {
        this.mIntervals = list;
    }

    @VisibleForTesting
    public void setType(@Nullable String str) {
        this.mType = str;
    }
}
