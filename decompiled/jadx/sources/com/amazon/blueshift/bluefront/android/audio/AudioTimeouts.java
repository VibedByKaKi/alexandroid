package com.amazon.blueshift.bluefront.android.audio;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AudioTimeouts {
    private static final int DEFAULT_MAX_SPEECH_TIMEOUT = 5000;
    private static final int DEFAULT_NO_SPEECH_TIMEOUT = 5000;
    private final int mMaxSpeechTimeout;
    private final int mNoSpeechTimeout;

    public AudioTimeouts(int i, int i2) {
        Preconditions.checkArgument(i > 0, "No input timeout must be greater than 0");
        Preconditions.checkArgument(i2 > 0, "Max speech timeout must be greater than 0");
        this.mNoSpeechTimeout = i;
        this.mMaxSpeechTimeout = i2;
    }

    public int getMaxSpeechTimeout() {
        return this.mMaxSpeechTimeout;
    }

    public int getNoSpeechTimeout() {
        return this.mNoSpeechTimeout;
    }

    public AudioTimeouts() {
        this(5000, 5000);
    }
}
