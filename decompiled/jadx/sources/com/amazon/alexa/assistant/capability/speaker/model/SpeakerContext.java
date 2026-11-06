package com.amazon.alexa.assistant.capability.speaker.model;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.audiopersonalization.constants.EventBusConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/amazon/alexa/assistant/capability/speaker/model/SpeakerContext;", "", EventBusConstants.VOLUME_KEY, "", "muted", "", "<init>", "(IZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getVolume", "()I", "getMuted", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "Companion", "$serializer", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class SpeakerContext {

    @NotNull
    public static final String CONTEXT_NAME = "VolumeState";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean muted;
    private final int volume;

    public /* synthetic */ SpeakerContext(int i, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SpeakerContext$$serializer.INSTANCE.getDescriptor());
        }
        this.volume = i2;
        this.muted = z;
    }

    public static /* synthetic */ SpeakerContext copy$default(SpeakerContext speakerContext, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = speakerContext.volume;
        }
        if ((i2 & 2) != 0) {
            z = speakerContext.muted;
        }
        return speakerContext.copy(i, z);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(SpeakerContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.volume);
        output.encodeBooleanElement(serialDesc, 1, self.muted);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVolume() {
        return this.volume;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    @NotNull
    public final SpeakerContext copy(int volume, boolean muted) {
        return new SpeakerContext(volume, muted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeakerContext)) {
            return false;
        }
        SpeakerContext speakerContext = (SpeakerContext) other;
        return this.volume == speakerContext.volume && this.muted == speakerContext.muted;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final int getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return Boolean.hashCode(this.muted) + (Integer.hashCode(this.volume) * 31);
    }

    @NotNull
    public String toString() {
        return "SpeakerContext(volume=" + this.volume + ", muted=" + this.muted + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speaker/model/SpeakerContext$Companion;", "", "<init>", "()V", "CONTEXT_NAME", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/speaker/model/SpeakerContext;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SpeakerContext> serializer() {
            return SpeakerContext$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SpeakerContext(int i, boolean z) {
        this.volume = i;
        this.muted = z;
    }
}
