package com.amazon.alexa.voice.ui.tta.search;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.TtaMessageResponseListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TtaResultHandler {
    void onResultSelected(@NonNull ResultItem resultItem);

    void setResponseListener(@NonNull TtaMessageResponseListener ttaMessageResponseListener);

    void setResultListener(@NonNull TtaResultListener ttaResultListener);
}
