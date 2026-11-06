package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStripAny
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0082 J\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0082 J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0012\u001a\u00020\u0005¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "dispatchEvent", "", "eventName", "", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Lcom/facebook/react/bridge/NativeMap;", "category", "", "dispatchEventSynchronously", "dispatchUniqueEvent", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "dispatchUnique", "destroy", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes6.dex */
public final class EventEmitterWrapper extends HybridClassBase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    static {
        FabricSoLoader.staticInit();
    }

    private EventEmitterWrapper() {
    }

    private final native void dispatchEvent(String eventName, NativeMap params, int category);

    private final native void dispatchEventSynchronously(String eventName, NativeMap params);

    private final native void dispatchUniqueEvent(String eventName, NativeMap params);

    public final synchronized void destroy() {
        if (isValid()) {
            resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatch(@NotNull String eventName, @Nullable WritableMap params, int eventCategory) {
        eventName.getClass();
        if (isValid()) {
            dispatchEvent(eventName, (NativeMap) params, eventCategory);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchEventSynchronously(@NotNull String eventName, @Nullable WritableMap params) {
        eventName.getClass();
        if (isValid()) {
            UiThreadUtil.assertOnUiThread();
            dispatchEventSynchronously(eventName, (NativeMap) params);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchUnique(@NotNull String eventName, @Nullable WritableMap params) {
        eventName.getClass();
        if (isValid()) {
            dispatchUniqueEvent(eventName, (NativeMap) params);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/events/EventEmitterWrapper$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
