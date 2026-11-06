package com.amazon.alexa.client.alexaservice.ui.cardrenderer;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaCardExtras;
import com.amazon.alexa.api.AlexaCardListener;
import com.amazon.alexa.api.AlexaCardRendererListenerProxy;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CardListenerWrapper {
    private static final String TAG = "CardListenerWrapper";
    private final AlexaCardListener alexaCardListener;
    private final AlexaCardRendererListenerProxy proxy;

    public CardListenerWrapper(AlexaCardListener alexaCardListener) {
        this.proxy = null;
        this.alexaCardListener = alexaCardListener;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CardListenerWrapper cardListenerWrapper = (CardListenerWrapper) obj;
            if (Objects.equals(this.proxy, cardListenerWrapper.proxy) && Objects.equals(this.alexaCardListener, cardListenerWrapper.alexaCardListener)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.proxy, this.alexaCardListener);
    }

    public void onReceivedRenderCard(@NonNull String str, @NonNull AlexaCardExtras alexaCardExtras) throws RemoteException {
        AlexaCardRendererListenerProxy alexaCardRendererListenerProxy = this.proxy;
        if (alexaCardRendererListenerProxy != null) {
            alexaCardRendererListenerProxy.onReceivedRenderCard(str);
            return;
        }
        AlexaCardListener alexaCardListener = this.alexaCardListener;
        if (alexaCardListener != null) {
            alexaCardListener.onReceivedRenderCard(str, alexaCardExtras);
        } else {
            Log.e(TAG, "Unable to send render card - listener is null");
        }
    }

    public CardListenerWrapper(AlexaCardRendererListenerProxy alexaCardRendererListenerProxy) {
        this.proxy = alexaCardRendererListenerProxy;
        this.alexaCardListener = null;
    }
}
