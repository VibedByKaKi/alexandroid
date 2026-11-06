package com.amazon.alexa.smarthomecameras.directive;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000e¨\u0006!"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/SessionTimeout;", "", "timeoutInMilliseconds", "", "isEligibleForExtension", "", "<init>", "(IZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTimeoutInMilliseconds", "()I", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$AlexaMobileAndroidSmartHomeCameras_release", "$serializer", "Companion", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
/* loaded from: classes19.dex */
public final /* data */ class SessionTimeout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isEligibleForExtension;
    private final int timeoutInMilliseconds;

    public /* synthetic */ SessionTimeout(int i, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SessionTimeout$$serializer.INSTANCE.getDescriptor());
        }
        this.timeoutInMilliseconds = i2;
        this.isEligibleForExtension = z;
    }

    public static /* synthetic */ SessionTimeout copy$default(SessionTimeout sessionTimeout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sessionTimeout.timeoutInMilliseconds;
        }
        if ((i2 & 2) != 0) {
            z = sessionTimeout.isEligibleForExtension;
        }
        return sessionTimeout.copy(i, z);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$AlexaMobileAndroidSmartHomeCameras_release(SessionTimeout self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.timeoutInMilliseconds);
        output.encodeBooleanElement(serialDesc, 1, self.isEligibleForExtension);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEligibleForExtension() {
        return this.isEligibleForExtension;
    }

    @NotNull
    public final SessionTimeout copy(int timeoutInMilliseconds, boolean isEligibleForExtension) {
        return new SessionTimeout(timeoutInMilliseconds, isEligibleForExtension);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionTimeout)) {
            return false;
        }
        SessionTimeout sessionTimeout = (SessionTimeout) other;
        return this.timeoutInMilliseconds == sessionTimeout.timeoutInMilliseconds && this.isEligibleForExtension == sessionTimeout.isEligibleForExtension;
    }

    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEligibleForExtension) + (Integer.hashCode(this.timeoutInMilliseconds) * 31);
    }

    public final boolean isEligibleForExtension() {
        return this.isEligibleForExtension;
    }

    @NotNull
    public String toString() {
        return "SessionTimeout(timeoutInMilliseconds=" + this.timeoutInMilliseconds + ", isEligibleForExtension=" + this.isEligibleForExtension + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/SessionTimeout$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/smarthomecameras/directive/SessionTimeout;", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SessionTimeout> serializer() {
            return SessionTimeout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionTimeout(int i, boolean z) {
        this.timeoutInMilliseconds = i;
        this.isEligibleForExtension = z;
    }
}
