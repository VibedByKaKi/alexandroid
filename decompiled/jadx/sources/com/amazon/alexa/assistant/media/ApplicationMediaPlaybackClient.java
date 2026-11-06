package com.amazon.alexa.assistant.media;

import com.amazon.alexa.assistant.media.model.MediaControl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/media/ApplicationMediaPlaybackClient;", "Lcom/amazon/alexa/assistant/media/MediaPlaybackClient;", "mediaEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/alexa/assistant/media/model/MediaControl;", "delegate", "Lcom/amazon/alexa/assistant/media/MediaPlaybackDelegate;", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lcom/amazon/alexa/assistant/media/MediaPlaybackDelegate;)V", "getMediaEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "getDelegate", "()Lcom/amazon/alexa/assistant/media/MediaPlaybackDelegate;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationMediaPlaybackClient implements MediaPlaybackClient {

    @Nullable
    private final MediaPlaybackDelegate delegate;

    @Nullable
    private final Flow<MediaControl> mediaEventFlow;

    public /* synthetic */ ApplicationMediaPlaybackClient(Flow flow, MediaPlaybackDelegate mediaPlaybackDelegate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : flow, (i & 2) != 0 ? null : mediaPlaybackDelegate);
    }

    @Override // com.amazon.alexa.assistant.media.MediaPlaybackClient
    @Nullable
    public MediaPlaybackDelegate getDelegate() {
        return this.delegate;
    }

    @Override // com.amazon.alexa.assistant.media.MediaPlaybackClient
    @Nullable
    public Flow<MediaControl> getMediaEventFlow() {
        return this.mediaEventFlow;
    }

    public ApplicationMediaPlaybackClient(@Nullable Flow<MediaControl> flow, @Nullable MediaPlaybackDelegate mediaPlaybackDelegate) {
        this.mediaEventFlow = flow;
        this.delegate = mediaPlaybackDelegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApplicationMediaPlaybackClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
