package com.amazon.alexa.apl.media;

import android.content.Context;
import android.view.TextureView;
import com.amazon.alexa.apl.metrics.MetricsPublisher;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import com.amazon.apl.android.providers.impl.MediaPlayerProvider;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/apl/media/AplMediaPlayerProvider;", "Lcom/amazon/apl/android/providers/impl/MediaPlayerProvider;", "metricsPublisher", "Lcom/amazon/alexa/apl/metrics/MetricsPublisher;", "(Lcom/amazon/alexa/apl/metrics/MetricsPublisher;)V", "createPlayer", "Lcom/amazon/apl/android/dependencies/IMediaPlayer;", "context", "Landroid/content/Context;", "view", "Landroid/view/TextureView;", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplMediaPlayerProvider extends MediaPlayerProvider {

    @NotNull
    private final MetricsPublisher metricsPublisher;

    @Inject
    public AplMediaPlayerProvider(@NotNull MetricsPublisher metricsPublisher) {
        metricsPublisher.getClass();
        this.metricsPublisher = metricsPublisher;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.apl.android.providers.impl.MediaPlayerProvider, com.amazon.apl.android.providers.AbstractMediaPlayerProvider
    @NotNull
    public IMediaPlayer<?> createPlayer(@NotNull Context context, @NotNull TextureView view) {
        context.getClass();
        view.getClass();
        return new AplMediaPlayer(context, view, this.metricsPublisher);
    }
}
