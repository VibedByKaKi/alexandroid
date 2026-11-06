package com.amazon.alexa.apl.factory;

import com.amazon.alexa.apl.payload.RenderDocumentPayload;
import com.amazon.apl.android.scaling.Scaling;
import com.amazon.apl.enums.ViewportMode;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/apl/factory/ScalingFactory;", "", "()V", "getScaling", "Lcom/amazon/apl/android/scaling/Scaling;", "renderDocumentPayload", "Lcom/amazon/alexa/apl/payload/RenderDocumentPayload;", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ScalingFactory {
    private static final double BIAS_CONSTANT = 10.0d;

    @NotNull
    private static final List<ViewportMode> allowModes = CollectionsKt.mutableListOf(ViewportMode.kViewportModeMobile);

    @Inject
    public ScalingFactory() {
    }

    @NotNull
    public final Scaling getScaling(@NotNull RenderDocumentPayload renderDocumentPayload) {
        renderDocumentPayload.getClass();
        return new Scaling(10.0d, renderDocumentPayload.getViewportSpecifications(), allowModes);
    }
}
