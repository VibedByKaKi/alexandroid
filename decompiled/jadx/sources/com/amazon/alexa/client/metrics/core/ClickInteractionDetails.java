package com.amazon.alexa.client.metrics.core;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetadataBundleKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ClickInteractionDetails extends InteractionDetails {
    private final String actionType;
    private final String elementType;
    private final Integer index;
    private final Integer totalElements;

    private ClickInteractionDetails(Builder builder) {
        super(builder.refMarker);
        this.actionType = builder.actionType;
        this.elementType = builder.elementType;
        this.index = builder.index;
        this.totalElements = builder.totalElements;
    }

    @NonNull
    public static Builder getClickInteractionDetailsBuilder() {
        return new Builder(0);
    }

    @NonNull
    public static ClickInteractionDetails getFromBundle(@NonNull Bundle bundle) {
        String string = bundle.getString(AlexaMetadataBundleKey.USER_INTERACTION_REF_MARKER.name(), null);
        String string2 = bundle.getString(AlexaMetadataBundleKey.USER_INTERACTION_ACTION_TYPE.name(), null);
        String string3 = bundle.getString(AlexaMetadataBundleKey.USER_INTERACTION_ELEMENT_TYPE.name(), null);
        AlexaMetadataBundleKey alexaMetadataBundleKey = AlexaMetadataBundleKey.USER_INTERACTION_TOTAL_ITEMS;
        Integer valueOf = bundle.containsKey(alexaMetadataBundleKey.name()) ? Integer.valueOf(bundle.getInt(alexaMetadataBundleKey.name())) : null;
        AlexaMetadataBundleKey alexaMetadataBundleKey2 = AlexaMetadataBundleKey.USER_INTERACTION_INDEX_TAPPED;
        return getClickInteractionDetailsBuilder().setRefMarker(string).setActionType(string2).setElementType(string3).setIndex(bundle.containsKey(alexaMetadataBundleKey2.name()) ? Integer.valueOf(bundle.getInt(alexaMetadataBundleKey2.name())) : null).setTotalElements(valueOf).build();
    }

    @Override // com.amazon.alexa.client.metrics.core.InteractionDetails
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClickInteractionDetails clickInteractionDetails = (ClickInteractionDetails) obj;
            if (getRefMarker() != null && getRefMarker().equals(clickInteractionDetails.getRefMarker()) && this.actionType.equals(clickInteractionDetails.actionType) && this.elementType.equals(clickInteractionDetails.elementType) && this.index.equals(clickInteractionDetails.index) && this.totalElements.equals(clickInteractionDetails.totalElements)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getActionType() {
        return this.actionType;
    }

    @Nullable
    public String getElementType() {
        return this.elementType;
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
        return "RefMarker = " + getRefMarker() + " actionType = " + this.actionType + " elementType = " + this.elementType + " index = " + this.index + " totalElements = " + this.totalElements;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String actionType;
        private String elementType;
        private Integer index;
        private String refMarker;
        private Integer totalElements;

        private Builder() {
            this.refMarker = null;
            this.actionType = null;
            this.elementType = null;
            this.index = null;
            this.totalElements = null;
        }

        @NonNull
        public ClickInteractionDetails build() {
            return new ClickInteractionDetails(this, 0);
        }

        @NonNull
        public Builder setActionType(@Nullable String str) {
            this.actionType = str;
            return this;
        }

        @NonNull
        public Builder setElementType(@Nullable String str) {
            this.elementType = str;
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

    public /* synthetic */ ClickInteractionDetails(Builder builder, int i) {
        this(builder);
    }
}
