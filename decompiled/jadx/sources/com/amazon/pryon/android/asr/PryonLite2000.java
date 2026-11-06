package com.amazon.pryon.android.asr;

import com.amazon.alexa.assistant.foundation.logging.DefaultLogger;
import com.amazon.alexa.assistant.foundation.logging.LogLevel;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PryonLite2000 {
    private static final String TAG = "PryonLite2000";
    private static boolean libraryIsLoaded;
    private static Throwable libraryLoadFailure;
    private Callbacks callbacks;
    private Logger logger;
    private long nativeMem;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Attributes {
        public String engineVersion;
        public String fingerprintApiVersion;
        public int fingerprintListVersion;
        public int maxMetadataBlobSize;
        public int requiredMem;
        public int samplesPerFrame;
        public String wakewordApiVersion;
        public String wakewordConfigVersion;
        public List<String> wakewordKeywords;
        public String watermarkApiVersion;

        public Attributes(String str, int i, int i2, int i3, String str2, String str3, String str4, int i4, String str5, List<String> list) {
            this.engineVersion = str;
            this.maxMetadataBlobSize = i;
            this.requiredMem = i2;
            this.samplesPerFrame = i3;
            this.wakewordKeywords = list;
            this.wakewordApiVersion = str2;
            this.wakewordConfigVersion = str3;
            this.fingerprintApiVersion = str4;
            this.fingerprintListVersion = i4;
            this.watermarkApiVersion = str5;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callbacks {
        void errorEvent(int i);

        void vadStateChanged(int i, long j);

        void wakeWordDetected(String str, long j, long j2, byte[] bArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ClientProperty {
        AUDIO_PLAYBACK(0, 0),
        ALARM_STATE(0, 1),
        MEDIA_PLAYER_STATE(0, 2),
        EARCON_PLAYER_STATE(0, 3),
        TTS_PLAYER_STATE(0, 4),
        AUTOMOTIVE_MODE(3, 0);

        public final int groupId;
        public final int propertyId;

        ClientProperty(int i, int i2) {
            this.groupId = i;
            this.propertyId = i2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ClientPropertyState {
        public static final int AUTOMOTIVE_ACTIVE = 1;
        public static final int AUTOMOTIVE_INACTIVE = 0;
        public static final int AUTOMOTIVE_UNKNOWN = -1;
        public static final int COMMON_NOT_PLAYING = 0;
        public static final int COMMON_PLAYING = 1;
        public static final int COMMON_UNKNOWN = -1;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Config {
        public int detectThreshold;
        public byte[] fingerprintList;
        public boolean lowLatency;
        public boolean useVad;
        public int vadActivationTimeMs;
        public int vadDeactivationTimeMs;
        public boolean vadStrictStop;
        public byte[] wakewordModel;
        public byte[] watermarkConfig;
    }

    static {
        boolean z;
        try {
            System.loadLibrary("pryon-lite-jni");
            z = true;
        } catch (Throwable th) {
            libraryLoadFailure = th;
            z = false;
        }
        libraryIsLoaded = z;
    }

    public PryonLite2000(Callbacks callbacks, Logger logger) {
        this.callbacks = callbacks;
        this.logger = logger;
        this.nativeMem = 0L;
    }

    public static boolean isAvailable() {
        return libraryIsLoaded;
    }

    public static boolean libraryIsLoaded() {
        return libraryIsLoaded;
    }

    public static Throwable libraryLoadFailure() {
        return libraryLoadFailure;
    }

    private native int nativeDestroy(long j);

    private native Attributes nativeGetAttributes(Config config);

    private native int nativeGetSamplesPerFrame(long j);

    private native int nativeInitialize(long j, Config config);

    private native int nativePushAudio(long j, short[] sArr);

    private native int nativeSetClientProperty(long j, int i, int i2, int i3);

    private native int nativeWakewordEnableKeyword(long j, String str, int i);

    private native int nativeWakewordSetDetectionThreshold(long j, int i);

    public synchronized int destroy() {
        int nativeDestroy;
        try {
            Logger logger = this.logger;
            String str = TAG;
            logger.info(str, "Destroying PryonLite decoder...", null);
            nativeDestroy = nativeDestroy(this.nativeMem);
            if (nativeDestroy != 0) {
                this.logger.error(str, "destroy returned error = " + nativeDestroy, null);
            }
            this.logger.info(str, "PryonLite destroy() returning to caller.", null);
        } catch (Throwable th) {
            throw th;
        }
        return nativeDestroy;
    }

    public Attributes getAttributes(Config config) {
        Logger logger = this.logger;
        String str = TAG;
        logger.info(str, "Querying PryonLite attributes...", null);
        Attributes nativeGetAttributes = nativeGetAttributes(config);
        if (nativeGetAttributes == null) {
            this.logger.error(str, "getAttributes failed", null);
        }
        this.logger.info(str, "PryonLite getAttributes() returning to caller.", null);
        return nativeGetAttributes;
    }

    public synchronized int getSamplesPerFrame() {
        int nativeGetSamplesPerFrame;
        nativeGetSamplesPerFrame = nativeGetSamplesPerFrame(this.nativeMem);
        Logger logger = this.logger;
        String str = TAG;
        logger.info(str, "PryonLite getSamplesPerFrame returned " + nativeGetSamplesPerFrame, null);
        if (nativeGetSamplesPerFrame <= 0) {
            this.logger.error(str, "getSamplesPerFrame returned error = " + nativeGetSamplesPerFrame, null);
        }
        return nativeGetSamplesPerFrame;
    }

    public synchronized int initialize(Config config) {
        int nativeInitialize;
        try {
            Logger logger = this.logger;
            String str = TAG;
            logger.info(str, "Initializing PryonLite decoder...", null);
            nativeInitialize = nativeInitialize(this.nativeMem, config);
            if (nativeInitialize != 0) {
                this.logger.error(str, "initialize returned error = " + nativeInitialize, null);
            }
            this.logger.info(str, "PryonLite initialize() returning to caller.", null);
        } catch (Throwable th) {
            throw th;
        }
        return nativeInitialize;
    }

    public synchronized int isInitialized() {
        return this.nativeMem != 0 ? 1 : 0;
    }

    public void onErrorEvent(int i) {
        this.logger.error(TAG, "error event received, code = " + i, null);
        this.callbacks.errorEvent(i);
    }

    public void onVADStateChanged(int i, long j) {
        this.logger.info(TAG, "Forwarding VAD event to client...", null);
        this.callbacks.vadStateChanged(i, j);
    }

    public void onWakeWordDetected(String str, long j, long j2, byte[] bArr) {
        this.logger.info(TAG, "Forwarding wakeword detection event to client...", null);
        this.callbacks.wakeWordDetected(str, j, j2, bArr);
    }

    public synchronized int pushAudio(short[] sArr) {
        int nativePushAudio;
        nativePushAudio = nativePushAudio(this.nativeMem, sArr);
        if (nativePushAudio != 0) {
            this.logger.error(TAG, "pushAudio returned error = " + nativePushAudio, null);
        }
        return nativePushAudio;
    }

    public synchronized int setClientProperty(ClientProperty clientProperty, int i) {
        try {
            try {
                Logger logger = this.logger;
                String str = TAG;
                logger.info(str, "PryonLite setClientProperty invoked - group: " + clientProperty.groupId + " properties:" + clientProperty.propertyId + " state data:" + i, null);
                int nativeSetClientProperty = nativeSetClientProperty(this.nativeMem, clientProperty.groupId, clientProperty.propertyId, i);
                if (nativeSetClientProperty != 0) {
                    this.logger.error(str, "setClientProperty returned error = " + nativeSetClientProperty, null);
                }
                return nativeSetClientProperty;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized int wakewordEnableKeyword(String str, boolean z) {
        int nativeWakewordEnableKeyword;
        Logger logger = this.logger;
        String str2 = TAG;
        logger.info(str2, "PryonLite wakewordEnableKeyword invoked, wakeword = " + str + ", enable = " + z, null);
        nativeWakewordEnableKeyword = nativeWakewordEnableKeyword(this.nativeMem, str, z ? 1 : 0);
        if (nativeWakewordEnableKeyword != 0) {
            this.logger.error(str2, "wakewordEnableKeywordd returned error = " + nativeWakewordEnableKeyword, null);
        }
        return nativeWakewordEnableKeyword;
    }

    public synchronized int wakewordSetDetectionThreshold(int i) {
        int nativeWakewordSetDetectionThreshold;
        Logger logger = this.logger;
        String str = TAG;
        logger.info(str, "PryonLite wakewordSetDetectionThreshold invoked, threshold = " + i, null);
        nativeWakewordSetDetectionThreshold = nativeWakewordSetDetectionThreshold(this.nativeMem, i);
        if (nativeWakewordSetDetectionThreshold != 0) {
            this.logger.error(str, "wakewordSetDetectionThreshold returned error = " + nativeWakewordSetDetectionThreshold, null);
        }
        return nativeWakewordSetDetectionThreshold;
    }

    public PryonLite2000(Callbacks callbacks) {
        this(callbacks, new DefaultLogger(LogLevel.ERROR));
    }
}
