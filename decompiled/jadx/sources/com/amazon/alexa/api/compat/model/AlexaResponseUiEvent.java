package com.amazon.alexa.api.compat.model;

import android.os.Bundle;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaResponseUiEventBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaResponseUiEvent;", "", "eventName", "Lcom/amazon/alexa/api/compat/model/UiEventName;", AlexaResponseUiEventBundleKeys.TIME_OF_EVENT, "", AlexaResponseUiEventBundleKeys.CUSTOM_DATA, "Landroid/os/Bundle;", "<init>", "(Lcom/amazon/alexa/api/compat/model/UiEventName;JLandroid/os/Bundle;)V", "getEventName", "()Lcom/amazon/alexa/api/compat/model/UiEventName;", "getTimeOfEvent", "()J", "getCustomData", "()Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Builder", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaResponseUiEvent {
    public static final int $stable = 8;

    @NotNull
    private final Bundle customData;

    @NotNull
    private final UiEventName eventName;
    private final long timeOfEvent;

    public AlexaResponseUiEvent(@NotNull UiEventName uiEventName, long j, @NotNull Bundle bundle) {
        uiEventName.getClass();
        bundle.getClass();
        this.eventName = uiEventName;
        this.timeOfEvent = j;
        this.customData = bundle;
    }

    public static /* synthetic */ AlexaResponseUiEvent copy$default(AlexaResponseUiEvent alexaResponseUiEvent, UiEventName uiEventName, long j, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEventName = alexaResponseUiEvent.eventName;
        }
        if ((i & 2) != 0) {
            j = alexaResponseUiEvent.timeOfEvent;
        }
        if ((i & 4) != 0) {
            bundle = alexaResponseUiEvent.customData;
        }
        return alexaResponseUiEvent.copy(uiEventName, j, bundle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UiEventName getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeOfEvent() {
        return this.timeOfEvent;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Bundle getCustomData() {
        return this.customData;
    }

    @NotNull
    public final AlexaResponseUiEvent copy(@NotNull UiEventName eventName, long timeOfEvent, @NotNull Bundle customData) {
        eventName.getClass();
        customData.getClass();
        return new AlexaResponseUiEvent(eventName, timeOfEvent, customData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaResponseUiEvent)) {
            return false;
        }
        AlexaResponseUiEvent alexaResponseUiEvent = (AlexaResponseUiEvent) other;
        return this.eventName == alexaResponseUiEvent.eventName && this.timeOfEvent == alexaResponseUiEvent.timeOfEvent && Intrinsics.areEqual(this.customData, alexaResponseUiEvent.customData);
    }

    @NotNull
    public final Bundle getCustomData() {
        return this.customData;
    }

    @NotNull
    public final UiEventName getEventName() {
        return this.eventName;
    }

    public final long getTimeOfEvent() {
        return this.timeOfEvent;
    }

    public int hashCode() {
        return this.customData.hashCode() + BitVector$$ExternalSyntheticOutline0.m(this.timeOfEvent, this.eventName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "AlexaResponseUiEvent(eventName=" + this.eventName + ", timeOfEvent=" + this.timeOfEvent + ", customData=" + this.customData + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaResponseUiEvent$Builder;", "", "<init>", "()V", "eventName", "Lcom/amazon/alexa/api/compat/model/UiEventName;", AlexaResponseUiEventBundleKeys.TIME_OF_EVENT, "", AlexaResponseUiEventBundleKeys.CUSTOM_DATA, "Landroid/os/Bundle;", "withEventName", "withTimeOfEvent", "withCustomData", "bundle", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaResponseUiEvent;", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaResponseUiEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaResponseUiEvent.kt\ncom/amazon/alexa/api/compat/model/AlexaResponseUiEvent$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class Builder {

        @NotNull
        private Bundle customData = new Bundle();

        @Nullable
        private UiEventName eventName;
        private long timeOfEvent;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @JvmStatic
        @NotNull
        public static final Builder builder() {
            return INSTANCE.builder();
        }

        @NotNull
        public final AlexaResponseUiEvent build() {
            UiEventName uiEventName = this.eventName;
            if (uiEventName != null) {
                return new AlexaResponseUiEvent(uiEventName, this.timeOfEvent, this.customData);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("eventName must not be null");
            return null;
        }

        @NotNull
        public final Builder withCustomData(@NotNull Bundle bundle) {
            bundle.getClass();
            this.customData = bundle;
            return this;
        }

        @NotNull
        public final Builder withEventName(@NotNull UiEventName eventName) {
            eventName.getClass();
            this.eventName = eventName;
            return this;
        }

        @NotNull
        public final Builder withTimeOfEvent(long timeOfEvent) {
            this.timeOfEvent = timeOfEvent;
            return this;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaResponseUiEvent$Builder$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaResponseUiEvent$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Builder builder() {
                return new Builder();
            }

            private Companion() {
            }
        }
    }

    public /* synthetic */ AlexaResponseUiEvent(UiEventName uiEventName, long j, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiEventName, j, (i & 4) != 0 ? new Bundle() : bundle);
    }
}
