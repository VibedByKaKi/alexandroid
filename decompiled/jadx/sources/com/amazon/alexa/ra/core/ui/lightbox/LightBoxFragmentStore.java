package com.amazon.alexa.ra.core.ui.lightbox;

import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxFragmentStore;", "Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxStoreApi;", "Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxResult;", "<init>", "()V", "lightBoxData", HttpClientUtils.ElementsCacheKey.STORE, "", "data", MetricsConstants.Method.CACHE_GET, MetricsConstants.Method.CACHE_CLEAR, "hasData", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class LightBoxFragmentStore implements LightBoxStoreApi<LightBoxResult> {

    @Nullable
    private static LightBoxResult lightBoxData;

    @NotNull
    public static final LightBoxFragmentStore INSTANCE = new LightBoxFragmentStore();
    public static final int $stable = 8;

    private LightBoxFragmentStore() {
    }

    @Override // com.amazon.alexa.ra.core.ui.lightbox.LightBoxStoreApi
    public void clear() {
        lightBoxData = null;
    }

    @Override // com.amazon.alexa.ra.core.ui.lightbox.LightBoxStoreApi
    @Nullable
    public LightBoxResult get() {
        return lightBoxData;
    }

    @Override // com.amazon.alexa.ra.core.ui.lightbox.LightBoxStoreApi
    public boolean hasData() {
        return lightBoxData != null;
    }

    public final void store(@NotNull LightBoxResult data) {
        data.getClass();
        lightBoxData = data;
    }
}
