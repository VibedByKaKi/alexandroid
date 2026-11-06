package com.amazon.tarazed.sessionclient.model.createcredentials;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BE\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/amazon/tarazed/sessionclient/model/createcredentials/CreateCredentialsResponse;", "", "seen1", "", "durationSeconds", "loggingCredentials", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;", "signalingCredentials", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/SignalingCredentials;", "mediaCredentials", "", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/MediaCredential;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;Lcom/amazon/tarazed/sessionclient/model/createcredentials/SignalingCredentials;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;Lcom/amazon/tarazed/sessionclient/model/createcredentials/SignalingCredentials;Ljava/util/List;)V", "getDurationSeconds", "()I", "getLoggingCredentials", "()Lcom/amazon/tarazed/sessionclient/model/createcredentials/LoggingCredentials;", "getMediaCredentials", "()Ljava/util/List;", "getSignalingCredentials", "()Lcom/amazon/tarazed/sessionclient/model/createcredentials/SignalingCredentials;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$TarazedAndroidLibrary_release", "$serializer", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes19.dex */
public final /* data */ class CreateCredentialsResponse {
    private final int durationSeconds;

    @NotNull
    private final LoggingCredentials loggingCredentials;

    @NotNull
    private final List<MediaCredential> mediaCredentials;

    @NotNull
    private final SignalingCredentials signalingCredentials;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(MediaCredential$$serializer.INSTANCE)};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CreateCredentialsResponse(int i, int i2, LoggingCredentials loggingCredentials, SignalingCredentials signalingCredentials, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CreateCredentialsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.durationSeconds = i2;
        this.loggingCredentials = loggingCredentials;
        this.signalingCredentials = signalingCredentials;
        this.mediaCredentials = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateCredentialsResponse copy$default(CreateCredentialsResponse createCredentialsResponse, int i, LoggingCredentials loggingCredentials, SignalingCredentials signalingCredentials, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createCredentialsResponse.durationSeconds;
        }
        if ((i2 & 2) != 0) {
            loggingCredentials = createCredentialsResponse.loggingCredentials;
        }
        if ((i2 & 4) != 0) {
            signalingCredentials = createCredentialsResponse.signalingCredentials;
        }
        if ((i2 & 8) != 0) {
            list = createCredentialsResponse.mediaCredentials;
        }
        return createCredentialsResponse.copy(i, loggingCredentials, signalingCredentials, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$TarazedAndroidLibrary_release(CreateCredentialsResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.durationSeconds);
        output.encodeSerializableElement(serialDesc, 1, LoggingCredentials$$serializer.INSTANCE, self.loggingCredentials);
        output.encodeSerializableElement(serialDesc, 2, SignalingCredentials$$serializer.INSTANCE, self.signalingCredentials);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.mediaCredentials);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LoggingCredentials getLoggingCredentials() {
        return this.loggingCredentials;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SignalingCredentials getSignalingCredentials() {
        return this.signalingCredentials;
    }

    @NotNull
    public final List<MediaCredential> component4() {
        return this.mediaCredentials;
    }

    @NotNull
    public final CreateCredentialsResponse copy(int durationSeconds, @NotNull LoggingCredentials loggingCredentials, @NotNull SignalingCredentials signalingCredentials, @NotNull List<MediaCredential> mediaCredentials) {
        loggingCredentials.getClass();
        signalingCredentials.getClass();
        mediaCredentials.getClass();
        return new CreateCredentialsResponse(durationSeconds, loggingCredentials, signalingCredentials, mediaCredentials);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCredentialsResponse)) {
            return false;
        }
        CreateCredentialsResponse createCredentialsResponse = (CreateCredentialsResponse) other;
        return this.durationSeconds == createCredentialsResponse.durationSeconds && Intrinsics.areEqual(this.loggingCredentials, createCredentialsResponse.loggingCredentials) && Intrinsics.areEqual(this.signalingCredentials, createCredentialsResponse.signalingCredentials) && Intrinsics.areEqual(this.mediaCredentials, createCredentialsResponse.mediaCredentials);
    }

    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    @NotNull
    public final LoggingCredentials getLoggingCredentials() {
        return this.loggingCredentials;
    }

    @NotNull
    public final List<MediaCredential> getMediaCredentials() {
        return this.mediaCredentials;
    }

    @NotNull
    public final SignalingCredentials getSignalingCredentials() {
        return this.signalingCredentials;
    }

    public int hashCode() {
        return this.mediaCredentials.hashCode() + ((this.signalingCredentials.hashCode() + ((this.loggingCredentials.hashCode() + (Integer.hashCode(this.durationSeconds) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CreateCredentialsResponse(durationSeconds=" + this.durationSeconds + ", loggingCredentials=" + this.loggingCredentials + ", signalingCredentials=" + this.signalingCredentials + ", mediaCredentials=" + this.mediaCredentials + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/sessionclient/model/createcredentials/CreateCredentialsResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/CreateCredentialsResponse;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<CreateCredentialsResponse> serializer() {
            return CreateCredentialsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CreateCredentialsResponse(int i, @NotNull LoggingCredentials loggingCredentials, @NotNull SignalingCredentials signalingCredentials, @NotNull List<MediaCredential> list) {
        loggingCredentials.getClass();
        signalingCredentials.getClass();
        list.getClass();
        this.durationSeconds = i;
        this.loggingCredentials = loggingCredentials;
        this.signalingCredentials = signalingCredentials;
        this.mediaCredentials = list;
    }
}
