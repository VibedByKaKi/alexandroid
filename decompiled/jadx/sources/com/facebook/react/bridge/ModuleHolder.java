package com.facebook.react.bridge;

import androidx.annotation.GuardedBy;
import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.systrace.SystraceMessage;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\nJ\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010'\u001a\u00020\u0006H\u0002J\u0012\u0010(\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u00020\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u0011\u0010$\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder;", "", "moduleInfo", "Lcom/facebook/react/module/model/ReactModuleInfo;", "provider", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "<init>", "(Lcom/facebook/react/module/model/ReactModuleInfo;Ljavax/inject/Provider;)V", "nativeModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "instanceKey", "", "name", "", "getName", "()Ljava/lang/String;", "reactModuleInfo", "internalModule", "initializable", "", "isCreating", "isInitializing", "markInitializable", "", "markInitializable$ReactAndroid_release", "hasInstance", "hasInstance$ReactAndroid_release", "destroy", "canOverrideExistingModule", "getCanOverrideExistingModule", "()Z", "isTurboModule", "isCxxModule", "className", "getClassName", "module", "getModule", "()Lcom/facebook/react/bridge/NativeModule;", "create", "doInitialize", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModuleHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleHolder.kt\ncom/facebook/react/bridge/ModuleHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
/* loaded from: classes6.dex */
public final class ModuleHolder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger instanceKeyCounter = new AtomicInteger(1);

    @GuardedBy("this")
    private boolean initializable;
    private final int instanceKey;

    @GuardedBy("this")
    @Nullable
    private NativeModule internalModule;

    @GuardedBy("this")
    private boolean isCreating;

    @GuardedBy("this")
    private boolean isInitializing;

    @NotNull
    private final String name;

    @Nullable
    private Provider<? extends NativeModule> provider;

    @NotNull
    private final ReactModuleInfo reactModuleInfo;

    public ModuleHolder(@NotNull NativeModule nativeModule) {
        nativeModule.getClass();
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        String name = nativeModule.getName();
        name.getClass();
        this.name = name;
        String name2 = nativeModule.getName();
        name2.getClass();
        this.reactModuleInfo = new ReactModuleInfo(name2, nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.INSTANCE.classIsTurboModule(nativeModule.getClass()));
        this.internalModule = nativeModule;
        PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.NATIVE_MODULE, "NativeModule init: %s", name);
    }

    private final NativeModule create() {
        boolean z = false;
        SoftAssertions.assertCondition(this.internalModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.name, this.instanceKey);
        SystraceMessage.beginSection(0L, "ModuleHolder.createModule").arg("name", this.name).flush();
        PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.NATIVE_MODULE, "NativeModule init: %s", this.name);
        try {
            Provider<? extends NativeModule> provider = this.provider;
            if (provider == null) {
                throw new IllegalStateException("Required value was null.");
            }
            NativeModule nativeModule = provider.get();
            nativeModule.getClass();
            NativeModule nativeModule2 = nativeModule;
            this.provider = null;
            synchronized (this) {
                try {
                    this.internalModule = nativeModule2;
                    if (this.initializable && !this.isInitializing) {
                        z = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                doInitialize(nativeModule2);
            }
            return nativeModule2;
        } finally {
        }
    }

    private final void doInitialize(NativeModule module) {
        boolean z;
        SystraceMessage.beginSection(0L, "ModuleHolder.initialize").arg("name", this.name).flush();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.name, this.instanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.initializable || this.isInitializing) {
                        z = false;
                    } else {
                        z = true;
                        this.isInitializing = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (z) {
                if (module != null) {
                    module.initialize();
                }
                synchronized (this) {
                    this.isInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            SystraceMessage.endSection(0L).flush();
        }
    }

    public final synchronized void destroy() {
        NativeModule nativeModule = this.internalModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public final boolean getCanOverrideExistingModule() {
        return this.reactModuleInfo.getCanOverrideExistingModule();
    }

    @NotNull
    public final String getClassName() {
        return this.reactModuleInfo.getClassName();
    }

    @DoNotStrip
    @NotNull
    public final NativeModule getModule() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            try {
                NativeModule nativeModule2 = this.internalModule;
                if (nativeModule2 != null) {
                    return nativeModule2;
                }
                if (this.isCreating) {
                    z = false;
                } else {
                    z = true;
                    this.isCreating = true;
                }
                Unit unit = Unit.INSTANCE;
                if (z) {
                    NativeModule create = create();
                    synchronized (this) {
                        this.isCreating = false;
                        notifyAll();
                    }
                    return create;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.internalModule;
                        if (nativeModule != null || !this.isCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (nativeModule == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return nativeModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @DoNotStrip
    @NotNull
    public final String getName() {
        return this.name;
    }

    public final synchronized boolean hasInstance$ReactAndroid_release() {
        return this.internalModule != null;
    }

    public final boolean isCxxModule() {
        return this.reactModuleInfo.getIsCxxModule();
    }

    public final boolean isTurboModule() {
        return this.reactModuleInfo.getIsTurboModule();
    }

    public final void markInitializable$ReactAndroid_release() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            try {
                this.initializable = true;
                nativeModule = this.internalModule;
                if (nativeModule == null) {
                    z = false;
                    nativeModule = null;
                } else if (this.isInitializing) {
                    throw new IllegalStateException("Check failed.");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (nativeModule != null) {
                doInitialize(nativeModule);
            } else {
                Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder$Companion;", "", "<init>", "()V", "instanceKeyCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModuleHolder(@NotNull ReactModuleInfo reactModuleInfo, @NotNull Provider<? extends NativeModule> provider) {
        reactModuleInfo.getClass();
        provider.getClass();
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        this.name = reactModuleInfo.getName();
        this.provider = provider;
        this.reactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.getNeedsEagerInit()) {
            this.internalModule = create();
        }
    }
}
