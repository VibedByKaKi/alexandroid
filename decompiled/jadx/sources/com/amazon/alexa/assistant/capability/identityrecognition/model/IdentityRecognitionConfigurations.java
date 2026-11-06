package com.amazon.alexa.assistant.capability.identityrecognition.model;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/assistant/capability/identityrecognition/model/IdentityRecognitionConfigurations;", "", "is1pDevice", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "$serializer", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class IdentityRecognitionConfigurations {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean is1pDevice;

    public /* synthetic */ IdentityRecognitionConfigurations(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.is1pDevice = false;
        } else {
            this.is1pDevice = z;
        }
    }

    public static /* synthetic */ IdentityRecognitionConfigurations copy$default(IdentityRecognitionConfigurations identityRecognitionConfigurations, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = identityRecognitionConfigurations.is1pDevice;
        }
        return identityRecognitionConfigurations.copy(z);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(IdentityRecognitionConfigurations self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.is1pDevice) {
            output.encodeBooleanElement(serialDesc, 0, self.is1pDevice);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIs1pDevice() {
        return this.is1pDevice;
    }

    @NotNull
    public final IdentityRecognitionConfigurations copy(boolean is1pDevice) {
        return new IdentityRecognitionConfigurations(is1pDevice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IdentityRecognitionConfigurations) && this.is1pDevice == ((IdentityRecognitionConfigurations) other).is1pDevice;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is1pDevice);
    }

    public final boolean is1pDevice() {
        return this.is1pDevice;
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("IdentityRecognitionConfigurations(is1pDevice=", MarkdownConstants.RIGHT_PARENTHESIS, this.is1pDevice);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/identityrecognition/model/IdentityRecognitionConfigurations$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/identityrecognition/model/IdentityRecognitionConfigurations;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<IdentityRecognitionConfigurations> serializer() {
            return IdentityRecognitionConfigurations$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IdentityRecognitionConfigurations() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public IdentityRecognitionConfigurations(boolean z) {
        this.is1pDevice = z;
    }

    public /* synthetic */ IdentityRecognitionConfigurations(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
