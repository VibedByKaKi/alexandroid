package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaLivePreviewListener;
import com.amazon.alexa.api.LivePreview;
import com.amazon.alexa.api.TranscriptDirection;
import com.amazon.alexa.api.compat.model.TranscriptSequence;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaLivePreviewListenerAdapter;", "Lcom/amazon/alexa/api/AlexaLivePreviewListener;", "compatListener", "Lcom/amazon/alexa/api/compat/model/AlexaLivePreviewListener;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaLivePreviewListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/model/AlexaLivePreviewListener;", "onLivePreviewReceived", "", "livePreview", "Lcom/amazon/alexa/api/LivePreview;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaLivePreviewListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaLivePreviewListenerAdapter.kt\ncom/amazon/alexa/api/compat/AlexaLivePreviewListenerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* loaded from: classes16.dex */
public final class AlexaLivePreviewListenerAdapter implements AlexaLivePreviewListener {

    @NotNull
    private final com.amazon.alexa.api.compat.model.AlexaLivePreviewListener compatListener;

    public AlexaLivePreviewListenerAdapter(@NotNull com.amazon.alexa.api.compat.model.AlexaLivePreviewListener alexaLivePreviewListener) {
        alexaLivePreviewListener.getClass();
        this.compatListener = alexaLivePreviewListener;
    }

    @NotNull
    public final com.amazon.alexa.api.compat.model.AlexaLivePreviewListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaLivePreviewListener
    public void onLivePreviewReceived(@NotNull LivePreview livePreview) {
        livePreview.getClass();
        com.amazon.alexa.api.compat.model.AlexaLivePreviewListener alexaLivePreviewListener = this.compatListener;
        TranscriptSequence valueOf = TranscriptSequence.valueOf(livePreview.getSequence().name());
        TranscriptDirection transcriptDirection = livePreview.getTranscriptDirection();
        com.amazon.alexa.api.compat.model.TranscriptDirection valueOf2 = transcriptDirection != null ? com.amazon.alexa.api.compat.model.TranscriptDirection.valueOf(transcriptDirection.name()) : null;
        String transcript = livePreview.getTranscript();
        transcript.getClass();
        Locale locale = livePreview.getLocale();
        locale.getClass();
        String id = livePreview.getId();
        id.getClass();
        alexaLivePreviewListener.onLivePreviewReceived(new com.amazon.alexa.api.compat.model.LivePreview(valueOf, valueOf2, transcript, locale, id));
    }
}
