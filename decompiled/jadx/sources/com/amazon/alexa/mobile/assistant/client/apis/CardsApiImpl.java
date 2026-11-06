package com.amazon.alexa.mobile.assistant.client.apis;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.AlexaAplCommand;
import com.amazon.alexa.api.compat.model.AlexaAplCommandListener;
import com.amazon.alexa.api.compat.model.AlexaCardRendererListener;
import com.amazon.alexa.api.compat.model.AlexaMediaPlaybackListener;
import com.amazon.alexa.api.compat.model.AlexaMediaPlaybackMetadata;
import com.amazon.alexa.api.compat.model.AplState;
import com.amazon.alexa.api.compat.model.CardsApiV2;
import com.amazon.alexa.eventbus.stub.FakeEventBus$$ExternalSyntheticLambda0;
import com.amazon.alexa.mobile.assistant.capabilities.apl.AplDirectiveListener;
import com.amazon.alexa.mobile.assistant.capabilities.cardrenderer.CardRendererDirectiveListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/CardsApiImpl;", "Lcom/amazon/alexa/api/compat/model/CardsApiV2;", "<init>", "()V", "aplListeners", "", "Lcom/amazon/alexa/api/compat/model/AlexaAplCommandListener;", "cardRendererListeners", "Lcom/amazon/alexa/api/compat/model/AlexaCardRendererListener;", "mediaPlaybackListeners", "Lcom/amazon/alexa/api/compat/model/AlexaMediaPlaybackListener;", "aplDirectiveListener", "Lcom/amazon/alexa/mobile/assistant/capabilities/apl/AplDirectiveListener;", "getAplDirectiveListener", "()Lcom/amazon/alexa/mobile/assistant/capabilities/apl/AplDirectiveListener;", "cardRendererDirectiveListener", "Lcom/amazon/alexa/mobile/assistant/capabilities/cardrenderer/CardRendererDirectiveListener;", "getCardRendererDirectiveListener", "()Lcom/amazon/alexa/mobile/assistant/capabilities/cardrenderer/CardRendererDirectiveListener;", "registerAplCommandListener", "", "aplCommandListener", "deregisterAplCommandListener", "registerPlayerInfoCardListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "deregisterPlayerInfoCardListener", "registerAlexaCardRendererListener", "deregisterCardRendererListener", "reportAplState", "aplState", "Lcom/amazon/alexa/api/compat/model/AplState;", "destroy", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardsApiImpl implements CardsApiV2 {

    @NotNull
    private static final String TAG = "CardsApiImpl";
    public static final int $stable = 8;

    @NotNull
    private final Set<AlexaAplCommandListener> aplListeners = new LinkedHashSet();

    @NotNull
    private final Set<AlexaCardRendererListener> cardRendererListeners = new LinkedHashSet();

    @NotNull
    private final Set<AlexaMediaPlaybackListener> mediaPlaybackListeners = new LinkedHashSet();

    @NotNull
    private final AplDirectiveListener aplDirectiveListener = new FakeEventBus$$ExternalSyntheticLambda0(this, 20);

    @NotNull
    private final CardRendererDirectiveListener cardRendererDirectiveListener = new CardRendererDirectiveListener() { // from class: com.amazon.alexa.mobile.assistant.client.apis.CardsApiImpl$cardRendererDirectiveListener$1
        @Override // com.amazon.alexa.mobile.assistant.capabilities.cardrenderer.CardRendererDirectiveListener
        public void onPlayerInfo(String cardData, boolean partOfVoiceRequest) {
            Set set;
            Set set2;
            cardData.getClass();
            AlexaMediaPlaybackMetadata build = AlexaMediaPlaybackMetadata.INSTANCE.builder(cardData).build();
            set = CardsApiImpl.this.mediaPlaybackListeners;
            ParcelCompat$$ExternalSyntheticOutline0.m(set.size(), "onPlayerInfo: forwarding raw PlayerInfo card to ", " listener(s)", "CardsApiImpl");
            set2 = CardsApiImpl.this.mediaPlaybackListeners;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                try {
                    ((AlexaMediaPlaybackListener) it2.next()).onMediaMetadata(build);
                } catch (Exception e) {
                    Log.e("CardsApiImpl", "Error forwarding PlayerInfo to listener", e);
                }
            }
        }

        @Override // com.amazon.alexa.mobile.assistant.capabilities.cardrenderer.CardRendererDirectiveListener
        public void onRenderCard(String cardData) {
            Set set;
            cardData.getClass();
            set = CardsApiImpl.this.cardRendererListeners;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    ((AlexaCardRendererListener) it2.next()).onReceivedRenderCard(cardData);
                } catch (Exception e) {
                    Log.e("CardsApiImpl", "Error forwarding RenderCard to listener", e);
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aplDirectiveListener$lambda$0(CardsApiImpl cardsApiImpl, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        str.getClass();
        str2.getClass();
        Iterator<AlexaAplCommandListener> it2 = cardsApiImpl.aplListeners.iterator();
        while (it2.hasNext()) {
            try {
                str4 = str;
                str5 = str2;
                str6 = str3;
            } catch (Exception e) {
                e = e;
                str4 = str;
                str5 = str2;
                str6 = str3;
            }
            try {
                it2.next().onAplCommandReceived(new AlexaAplCommand(str4, str5, str6, false, null, 24, null));
            } catch (Exception e2) {
                e = e2;
                Log.e(TAG, "Error forwarding APL directive to listener", e);
                str = str4;
                str2 = str5;
                str3 = str6;
            }
            str = str4;
            str2 = str5;
            str3 = str6;
        }
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void deregisterAplCommandListener(@NotNull AlexaAplCommandListener aplCommandListener) {
        aplCommandListener.getClass();
        this.aplListeners.remove(aplCommandListener);
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void deregisterCardRendererListener(@NotNull AlexaCardRendererListener listener) {
        listener.getClass();
        this.cardRendererListeners.remove(listener);
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void deregisterPlayerInfoCardListener(@NotNull AlexaMediaPlaybackListener listener) {
        listener.getClass();
        this.mediaPlaybackListeners.remove(listener);
    }

    public final void destroy() {
        this.aplListeners.clear();
        this.cardRendererListeners.clear();
        this.mediaPlaybackListeners.clear();
    }

    @NotNull
    public final AplDirectiveListener getAplDirectiveListener() {
        return this.aplDirectiveListener;
    }

    @NotNull
    public final CardRendererDirectiveListener getCardRendererDirectiveListener() {
        return this.cardRendererDirectiveListener;
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void registerAlexaCardRendererListener(@NotNull AlexaCardRendererListener listener) {
        listener.getClass();
        this.cardRendererListeners.add(listener);
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void registerAplCommandListener(@NotNull AlexaAplCommandListener aplCommandListener) {
        aplCommandListener.getClass();
        this.aplListeners.add(aplCommandListener);
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void registerPlayerInfoCardListener(@NotNull AlexaMediaPlaybackListener listener) {
        listener.getClass();
        this.mediaPlaybackListeners.add(listener);
    }

    @Override // com.amazon.alexa.api.compat.model.CardsApiV2
    public void reportAplState(@NotNull AplState aplState) {
        aplState.getClass();
    }
}
