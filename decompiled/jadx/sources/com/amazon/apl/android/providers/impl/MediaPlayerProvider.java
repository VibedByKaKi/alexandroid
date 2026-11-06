package com.amazon.apl.android.providers.impl;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import com.amazon.apl.android.dependencies.impl.MediaPlayer;
import com.amazon.apl.android.providers.AbstractMediaPlayerProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaPlayerProvider extends AbstractMediaPlayerProvider<TextureView> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    @NonNull
    public TextureView createView(Context context) {
        return new TextureView(context);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    @NonNull
    public IMediaPlayer createPlayer(@NonNull Context context, @NonNull TextureView textureView) {
        return new MediaPlayer(context, textureView);
    }
}
