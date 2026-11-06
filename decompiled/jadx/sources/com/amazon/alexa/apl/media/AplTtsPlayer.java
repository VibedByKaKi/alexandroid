package com.amazon.alexa.apl.media;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AudioTaskSchedulerApi;
import com.amazon.alexa.apl.dagger.component.AplFactory;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.player.tts.TtsPlayer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.InputStream;
import java.net.URL;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0006\u0010\u0016\u001a\u00020\u0010J\u001c\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/amazon/alexa/apl/media/AplTtsPlayer;", "Lcom/amazon/alexa/apl/media/AudioFocusListener;", "Lcom/amazon/apl/android/dependencies/ITtsPlayer;", "mContext", "Landroid/content/Context;", "mAudioTaskSchedulerApi", "Lcom/amazon/alexa/api/AudioTaskSchedulerApi;", "(Landroid/content/Context;Lcom/amazon/alexa/api/AudioTaskSchedulerApi;)V", "activeAplTtsAudioTask", "Lcom/amazon/alexa/apl/media/AplTtsAudioTask;", "aplAudioFocusManager", "Lcom/amazon/alexa/apl/media/AplAudioFocusManager;", "ttsPlayer", "Lcom/amazon/apl/player/tts/TtsPlayer;", "createAudioTask", "finish", "", "gainedFocus", "getSource", "", "lostFocus", "play", "playDelegate", "prepare", "source", "stream", "Ljava/io/InputStream;", "url", "Ljava/net/URL;", "release", "schedule", "setStateChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/apl/android/dependencies/ITtsPlayer$IStateChangeListener;", "setWordMarkListener", "Lcom/amazon/apl/android/dependencies/ITtsPlayer$ISpeechMarksListener;", "stop", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplTtsPlayer implements AudioFocusListener, ITtsPlayer {
    private static final String TAG = "AplTtsPlayer";
    private AplTtsAudioTask activeAplTtsAudioTask;

    @NotNull
    private final AplAudioFocusManager aplAudioFocusManager;

    @NotNull
    private final AudioTaskSchedulerApi mAudioTaskSchedulerApi;

    @NotNull
    private final TtsPlayer ttsPlayer;

    @Inject
    public AplTtsPlayer(@NotNull Context context, @NotNull AudioTaskSchedulerApi audioTaskSchedulerApi) {
        context.getClass();
        audioTaskSchedulerApi.getClass();
        this.mAudioTaskSchedulerApi = audioTaskSchedulerApi;
        this.aplAudioFocusManager = new AplAudioFocusManager(context, this);
        this.ttsPlayer = AplFactory.INSTANCE.getComponent().getTtsPlayer();
    }

    private final void schedule() {
        Log.i(TAG, "scheduling");
        AplTtsAudioTask createAudioTask = createAudioTask();
        this.activeAplTtsAudioTask = createAudioTask;
        AudioTaskSchedulerApi audioTaskSchedulerApi = this.mAudioTaskSchedulerApi;
        if (createAudioTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activeAplTtsAudioTask");
            createAudioTask = null;
        }
        audioTaskSchedulerApi.scheduleAudioTask(createAudioTask);
    }

    @VisibleForTesting
    @NotNull
    public final AplTtsAudioTask createAudioTask() {
        return new AplTtsAudioTask(this, this.aplAudioFocusManager);
    }

    public final void finish() {
        this.ttsPlayer.stop();
        AplTtsAudioTask aplTtsAudioTask = this.activeAplTtsAudioTask;
        if (aplTtsAudioTask != null) {
            AudioTaskSchedulerApi audioTaskSchedulerApi = this.mAudioTaskSchedulerApi;
            if (aplTtsAudioTask == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activeAplTtsAudioTask");
                aplTtsAudioTask = null;
            }
            audioTaskSchedulerApi.unscheduleAudioTask(aplTtsAudioTask);
        }
        this.aplAudioFocusManager.abandonRequest();
    }

    @Override // com.amazon.alexa.apl.media.AudioFocusListener
    public void gainedFocus() {
        Log.i(TAG, "gainedFocus");
        play();
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    @Nullable
    public String getSource() {
        return this.ttsPlayer.getSource();
    }

    @Override // com.amazon.alexa.apl.media.AudioFocusListener
    public void lostFocus() {
        Log.i(TAG, "lostFocus");
        finish();
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void play() {
        Log.i(TAG, "play");
        schedule();
    }

    public final void playDelegate() {
        this.ttsPlayer.play();
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(@Nullable String source, @Nullable URL url) {
        TtsPlayer ttsPlayer = this.ttsPlayer;
        url.getClass();
        ttsPlayer.prepare(source, url);
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void release() {
        this.ttsPlayer.release();
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void setStateChangeListener(@Nullable ITtsPlayer.IStateChangeListener listener) {
        this.ttsPlayer.setStateChangeListener(listener);
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void setWordMarkListener(@Nullable ITtsPlayer.ISpeechMarksListener listener) {
        this.ttsPlayer.setWordMarkListener(listener);
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void stop() {
        Log.i(TAG, "stop");
        finish();
    }

    @Override // com.amazon.apl.android.dependencies.ITtsPlayer
    public void prepare(@Nullable String source, @Nullable InputStream stream) {
        this.ttsPlayer.prepare(source, stream);
    }
}
