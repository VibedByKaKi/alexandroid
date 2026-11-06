package com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechPlayer;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import dagger.Lazy;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SpeechPlayerInitializer {
    private static final String TAG = "SpeechPlayerInitializer";
    private final ExecutorService executor;
    private volatile boolean hasNotTried;
    private final Lazy<SpeechPlayer> speechPlayer;

    @Inject
    public SpeechPlayerInitializer(Lazy<SpeechPlayer> lazy) {
        this(ManagedExecutorFactory.newCachedThreadPool(TAG, 1), lazy);
    }

    public void tryInitialize() {
        if (this.hasNotTried) {
            this.hasNotTried = false;
            this.executor.submit(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.SpeechPlayerInitializer.1
                @Override // java.lang.Runnable
                public void run() {
                    SystemClock.elapsedRealtime();
                    ((SpeechPlayer) SpeechPlayerInitializer.this.speechPlayer.get()).initializePlayer();
                    SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @VisibleForTesting
    public SpeechPlayerInitializer(ExecutorService executorService, Lazy<SpeechPlayer> lazy) {
        this.executor = executorService;
        this.speechPlayer = lazy;
        this.hasNotTried = true;
    }
}
