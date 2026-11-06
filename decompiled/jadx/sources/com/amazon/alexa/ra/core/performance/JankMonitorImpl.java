package com.amazon.alexa.ra.core.performance;

import android.app.Activity;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.alexa.ra.core.data.utils.DispatcherProvider;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/performance/JankMonitorImpl;", "Lcom/amazon/alexa/ra/core/performance/JankMonitor;", "<init>", "()V", "onResume", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onPause", "onDestroy", "addTag", "tag", "", "removeTag", "startMonitoring", "stopMonitoring", "isMonitoring", "", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class JankMonitorImpl implements JankMonitor {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final JankMonitorImpl INSTANCE = new JankMonitorImpl();

    private JankMonitorImpl() {
    }

    @JvmStatic
    @Nullable
    public static final JankMonitor create(@NotNull Activity activity, @NotNull Window window, @NotNull DispatcherProvider dispatcherProvider) {
        return INSTANCE.create(activity, window, dispatcherProvider);
    }

    @JvmStatic
    @Nullable
    public static final JankMonitor getInstance() {
        return INSTANCE.getInstance();
    }

    @Override // com.amazon.alexa.ra.core.performance.JankMonitor
    public void addTag(@NotNull String tag) {
        tag.getClass();
    }

    @Override // com.amazon.alexa.ra.core.performance.JankMonitor
    public boolean isMonitoring() {
        return false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        owner.getClass();
    }

    @Override // com.amazon.alexa.ra.core.performance.JankMonitor
    public void removeTag(@NotNull String tag) {
        tag.getClass();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/core/performance/JankMonitorImpl$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/amazon/alexa/ra/core/performance/JankMonitorImpl;", "create", "Lcom/amazon/alexa/ra/core/performance/JankMonitor;", "activity", "Landroid/app/Activity;", "window", "Landroid/view/Window;", "dispatcherProvider", "Lcom/amazon/alexa/ra/core/data/utils/DispatcherProvider;", "getInstance", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final JankMonitor create(@NotNull Activity activity, @NotNull Window window, @NotNull DispatcherProvider dispatcherProvider) {
            activity.getClass();
            window.getClass();
            dispatcherProvider.getClass();
            return null;
        }

        @JvmStatic
        @Nullable
        public final JankMonitor getInstance() {
            return null;
        }

        private Companion() {
        }
    }

    @Override // com.amazon.alexa.ra.core.performance.JankMonitor
    public void startMonitoring() {
    }

    @Override // com.amazon.alexa.ra.core.performance.JankMonitor
    public void stopMonitoring() {
    }
}
