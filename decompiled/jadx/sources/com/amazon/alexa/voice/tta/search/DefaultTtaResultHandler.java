package com.amazon.alexa.voice.tta.search;

import com.amazon.alexa.voice.ui.tta.TtaMessageResponseListener;
import com.amazon.alexa.voice.ui.tta.search.ResultItem;
import com.amazon.alexa.voice.ui.tta.search.TtaResultHandler;
import com.amazon.alexa.voice.ui.tta.search.TtaResultListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/voice/tta/search/DefaultTtaResultHandler;", "Lcom/amazon/alexa/voice/ui/tta/search/TtaResultHandler;", "<init>", "()V", "interactorReference", "Ljava/lang/ref/WeakReference;", "Lcom/amazon/alexa/voice/tta/search/SearchInteractor;", "initialize", "", "searchInteractor", "setResultListener", "ttaResultListener", "Lcom/amazon/alexa/voice/ui/tta/search/TtaResultListener;", "setResponseListener", "ttaMessageResponseListener", "Lcom/amazon/alexa/voice/ui/tta/TtaMessageResponseListener;", "onResultSelected", "resultItem", "Lcom/amazon/alexa/voice/ui/tta/search/ResultItem;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DefaultTtaResultHandler implements TtaResultHandler {

    @Nullable
    private WeakReference<SearchInteractor> interactorReference;

    public final void initialize(@NotNull SearchInteractor searchInteractor) {
        searchInteractor.getClass();
        this.interactorReference = new WeakReference<>(searchInteractor);
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaResultHandler
    public void onResultSelected(@NotNull ResultItem resultItem) {
        SearchInteractor searchInteractor;
        resultItem.getClass();
        WeakReference<SearchInteractor> weakReference = this.interactorReference;
        if (weakReference == null || (searchInteractor = weakReference.get()) == null) {
            return;
        }
        searchInteractor.onResultSelected(resultItem);
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaResultHandler
    public void setResponseListener(@NotNull TtaMessageResponseListener ttaMessageResponseListener) {
        SearchInteractor searchInteractor;
        ttaMessageResponseListener.getClass();
        WeakReference<SearchInteractor> weakReference = this.interactorReference;
        if (weakReference == null || (searchInteractor = weakReference.get()) == null) {
            return;
        }
        searchInteractor.setResponseListener(ttaMessageResponseListener);
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaResultHandler
    public void setResultListener(@NotNull TtaResultListener ttaResultListener) {
        SearchInteractor searchInteractor;
        ttaResultListener.getClass();
        WeakReference<SearchInteractor> weakReference = this.interactorReference;
        if (weakReference == null || (searchInteractor = weakReference.get()) == null) {
            return;
        }
        searchInteractor.setResultListener(ttaResultListener);
    }
}
