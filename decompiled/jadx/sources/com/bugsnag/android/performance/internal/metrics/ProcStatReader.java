package com.bugsnag.android.performance.internal.metrics;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\r\u0010\u0016\u001a\u00020\t*\u00020\u0006H\u0082\bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\u00020\t*\u00020\n8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/ProcStatReader;", "", "path", "", "(Ljava/lang/String;)V", "buffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "intValue", "", "", "getIntValue", "(B)I", "parse", "", "target", "Lcom/bugsnag/android/performance/internal/metrics/ProcStatReader$Stat;", "parseLong", "", "skipUntil", "ch", "", "nextByte", "Companion", "Stat", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProcStatReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcStatReader.kt\ncom/bugsnag/android/performance/internal/metrics/ProcStatReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n109#1,5:163\n113#1:168\n109#1,5:169\n109#1,5:174\n113#1:179\n1#2:162\n*S KotlinDebug\n*F\n+ 1 ProcStatReader.kt\ncom/bugsnag/android/performance/internal/metrics/ProcStatReader\n*L\n29#1:163,5\n42#1:168\n50#1:169,5\n81#1:174,5\n109#1:179\n*E\n"})
/* loaded from: classes6.dex */
public final class ProcStatReader {
    public static final int BUFFER_SIZE = 256;
    public static final int BYTE_MASK = 255;
    public static final int FIELDS_TO_SKIP = 10;
    public static final int NINE_CODE = 57;
    public static final int ZERO_CODE = 48;
    private final ByteBuffer buffer;

    @NotNull
    private final String path;

    public ProcStatReader(@NotNull String str) {
        str.getClass();
        this.path = str;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256);
        allocateDirect.order(ByteOrder.BIG_ENDIAN);
        this.buffer = allocateDirect;
    }

    private final int getIntValue(byte b) {
        return b & 255;
    }

    private final int nextByte(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    private final long parseLong() {
        ByteBuffer byteBuffer = this.buffer;
        boolean z = (byteBuffer.get(byteBuffer.position()) & 255) == 45;
        if (z) {
            this.buffer.get();
        }
        long j = 0;
        while (this.buffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.buffer;
            byteBuffer2.getClass();
            int i = byteBuffer2.get() & 255;
            if (i == 32) {
                break;
            }
            if (48 <= i && i < 58) {
                j = (j * 10) + (i - 48);
            }
        }
        return z ? -j : j;
    }

    private final boolean skipUntil(char ch) {
        while (this.buffer.hasRemaining()) {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.getClass();
            if ((byteBuffer.get() & 255) == ch) {
                return true;
            }
        }
        return false;
    }

    public final boolean parse(@NotNull Stat target) {
        target.getClass();
        try {
            this.buffer.rewind();
            FileChannel channel = new FileInputStream(this.path).getChannel();
            try {
                channel.read(this.buffer);
                CloseableKt.closeFinally(channel, null);
                this.buffer.rewind();
                skipUntil(')');
                this.buffer.get();
                ByteBuffer byteBuffer = this.buffer;
                byteBuffer.getClass();
                target.setState((char) (byteBuffer.get() & 255));
                this.buffer.get();
                for (int i = 0; i < 10; i++) {
                    skipUntil(' ');
                }
                target.setUtime(parseLong());
                target.setStime(parseLong());
                target.setCutime(parseLong());
                target.setCstime(parseLong());
                target.setCounter((int) parseLong());
                target.setPriority((int) parseLong());
                target.setTimeout(parseLong());
                target.setItrealvalue(parseLong());
                target.setStarttime(parseLong());
                target.setVsize(parseLong());
                target.setRss(parseLong());
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Be\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\u0081\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u000bHÖ\u0001J\t\u0010F\u001a\u00020GHÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001a¨\u0006H"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/ProcStatReader$Stat;", "", "()V", "state", "", "utime", "", "stime", "cutime", "cstime", "counter", "", "priority", "timeout", "itrealvalue", "starttime", "vsize", "rss", "(CJJJJIIJJJJJ)V", "getCounter", "()I", "setCounter", "(I)V", "getCstime", "()J", "setCstime", "(J)V", "getCutime", "setCutime", "getItrealvalue", "setItrealvalue", "getPriority", "setPriority", "getRss", "setRss", "getStarttime", "setStarttime", "getState", "()C", "setState", "(C)V", "getStime", "setStime", "getTimeout", "setTimeout", "totalCpuTime", "", "getTotalCpuTime", "()D", "getUtime", "setUtime", "getVsize", "setVsize", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Stat {
        private int counter;
        private long cstime;
        private long cutime;
        private long itrealvalue;
        private int priority;
        private long rss;
        private long starttime;
        private char state;
        private long stime;
        private long timeout;
        private long utime;
        private long vsize;

        public Stat(char c, long j, long j2, long j3, long j4, int i, int i2, long j5, long j6, long j7, long j8, long j9) {
            this.state = c;
            this.utime = j;
            this.stime = j2;
            this.cutime = j3;
            this.cstime = j4;
            this.counter = i;
            this.priority = i2;
            this.timeout = j5;
            this.itrealvalue = j6;
            this.starttime = j7;
            this.vsize = j8;
            this.rss = j9;
        }

        public static /* synthetic */ Stat copy$default(Stat stat, char c, long j, long j2, long j3, long j4, int i, int i2, long j5, long j6, long j7, long j8, long j9, int i3, Object obj) {
            long j10;
            long j11;
            long j12;
            long j13;
            char c2 = (i3 & 1) != 0 ? stat.state : c;
            long j14 = (i3 & 2) != 0 ? stat.utime : j;
            long j15 = (i3 & 4) != 0 ? stat.stime : j2;
            long j16 = (i3 & 8) != 0 ? stat.cutime : j3;
            long j17 = (i3 & 16) != 0 ? stat.cstime : j4;
            int i4 = (i3 & 32) != 0 ? stat.counter : i;
            int i5 = (i3 & 64) != 0 ? stat.priority : i2;
            long j18 = (i3 & 128) != 0 ? stat.timeout : j5;
            char c3 = c2;
            if ((i3 & 256) != 0) {
                j10 = j14;
                j11 = stat.itrealvalue;
            } else {
                j10 = j14;
                j11 = j6;
            }
            long j19 = j11;
            long j20 = (i3 & 512) != 0 ? stat.starttime : j7;
            long j21 = (i3 & 1024) != 0 ? stat.vsize : j8;
            if ((i3 & 2048) != 0) {
                j13 = j21;
                j12 = stat.rss;
            } else {
                j12 = j9;
                j13 = j21;
            }
            return stat.copy(c3, j10, j15, j16, j17, i4, i5, j18, j19, j20, j13, j12);
        }

        /* renamed from: component1, reason: from getter */
        public final char getState() {
            return this.state;
        }

        /* renamed from: component10, reason: from getter */
        public final long getStarttime() {
            return this.starttime;
        }

        /* renamed from: component11, reason: from getter */
        public final long getVsize() {
            return this.vsize;
        }

        /* renamed from: component12, reason: from getter */
        public final long getRss() {
            return this.rss;
        }

        /* renamed from: component2, reason: from getter */
        public final long getUtime() {
            return this.utime;
        }

        /* renamed from: component3, reason: from getter */
        public final long getStime() {
            return this.stime;
        }

        /* renamed from: component4, reason: from getter */
        public final long getCutime() {
            return this.cutime;
        }

        /* renamed from: component5, reason: from getter */
        public final long getCstime() {
            return this.cstime;
        }

        /* renamed from: component6, reason: from getter */
        public final int getCounter() {
            return this.counter;
        }

        /* renamed from: component7, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        /* renamed from: component8, reason: from getter */
        public final long getTimeout() {
            return this.timeout;
        }

        /* renamed from: component9, reason: from getter */
        public final long getItrealvalue() {
            return this.itrealvalue;
        }

        @NotNull
        public final Stat copy(char state, long utime, long stime, long cutime, long cstime, int counter, int priority, long timeout, long itrealvalue, long starttime, long vsize, long rss) {
            return new Stat(state, utime, stime, cutime, cstime, counter, priority, timeout, itrealvalue, starttime, vsize, rss);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stat)) {
                return false;
            }
            Stat stat = (Stat) other;
            return this.state == stat.state && this.utime == stat.utime && this.stime == stat.stime && this.cutime == stat.cutime && this.cstime == stat.cstime && this.counter == stat.counter && this.priority == stat.priority && this.timeout == stat.timeout && this.itrealvalue == stat.itrealvalue && this.starttime == stat.starttime && this.vsize == stat.vsize && this.rss == stat.rss;
        }

        public final int getCounter() {
            return this.counter;
        }

        public final long getCstime() {
            return this.cstime;
        }

        public final long getCutime() {
            return this.cutime;
        }

        public final long getItrealvalue() {
            return this.itrealvalue;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final long getRss() {
            return this.rss;
        }

        public final long getStarttime() {
            return this.starttime;
        }

        public final char getState() {
            return this.state;
        }

        public final long getStime() {
            return this.stime;
        }

        public final long getTimeout() {
            return this.timeout;
        }

        public final double getTotalCpuTime() {
            return this.utime + this.stime + this.cutime + this.cstime;
        }

        public final long getUtime() {
            return this.utime;
        }

        public final long getVsize() {
            return this.vsize;
        }

        public int hashCode() {
            return Long.hashCode(this.rss) + BitVector$$ExternalSyntheticOutline0.m(this.vsize, BitVector$$ExternalSyntheticOutline0.m(this.starttime, BitVector$$ExternalSyntheticOutline0.m(this.itrealvalue, BitVector$$ExternalSyntheticOutline0.m(this.timeout, ArcMode$$ExternalSyntheticOutline0.m(this.priority, ArcMode$$ExternalSyntheticOutline0.m(this.counter, BitVector$$ExternalSyntheticOutline0.m(this.cstime, BitVector$$ExternalSyntheticOutline0.m(this.cutime, BitVector$$ExternalSyntheticOutline0.m(this.stime, BitVector$$ExternalSyntheticOutline0.m(this.utime, Character.hashCode(this.state) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final void setCounter(int i) {
            this.counter = i;
        }

        public final void setCstime(long j) {
            this.cstime = j;
        }

        public final void setCutime(long j) {
            this.cutime = j;
        }

        public final void setItrealvalue(long j) {
            this.itrealvalue = j;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }

        public final void setRss(long j) {
            this.rss = j;
        }

        public final void setStarttime(long j) {
            this.starttime = j;
        }

        public final void setState(char c) {
            this.state = c;
        }

        public final void setStime(long j) {
            this.stime = j;
        }

        public final void setTimeout(long j) {
            this.timeout = j;
        }

        public final void setUtime(long j) {
            this.utime = j;
        }

        public final void setVsize(long j) {
            this.vsize = j;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Stat(state=");
            sb.append(this.state);
            sb.append(", utime=");
            sb.append(this.utime);
            sb.append(", stime=");
            sb.append(this.stime);
            sb.append(", cutime=");
            sb.append(this.cutime);
            sb.append(", cstime=");
            sb.append(this.cstime);
            sb.append(", counter=");
            sb.append(this.counter);
            sb.append(", priority=");
            sb.append(this.priority);
            sb.append(", timeout=");
            sb.append(this.timeout);
            sb.append(", itrealvalue=");
            sb.append(this.itrealvalue);
            sb.append(", starttime=");
            sb.append(this.starttime);
            sb.append(", vsize=");
            sb.append(this.vsize);
            sb.append(", rss=");
            return DoubleList$$ExternalSyntheticOutline0.m(sb, this.rss, ')');
        }

        public Stat() {
            this(' ', 0L, 0L, 0L, 0L, 0, 0, 0L, 0L, 0L, 0L, 0L);
        }
    }
}
