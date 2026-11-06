package com.amazon.alexa.assistant.ui.conversation.overlay;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.ra.core.features.backgroundvoice.RaOverlayServiceLifecycleApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/overlay/OverlayServiceLifecycleManager;", "Lcom/amazon/alexa/ra/core/features/backgroundvoice/RaOverlayServiceLifecycleApi;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "startService", "", "context", "Landroid/content/Context;", "stopService", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OverlayServiceLifecycleManager implements RaOverlayServiceLifecycleApi {

    @NotNull
    private static final String TAG = "OverlayServiceLifecycleManager";

    @NotNull
    private final Logger logger;
    public static final int $stable = 8;

    public OverlayServiceLifecycleManager(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @Override // com.amazon.alexa.ra.core.features.backgroundvoice.RaOverlayServiceLifecycleApi
    public void startService(@NotNull Context context) {
        context.getClass();
        Logger.DefaultImpls.info$default(this.logger, TAG, "startService called", null, 4, null);
    }

    @Override // com.amazon.alexa.ra.core.features.backgroundvoice.RaOverlayServiceLifecycleApi
    public void stopService(@NotNull Context context) {
        context.getClass();
        Logger.DefaultImpls.info$default(this.logger, TAG, "stopService called", null, 4, null);
    }
}
