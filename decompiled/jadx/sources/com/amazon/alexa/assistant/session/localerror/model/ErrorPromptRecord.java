package com.amazon.alexa.assistant.session.localerror.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Lcom/amazon/alexa/assistant/session/localerror/model/ErrorPromptRecord;", "", "locale", "", "artifactIdentifier", "md5Checksum", "lastCheckedTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLocale", "()Ljava/lang/String;", "getArtifactIdentifier", "getMd5Checksum", "getLastCheckedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/amazon/alexa/assistant/session/localerror/model/ErrorPromptRecord;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$session_release", "$serializer", "Companion", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes17.dex */
public final /* data */ class ErrorPromptRecord {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String artifactIdentifier;

    @Nullable
    private final Long lastCheckedTime;

    @NotNull
    private final String locale;

    @NotNull
    private final String md5Checksum;

    public /* synthetic */ ErrorPromptRecord(int i, String str, String str2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ErrorPromptRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.locale = str;
        this.artifactIdentifier = str2;
        this.md5Checksum = str3;
        this.lastCheckedTime = l;
    }

    public static /* synthetic */ ErrorPromptRecord copy$default(ErrorPromptRecord errorPromptRecord, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorPromptRecord.locale;
        }
        if ((i & 2) != 0) {
            str2 = errorPromptRecord.artifactIdentifier;
        }
        if ((i & 4) != 0) {
            str3 = errorPromptRecord.md5Checksum;
        }
        if ((i & 8) != 0) {
            l = errorPromptRecord.lastCheckedTime;
        }
        return errorPromptRecord.copy(str, str2, str3, l);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$session_release(ErrorPromptRecord self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.locale);
        output.encodeStringElement(serialDesc, 1, self.artifactIdentifier);
        output.encodeStringElement(serialDesc, 2, self.md5Checksum);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.lastCheckedTime);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMd5Checksum() {
        return this.md5Checksum;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getLastCheckedTime() {
        return this.lastCheckedTime;
    }

    @NotNull
    public final ErrorPromptRecord copy(@NotNull String locale, @NotNull String artifactIdentifier, @NotNull String md5Checksum, @Nullable Long lastCheckedTime) {
        locale.getClass();
        artifactIdentifier.getClass();
        md5Checksum.getClass();
        return new ErrorPromptRecord(locale, artifactIdentifier, md5Checksum, lastCheckedTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorPromptRecord)) {
            return false;
        }
        ErrorPromptRecord errorPromptRecord = (ErrorPromptRecord) other;
        return Intrinsics.areEqual(this.locale, errorPromptRecord.locale) && Intrinsics.areEqual(this.artifactIdentifier, errorPromptRecord.artifactIdentifier) && Intrinsics.areEqual(this.md5Checksum, errorPromptRecord.md5Checksum) && Intrinsics.areEqual(this.lastCheckedTime, errorPromptRecord.lastCheckedTime);
    }

    @NotNull
    public final String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    @Nullable
    public final Long getLastCheckedTime() {
        return this.lastCheckedTime;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getMd5Checksum() {
        return this.md5Checksum;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.locale.hashCode() * 31, 31, this.artifactIdentifier), 31, this.md5Checksum);
        Long l = this.lastCheckedTime;
        return m + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.locale;
        String str2 = this.artifactIdentifier;
        String str3 = this.md5Checksum;
        Long l = this.lastCheckedTime;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ErrorPromptRecord(locale=", str, ", artifactIdentifier=", str2, ", md5Checksum=");
        m.append(str3);
        m.append(", lastCheckedTime=");
        m.append(l);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/session/localerror/model/ErrorPromptRecord$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/session/localerror/model/ErrorPromptRecord;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ErrorPromptRecord> serializer() {
            return ErrorPromptRecord$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ErrorPromptRecord(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Long l) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.locale = str;
        this.artifactIdentifier = str2;
        this.md5Checksum = str3;
        this.lastCheckedTime = l;
    }
}
