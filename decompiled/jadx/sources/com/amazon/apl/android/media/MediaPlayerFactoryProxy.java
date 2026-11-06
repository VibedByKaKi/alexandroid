package com.amazon.apl.android.media;

import androidx.annotation.NonNull;
import com.amazon.apl.android.providers.AbstractMediaPlayerProvider;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaPlayerFactoryProxy extends BoundObject {
    private final IMediaPlayerFactory mFactory;

    public MediaPlayerFactoryProxy(@NonNull IMediaPlayerFactory iMediaPlayerFactory) {
        bind(nCreate());
        this.mFactory = iMediaPlayerFactory;
    }

    private MediaPlayer createPlayer(long j) {
        return new MediaPlayer(j);
    }

    private native long nCreate();

    public AbstractMediaPlayerProvider getMediaPlayerProvider() {
        return this.mFactory.getMediaPlayerProvider();
    }
}
