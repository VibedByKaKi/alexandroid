package com.amazon.alexa.client.alexaservice.vad.detector.silero;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.vad.configuration.VADConfiguration;
import com.amazon.alexa.client.alexaservice.vad.configuration.VADModelConfiguration;
import com.amazon.alexa.client.alexaservice.vad.detector.VADInitializationException;
import com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetector;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SileroVoiceActivityDetector implements VoiceActivityDetector {
    private static final int EXIT_HANGOVER_FRAMES = 4;
    public static final int PREROLL_DURATION_MS = 512;
    public static final float SPEECH_ENTER_THRESHOLD = 0.999f;
    private static final float SPEECH_EXIT_THRESHOLD = 0.4f;
    private static final String TAG = "SileroVADetector";
    private int belowExitCount;
    private final Context context;
    private boolean inSpeech;
    private final SileroVADModel model;
    private VADModelConfiguration modelConfiguration;
    private float speechEnterThreshold = 0.999f;
    private float speechFloor = 0.999f;

    @Inject
    public SileroVoiceActivityDetector(@NonNull Context context, @NonNull SileroVADModel sileroVADModel) {
        this.context = context.getApplicationContext();
        this.model = sileroVADModel;
    }

    private float applyHysteresis(float f) {
        if (this.inSpeech) {
            if (f <= 0.4f) {
                int i = this.belowExitCount + 1;
                this.belowExitCount = i;
                if (i >= 4) {
                    this.inSpeech = false;
                    this.belowExitCount = 0;
                }
            } else {
                this.belowExitCount = 0;
            }
        } else if (f >= this.speechEnterThreshold) {
            this.inSpeech = true;
            this.belowExitCount = 0;
        }
        return this.inSpeech ? Math.max(f, this.speechFloor) : f;
    }

    private void resetHysteresisState() {
        this.inSpeech = false;
        this.belowExitCount = 0;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetector
    @NonNull
    public VADModelConfiguration getModelConfiguration() {
        return this.modelConfiguration;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetector
    public void initialize(@NonNull VADConfiguration vADConfiguration) throws VADInitializationException {
        this.modelConfiguration = vADConfiguration.getModelConfiguration();
        float speechThreshold = vADConfiguration.getSpeechThreshold();
        this.speechEnterThreshold = speechThreshold;
        this.speechFloor = speechThreshold;
        this.model.initialize(this.context, this.modelConfiguration.getModelPath());
        resetStates();
        Log.i(TAG, "Initialized with model: " + this.modelConfiguration.getModelName() + " v" + this.modelConfiguration.getVersion());
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetector
    public float processAudio(@NonNull short[] sArr) {
        float[] fArr = new float[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            fArr[i] = sArr[i] / 32768.0f;
        }
        return applyHysteresis(this.model.process(fArr));
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetector
    public void release() {
        this.model.release();
        resetHysteresisState();
        Log.i(TAG, "Released");
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetector
    public void resetStates() {
        this.model.resetStates();
        resetHysteresisState();
    }
}
