package com.amazon.alexa.redesign.debug.menu;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.redesign.entity.DebugMenuModel;
import com.amazon.alexa.redesign.presenter.StartHandler$$ExternalSyntheticLambda2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/debug/menu/DebugMenuService;", "", "<init>", "()V", "value", "Lcom/amazon/alexa/redesign/entity/DebugMenuModel;", "model", "getModel", "()Lcom/amazon/alexa/redesign/entity/DebugMenuModel;", "setBypass", "", "bypass", "", "setLocalJSON", "localJSON", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DebugMenuService {

    @NotNull
    private DebugMenuModel model = new DebugMenuModel(false, false, 3, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<DebugMenuService> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new StartHandler$$ExternalSyntheticLambda2(3));

    private DebugMenuService() {
    }

    @NotNull
    public static final DebugMenuService getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebugMenuService instance_delegate$lambda$0() {
        return new DebugMenuService();
    }

    @NotNull
    public final DebugMenuModel getModel() {
        return this.model;
    }

    public final void setBypass(boolean bypass) {
        this.model.setBypass(bypass);
    }

    public final void setLocalJSON(boolean localJSON) {
        this.model.setLocalJSON(localJSON);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/redesign/debug/menu/DebugMenuService$Companion;", "", "<init>", "()V", AlexaEventBundleKeys.INSTANCE, "Lcom/amazon/alexa/redesign/debug/menu/DebugMenuService;", "getInstance$annotations", "getInstance", "()Lcom/amazon/alexa/redesign/debug/menu/DebugMenuService;", "instance$delegate", "Lkotlin/Lazy;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DebugMenuService getInstance() {
            return (DebugMenuService) DebugMenuService.instance$delegate.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }
    }
}
