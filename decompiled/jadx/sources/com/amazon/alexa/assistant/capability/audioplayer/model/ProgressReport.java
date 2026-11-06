package com.amazon.alexa.assistant.capability.audioplayer.model;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006$"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/model/ProgressReport;", "", "progressReportDelayInMilliseconds", "", "progressReportIntervalInMilliseconds", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getProgressReportDelayInMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProgressReportIntervalInMilliseconds", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/amazon/alexa/assistant/capability/audioplayer/model/ProgressReport;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$voice_release", "$serializer", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class ProgressReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long progressReportDelayInMilliseconds;

    @Nullable
    private final Long progressReportIntervalInMilliseconds;

    public /* synthetic */ ProgressReport(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.progressReportDelayInMilliseconds = null;
        } else {
            this.progressReportDelayInMilliseconds = l;
        }
        if ((i & 2) == 0) {
            this.progressReportIntervalInMilliseconds = null;
        } else {
            this.progressReportIntervalInMilliseconds = l2;
        }
    }

    public static /* synthetic */ ProgressReport copy$default(ProgressReport progressReport, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = progressReport.progressReportDelayInMilliseconds;
        }
        if ((i & 2) != 0) {
            l2 = progressReport.progressReportIntervalInMilliseconds;
        }
        return progressReport.copy(l, l2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$voice_release(ProgressReport self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.progressReportDelayInMilliseconds != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.progressReportDelayInMilliseconds);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.progressReportIntervalInMilliseconds == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.progressReportIntervalInMilliseconds);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Long getProgressReportDelayInMilliseconds() {
        return this.progressReportDelayInMilliseconds;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getProgressReportIntervalInMilliseconds() {
        return this.progressReportIntervalInMilliseconds;
    }

    @NotNull
    public final ProgressReport copy(@Nullable Long progressReportDelayInMilliseconds, @Nullable Long progressReportIntervalInMilliseconds) {
        return new ProgressReport(progressReportDelayInMilliseconds, progressReportIntervalInMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressReport)) {
            return false;
        }
        ProgressReport progressReport = (ProgressReport) other;
        return Intrinsics.areEqual(this.progressReportDelayInMilliseconds, progressReport.progressReportDelayInMilliseconds) && Intrinsics.areEqual(this.progressReportIntervalInMilliseconds, progressReport.progressReportIntervalInMilliseconds);
    }

    @Nullable
    public final Long getProgressReportDelayInMilliseconds() {
        return this.progressReportDelayInMilliseconds;
    }

    @Nullable
    public final Long getProgressReportIntervalInMilliseconds() {
        return this.progressReportIntervalInMilliseconds;
    }

    public int hashCode() {
        Long l = this.progressReportDelayInMilliseconds;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.progressReportIntervalInMilliseconds;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProgressReport(progressReportDelayInMilliseconds=" + this.progressReportDelayInMilliseconds + ", progressReportIntervalInMilliseconds=" + this.progressReportIntervalInMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/model/ProgressReport$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/audioplayer/model/ProgressReport;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ProgressReport> serializer() {
            return ProgressReport$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProgressReport() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProgressReport(@Nullable Long l, @Nullable Long l2) {
        this.progressReportDelayInMilliseconds = l;
        this.progressReportIntervalInMilliseconds = l2;
    }

    public /* synthetic */ ProgressReport(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
