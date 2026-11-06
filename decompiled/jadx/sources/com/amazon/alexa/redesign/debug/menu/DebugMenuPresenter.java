package com.amazon.alexa.redesign.debug.menu;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.redesign.debug.menu.DebugMenuContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/debug/menu/DebugMenuPresenter;", "Lcom/amazon/alexa/redesign/debug/menu/DebugMenuContract$Presenter;", "view", "Lcom/amazon/alexa/redesign/debug/menu/DebugMenuContract$View;", "interactor", "Lcom/amazon/alexa/redesign/debug/menu/DebugMenuContract$Interactor;", "<init>", "(Lcom/amazon/alexa/redesign/debug/menu/DebugMenuContract$View;Lcom/amazon/alexa/redesign/debug/menu/DebugMenuContract$Interactor;)V", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_START, "", "onExitClicked", "onBypassSwitchChanged", "newBypassValue", "", "onLocalJSONSwitchChanged", "localJSON", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DebugMenuPresenter implements DebugMenuContract.Presenter {
    public static final int $stable = 0;

    @NotNull
    private final DebugMenuContract.Interactor interactor;

    @NotNull
    private final DebugMenuContract.View view;

    public DebugMenuPresenter(@NotNull DebugMenuContract.View view, @NotNull DebugMenuContract.Interactor interactor) {
        view.getClass();
        interactor.getClass();
        this.view = view;
        this.interactor = interactor;
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Presenter
    public void onBypassSwitchChanged(boolean newBypassValue) {
        this.interactor.setBypass(newBypassValue);
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Presenter
    public void onExitClicked() {
        this.view.close();
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Presenter
    public void onLocalJSONSwitchChanged(boolean localJSON) {
        this.interactor.setLocalJSON(localJSON);
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Presenter
    public void onStart() {
        this.view.bindDebugModel(this.interactor.getDebugModel());
    }
}
