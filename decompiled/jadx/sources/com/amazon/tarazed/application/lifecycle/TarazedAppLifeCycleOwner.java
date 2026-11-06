package com.amazon.tarazed.application.lifecycle;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import com.amazon.tarazed.dagger.injectors.LibraryInjector;
import com.amazon.tarazed.utility.DeviceInfoUtility;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001fH\u0080@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001fH\u0080@¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0013H\u0001¢\u0006\u0002\b(R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/amazon/tarazed/application/lifecycle/TarazedAppLifeCycleOwner;", "", "()V", "<set-?>", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "deviceInfo", "getDeviceInfo$TarazedAndroidLibrary_release", "()Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "setDeviceInfo$TarazedAndroidLibrary_release", "(Lcom/amazon/tarazed/utility/DeviceInfoUtility;)V", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "dispatcherProvider", "getDispatcherProvider$TarazedAndroidLibrary_release", "()Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "setDispatcherProvider$TarazedAndroidLibrary_release", "(Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;)V", "hasRegisteredObserver", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Lcom/amazon/tarazed/application/lifecycle/TarazedAppLifeCycleObserver;", "observer", "getObserver$TarazedAndroidLibrary_release", "()Lcom/amazon/tarazed/application/lifecycle/TarazedAppLifeCycleObserver;", "setObserver$TarazedAndroidLibrary_release", "(Lcom/amazon/tarazed/application/lifecycle/TarazedAppLifeCycleObserver;)V", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "getOwner", "()Landroidx/lifecycle/LifecycleOwner;", "deregisterLifeCycleObserver", "", "deregisterLifeCycleObserver$TarazedAndroidLibrary_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerLifeCycleObserver", "registerLifeCycleObserver$TarazedAndroidLibrary_release", "setHasRegisteredObserver", "setHasRegisteredObserver$TarazedAndroidLibrary_release", "setLifeCycle", "lifecycleOwner", "setLifeCycle$TarazedAndroidLibrary_release", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TarazedAppLifeCycleOwner {

    @NotNull
    public static final TarazedAppLifeCycleOwner INSTANCE;
    public static DeviceInfoUtility deviceInfo;
    public static DispatcherProvider dispatcherProvider;
    private static boolean hasRegisteredObserver;

    @NotNull
    private static Lifecycle lifecycle;
    public static TarazedAppLifeCycleObserver observer;

    @NotNull
    private static final LifecycleOwner owner;

    static {
        TarazedAppLifeCycleOwner tarazedAppLifeCycleOwner = new TarazedAppLifeCycleOwner();
        INSTANCE = tarazedAppLifeCycleOwner;
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
        lifecycle = companion.get().getLifecycle();
        owner = companion.get();
        LibraryInjector.getComponent().inject(tarazedAppLifeCycleOwner);
    }

    private TarazedAppLifeCycleOwner() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deregisterLifeCycleObserver$TarazedAndroidLibrary_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$1 r0 = (com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$1 r0 = new com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner r5 = (com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5e
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner.hasRegisteredObserver
            if (r6 == 0) goto L61
            com.amazon.tarazed.utility.DeviceInfoUtility r6 = r5.getDeviceInfo$TarazedAndroidLibrary_release()
            boolean r6 = r6.getIs1PDevice()
            if (r6 != 0) goto L61
            com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider r6 = r5.getDispatcherProvider$TarazedAndroidLibrary_release()
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.main()
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$2 r2 = new com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$deregisterLifeCycleObserver$2
            r4 = 0
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            r5 = 0
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner.hasRegisteredObserver = r5
        L61:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner.deregisterLifeCycleObserver$TarazedAndroidLibrary_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final DeviceInfoUtility getDeviceInfo$TarazedAndroidLibrary_release() {
        DeviceInfoUtility deviceInfoUtility = deviceInfo;
        if (deviceInfoUtility != null) {
            return deviceInfoUtility;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceInfo");
        return null;
    }

    @NotNull
    public final DispatcherProvider getDispatcherProvider$TarazedAndroidLibrary_release() {
        DispatcherProvider dispatcherProvider2 = dispatcherProvider;
        if (dispatcherProvider2 != null) {
            return dispatcherProvider2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dispatcherProvider");
        return null;
    }

    @NotNull
    public final TarazedAppLifeCycleObserver getObserver$TarazedAndroidLibrary_release() {
        TarazedAppLifeCycleObserver tarazedAppLifeCycleObserver = observer;
        if (tarazedAppLifeCycleObserver != null) {
            return tarazedAppLifeCycleObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @NotNull
    public final LifecycleOwner getOwner() {
        return owner;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerLifeCycleObserver$TarazedAndroidLibrary_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$1 r0 = (com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$1 r0 = new com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner r5 = (com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5e
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner.hasRegisteredObserver
            if (r6 != 0) goto L60
            com.amazon.tarazed.utility.DeviceInfoUtility r6 = r5.getDeviceInfo$TarazedAndroidLibrary_release()
            boolean r6 = r6.getIs1PDevice()
            if (r6 != 0) goto L60
            com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider r6 = r5.getDispatcherProvider$TarazedAndroidLibrary_release()
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.main()
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$2 r2 = new com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner$registerLifeCycleObserver$2
            r4 = 0
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner.hasRegisteredObserver = r3
        L60:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.tarazed.application.lifecycle.TarazedAppLifeCycleOwner.registerLifeCycleObserver$TarazedAndroidLibrary_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Inject
    public final void setDeviceInfo$TarazedAndroidLibrary_release(@NotNull DeviceInfoUtility deviceInfoUtility) {
        deviceInfoUtility.getClass();
        deviceInfo = deviceInfoUtility;
    }

    @Inject
    public final void setDispatcherProvider$TarazedAndroidLibrary_release(@NotNull DispatcherProvider dispatcherProvider2) {
        dispatcherProvider2.getClass();
        dispatcherProvider = dispatcherProvider2;
    }

    @VisibleForTesting
    public final void setHasRegisteredObserver$TarazedAndroidLibrary_release(boolean hasRegisteredObserver2) {
        hasRegisteredObserver = hasRegisteredObserver2;
    }

    @VisibleForTesting
    public final void setLifeCycle$TarazedAndroidLibrary_release(@NotNull Lifecycle lifecycleOwner) {
        lifecycleOwner.getClass();
        lifecycle = lifecycleOwner;
    }

    @Inject
    public final void setObserver$TarazedAndroidLibrary_release(@NotNull TarazedAppLifeCycleObserver tarazedAppLifeCycleObserver) {
        tarazedAppLifeCycleObserver.getClass();
        observer = tarazedAppLifeCycleObserver;
    }
}
