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
public class UtteranceLimitsConfig {

    @JsonProperty("maxCount")
    private Integer mMaxCount;

    @JsonProperty("maxDaysAfterFirstUtterance")
    private Integer mMaxDaysAfterFirstUtterance;

    @JsonProperty("minHoursBeforeNextUtterance")
    private Integer mMinHoursBeforeNextUtterance;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UtteranceLimitsConfig utteranceLimitsConfig = (UtteranceLimitsConfig) obj;
            if (Objects.equals(this.mMaxCount, utteranceLimitsConfig.mMaxCount) && Objects.equals(this.mMaxDaysAfterFirstUtterance, utteranceLimitsConfig.mMaxDaysAfterFirstUtterance) && Objects.equals(this.mMinHoursBeforeNextUtterance, utteranceLimitsConfig.mMinHoursBeforeNextUtterance)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Integer getMaxCount() {
        return this.mMaxCount;
    }

    @Nullable
    public Integer getMaxDaysAfterFirstUtterance() {
        return this.mMaxDaysAfterFirstUtterance;
    }

    @Nullable
    public Integer getMinHoursBeforeNextUtterance() {
        return this.mMinHoursBeforeNextUtterance;
    }

    public int hashCode() {
        return Objects.hash(this.mMaxCount, this.mMaxDaysAfterFirstUtterance, this.mMinHoursBeforeNextUtterance);
    }

    @VisibleForTesting
    public void setMaxCount(@Nullable Integer num) {
        this.mMaxCount = num;
    }

    @VisibleForTesting
    public void setMaxDaysAfterFirstUtterance(@Nullable Integer num) {
        this.mMaxDaysAfterFirstUtterance = num;
    }

    @VisibleForTesting
    public void setMinHoursBeforeNextUtterance(@Nullable Integer num) {
        this.mMinHoursBeforeNextUtterance = num;
    }
}
