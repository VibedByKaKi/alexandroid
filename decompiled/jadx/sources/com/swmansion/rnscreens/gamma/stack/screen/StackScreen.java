package com.swmansion.rnscreens.gamma.stack.screen;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.ext.ViewExtKt;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import com.swmansion.rnscreens.gamma.stack.host.StackHost;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreen;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020+H\u0000¢\u0006\u0002\b3J0\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0014J\n\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006>"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;", "Landroid/view/ViewGroup;", "Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "value", "", "isNativelyDismissed", "isNativelyDismissed$react_native_screens_release", "()Z", "setNativelyDismissed$react_native_screens_release", "(Z)V", "stackHost", "Ljava/lang/ref/WeakReference;", "Lcom/swmansion/rnscreens/gamma/stack/host/StackHost;", "getStackHost$react_native_screens_release", "()Ljava/lang/ref/WeakReference;", "setStackHost$react_native_screens_release", "(Ljava/lang/ref/WeakReference;)V", "<set-?>", "Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", "activityMode", "getActivityMode", "()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", "setActivityMode", "(Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;)V", "activityMode$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "screenKey", "getScreenKey", "()Ljava/lang/String;", "setScreenKey", "(Ljava/lang/String;)V", "eventEmitter", "Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenEventEmitter;", "getEventEmitter$react_native_screens_release", "()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenEventEmitter;", "setEventEmitter$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenEventEmitter;)V", "onViewManagerAddEventEmitters", "", "onViewManagerAddEventEmitters$react_native_screens_release", "createAppearanceEventsEmitter", "Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenAppearanceEventsEmitter;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "createAppearanceEventsEmitter$react_native_screens_release", "onDismiss", "onDismiss$react_native_screens_release", "onLayout", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "", "t", "r", "b", "getAssociatedFragment", "Landroidx/fragment/app/Fragment;", "ActivityMode", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nStackScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackScreen.kt\ncom/swmansion/rnscreens/gamma/stack/screen/StackScreen\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n33#2,3:79\n1#3:82\n*S KotlinDebug\n*F\n+ 1 StackScreen.kt\ncom/swmansion/rnscreens/gamma/stack/screen/StackScreen\n*L\n33#1:79,3\n*E\n"})
/* loaded from: classes9.dex */
public final class StackScreen extends ViewGroup implements FragmentProviding {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {AppLaunchChecker$$ExternalSyntheticOutline0.m(StackScreen.class, "activityMode", "getActivityMode()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", 0)};

    /* renamed from: activityMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty activityMode;
    public StackScreenEventEmitter eventEmitter;
    private boolean isNativelyDismissed;

    @NotNull
    private final ThemedReactContext reactContext;

    @Nullable
    private String screenKey;

    @NotNull
    private WeakReference<StackHost> stackHost;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", "", "<init>", "(Ljava/lang/String;I)V", "DETACHED", "ATTACHED", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivityMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActivityMode[] $VALUES;
        public static final ActivityMode DETACHED = new ActivityMode("DETACHED", 0);
        public static final ActivityMode ATTACHED = new ActivityMode("ATTACHED", 1);

        private static final /* synthetic */ ActivityMode[] $values() {
            return new ActivityMode[]{DETACHED, ATTACHED};
        }

        static {
            ActivityMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ActivityMode(String str, int i) {
        }

        @NotNull
        public static EnumEntries<ActivityMode> getEntries() {
            return $ENTRIES;
        }

        public static ActivityMode valueOf(String str) {
            return (ActivityMode) Enum.valueOf(ActivityMode.class, str);
        }

        public static ActivityMode[] values() {
            return (ActivityMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackScreen(@NotNull ThemedReactContext themedReactContext) {
        super(themedReactContext);
        themedReactContext.getClass();
        this.reactContext = themedReactContext;
        this.stackHost = new WeakReference<>(null);
        Delegates delegates = Delegates.INSTANCE;
        final ActivityMode activityMode = ActivityMode.DETACHED;
        this.activityMode = new ObservableProperty<ActivityMode>(activityMode) { // from class: com.swmansion.rnscreens.gamma.stack.screen.StackScreen$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, StackScreen.ActivityMode oldValue, StackScreen.ActivityMode newValue) {
                StackHost stackHost;
                property.getClass();
                if (oldValue == newValue || (stackHost = this.getStackHost$react_native_screens_release().get()) == null) {
                    return;
                }
                stackHost.stackScreenChangedActivityMode$react_native_screens_release(this);
            }
        };
    }

    @NotNull
    public final StackScreenAppearanceEventsEmitter createAppearanceEventsEmitter$react_native_screens_release(@NotNull LifecycleOwner viewLifecycleOwner) {
        viewLifecycleOwner.getClass();
        return new StackScreenAppearanceEventsEmitter(viewLifecycleOwner.getLifecycle(), getEventEmitter$react_native_screens_release());
    }

    @NotNull
    public final ActivityMode getActivityMode() {
        return (ActivityMode) this.activityMode.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.swmansion.rnscreens.gamma.common.FragmentProviding
    @Nullable
    public Fragment getAssociatedFragment() {
        Fragment findFragmentOrNull = ViewExtKt.findFragmentOrNull(this);
        if (findFragmentOrNull == null) {
            return null;
        }
        if (findFragmentOrNull instanceof StackScreenFragment) {
            return findFragmentOrNull;
        }
        PathKt$$ExternalSyntheticBUOutline0.m((Object) "[RNScreens] Unexpected fragment type: ".concat(findFragmentOrNull.getClass().getSimpleName()));
        return null;
    }

    @NotNull
    public final StackScreenEventEmitter getEventEmitter$react_native_screens_release() {
        StackScreenEventEmitter stackScreenEventEmitter = this.eventEmitter;
        if (stackScreenEventEmitter != null) {
            return stackScreenEventEmitter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    @Nullable
    public final String getScreenKey() {
        return this.screenKey;
    }

    @NotNull
    public final WeakReference<StackHost> getStackHost$react_native_screens_release() {
        return this.stackHost;
    }

    /* renamed from: isNativelyDismissed$react_native_screens_release, reason: from getter */
    public final boolean getIsNativelyDismissed() {
        return this.isNativelyDismissed;
    }

    public final void onDismiss$react_native_screens_release() {
        if (getActivityMode() == ActivityMode.ATTACHED) {
            setNativelyDismissed$react_native_screens_release(true);
        }
        getEventEmitter$react_native_screens_release().emitOnDismiss$react_native_screens_release(this.isNativelyDismissed);
    }

    public final void onViewManagerAddEventEmitters$react_native_screens_release() {
        if (getId() != -1) {
            setEventEmitter$react_native_screens_release(new StackScreenEventEmitter(this.reactContext, getId()));
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("[RNScreens] StackScreen must have its tag set when registering event emitters");
        }
    }

    public final void setActivityMode(@NotNull ActivityMode activityMode) {
        activityMode.getClass();
        this.activityMode.setValue(this, $$delegatedProperties[0], activityMode);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull StackScreenEventEmitter stackScreenEventEmitter) {
        stackScreenEventEmitter.getClass();
        this.eventEmitter = stackScreenEventEmitter;
    }

    public final void setNativelyDismissed$react_native_screens_release(boolean z) {
        if (z) {
            this.isNativelyDismissed = true;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("[RNScreens] Natively dismissed StackScreen must remain dismissed.");
        }
    }

    public final void setScreenKey(@Nullable String str) {
        if (this.screenKey == null) {
            this.screenKey = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("[RNScreens] StackScreen can't change its screenKey.");
        }
    }

    public final void setStackHost$react_native_screens_release(@NotNull WeakReference<StackHost> weakReference) {
        weakReference.getClass();
        this.stackHost = weakReference;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
