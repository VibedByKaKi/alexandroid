package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaCardExtras;
import com.amazon.alexa.api.AlexaCardListener;
import com.amazon.alexa.api.compat.model.AlexaCardRendererListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaCardRendererListenerAdapter;", "Lcom/amazon/alexa/api/AlexaCardListener;", "compatListener", "Lcom/amazon/alexa/api/compat/model/AlexaCardRendererListener;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaCardRendererListener;)V", "onReceivedRenderCard", "", "payload", "", "cardExtras", "Lcom/amazon/alexa/api/AlexaCardExtras;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaCardRendererListenerAdapter implements AlexaCardListener {

    @NotNull
    private final AlexaCardRendererListener compatListener;

    public AlexaCardRendererListenerAdapter(@NotNull AlexaCardRendererListener alexaCardRendererListener) {
        alexaCardRendererListener.getClass();
        this.compatListener = alexaCardRendererListener;
    }

    @Override // com.amazon.alexa.api.AlexaCardListener
    public void onReceivedRenderCard(@NotNull String payload, @NotNull AlexaCardExtras cardExtras) {
        payload.getClass();
        cardExtras.getClass();
        this.compatListener.onReceivedRenderCard(payload, new com.amazon.alexa.api.compat.model.AlexaCardExtras(cardExtras.getMarketplace(), cardExtras.getLocale()));
    }
}
