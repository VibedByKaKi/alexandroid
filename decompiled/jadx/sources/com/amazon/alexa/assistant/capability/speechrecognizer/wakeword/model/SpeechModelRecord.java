package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.assistant.foundation.model.SystemLocale;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000234B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000fHÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelRecord;", "", "locale", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "identifier", "", "modelPath", "lastCheckedTime", "", "checksum", "priority", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelPriority;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelPriority;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/assistant/foundation/model/SystemLocale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelPriority;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLocale", "()Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "getIdentifier", "()Ljava/lang/String;", "getModelPath", "getLastCheckedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getChecksum", "getPriority", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelPriority;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelPriority;)Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelRecord;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "Companion", "$serializer", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class SpeechModelRecord {
    public static final long MILLIS_IN_BETWEEN_DOWNLOADS = 3600000;

    @NotNull
    private final String checksum;

    @NotNull
    private final String identifier;

    @Nullable
    private final Long lastCheckedTime;

    @NotNull
    private final SystemLocale locale;

    @NotNull
    private final String modelPath;

    @NotNull
    private final SpeechModelPriority priority;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {SystemLocale.INSTANCE.serializer(), null, null, null, null, SpeechModelPriority.INSTANCE.serializer()};

    public /* synthetic */ SpeechModelRecord(int i, SystemLocale systemLocale, String str, String str2, Long l, String str3, SpeechModelPriority speechModelPriority, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, SpeechModelRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.locale = systemLocale;
        this.identifier = str;
        this.modelPath = str2;
        this.lastCheckedTime = l;
        this.checksum = str3;
        this.priority = speechModelPriority;
    }

    public static /* synthetic */ SpeechModelRecord copy$default(SpeechModelRecord speechModelRecord, SystemLocale systemLocale, String str, String str2, Long l, String str3, SpeechModelPriority speechModelPriority, int i, Object obj) {
        if ((i & 1) != 0) {
            systemLocale = speechModelRecord.locale;
        }
        if ((i & 2) != 0) {
            str = speechModelRecord.identifier;
        }
        if ((i & 4) != 0) {
            str2 = speechModelRecord.modelPath;
        }
        if ((i & 8) != 0) {
            l = speechModelRecord.lastCheckedTime;
        }
        if ((i & 16) != 0) {
            str3 = speechModelRecord.checksum;
        }
        if ((i & 32) != 0) {
            speechModelPriority = speechModelRecord.priority;
        }
        String str4 = str3;
        SpeechModelPriority speechModelPriority2 = speechModelPriority;
        return speechModelRecord.copy(systemLocale, str, str2, l, str4, speechModelPriority2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(SpeechModelRecord self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.locale);
        output.encodeStringElement(serialDesc, 1, self.identifier);
        output.encodeStringElement(serialDesc, 2, self.modelPath);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.lastCheckedTime);
        output.encodeStringElement(serialDesc, 4, self.checksum);
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.priority);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SystemLocale getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getModelPath() {
        return this.modelPath;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getLastCheckedTime() {
        return this.lastCheckedTime;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final SpeechModelPriority getPriority() {
        return this.priority;
    }

    @NotNull
    public final SpeechModelRecord copy(@NotNull SystemLocale locale, @NotNull String identifier, @NotNull String modelPath, @Nullable Long lastCheckedTime, @NotNull String checksum, @NotNull SpeechModelPriority priority) {
        locale.getClass();
        identifier.getClass();
        modelPath.getClass();
        checksum.getClass();
        priority.getClass();
        return new SpeechModelRecord(locale, identifier, modelPath, lastCheckedTime, checksum, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechModelRecord)) {
            return false;
        }
        SpeechModelRecord speechModelRecord = (SpeechModelRecord) other;
        return this.locale == speechModelRecord.locale && Intrinsics.areEqual(this.identifier, speechModelRecord.identifier) && Intrinsics.areEqual(this.modelPath, speechModelRecord.modelPath) && Intrinsics.areEqual(this.lastCheckedTime, speechModelRecord.lastCheckedTime) && Intrinsics.areEqual(this.checksum, speechModelRecord.checksum) && this.priority == speechModelRecord.priority;
    }

    @NotNull
    public final String getChecksum() {
        return this.checksum;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final Long getLastCheckedTime() {
        return this.lastCheckedTime;
    }

    @NotNull
    public final SystemLocale getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getModelPath() {
        return this.modelPath;
    }

    @NotNull
    public final SpeechModelPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.locale.hashCode() * 31, 31, this.identifier), 31, this.modelPath);
        Long l = this.lastCheckedTime;
        return this.priority.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.checksum);
    }

    @NotNull
    public String toString() {
        return "SpeechModelRecord(locale=" + this.locale + ", identifier=" + this.identifier + ", modelPath=" + this.modelPath + ", lastCheckedTime=" + this.lastCheckedTime + ", checksum=" + this.checksum + ", priority=" + this.priority + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelRecord$Companion;", "", "<init>", "()V", "MILLIS_IN_BETWEEN_DOWNLOADS", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/SpeechModelRecord;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SpeechModelRecord> serializer() {
            return SpeechModelRecord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SpeechModelRecord(@NotNull SystemLocale systemLocale, @NotNull String str, @NotNull String str2, @Nullable Long l, @NotNull String str3, @NotNull SpeechModelPriority speechModelPriority) {
        systemLocale.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        speechModelPriority.getClass();
        this.locale = systemLocale;
        this.identifier = str;
        this.modelPath = str2;
        this.lastCheckedTime = l;
        this.checksum = str3;
        this.priority = speechModelPriority;
    }
}
