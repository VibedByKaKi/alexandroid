package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*  JADX ERROR: Class process error: OutOfMemoryError
    java.lang.OutOfMemoryError: Java heap space
    	at java.base/jdk.internal.misc.Unsafe.allocateUninitializedArray(Unsafe.java:1380)
    	at java.base/java.lang.StringConcatHelper.newArray(StringConcatHelper.java:511)
    	at java.base/java.lang.StringLatin1.replace(StringLatin1.java:304)
    	at java.base/java.lang.String.replace(String.java:2933)
    	at jadx.core.utils.Utils.cleanObjectName(Utils.java:41)
    	at jadx.core.dex.instructions.args.ArgType.object(ArgType.java:86)
    	at jadx.core.dex.info.ClassInfo.fromName(ClassInfo.java:42)
    	at jadx.core.dex.info.FieldInfo.fromRef(FieldInfo.java:31)
    	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:377)
    	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:51)
    	at jadx.core.dex.instructions.InsnDecoder$$Lambda/0x00007de044226af8.accept(Unknown Source)
    	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:86)
    	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
    	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
    	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
    	at jadx.core.ProcessClass.process(ProcessClass.java:69)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
    */
/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:93)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:84)
    */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private Clock clock;
    private int firstFrameState;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private boolean joiningRenderNextFrameImmediately;
    private long lastPresentationTimeUs;
    private long lastReleaseRealtimeUs;
    private float playbackSpeed;
    private boolean started;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface FrameReleaseAction {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FrameReleaseInfo {
        private long earlyUs = -9223372036854775807L;
        private long releaseTimeNs = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = -9223372036854775807L;
            this.releaseTimeNs = -9223372036854775807L;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j, long j2, boolean z);

        boolean shouldForceReleaseFrame(long j, long j2);

        boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) throws ExoPlaybackException;
    }

    /*  JADX ERROR: NullPointerException in pass: AttachMethodDetails
        java.lang.NullPointerException: Cannot read the array length because "<local2>" is null
        	at jadx.core.dex.visitors.AttachMethodDetails.visit(AttachMethodDetails.java:34)
        */
    /* JADX WARN: Error attach source line
    java.lang.NullPointerException: Cannot load from object array because "insnArr" is null
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachSourceLines(DebugInfoAttachVisitor.java:62)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:40)
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.NullPointerException: Cannot read the array length because "<local3>" is null
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.setMethodSourceLine(DebugInfoAttachVisitor.java:189)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:53)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:40)
     */
    public VideoFrameReleaseControl(android.content.Context r1, androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator r2, long r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.frameTimingEvaluator = r2
            r0.allowedJoiningTimeMs = r3
            androidx.media3.exoplayer.video.VideoFrameReleaseHelper r2 = new androidx.media3.exoplayer.video.VideoFrameReleaseHelper
            r2.<init>(r1)
            r0.frameReleaseHelper = r2
            r1 = 0
            r0.firstFrameState = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.initialPositionUs = r1
            r0.lastPresentationTimeUs = r1
            r0.joiningDeadlineMs = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.playbackSpeed = r1
            androidx.media3.common.util.Clock r1 = androidx.media3.common.util.Clock.DEFAULT
            r0.clock = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.VideoFrameReleaseControl.<init>(android.content.Context, androidx.media3.exoplayer.video.VideoFrameReleaseControl$FrameTimingEvaluator, long):void");
    }

    private long calculateEarlyTimeUs(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / this.playbackSpeed);
        return this.started ? j4 - (Util.msToUs(this.clock.elapsedRealtime()) - j2) : j4;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    private boolean shouldForceRelease(long j, long j2, long j3) {
        if (this.joiningDeadlineMs != -9223372036854775807L && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i = this.firstFrameState;
        if (i == 0) {
            return this.started;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i == 3) {
            return this.started && this.frameTimingEvaluator.shouldForceReleaseFrame(j2, Util.msToUs(this.clock.elapsedRealtime()) - this.lastReleaseRealtimeUs);
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return false;
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public int getFrameReleaseAction(long j, long j2, long j3, long j4, boolean z, FrameReleaseInfo frameReleaseInfo) throws ExoPlaybackException {
        frameReleaseInfo.reset();
        if (this.initialPositionUs == -9223372036854775807L) {
            this.initialPositionUs = j2;
        }
        if (this.lastPresentationTimeUs != j) {
            this.frameReleaseHelper.onNextFrame(j);
            this.lastPresentationTimeUs = j;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j2, j3, j);
        if (shouldForceRelease(j2, frameReleaseInfo.earlyUs, j4)) {
            return 0;
        }
        if (!this.started || j2 == this.initialPositionUs) {
            return 5;
        }
        long nanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + nanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - nanoTime) / 1000;
        boolean z2 = (this.joiningDeadlineMs == -9223372036854775807L || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j2, j3, z, z2)) {
            return 4;
        }
        return this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j3, z) ? z2 ? 3 : 2 : frameReleaseInfo.earlyUs > MAX_EARLY_US_THRESHOLD ? 5 : 1;
    }

    public boolean isReady(boolean z) {
        if (z && this.firstFrameState == 3) {
            this.joiningDeadlineMs = -9223372036854775807L;
            return true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = -9223372036854775807L;
        return false;
    }

    public void join(boolean z) {
        this.joiningRenderNextFrameImmediately = z;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : -9223372036854775807L;
    }

    public void onDisabled() {
        lowerFirstFrameState(0);
    }

    public void onEnabled(boolean z) {
        this.firstFrameState = z ? 1 : 0;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return z;
    }

    public void onProcessedStreamChange() {
        lowerFirstFrameState(2);
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = -9223372036854775807L;
        this.frameReleaseHelper.onStopped();
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = -9223372036854775807L;
        this.initialPositionUs = -9223372036854775807L;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = -9223372036854775807L;
    }

    public void setChangeFrameRateStrategy(int i) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setFrameRate(float f) {
        this.frameReleaseHelper.onFormatChanged(f);
    }

    public void setOutputSurface(@Nullable Surface surface) {
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        Assertions.checkArgument(f > 0.0f);
        if (f == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f;
        this.frameReleaseHelper.onPlaybackSpeed(f);
    }
}
