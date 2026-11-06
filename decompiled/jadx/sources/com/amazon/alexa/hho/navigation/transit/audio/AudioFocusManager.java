package com.amazon.alexa.hho.navigation.transit.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/audio/AudioFocusManager;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "audioManager", "Landroid/media/AudioManager;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/hho/navigation/transit/audio/AudioFocusManager$AudioFocusListener;", "hasFocus", "", "requestFocus", "abandonFocus", "", "onAudioFocusChange", "focusChange", "", "requestFocusFromSystem", "Companion", "AudioFocusListener", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AudioFocusManager implements AudioManager.OnAudioFocusChangeListener {

    @NotNull
    private static final String TAG = "NavCA_AudioFocusManager";

    @Nullable
    private AudioFocusRequest audioFocusRequest;

    @NotNull
    private final AudioManager audioManager;

    @NotNull
    private final Context context;
    private volatile boolean hasFocus;

    @Nullable
    private AudioFocusListener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/audio/AudioFocusManager$AudioFocusListener;", "", "onAudioFocusGained", "", "onAudioFocusLost", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AudioFocusListener {
        void onAudioFocusGained();

        void onAudioFocusLost();
    }

    @Inject
    public AudioFocusManager(@NotNull Context context) {
        context.getClass();
        this.context = context;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.audioManager = (AudioManager) systemService;
    }

    public final synchronized void abandonFocus() {
        try {
            try {
                AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
                if (audioFocusRequest != null) {
                    this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                this.hasFocus = false;
            } catch (Exception e) {
                Log.e(TAG, "Failed to abandon audio focus", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public synchronized void onAudioFocusChange(int focusChange) {
        try {
            if (focusChange == -3 || focusChange == -2 || focusChange == -1) {
                this.hasFocus = false;
                AudioFocusListener audioFocusListener = this.listener;
                if (audioFocusListener != null) {
                    audioFocusListener.onAudioFocusLost();
                }
            } else if (focusChange == 1 || focusChange == 2) {
                this.hasFocus = true;
                AudioFocusListener audioFocusListener2 = this.listener;
                if (audioFocusListener2 != null) {
                    audioFocusListener2.onAudioFocusGained();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean requestFocus(@NotNull AudioFocusListener listener) {
        listener.getClass();
        this.listener = listener;
        if (!this.hasFocus) {
            try {
                boolean z = true;
                if (requestFocusFromSystem() != 1) {
                    z = false;
                }
                this.hasFocus = z;
            } catch (Exception e) {
                Log.e(TAG, "Failed to request audio focus.", e);
                this.hasFocus = false;
            }
        }
        return this.hasFocus;
    }

    @VisibleForTesting
    public final int requestFocusFromSystem() {
        AudioFocusRequest build = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build()).setOnAudioFocusChangeListener(this).setAcceptsDelayedFocusGain(false).build();
        this.audioFocusRequest = build;
        return this.audioManager.requestAudioFocus(build);
    }
}
