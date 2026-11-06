package com.amazon.alexa.assistant.foundation.audio;

import android.os.SystemClock;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00032\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayerListener;", "", "onReady", "", "elapsedRealtimeMs", "", "onPlaying", "onPaused", "onStopped", "onFinished", "onBuffering", "onError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onPositionChanged", "positionMs", "durationMs", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioPlayerListener {
    void onBuffering(long elapsedRealtimeMs);

    void onError(@NotNull Exception error, long elapsedRealtimeMs);

    void onFinished(long elapsedRealtimeMs);

    void onPaused(long elapsedRealtimeMs);

    void onPlaying(long elapsedRealtimeMs);

    void onPositionChanged(long positionMs, long durationMs, long elapsedRealtimeMs);

    void onReady(long elapsedRealtimeMs);

    void onStopped(long elapsedRealtimeMs);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onBuffering$default(AudioPlayerListener audioPlayerListener, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onBuffering");
                return;
            }
            if ((i & 1) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onBuffering(j);
        }

        public static /* synthetic */ void onError$default(AudioPlayerListener audioPlayerListener, Exception exc, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onError");
                return;
            }
            if ((i & 2) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onError(exc, j);
        }

        public static /* synthetic */ void onFinished$default(AudioPlayerListener audioPlayerListener, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onFinished");
                return;
            }
            if ((i & 1) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onFinished(j);
        }

        public static /* synthetic */ void onPaused$default(AudioPlayerListener audioPlayerListener, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onPaused");
                return;
            }
            if ((i & 1) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onPaused(j);
        }

        public static /* synthetic */ void onPlaying$default(AudioPlayerListener audioPlayerListener, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onPlaying");
                return;
            }
            if ((i & 1) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onPlaying(j);
        }

        public static /* synthetic */ void onPositionChanged$default(AudioPlayerListener audioPlayerListener, long j, long j2, long j3, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onPositionChanged");
                return;
            }
            if ((i & 4) != 0) {
                j3 = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onPositionChanged(j, j2, j3);
        }

        public static /* synthetic */ void onReady$default(AudioPlayerListener audioPlayerListener, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onReady");
                return;
            }
            if ((i & 1) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onReady(j);
        }

        public static /* synthetic */ void onStopped$default(AudioPlayerListener audioPlayerListener, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onStopped");
                return;
            }
            if ((i & 1) != 0) {
                j = SystemClock.elapsedRealtime();
            }
            audioPlayerListener.onStopped(j);
        }

        public static void onBuffering(@NotNull AudioPlayerListener audioPlayerListener, long j) {
        }

        public static void onPositionChanged(@NotNull AudioPlayerListener audioPlayerListener, long j, long j2, long j3) {
        }
    }
}
