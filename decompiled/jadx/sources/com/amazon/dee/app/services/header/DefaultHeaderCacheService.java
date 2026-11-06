package com.amazon.dee.app.services.header;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.dee.app.services.logging.Log;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/services/header/DefaultHeaderCacheService;", "Lcom/amazon/dee/app/services/header/HeaderCacheService;", "<init>", "()V", "rendererRef", "Ljava/lang/ref/WeakReference;", "Lcom/amazon/dee/app/services/header/HeaderRenderer;", "cachedHeader", "Lorg/json/JSONObject;", "setRenderer", "", "renderer", "loadCachedRequest", "cacheRequest", MissingTokenPull.TRIGGER_REQUEST, "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultHeaderCacheService implements HeaderCacheService {

    @NotNull
    private static final String TAG = Log.tag((Class<?>) DefaultHeaderCacheService.class);

    @Nullable
    private JSONObject cachedHeader;

    @Nullable
    private WeakReference<HeaderRenderer> rendererRef;

    @Override // com.amazon.dee.app.services.header.HeaderCacheService
    public void cacheRequest(@NotNull JSONObject request) {
        request.getClass();
        this.cachedHeader = request;
    }

    @Override // com.amazon.dee.app.services.header.HeaderCacheService
    public void loadCachedRequest() {
        HeaderRenderer headerRenderer;
        JSONObject jSONObject = this.cachedHeader;
        if (jSONObject == null) {
            return;
        }
        try {
            WeakReference<HeaderRenderer> weakReference = this.rendererRef;
            if (weakReference == null || (headerRenderer = weakReference.get()) == null) {
                return;
            }
            headerRenderer.render(jSONObject);
        } catch (Exception e) {
            Log.e(TAG, "header error: ", e);
        }
    }

    @Override // com.amazon.dee.app.services.header.HeaderCacheService
    public void setRenderer(@NotNull HeaderRenderer renderer) {
        renderer.getClass();
        this.rendererRef = new WeakReference<>(renderer);
    }
}
