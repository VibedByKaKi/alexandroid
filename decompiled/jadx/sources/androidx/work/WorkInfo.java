package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.media3.exoplayer.RendererCapabilities;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u0003123B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0002\u0010\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010/\u001a\u00020\rH\u0016J\b\u00100\u001a\u00020\bH\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\f\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0016\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Landroidx/work/WorkInfo;", "", "id", "Ljava/util/UUID;", "state", "Landroidx/work/WorkInfo$State;", "tags", "", "", "outputData", "Landroidx/work/Data;", "progress", "runAttemptCount", "", "generation", "constraints", "Landroidx/work/Constraints;", "initialDelayMillis", "", "periodicityInfo", "Landroidx/work/WorkInfo$PeriodicityInfo;", "nextScheduleTimeMillis", "stopReason", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "getConstraints", "()Landroidx/work/Constraints;", "getGeneration", "()I", "getId", "()Ljava/util/UUID;", "getInitialDelayMillis", "()J", "getNextScheduleTimeMillis", "getOutputData", "()Landroidx/work/Data;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "getProgress", "getRunAttemptCount", "getState", "()Landroidx/work/WorkInfo$State;", "getStopReason", "getTags", "()Ljava/util/Set;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Companion", "PeriodicityInfo", "State", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WorkInfo {
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;

    @NotNull
    private final Constraints constraints;
    private final int generation;

    @NotNull
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;

    @NotNull
    private final Data outputData;

    @Nullable
    private final PeriodicityInfo periodicityInfo;

    @NotNull
    private final Data progress;
    private final int runAttemptCount;

    @NotNull
    private final State state;
    private final int stopReason;

    @NotNull
    private final Set<String> tags;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "repeatIntervalMillis", "", "flexIntervalMillis", "(JJ)V", "getFlexIntervalMillis", "()J", "getRepeatIntervalMillis", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j, long j2) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && Intrinsics.areEqual(PeriodicityInfo.class, other.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) other;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public int hashCode() {
            return Long.hashCode(this.flexIntervalMillis) + (Long.hashCode(this.repeatIntervalMillis) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.repeatIntervalMillis);
            sb.append(", flexIntervalMillis=");
            return DoubleList$$ExternalSyntheticOutline0.m(sb, this.flexIntervalMillis, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "(Ljava/lang/String;I)V", "isFinished", "", "()Z", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WorkInfo(java.util.UUID r18, androidx.work.WorkInfo.State r19, java.util.Set r20, androidx.work.Data r21, androidx.work.Data r22, int r23, int r24, androidx.work.Constraints r25, long r26, androidx.work.WorkInfo.PeriodicityInfo r28, long r29, int r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 8
            if (r1 == 0) goto Ld
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r1.getClass()
            r6 = r1
            goto Lf
        Ld:
            r6 = r21
        Lf:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r1.getClass()
            r7 = r1
            goto L1c
        L1a:
            r7 = r22
        L1c:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L23
            r8 = r2
            goto L25
        L23:
            r8 = r23
        L25:
            r1 = r0 & 64
            if (r1 == 0) goto L2b
            r9 = r2
            goto L2d
        L2b:
            r9 = r24
        L2d:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L35
            androidx.work.Constraints r1 = androidx.work.Constraints.NONE
            r10 = r1
            goto L37
        L35:
            r10 = r25
        L37:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3f
            r1 = 0
            r11 = r1
            goto L41
        L3f:
            r11 = r26
        L41:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L48
            r1 = 0
            r13 = r1
            goto L4a
        L48:
            r13 = r28
        L4a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L55
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = r1
            goto L57
        L55:
            r14 = r29
        L57:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L68
            r0 = -256(0xffffffffffffff00, float:NaN)
            r16 = r0
        L5f:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            goto L6b
        L68:
            r16 = r31
            goto L5f
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.<init>(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(WorkInfo.class, other.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) other;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && Intrinsics.areEqual(this.id, workInfo.id) && this.state == workInfo.state && Intrinsics.areEqual(this.outputData, workInfo.outputData) && Intrinsics.areEqual(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && Intrinsics.areEqual(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && Intrinsics.areEqual(this.tags, workInfo.tags)) {
            return Intrinsics.areEqual(this.progress, workInfo.progress);
        }
        return false;
    }

    @NotNull
    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    @NotNull
    public final Data getOutputData() {
        return this.outputData;
    }

    @Nullable
    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    @NotNull
    public final Data getProgress() {
        return this.progress;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.stopReason;
    }

    @NotNull
    public final Set<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.initialDelayMillis, (this.constraints.hashCode() + ((((((this.progress.hashCode() + ((this.tags.hashCode() + ((this.outputData.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.runAttemptCount) * 31) + this.generation) * 31)) * 31, 31);
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return Integer.hashCode(this.stopReason) + BitVector$$ExternalSyntheticOutline0.m(this.nextScheduleTimeMillis, (m + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data) {
        this(uuid, state, set, data, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2) {
        this(uuid, state, set, data, data2, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i) {
        this(uuid, state, set, data, data2, i, 0, null, 0L, null, 0L, 0, 4032, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2) {
        this(uuid, state, set, data, data2, i, i2, null, 0L, null, 0L, 0, Utf8.MASK_2BYTES, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2, @NotNull Constraints constraints) {
        this(uuid, state, set, data, data2, i, i2, constraints, 0L, null, 0L, 0, 3840, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2, @NotNull Constraints constraints, long j) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, null, 0L, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2, @NotNull Constraints constraints, long j, @Nullable PeriodicityInfo periodicityInfo) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, periodicityInfo, 0L, 0, 3072, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2, @NotNull Constraints constraints, long j, @Nullable PeriodicityInfo periodicityInfo, long j2) {
        this(uuid, state, set, data, data2, i, i2, constraints, j, periodicityInfo, j2, 0, 2048, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set, @NotNull Data data, @NotNull Data data2, int i, int i2, @NotNull Constraints constraints, long j, @Nullable PeriodicityInfo periodicityInfo, long j2, int i3) {
        uuid.getClass();
        state.getClass();
        set.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
        this.id = uuid;
        this.state = state;
        this.tags = set;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i;
        this.generation = i2;
        this.constraints = constraints;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j2;
        this.stopReason = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID uuid, @NotNull State state, @NotNull Set<String> set) {
        this(uuid, state, set, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        uuid.getClass();
        state.getClass();
        set.getClass();
    }
}
