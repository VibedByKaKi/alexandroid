package com.amazon.alexa.client.alexaservice.audio.core;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SoundAuthority {
    static final int INFINITE_LOOP = -1;
    static final int INVALID_STREAM_ID = -1;
    static final int NO_LOOP = 0;
    static final int PRIORITY = 0;
    static final float RATE = 1.0001f;
    public static final String SCO_SOUNDPOOL = "ScoSoundPool";
    private static final String SOUND_LOADING_EXECUTOR = "sound_loading_executor";
    private static final String TAG = "SoundAuthority";
    static final float VOLUME = 1.0f;
    private final SoundWrapper scoSounds;
    private final ExecutorService soundExecutor;
    private final SoundWrapper sounds;
    private final ConditionVariable soundsLoaded;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PlaySoundCallable implements Callable<Integer> {
        private final boolean shouldLoop;
        private final boolean shouldPlayOverSco;
        private final Sound sound;

        public PlaySoundCallable(Sound sound, boolean z, boolean z2) {
            this.sound = sound;
            this.shouldPlayOverSco = z;
            this.shouldLoop = z2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Integer call() throws Exception {
            if (this.sound.waitForLoad()) {
                return Integer.valueOf(SoundAuthority.this.play(this.sound.getSoundName(), this.shouldPlayOverSco, this.shouldLoop));
            }
            return -1;
        }
    }

    @VisibleForTesting
    public SoundAuthority(SoundWrapper soundWrapper, SoundWrapper soundWrapper2, ExecutorService executorService) {
        this.soundsLoaded = new ConditionVariable(false);
        this.sounds = soundWrapper;
        this.scoSounds = soundWrapper2;
        this.soundExecutor = executorService;
    }

    private void loadSounds() {
        this.soundExecutor.submit(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.audio.core.SoundAuthority.1
            @Override // java.lang.Runnable
            public void run() {
                SoundAuthority.this.scoSounds.loadSounds();
                SoundAuthority.this.sounds.loadSounds();
                SoundAuthority.this.soundsLoaded.open();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int play(SoundName soundName, boolean z, boolean z2) {
        return z ? this.scoSounds.play(soundName, z2) : this.sounds.play(soundName, z2);
    }

    private PlayingSound tryPlay(SoundName soundName, boolean z, boolean z2) {
        Sound sound = (z ? this.scoSounds : this.sounds).getSound(soundName);
        if (sound.isReady()) {
            return new ImmediatelyPlayingSound(play(soundName, z, z2));
        }
        FutureTask futureTask = new FutureTask(new PlaySoundCallable(sound, z, z2));
        this.soundExecutor.submit(futureTask);
        Objects.toString(soundName);
        return new FuturePlayingSound(futureTask);
    }

    public void initialize() {
        loadSounds();
    }

    public PlayingSound loop(SoundName soundName, boolean z) {
        return tryPlay(soundName, z, true);
    }

    public void stop(PlayingSound playingSound) {
        if (!playingSound.hasStarted()) {
            playingSound.cancel();
        } else {
            this.sounds.stop(playingSound.getStreamId());
            this.scoSounds.stop(playingSound.getStreamId());
        }
    }

    public void teardown() {
        this.soundExecutor.shutdownNow();
        this.sounds.teardown();
        this.scoSounds.teardown();
    }

    @VisibleForTesting
    public void waitForSoundsToLoad() throws InterruptedException {
        this.soundsLoaded.block();
    }

    public PlayingSound play(SoundName soundName, boolean z) {
        return tryPlay(soundName, z, false);
    }

    @Inject
    public SoundAuthority(SoundWrapper soundWrapper, @Named("ScoSoundWrapper") SoundWrapper soundWrapper2) {
        this(soundWrapper, soundWrapper2, ExecutorFactory.newSingleThreadCachedThreadPool(SOUND_LOADING_EXECUTOR));
    }
}
