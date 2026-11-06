package com.amazon.alexa.ra.core.performance;

import android.app.Activity;
import android.view.Window;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.alexa.ra.core.data.utils.DefaultDispatcherProvider;
import com.amazon.alexa.ra.core.data.utils.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/performance/JankMonitor;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "addTag", "", "tag", "", "removeTag", "startMonitoring", "stopMonitoring", "isMonitoring", "", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface JankMonitor extends DefaultLifecycleObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/performance/JankMonitor$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/ra/core/performance/JankMonitor;", "activity", "Landroid/app/Activity;", "window", "Landroid/view/Window;", "dispatcherProvider", "Lcom/amazon/alexa/ra/core/data/utils/DispatcherProvider;", "getInstance", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ JankMonitor create$default(Companion companion, Activity activity, Window window, DispatcherProvider dispatcherProvider, int i, Object obj) {
            if ((i & 4) != 0) {
                dispatcherProvider = new DefaultDispatcherProvider();
            }
            return companion.create(activity, window, dispatcherProvider);
        }

        @JvmStatic
        @Nullable
        public final JankMonitor create(@NotNull Activity activity, @NotNull Window window, @NotNull DispatcherProvider dispatcherProvider) {
            activity.getClass();
            window.getClass();
            dispatcherProvider.getClass();
            return JankMonitorImpl.INSTANCE.create(activity, window, dispatcherProvider);
        }

        @JvmStatic
        @Nullable
        public final JankMonitor getInstance() {
            return JankMonitorImpl.INSTANCE.getInstance();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onCreate(@NotNull JankMonitor jankMonitor, @NotNull LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getClass();
            JankMonitor.super.onCreate(lifecycleOwner);
        }

        @Deprecated
        public static void onDestroy(@NotNull JankMonitor jankMonitor, @NotNull LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getClass();
            JankMonitor.super.onDestroy(lifecycleOwner);
        }

        @Deprecated
        public static void onPause(@NotNull JankMonitor jankMonitor, @NotNull LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getClass();
            JankMonitor.super.onPause(lifecycleOwner);
        }

        @Deprecated
        public static void onResume(@NotNull JankMonitor jankMonitor, @NotNull LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getClass();
            JankMonitor.super.onResume(lifecycleOwner);
        }

        @Deprecated
        public static void onStart(@NotNull JankMonitor jankMonitor, @NotNull LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getClass();
            JankMonitor.super.onStart(lifecycleOwner);
        }

        @Deprecated
        public static void onStop(@NotNull JankMonitor jankMonitor, @NotNull LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getClass();
            JankMonitor.super.onStop(lifecycleOwner);
        }
    }

    @JvmStatic
    @Nullable
    static JankMonitor create(@NotNull Activity activity, @NotNull Window window, @NotNull DispatcherProvider dispatcherProvider) {
        return INSTANCE.create(activity, window, dispatcherProvider);
    }

    @JvmStatic
    @Nullable
    static JankMonitor getInstance() {
        return INSTANCE.getInstance();
    }

    void addTag(@NotNull String tag);

    boolean isMonitoring();

    void removeTag(@NotNull String tag);

    void startMonitoring();

    void stopMonitoring();
}
