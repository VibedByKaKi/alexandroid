package com.amazon.alexa.assistant.ui.conversation.settings.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/settings/model/AdaptiveVolumeResponse;", "", "adaptiveVolumeEnabled", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAdaptiveVolumeEnabled", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ui_release", "$serializer", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes17.dex */
public final /* data */ class AdaptiveVolumeResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean adaptiveVolumeEnabled;

    public /* synthetic */ AdaptiveVolumeResponse(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.adaptiveVolumeEnabled = false;
        } else {
            this.adaptiveVolumeEnabled = z;
        }
    }

    public static /* synthetic */ AdaptiveVolumeResponse copy$default(AdaptiveVolumeResponse adaptiveVolumeResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = adaptiveVolumeResponse.adaptiveVolumeEnabled;
        }
        return adaptiveVolumeResponse.copy(z);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ui_release(AdaptiveVolumeResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.adaptiveVolumeEnabled) {
            output.encodeBooleanElement(serialDesc, 0, self.adaptiveVolumeEnabled);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAdaptiveVolumeEnabled() {
        return this.adaptiveVolumeEnabled;
    }

    @NotNull
    public final AdaptiveVolumeResponse copy(boolean adaptiveVolumeEnabled) {
        return new AdaptiveVolumeResponse(adaptiveVolumeEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdaptiveVolumeResponse) && this.adaptiveVolumeEnabled == ((AdaptiveVolumeResponse) other).adaptiveVolumeEnabled;
    }

    public final boolean getAdaptiveVolumeEnabled() {
        return this.adaptiveVolumeEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.adaptiveVolumeEnabled);
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("AdaptiveVolumeResponse(adaptiveVolumeEnabled=", MarkdownConstants.RIGHT_PARENTHESIS, this.adaptiveVolumeEnabled);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/settings/model/AdaptiveVolumeResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/ui/conversation/settings/model/AdaptiveVolumeResponse;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<AdaptiveVolumeResponse> serializer() {
            return AdaptiveVolumeResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdaptiveVolumeResponse() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public AdaptiveVolumeResponse(boolean z) {
        this.adaptiveVolumeEnabled = z;
    }

    public /* synthetic */ AdaptiveVolumeResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
