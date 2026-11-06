package com.amazon.apl.android.providers.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import com.amazon.apl.android.dependencies.impl.NoOpMediaPlayer;
import com.amazon.apl.android.providers.AbstractMediaPlayerProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpMediaPlayerProvider extends AbstractMediaPlayerProvider<View> {
    private static NoOpMediaPlayerProvider INSTANCE;

    private NoOpMediaPlayerProvider() {
    }

    public static NoOpMediaPlayerProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NoOpMediaPlayerProvider();
        }
        return INSTANCE;
    }

    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    public IMediaPlayer createPlayer(Context context, View view) {
        return new NoOpMediaPlayer();
    }

    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    public View createView(Context context) {
        return new View(context);
    }

    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    public IMediaPlayer getNewPlayer(Context context, View view) {
        return new NoOpMediaPlayer();
    }

    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    public boolean hasPlayingMediaPlayer() {
        return false;
    }

    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider, com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
    }

    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider, com.amazon.apl.android.dependencies.IMediaPlayer.IMediaListener
    public void updateMediaState(@NonNull IMediaPlayer iMediaPlayer) {
    }
}
