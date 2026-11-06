package com.amazon.alexa.client.metrics.core;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetadataBundleKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ViewInteractionDetails extends InteractionDetails {
    private final Long duration;
    private final Integer index;
    private final Integer totalElements;

    private ViewInteractionDetails(Builder builder) {
        super(builder.refMarker);
        this.index = builder.index;
        this.totalElements = builder.totalElements;
        this.duration = builder.duration;
    }

    @NonNull
    public static ViewInteractionDetails getFromBundle(@NonNull Bundle bundle) {
        String string = bundle.getString(AlexaMetadataBundleKey.USER_INTERACTION_REF_MARKER.name(), null);
        AlexaMetadataBundleKey alexaMetadataBundleKey = AlexaMetadataBundleKey.LATENCY_REALTIME_MS;
        Long valueOf = bundle.containsKey(alexaMetadataBundleKey.name()) ? Long.valueOf(bundle.getLong(alexaMetadataBundleKey.name())) : null;
        AlexaMetadataBundleKey alexaMetadataBundleKey2 = AlexaMetadataBundleKey.USER_INTERACTION_TOTAL_ITEMS;
        Integer valueOf2 = bundle.containsKey(alexaMetadataBundleKey2.name()) ? Integer.valueOf(bundle.getInt(alexaMetadataBundleKey2.name())) : null;
        AlexaMetadataBundleKey alexaMetadataBundleKey3 = AlexaMetadataBundleKey.USER_INTERACTION_INDEX_TAPPED;
        return getViewInteractionDetailsBuilder().setRefMarker(string).setIndex(bundle.containsKey(alexaMetadataBundleKey3.name()) ? Integer.valueOf(bundle.getInt(alexaMetadataBundleKey3.name())) : null).setTotalElements(valueOf2).setDuration(valueOf).build();
    }

    @NonNull
    public static Builder getViewInteractionDetailsBuilder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.client.metrics.core.InteractionDetails
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ViewInteractionDetails viewInteractionDetails = (ViewInteractionDetails) obj;
            if (getRefMarker() != null && getRefMarker().equals(viewInteractionDetails.getRefMarker()) && this.index.equals(viewInteractionDetails.index) && this.totalElements.equals(viewInteractionDetails.totalElements) && this.duration.equals(viewInteractionDetails.duration)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Long getDuration() {
        return this.duration;
    }

    @Nullable
    public Integer getIndex() {
        return this.index;
    }

    @Nullable
    public Integer getTotalElements() {
        return this.totalElements;
    }

    @Override // com.amazon.alexa.client.metrics.core.InteractionDetails
    @NonNull
    public String toString() {
        return "RefMarker = " + getRefMarker() + " duration = " + this.duration + " index = " + this.index + " totalElements = " + this.totalElements;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Long duration;
        private Integer index;
        private String refMarker;
        private Integer totalElements;

        private Builder() {
            this.refMarker = null;
            this.index = null;
            this.totalElements = null;
            this.duration = null;
        }

        @NonNull
        public ViewInteractionDetails build() {
            return new ViewInteractionDetails(this, 0);
        }

        @NonNull
        public Builder setDuration(@Nullable Long l) {
            this.duration = l;
            return this;
        }

        @NonNull
        public Builder setIndex(@Nullable Integer num) {
            if (num != null) {
                this.index = TableInfo$$ExternalSyntheticOutline0.m(1, num);
            }
            return this;
        }

        @NonNull
        public Builder setRefMarker(@Nullable String str) {
            this.refMarker = str;
            return this;
        }

        @NonNull
        public Builder setTotalElements(@Nullable Integer num) {
            this.totalElements = num;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ ViewInteractionDetails(Builder builder, int i) {
        this(builder);
    }
}
