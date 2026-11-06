package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006!"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerMetadata;", "", "playerId", "", "skillToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPlayerId", "()Ljava/lang/String;", "getSkillToken", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "$serializer", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class ExternalMediaPlayerMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String playerId;

    @NotNull
    private final String skillToken;

    public /* synthetic */ ExternalMediaPlayerMetadata(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ExternalMediaPlayerMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.playerId = str;
        this.skillToken = str2;
    }

    public static /* synthetic */ ExternalMediaPlayerMetadata copy$default(ExternalMediaPlayerMetadata externalMediaPlayerMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalMediaPlayerMetadata.playerId;
        }
        if ((i & 2) != 0) {
            str2 = externalMediaPlayerMetadata.skillToken;
        }
        return externalMediaPlayerMetadata.copy(str, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(ExternalMediaPlayerMetadata self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.playerId);
        output.encodeStringElement(serialDesc, 1, self.skillToken);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlayerId() {
        return this.playerId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSkillToken() {
        return this.skillToken;
    }

    @NotNull
    public final ExternalMediaPlayerMetadata copy(@NotNull String playerId, @NotNull String skillToken) {
        playerId.getClass();
        skillToken.getClass();
        return new ExternalMediaPlayerMetadata(playerId, skillToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalMediaPlayerMetadata)) {
            return false;
        }
        ExternalMediaPlayerMetadata externalMediaPlayerMetadata = (ExternalMediaPlayerMetadata) other;
        return Intrinsics.areEqual(this.playerId, externalMediaPlayerMetadata.playerId) && Intrinsics.areEqual(this.skillToken, externalMediaPlayerMetadata.skillToken);
    }

    @NotNull
    public final String getPlayerId() {
        return this.playerId;
    }

    @NotNull
    public final String getSkillToken() {
        return this.skillToken;
    }

    public int hashCode() {
        return this.skillToken.hashCode() + (this.playerId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ExternalMediaPlayerMetadata(playerId=", this.playerId, ", skillToken=", this.skillToken, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerMetadata$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerMetadata;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ExternalMediaPlayerMetadata> serializer() {
            return ExternalMediaPlayerMetadata$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExternalMediaPlayerMetadata(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.playerId = str;
        this.skillToken = str2;
    }
}
