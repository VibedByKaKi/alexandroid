package com.amazon.alexa.client.alexaservice.vad.audio.mode;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.metrics.core.DefaultMetricsTimer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AudioModeController {
    private static final String COMPONENT_NAME = "vox_conversation";
    private static final String METADATA_EXCEPTION = "exception";
    private static final String METADATA_PRE_START_MODE = "preStartMode";
    private static final String METADATA_REASON = "reason";
    private static final String METADATA_RESTORED_MODE = "restoredMode";

    @VisibleForTesting
    static final String METRIC_RESTORE_FAILURE = "VAD_COMMUNICATION_MODE_RESTORE_FAILURE";

    @VisibleForTesting
    static final String METRIC_RESTORE_SUCCESS = "VAD_COMMUNICATION_MODE_RESTORE_SUCCESS";

    @VisibleForTesting
    static final String METRIC_SESSION_DURATION = "VAD_COMMUNICATION_MODE_SESSION_DURATION";

    @VisibleForTesting
    static final String METRIC_SET_FAILURE = "VAD_COMMUNICATION_MODE_SET_FAILURE";

    @VisibleForTesting
    static final String METRIC_SET_SUCCESS = "VAD_COMMUNICATION_MODE_SET_SUCCESS";
    private static final String TAG = "AudioModeController";
    private boolean didSet;
    private volatile Thread expectedThread;
    private final MetricsService metricsService;
    private int preStartMode;
    private final AudioModeProvider provider;
    private long sessionStartNanos;

    @Inject
    public AudioModeController(@NonNull AudioModeProvider audioModeProvider, @NonNull MetricsService metricsService) {
        this.provider = audioModeProvider;
        this.metricsService = metricsService;
    }

    private void checkThread() {
        Thread currentThread = Thread.currentThread();
        if (this.expectedThread == null) {
            this.expectedThread = currentThread;
            return;
        }
        if (this.expectedThread != currentThread) {
            Log.w(TAG, "AudioModeController called from unexpected thread: " + currentThread.getName() + " (expected: " + this.expectedThread.getName() + MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private void emitSetFailure(String str) {
        this.metricsService.recordOccurrence(METRIC_SET_FAILURE, "vox_conversation", true, AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("reason", str));
    }

    private static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? a$$ExternalSyntheticOutline0.m(i, "UNKNOWN(", MarkdownConstants.RIGHT_PARENTHESIS) : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    @VisibleForTesting
    public int getPreStartMode() {
        return this.preStartMode;
    }

    public boolean isDidSet() {
        return this.didSet;
    }

    public void restore() {
        checkThread();
        if (this.didSet) {
            modeToString(this.preStartMode);
            long nanoTime = System.nanoTime() - this.sessionStartNanos;
            try {
                try {
                    this.provider.setMode(this.preStartMode);
                    modeToString(this.provider.getMode());
                    HashMap hashMap = new HashMap();
                    hashMap.put(METADATA_RESTORED_MODE, Integer.valueOf(this.preStartMode));
                    this.metricsService.recordOccurrence(METRIC_RESTORE_SUCCESS, "vox_conversation", true, hashMap);
                    Log.i(TAG, "Audio mode restored to " + modeToString(this.preStartMode));
                } catch (Exception e) {
                    Log.e(TAG, "Failed to restore audio mode to " + this.preStartMode, e);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("exception", e.getClass().getSimpleName());
                    this.metricsService.recordOccurrence(METRIC_RESTORE_FAILURE, "vox_conversation", true, hashMap2);
                }
                this.metricsService.recordTimer(new DefaultMetricsTimer(METRIC_SESSION_DURATION, "vox_conversation", null, nanoTime / 1000000, false));
            } finally {
                this.didSet = false;
            }
        }
    }

    public void save() {
        checkThread();
        this.preStartMode = 0;
        this.didSet = false;
        this.sessionStartNanos = 0L;
        try {
            int mode = this.provider.getMode();
            this.preStartMode = mode;
            modeToString(mode);
        } catch (Exception e) {
            Log.e(TAG, "Failed to read current audio mode during save", e);
            emitSetFailure("save failed");
        }
    }

    public void set() {
        checkThread();
        if (this.didSet) {
            Log.w(TAG, "set() called but didSet is already true; short-circuiting");
            return;
        }
        try {
            this.provider.setMode(3);
            int mode = this.provider.getMode();
            modeToString(mode);
            if (mode != 3) {
                Log.w(TAG, "Verification failed: expected MODE_IN_COMMUNICATION (3) but got " + mode + " (" + modeToString(mode) + MarkdownConstants.RIGHT_PARENTHESIS);
                emitSetFailure("verification failed");
                return;
            }
            this.didSet = true;
            this.sessionStartNanos = System.nanoTime();
            HashMap hashMap = new HashMap();
            hashMap.put(METADATA_PRE_START_MODE, Integer.valueOf(this.preStartMode));
            this.metricsService.recordOccurrence(METRIC_SET_SUCCESS, "vox_conversation", true, hashMap);
            Log.i(TAG, "Audio mode set to MODE_IN_COMMUNICATION (preStartMode=" + this.preStartMode + MarkdownConstants.RIGHT_PARENTHESIS);
        } catch (Exception e) {
            Log.e(TAG, "Failed to set audio mode to MODE_IN_COMMUNICATION", e);
            emitSetFailure(e.getClass().getSimpleName());
        }
    }
}
