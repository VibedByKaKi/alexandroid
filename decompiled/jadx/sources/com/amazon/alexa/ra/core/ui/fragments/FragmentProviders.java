package com.amazon.alexa.ra.core.ui.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.CardType;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.data.fragments.ContentType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\b\u0010\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/FragmentProviders;", "", "providers", "", "Lcom/amazon/alexa/ra/core/ui/fragments/ProviderKey;", "Lcom/amazon/alexa/ra/core/ui/fragments/FragmentProvider;", "<init>", "(Ljava/util/Map;)V", MetricsConstants.Method.CACHE_GET, "contentType", "Lcom/amazon/alexa/ra/core/data/fragments/ContentType;", Content.CARD_TYPE, "Lcom/amazon/alexa/ra/core/data/fragments/CardType;", "hasProvider", "", "toBuilder", "Lcom/amazon/alexa/ra/core/ui/fragments/FragmentProviders$Companion$Builder;", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FragmentProviders {

    @NotNull
    private final Map<ProviderKey, FragmentProvider> providers;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentProviders(@NotNull Map<ProviderKey, ? extends FragmentProvider> map) {
        map.getClass();
        this.providers = map;
    }

    public static /* synthetic */ FragmentProvider get$default(FragmentProviders fragmentProviders, ContentType contentType, CardType cardType, int i, Object obj) {
        if ((i & 2) != 0) {
            cardType = null;
        }
        return fragmentProviders.get(contentType, cardType);
    }

    public static /* synthetic */ boolean hasProvider$default(FragmentProviders fragmentProviders, ContentType contentType, CardType cardType, int i, Object obj) {
        if ((i & 2) != 0) {
            cardType = null;
        }
        return fragmentProviders.hasProvider(contentType, cardType);
    }

    @Nullable
    public final FragmentProvider get(@NotNull ContentType contentType, @Nullable CardType cardType) {
        contentType.getClass();
        return this.providers.get(new ProviderKey(contentType, cardType));
    }

    public final boolean hasProvider(@NotNull ContentType contentType, @Nullable CardType cardType) {
        contentType.getClass();
        return this.providers.containsKey(new ProviderKey(contentType, cardType));
    }

    @NotNull
    public final Companion.Builder toBuilder() {
        return new Companion.Builder(MapsKt.toMutableMap(this.providers));
    }
}
