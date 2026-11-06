package com.amazon.alexa.redesign.debug.menu;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.debug.menu.DebugMenuContract;
import com.amazon.alexa.redesign.entity.DebugMenuModel;
import com.amazon.alexa.redesign.presenter.StartHandler$$ExternalSyntheticLambda2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/debug/menu/DebugMenuInteractor;", "Lcom/amazon/alexa/redesign/debug/menu/DebugMenuContract$Interactor;", "<init>", "()V", "debugMenuService", "Lcom/amazon/alexa/redesign/debug/menu/DebugMenuService;", "getDebugMenuService", "()Lcom/amazon/alexa/redesign/debug/menu/DebugMenuService;", "debugMenuService$delegate", "Lkotlin/Lazy;", "getDebugModel", "Lcom/amazon/alexa/redesign/entity/DebugMenuModel;", "setBypass", "", "bypass", "", "setLocalJSON", "localJSON", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DebugMenuInteractor implements DebugMenuContract.Interactor {
    public static final int $stable = 8;

    /* renamed from: debugMenuService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy debugMenuService = LazyKt.lazy(new StartHandler$$ExternalSyntheticLambda2(2));

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebugMenuService debugMenuService_delegate$lambda$0() {
        return DebugMenuService.INSTANCE.getInstance();
    }

    private final DebugMenuService getDebugMenuService() {
        return (DebugMenuService) this.debugMenuService.getValue();
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Interactor
    @NotNull
    public DebugMenuModel getDebugModel() {
        return getDebugMenuService().getModel();
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Interactor
    public void setBypass(boolean bypass) {
        getDebugMenuService().setBypass(bypass);
    }

    @Override // com.amazon.alexa.redesign.debug.menu.DebugMenuContract.Interactor
    public void setLocalJSON(boolean localJSON) {
        getDebugMenuService().setLocalJSON(localJSON);
    }
}
