package com.amazon.alexa.hho.navigation.transit.audio;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.hho.navigation.transit.audio.AudioFocusManager;
import com.amazon.apl.android.Content$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0017J$\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010#\u001a\u00020\u0014J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u000fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/audio/NavigationAudioManager;", "Lcom/amazon/alexa/hho/navigation/transit/audio/AudioFocusManager$AudioFocusListener;", "context", "Landroid/content/Context;", "audioFocusManager", "Lcom/amazon/alexa/hho/navigation/transit/audio/AudioFocusManager;", "<init>", "(Landroid/content/Context;Lcom/amazon/alexa/hho/navigation/transit/audio/AudioFocusManager;)V", "handlerThread", "Landroid/os/HandlerThread;", "handler", "Landroid/os/Handler;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "isPrepared", "", "onPlaybackComplete", "Lkotlin/Function1;", "", "onAudioFocusGained", "onAudioFocusLost", "createHandler", "playFromUri", "uri", "Landroid/net/Uri;", "onComplete", "stop", "pause", "resume", "invokePlaybackComplete", "success", "createMediaSource", "Lcom/google/android/exoplayer2/source/MediaSource;", "release", "createPlayer", "createExoPlayer", "Companion", "ExoPlayerEventListener", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationAudioManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationAudioManager.kt\ncom/amazon/alexa/hho/navigation/transit/audio/NavigationAudioManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1#2:268\n*E\n"})
/* loaded from: classes13.dex */
public class NavigationAudioManager implements AudioFocusManager.AudioFocusListener {

    @NotNull
    private static final String HANDLER_NAME = "exo-player-thread";

    @NotNull
    private static final String TAG = "NavCA_AudioManager";

    @NotNull
    private static final String USER_AGENT = "navigation-exo-player";

    @NotNull
    private final AudioFocusManager audioFocusManager;

    @NotNull
    private final Context context;

    @NotNull
    private final DefaultDataSourceFactory dataSourceFactory;

    @Nullable
    private SimpleExoPlayer exoPlayer;

    @NotNull
    private final Handler handler;

    @NotNull
    private final HandlerThread handlerThread;
    private boolean isPrepared;

    @Nullable
    private Function1<? super Boolean, Unit> onPlaybackComplete;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/audio/NavigationAudioManager$ExoPlayerEventListener;", "Lcom/google/android/exoplayer2/Player$DefaultEventListener;", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/audio/NavigationAudioManager;)V", "onPlaybackStateChanged", "", "state", "", "onPlayerError", "error", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ExoPlayerEventListener extends Player.DefaultEventListener {
        public ExoPlayerEventListener() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int state) {
            super.onPlaybackStateChanged(state);
            if (state != 4) {
                return;
            }
            NavigationAudioManager.this.audioFocusManager.abandonFocus();
            NavigationAudioManager.this.invokePlaybackComplete(true);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(@NotNull ExoPlaybackException error) {
            error.getClass();
            Log.e(NavigationAudioManager.TAG, "onPlayerError: " + error.getMessage());
            NavigationAudioManager.this.isPrepared = false;
            NavigationAudioManager.this.audioFocusManager.abandonFocus();
            NavigationAudioManager.this.invokePlaybackComplete(false);
        }
    }

    @Inject
    public NavigationAudioManager(@NotNull Context context, @NotNull AudioFocusManager audioFocusManager) {
        context.getClass();
        audioFocusManager.getClass();
        this.context = context;
        this.audioFocusManager = audioFocusManager;
        this.handlerThread = DoubleList$$ExternalSyntheticOutline0.m(HANDLER_NAME);
        Handler createHandler = createHandler();
        this.handler = createHandler;
        this.dataSourceFactory = new DefaultDataSourceFactory(context, Util.getUserAgent(context, USER_AGENT));
        createHandler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 4));
    }

    private final MediaSource createMediaSource(Uri uri) {
        ExtractorMediaSource createMediaSource = new ExtractorMediaSource.Factory(this.dataSourceFactory).createMediaSource(uri);
        createMediaSource.getClass();
        return createMediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPlayer() {
        SimpleExoPlayer createExoPlayer = createExoPlayer();
        createExoPlayer.addListener(new ExoPlayerEventListener());
        createExoPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(12).build(), false);
        this.exoPlayer = createExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokePlaybackComplete(boolean success) {
        Function1<? super Boolean, Unit> function1 = this.onPlaybackComplete;
        if (function1 != null) {
            this.onPlaybackComplete = null;
            function1.invoke(Boolean.valueOf(success));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAudioFocusGained$lambda$1(NavigationAudioManager navigationAudioManager) {
        SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAudioFocusLost$lambda$2(NavigationAudioManager navigationAudioManager) {
        SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$6(NavigationAudioManager navigationAudioManager) {
        if (!navigationAudioManager.isPrepared) {
            Log.w(TAG, "Called pause without preparing.");
            return;
        }
        SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playFromUri$lambda$4(NavigationAudioManager navigationAudioManager, Function1 function1, Uri uri) {
        navigationAudioManager.onPlaybackComplete = function1;
        if (uri == null) {
            Log.e(TAG, "Cannot play audio: URI is null");
            navigationAudioManager.invokePlaybackComplete(false);
            return;
        }
        if (!navigationAudioManager.audioFocusManager.requestFocus(navigationAudioManager)) {
            Log.w(TAG, "Failed to gain audio focus, skipping playback");
            navigationAudioManager.invokePlaybackComplete(false);
            return;
        }
        try {
            if (navigationAudioManager.exoPlayer == null) {
                navigationAudioManager.createPlayer();
            }
            if (navigationAudioManager.isPrepared) {
                SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
                if (simpleExoPlayer != null) {
                    simpleExoPlayer.stop();
                }
                navigationAudioManager.isPrepared = false;
            }
            MediaSource createMediaSource = navigationAudioManager.createMediaSource(uri);
            SimpleExoPlayer simpleExoPlayer2 = navigationAudioManager.exoPlayer;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.setMediaSource(createMediaSource);
            }
            SimpleExoPlayer simpleExoPlayer3 = navigationAudioManager.exoPlayer;
            if (simpleExoPlayer3 != null) {
                simpleExoPlayer3.prepare();
            }
            navigationAudioManager.isPrepared = true;
            SimpleExoPlayer simpleExoPlayer4 = navigationAudioManager.exoPlayer;
            if (simpleExoPlayer4 != null) {
                simpleExoPlayer4.setPlayWhenReady(true);
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to prepare audio playback", e);
            navigationAudioManager.isPrepared = false;
            navigationAudioManager.audioFocusManager.abandonFocus();
            navigationAudioManager.invokePlaybackComplete(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$9(NavigationAudioManager navigationAudioManager) {
        navigationAudioManager.audioFocusManager.abandonFocus();
        navigationAudioManager.invokePlaybackComplete(false);
        navigationAudioManager.isPrepared = false;
        SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
        }
        navigationAudioManager.exoPlayer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$7(NavigationAudioManager navigationAudioManager) {
        if (!navigationAudioManager.isPrepared) {
            Log.w(TAG, "Called resume without preparing.");
            return;
        }
        SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$5(NavigationAudioManager navigationAudioManager) {
        if (!navigationAudioManager.isPrepared) {
            Log.w(TAG, "Called stop without preparing.");
            return;
        }
        SimpleExoPlayer simpleExoPlayer = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
        }
        SimpleExoPlayer simpleExoPlayer2 = navigationAudioManager.exoPlayer;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.setPlayWhenReady(false);
        }
        navigationAudioManager.isPrepared = false;
    }

    @VisibleForTesting
    @NotNull
    public SimpleExoPlayer createExoPlayer() {
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(this.context).setTrackSelector(new DefaultTrackSelector()).build();
        build.getClass();
        return build;
    }

    @VisibleForTesting
    @NotNull
    public Handler createHandler() {
        return new Handler(this.handlerThread.getLooper());
    }

    @Override // com.amazon.alexa.hho.navigation.transit.audio.AudioFocusManager.AudioFocusListener
    public void onAudioFocusGained() {
        this.handler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // com.amazon.alexa.hho.navigation.transit.audio.AudioFocusManager.AudioFocusListener
    public void onAudioFocusLost() {
        this.handler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 3));
    }

    public final void pause() {
        this.handler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 2));
    }

    public final void playFromUri(@Nullable Uri uri, @NotNull Function1<? super Boolean, Unit> onComplete) {
        onComplete.getClass();
        this.handler.post(new Content$$ExternalSyntheticLambda0(this, 10, onComplete, uri));
    }

    public final void release() {
        this.handler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 6));
        this.handlerThread.quitSafely();
    }

    public final void resume() {
        this.handler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 1));
    }

    public final void stop() {
        this.handler.post(new NavigationAudioManager$$ExternalSyntheticLambda0(this, 5));
        this.audioFocusManager.abandonFocus();
    }
}
