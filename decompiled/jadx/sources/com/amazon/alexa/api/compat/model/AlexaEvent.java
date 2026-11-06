package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
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
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaEvent;", "", "alexaHeader", "Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "alexaPayload", "Lcom/amazon/alexa/api/compat/model/AlexaPayload;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaHeader;Lcom/amazon/alexa/api/compat/model/AlexaPayload;)V", "getAlexaHeader", "()Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "getAlexaPayload", "()Lcom/amazon/alexa/api/compat/model/AlexaPayload;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaEvent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AlexaHeader alexaHeader;

    @NotNull
    private final AlexaPayload alexaPayload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaEvent$Builder;", "", "<init>", "()V", "alexaHeader", "Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "alexaPayload", "Lcom/amazon/alexa/api/compat/model/AlexaPayload;", "setAlexaHeader", "setAlexaPayload", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaEvent;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaEvent.kt\ncom/amazon/alexa/api/compat/model/AlexaEvent$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private AlexaHeader alexaHeader;

        @Nullable
        private AlexaPayload alexaPayload;

        @NotNull
        public final AlexaEvent build() {
            if (this.alexaHeader == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("AlexaHeader must be set");
                return null;
            }
            if (this.alexaPayload == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("AlexaPayload must be set");
                return null;
            }
            AlexaHeader alexaHeader = this.alexaHeader;
            alexaHeader.getClass();
            AlexaPayload alexaPayload = this.alexaPayload;
            alexaPayload.getClass();
            return new AlexaEvent(alexaHeader, alexaPayload);
        }

        @NotNull
        public final Builder setAlexaHeader(@NotNull AlexaHeader alexaHeader) {
            alexaHeader.getClass();
            this.alexaHeader = alexaHeader;
            return this;
        }

        @NotNull
        public final Builder setAlexaPayload(@NotNull AlexaPayload alexaPayload) {
            alexaPayload.getClass();
            this.alexaPayload = alexaPayload;
            return this;
        }
    }

    public AlexaEvent(@NotNull AlexaHeader alexaHeader, @NotNull AlexaPayload alexaPayload) {
        alexaHeader.getClass();
        alexaPayload.getClass();
        this.alexaHeader = alexaHeader;
        this.alexaPayload = alexaPayload;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaEvent copy$default(AlexaEvent alexaEvent, AlexaHeader alexaHeader, AlexaPayload alexaPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            alexaHeader = alexaEvent.alexaHeader;
        }
        if ((i & 2) != 0) {
            alexaPayload = alexaEvent.alexaPayload;
        }
        return alexaEvent.copy(alexaHeader, alexaPayload);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AlexaHeader getAlexaHeader() {
        return this.alexaHeader;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AlexaPayload getAlexaPayload() {
        return this.alexaPayload;
    }

    @NotNull
    public final AlexaEvent copy(@NotNull AlexaHeader alexaHeader, @NotNull AlexaPayload alexaPayload) {
        alexaHeader.getClass();
        alexaPayload.getClass();
        return new AlexaEvent(alexaHeader, alexaPayload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaEvent)) {
            return false;
        }
        AlexaEvent alexaEvent = (AlexaEvent) other;
        return Intrinsics.areEqual(this.alexaHeader, alexaEvent.alexaHeader) && Intrinsics.areEqual(this.alexaPayload, alexaEvent.alexaPayload);
    }

    @NotNull
    public final AlexaHeader getAlexaHeader() {
        return this.alexaHeader;
    }

    @NotNull
    public final AlexaPayload getAlexaPayload() {
        return this.alexaPayload;
    }

    public int hashCode() {
        return this.alexaPayload.hashCode() + (this.alexaHeader.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AlexaEvent(alexaHeader=" + this.alexaHeader + ", alexaPayload=" + this.alexaPayload + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaEvent$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaEvent$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
