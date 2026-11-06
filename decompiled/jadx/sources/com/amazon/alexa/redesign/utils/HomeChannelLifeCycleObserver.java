package com.amazon.alexa.redesign.utils;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;
import com.amazon.alexa.ra.rtvi.RTVIInitializer$$ExternalSyntheticLambda0;
import com.amazon.alexa.redesign.ViewControllerToRoutingInterface;
import com.amazon.alexa.redesign.presenter.StartHandler$$ExternalSyntheticLambda2;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BT\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00030\u00030\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/redesign/utils/HomeChannelLifeCycleObserver;", "Lcom/amazon/alexa/protocols/lifecycle/MainActivityLifecycleObserver;", "routingInterface", "Lcom/amazon/alexa/redesign/ViewControllerToRoutingInterface;", "onResume", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isForegrounding", "", "onPause", "Lkotlin/Function0;", "onDestroy", "<init>", "(Lcom/amazon/alexa/redesign/ViewControllerToRoutingInterface;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "routingInterfaceReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onActivityCreated", "onActivityStart", "onActivityResume", "onActivityPause", "onActivityStop", "onActivityDestroy", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HomeChannelLifeCycleObserver implements MainActivityLifecycleObserver {
    public static final int $stable = 8;
    private boolean isForegrounding;

    @NotNull
    private final Function0<Unit> onDestroy;

    @NotNull
    private final Function0<Unit> onPause;

    @NotNull
    private final Function1<Boolean, Unit> onResume;

    @NotNull
    private final WeakReference<ViewControllerToRoutingInterface> routingInterfaceReference;

    public /* synthetic */ HomeChannelLifeCycleObserver(ViewControllerToRoutingInterface viewControllerToRoutingInterface, Function1 function1, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewControllerToRoutingInterface, (i & 2) != 0 ? new RTVIInitializer$$ExternalSyntheticLambda0(25) : function1, (i & 4) != 0 ? new StartHandler$$ExternalSyntheticLambda2(15) : function0, (i & 8) != 0 ? new StartHandler$$ExternalSyntheticLambda2(16) : function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityDestroy() {
        this.onDestroy.invoke();
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityPause() {
        this.isForegrounding = true;
        this.onPause.invoke();
        ViewControllerToRoutingInterface viewControllerToRoutingInterface = this.routingInterfaceReference.get();
        if (viewControllerToRoutingInterface != null) {
            viewControllerToRoutingInterface.notifyRoutingAdapterOnPause();
        }
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityResume() {
        ViewControllerToRoutingInterface viewControllerToRoutingInterface;
        Log.w("HomeChannelLifeCycleObserver", "onActivityResume isForegrounding current value is:" + this.isForegrounding);
        this.onResume.invoke(Boolean.valueOf(this.isForegrounding));
        if (!this.isForegrounding || (viewControllerToRoutingInterface = this.routingInterfaceReference.get()) == null) {
            return;
        }
        viewControllerToRoutingInterface.notifyRoutingAdapterOnResume();
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityCreated() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStart() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStop() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeChannelLifeCycleObserver(@NotNull ViewControllerToRoutingInterface viewControllerToRoutingInterface, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        viewControllerToRoutingInterface.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        this.onResume = function1;
        this.onPause = function0;
        this.onDestroy = function02;
        this.routingInterfaceReference = new WeakReference<>(viewControllerToRoutingInterface);
    }
}
