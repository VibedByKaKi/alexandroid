package com.amazon.alexa.ra.plugin.navigation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessorykit.finishsetup.presenters.FASCardPresenter;
import com.amazon.alexa.ra.core.viewmodel.RaConversationViewModel;
import com.amazon.alexa.ra.unified.UnifiedIngressBarBridge;
import com.amazon.alexa.voice.ui.ra.OnDismissCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/plugin/navigation/RaConversationDismissHandler;", "", "viewModel", "Lcom/amazon/alexa/ra/core/viewmodel/RaConversationViewModel;", "onDismissCallback", "Lcom/amazon/alexa/voice/ui/ra/OnDismissCallback;", "<init>", "(Lcom/amazon/alexa/ra/core/viewmodel/RaConversationViewModel;Lcom/amazon/alexa/voice/ui/ra/OnDismissCallback;)V", FASCardPresenter.ACTION_DISMISS, "", "Companion", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class RaConversationDismissHandler {

    @NotNull
    private static final String TAG = "RaConversationDismissHandler";

    @Nullable
    private final OnDismissCallback onDismissCallback;

    @NotNull
    private final RaConversationViewModel viewModel;
    public static final int $stable = 8;

    public RaConversationDismissHandler(@NotNull RaConversationViewModel raConversationViewModel, @Nullable OnDismissCallback onDismissCallback) {
        raConversationViewModel.getClass();
        this.viewModel = raConversationViewModel;
        this.onDismissCallback = onDismissCallback;
    }

    public final void dismiss() {
        UnifiedIngressBarBridge unifiedIngressBarBridge = UnifiedIngressBarBridge.INSTANCE;
        unifiedIngressBarBridge.requestHideKeyboard();
        unifiedIngressBarBridge.onConversationDismissed();
        RaConversationViewModel.cancelVoiceRequest$default(this.viewModel, null, 1, null);
        this.viewModel.updateLastConversationId();
        OnDismissCallback onDismissCallback = this.onDismissCallback;
        if (onDismissCallback != null) {
            onDismissCallback.onDismiss();
        }
    }
}
