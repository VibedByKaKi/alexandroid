package com.amazon.alexa.ra.android.smartfragment.react;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 )2\u00020\u0001:\u0001)J,\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0010H'J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0007\u001a\u00020\bH'¢\u0006\u0004\b\u0014\u0010\u0015Jl\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192(\u0010\u001a\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001bj\u0004\u0018\u0001`\u001d2(\u0010\u001e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001bj\u0004\u0018\u0001`\u001fH&J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH&J&\u0010\"\u001a\u00020\u00102\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\fH&J\u001e\u0010$\u001a\u00020\u00102\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cH&J\b\u0010&\u001a\u00020\u0010H&J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006*"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/react/ReactBridge;", "", "isInvalidated", "", "()Z", "createSurface", "Lcom/amazon/alexa/ra/android/smartfragment/react/MountedSurface;", "context", "Landroid/content/Context;", RouteParameter.PARENT, "Landroid/view/ViewGroup;", "componentName", "", "props", "Landroid/os/Bundle;", "onHostResume", "", "onHostPause", "onConfigurationChanged", "Lkotlin/Result;", "onConfigurationChanged-IoAF18A", "(Landroid/content/Context;)Ljava/lang/Object;", "registerViewId", "viewId", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Lcom/amazon/alexa/ra/android/smartfragment/react/ViewClaim;", "onMessage", "Lkotlin/Function1;", "", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/MessageHandler;", "onError", "Lcom/amazon/alexa/ra/android/smartfragment/messaging/RawErrorHandler;", "unregisterViewId", "forgetViewId", "postMessage", "data", "reportError", LogLevel.INFO, "invalidate", "onDestroyFinished", "Lcom/amazon/alexa/ra/android/smartfragment/react/DestroyCompletion;", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ReactBridge {

    @NotNull
    public static final String CONTENT_PROP = "content";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String SANDBOX_VIEW_ID_PROP = "__sandboxViewId";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/react/ReactBridge$Companion;", "", "<init>", "()V", "SANDBOX_VIEW_ID_PROP", "", "CONTENT_PROP", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String CONTENT_PROP = "content";

        @NotNull
        public static final String SANDBOX_VIEW_ID_PROP = "__sandboxViewId";

        private Companion() {
        }
    }

    @MainThread
    @Nullable
    MountedSurface createSurface(@NotNull Context context, @NotNull ViewGroup parent, @NotNull String componentName, @Nullable Bundle props);

    void forgetViewId(@NotNull String viewId);

    void invalidate();

    void invalidate(@NotNull DestroyCompletion onDestroyFinished);

    boolean isInvalidated();

    @MainThread
    @NotNull
    /* renamed from: onConfigurationChanged-IoAF18A */
    Object mo17436onConfigurationChangedIoAF18A(@NotNull Context context);

    @MainThread
    void onHostPause();

    @MainThread
    void onHostResume();

    void postMessage(@NotNull Map<String, ? extends Object> data, @NotNull String viewId);

    void registerViewId(@NotNull String viewId, @NotNull ViewClaim owner, @Nullable Function1<? super Map<String, ? extends Object>, Unit> onMessage, @Nullable Function1<? super Map<String, ? extends Object>, Unit> onError);

    void reportError(@NotNull Map<String, ? extends Object> info);

    void unregisterViewId(@NotNull String viewId, @NotNull ViewClaim owner);
}
