package com.amazon.alexa.alertsca;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.Log;
import com.amazon.alexa.alertsca.metrics.MetricsConstants;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AudioFocusManager implements AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = "AudioFocusManager";
    private AlertInteraction alertInteraction;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private volatile boolean hasFocus;
    private final MetricsService metricsService;

    @Inject
    public AudioFocusManager(AudioManager audioManager, MetricsService metricsService) {
        this.audioManager = audioManager;
        this.metricsService = metricsService;
    }

    private int requestFocusFromSystem() {
        AudioFocusRequest build = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this).build();
        this.audioFocusRequest = build;
        return this.audioManager.requestAudioFocus(build);
    }

    public synchronized void abandonRequest() {
        try {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            this.hasFocus = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean hasFocus() {
        return this.hasFocus;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public synchronized void onAudioFocusChange(int i) {
        try {
            if (i == -3) {
                this.hasFocus = false;
                this.alertInteraction.lostFocus();
            } else if (i == -2) {
                this.hasFocus = false;
                this.alertInteraction.lostFocus();
            } else if (i == -1) {
                this.hasFocus = false;
                this.alertInteraction.lostFocus();
            } else if (i == 1) {
                this.hasFocus = true;
                this.alertInteraction.gainedFocus();
            } else if (i == 2) {
                this.hasFocus = true;
                this.alertInteraction.gainedFocus();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean requestFocus(AlertInteraction alertInteraction) {
        this.alertInteraction = alertInteraction;
        if (!this.hasFocus) {
            try {
                int requestFocusFromSystem = requestFocusFromSystem();
                boolean z = true;
                if (requestFocusFromSystem != 1) {
                    z = false;
                }
                this.hasFocus = z;
                if (!this.hasFocus) {
                    Log.e(TAG, "failed to request focus because focusValue is " + requestFocusFromSystem);
                    this.metricsService.recordEvent(MetricsConstants.ALERTS.AUDIO_FOCUS.REQUEST_FOCUS_NOT_GRANTED.failure());
                }
            } catch (Exception e) {
                Log.e(TAG, "failed to request focus because of an error", e);
                this.metricsService.recordEvent(MetricsConstants.ALERTS.AUDIO_FOCUS.REQUEST_FOCUS_FAILED.failure());
            }
        }
        return this.hasFocus;
    }
}
