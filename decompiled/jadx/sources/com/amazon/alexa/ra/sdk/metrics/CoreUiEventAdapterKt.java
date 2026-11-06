package com.amazon.alexa.ra.sdk.metrics;

import com.amazon.alexa.api.compat.model.AlexaMetadataBundleKey;
import com.amazon.alexa.api.compat.model.UiEventName;
import com.amazon.alexa.ra.common.metrics.CoreUiEventMetadataKey;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toUiEventName", "Lcom/amazon/alexa/api/compat/model/UiEventName;", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "toAlexaMetadataBundleKey", "Lcom/amazon/alexa/api/compat/model/AlexaMetadataBundleKey;", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventMetadataKey;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CoreUiEventAdapterKt {
    @NotNull
    public static final AlexaMetadataBundleKey toAlexaMetadataBundleKey(@NotNull CoreUiEventMetadataKey coreUiEventMetadataKey) {
        coreUiEventMetadataKey.getClass();
        return CoreUiEventAdapter.INSTANCE.toAlexaMetadataBundleKey(coreUiEventMetadataKey);
    }

    @Nullable
    public static final UiEventName toUiEventName(@NotNull CoreUiEventName coreUiEventName) {
        coreUiEventName.getClass();
        return CoreUiEventAdapter.INSTANCE.toUiEventName(coreUiEventName);
    }
}
