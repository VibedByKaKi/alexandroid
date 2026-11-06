package com.amazon.apl.player.tts;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.android.dependencies.ITtsSourceProvider;
import com.amazon.apl.android.providers.ITtsPlayerProvider;
import java.io.IOException;
import java.net.URL;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtsPlayerProvider implements ITtsPlayerProvider {

    @Nullable
    private final TtsPlayer mPlayer;

    public TtsPlayerProvider(Context context) {
        this.mPlayer = new TtsPlayer(context.getApplicationContext(), 1);
    }

    @Override // com.amazon.apl.android.providers.ITtsPlayerProvider
    @NonNull
    public ITtsPlayer getPlayer() {
        TtsPlayer ttsPlayer = this.mPlayer;
        if (ttsPlayer != null) {
            return ttsPlayer;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Player has been released");
        return null;
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
        TtsPlayer ttsPlayer = this.mPlayer;
        if (ttsPlayer != null) {
            ttsPlayer.release();
        }
    }

    @Override // com.amazon.apl.android.providers.ITtsPlayerProvider
    public void prepare(@NonNull String str, @NonNull ITtsSourceProvider iTtsSourceProvider) throws IOException {
        iTtsSourceProvider.onSource(new URL(str));
    }
}
