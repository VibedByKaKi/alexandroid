package com.amazon.alexa.assistant.media;

import com.amazon.alexa.assistant.media.model.MediaControl;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/media/MediaPlaybackClient;", "", "delegate", "Lcom/amazon/alexa/assistant/media/MediaPlaybackDelegate;", "getDelegate", "()Lcom/amazon/alexa/assistant/media/MediaPlaybackDelegate;", "mediaEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/alexa/assistant/media/model/MediaControl;", "getMediaEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MediaPlaybackClient {
    @Nullable
    MediaPlaybackDelegate getDelegate();

    @Nullable
    Flow<MediaControl> getMediaEventFlow();
}
