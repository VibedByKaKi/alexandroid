package com.amazon.alexa.voice.ui.ra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.tta.TtaMessageResponseListener;
import com.amazon.alexa.voice.ui.tta.search.ResultItem;
import com.amazon.alexa.voice.ui.tta.search.TtaResultListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ResultHandler {
    void onResultSelected(@NonNull ResultItem resultItem);

    void setResponseListener(@Nullable TtaMessageResponseListener ttaMessageResponseListener);

    void setResultListener(@Nullable TtaResultListener ttaResultListener);
}
