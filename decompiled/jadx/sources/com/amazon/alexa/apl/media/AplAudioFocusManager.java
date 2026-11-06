package com.amazon.alexa.apl.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/apl/media/AplAudioFocusManager;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "context", "Landroid/content/Context;", "audioFocusListener", "Lcom/amazon/alexa/apl/media/AudioFocusListener;", "(Landroid/content/Context;Lcom/amazon/alexa/apl/media/AudioFocusListener;)V", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "getAudioFocusRequest", "()Landroid/media/AudioFocusRequest;", "setAudioFocusRequest", "(Landroid/media/AudioFocusRequest;)V", "audioManager", "Landroid/media/AudioManager;", "hasFocus", "", "abandonRequest", "", "checkIfBuildVersionIsAboveThreshold", "onAudioFocusChange", "focusChange", "", "requestFocus", "requestFocusFromSystem", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplAudioFocusManager implements AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = "AplAudioFocusManager";

    @NotNull
    private AudioFocusListener audioFocusListener;
    public AudioFocusRequest audioFocusRequest;

    @NotNull
    private AudioManager audioManager;
    private volatile boolean hasFocus;

    public AplAudioFocusManager(@NotNull Context context, @NotNull AudioFocusListener audioFocusListener) {
        context.getClass();
        audioFocusListener.getClass();
        Object systemService = context.getApplicationContext().getSystemService("audio");
        systemService.getClass();
        this.audioManager = (AudioManager) systemService;
        this.audioFocusListener = audioFocusListener;
    }

    public final synchronized void abandonRequest() {
        try {
            if (!checkIfBuildVersionIsAboveThreshold()) {
                this.audioManager.abandonAudioFocus(this);
            } else if (this.audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(getAudioFocusRequest());
            }
            this.hasFocus = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public final boolean checkIfBuildVersionIsAboveThreshold() {
        return true;
    }

    @NotNull
    public final AudioFocusRequest getAudioFocusRequest() {
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioFocusRequest");
        return null;
    }

    /* renamed from: hasFocus, reason: from getter */
    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public synchronized void onAudioFocusChange(int focusChange) {
        try {
            if (focusChange == -3) {
                this.hasFocus = false;
                this.audioFocusListener.lostFocus();
            } else if (focusChange == -2) {
                this.hasFocus = false;
                this.audioFocusListener.lostFocus();
            } else if (focusChange == -1) {
                this.hasFocus = false;
                this.audioFocusListener.lostFocus();
            } else if (focusChange == 1) {
                this.hasFocus = true;
                this.audioFocusListener.gainedFocus();
            } else if (focusChange == 2) {
                this.hasFocus = true;
                this.audioFocusListener.gainedFocus();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean requestFocus() {
        try {
            if (!this.hasFocus) {
                boolean z = true;
                if (requestFocusFromSystem() != 1) {
                    z = false;
                }
                this.hasFocus = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hasFocus;
    }

    public final int requestFocusFromSystem() {
        if (!checkIfBuildVersionIsAboveThreshold()) {
            return this.audioManager.requestAudioFocus(this, 3, 4);
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this).build();
        build.getClass();
        setAudioFocusRequest(build);
        return this.audioManager.requestAudioFocus(getAudioFocusRequest());
    }

    public final void setAudioFocusRequest(@NotNull AudioFocusRequest audioFocusRequest) {
        audioFocusRequest.getClass();
        this.audioFocusRequest = audioFocusRequest;
    }
}
