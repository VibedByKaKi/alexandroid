package com.swmansion.rnscreens.safearea;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.amazon.alexa.accessory.frames.media.autoimport.AutoImportConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.safearea.EdgeInsets;
import com.swmansion.rnscreens.safearea.paper.SafeAreaViewEdges;
import com.th3rdwave.safeareacontext.SafeAreaView$$ExternalSyntheticLambda1;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\n\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\fJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0002J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010*\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/swmansion/rnscreens/safearea/SafeAreaView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "provider", "Ljava/lang/ref/WeakReference;", "Lcom/swmansion/rnscreens/safearea/SafeAreaProvider;", "currentInterfaceInsets", "Lcom/swmansion/rnscreens/safearea/EdgeInsets;", "currentSystemInsets", "needsInsetsUpdate", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "edges", "Lcom/swmansion/rnscreens/safearea/paper/SafeAreaViewEdges;", "insetType", "Lcom/swmansion/rnscreens/safearea/InsetType;", "getStateWrapper", "setStateWrapper", "", "onAttachedToWindow", "onDetachedFromWindow", "findAncestorProvider", "onInterfaceInsetsChange", "newInterfaceInsets", "onApplyWindowInsets", "Landroidx/core/view/WindowInsetsCompat;", "view", "Landroid/view/View;", "insets", "updateInsetsIfNeeded", "updateInsets", "waitForReactLayout", "getConsumedInsetsFromSelectedEdges", "Landroidx/core/graphics/Insets;", "setEdges", "setInsetType", "onPreDraw", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes9.dex */
public final class SafeAreaView extends ReactViewGroup implements OnApplyWindowInsetsListener, ViewTreeObserver.OnPreDrawListener {

    @NotNull
    public static final String TAG = "SafeAreaView";

    @NotNull
    private EdgeInsets currentInterfaceInsets;

    @NotNull
    private EdgeInsets currentSystemInsets;

    @Nullable
    private SafeAreaViewEdges edges;

    @NotNull
    private InsetType insetType;
    private boolean needsInsetsUpdate;

    @NotNull
    private WeakReference<SafeAreaProvider> provider;

    @NotNull
    private final ThemedReactContext reactContext;

    @Nullable
    private StateWrapper stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaView(@NotNull ThemedReactContext themedReactContext) {
        super(themedReactContext);
        themedReactContext.getClass();
        this.reactContext = themedReactContext;
        this.provider = new WeakReference<>(null);
        EdgeInsets.Companion companion = EdgeInsets.INSTANCE;
        this.currentInterfaceInsets = companion.getZERO();
        this.currentSystemInsets = companion.getZERO();
        this.insetType = InsetType.ALL;
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
    }

    private final SafeAreaProvider findAncestorProvider() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof SafeAreaProvider)) {
            parent = parent.getParent();
        }
        if (parent instanceof SafeAreaProvider) {
            return (SafeAreaProvider) parent;
        }
        return null;
    }

    private final Insets getConsumedInsetsFromSelectedEdges(Insets insets) {
        SafeAreaViewEdges safeAreaViewEdges = this.edges;
        int i = safeAreaViewEdges != null ? safeAreaViewEdges.getLeft() : false ? 0 : insets.left;
        SafeAreaViewEdges safeAreaViewEdges2 = this.edges;
        int i2 = safeAreaViewEdges2 != null ? safeAreaViewEdges2.getTop() : false ? 0 : insets.top;
        SafeAreaViewEdges safeAreaViewEdges3 = this.edges;
        int i3 = safeAreaViewEdges3 != null ? safeAreaViewEdges3.getRight() : false ? 0 : insets.right;
        SafeAreaViewEdges safeAreaViewEdges4 = this.edges;
        Insets of = Insets.of(i, i2, i3, safeAreaViewEdges4 != null ? safeAreaViewEdges4.getBottom() : false ? 0 : insets.bottom);
        of.getClass();
        return of;
    }

    private final void updateInsets() {
        EdgeInsets.Companion companion = EdgeInsets.INSTANCE;
        EdgeInsets max = companion.max(this.insetType.containsInterface() ? this.currentInterfaceInsets : companion.getZERO(), this.insetType.containsSystem() ? this.currentSystemInsets : companion.getZERO());
        StateWrapper stateWrapper = getStateWrapper();
        if (stateWrapper != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.getClass();
            createMap.putDouble("left", PixelUtil.toDIPFromPixel(max.getLeft()));
            createMap.putDouble("top", PixelUtil.toDIPFromPixel(max.getTop()));
            createMap.putDouble("right", PixelUtil.toDIPFromPixel(max.getRight()));
            createMap.putDouble("bottom", PixelUtil.toDIPFromPixel(max.getBottom()));
            WritableMap createMap2 = Arguments.createMap();
            createMap2.getClass();
            createMap2.putMap("insets", createMap);
            stateWrapper.updateState(createMap2);
        }
    }

    private final boolean updateInsetsIfNeeded() {
        if (!this.needsInsetsUpdate) {
            return false;
        }
        this.needsInsetsUpdate = false;
        updateInsets();
        return true;
    }

    private final void waitForReactLayout() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        long nanoTime = System.nanoTime();
        UIManagerHelper.getReactContext(this).runOnNativeModulesQueueThread(new SafeAreaView$$ExternalSyntheticLambda1(reentrantLock, booleanRef, newCondition, 1));
        reentrantLock.lock();
        long j = 0;
        while (!booleanRef.element && j < AutoImportConstants.CRITICAL_STORAGE_THRESHOLD) {
            try {
                try {
                    newCondition.awaitNanos(AutoImportConstants.CRITICAL_STORAGE_THRESHOLD);
                } catch (InterruptedException unused) {
                    booleanRef.element = true;
                }
                j += System.nanoTime() - nanoTime;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        reentrantLock.unlock();
        if (j >= AutoImportConstants.CRITICAL_STORAGE_THRESHOLD) {
            Log.w(TAG, "Timed out waiting for layout.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitForReactLayout$lambda$3(ReentrantLock reentrantLock, Ref.BooleanRef booleanRef, Condition condition) {
        reentrantLock.lock();
        try {
            if (!booleanRef.element) {
                booleanRef.element = true;
                condition.signal();
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Nullable
    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull View view, @NotNull WindowInsetsCompat insets) {
        boolean z;
        view.getClass();
        insets.getClass();
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        insets2.getClass();
        if (!Intrinsics.areEqual(insets2, this.currentSystemInsets)) {
            this.currentSystemInsets = EdgeInsets.INSTANCE.fromInsets(insets2);
            if (this.insetType.containsSystem()) {
                this.needsInsetsUpdate = true;
            }
        }
        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(insets);
        if (this.insetType.containsSystem()) {
            Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            insets3.getClass();
            Insets consumedInsetsFromSelectedEdges = getConsumedInsetsFromSelectedEdges(insets3);
            Insets insets4 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
            insets4.getClass();
            Insets consumedInsetsFromSelectedEdges2 = getConsumedInsetsFromSelectedEdges(insets4);
            z = Intrinsics.areEqual(consumedInsetsFromSelectedEdges2, Insets.NONE);
            builder.setInsets(WindowInsetsCompat.Type.systemBars(), consumedInsetsFromSelectedEdges);
            builder.setInsets(WindowInsetsCompat.Type.displayCutout(), consumedInsetsFromSelectedEdges2);
        } else {
            z = false;
        }
        WindowInsetsCompat build = builder.build();
        build.getClass();
        if (Build.VERSION.SDK_INT >= 30 || !z) {
            return build;
        }
        WindowInsetsCompat consumeDisplayCutout = build.consumeDisplayCutout();
        consumeDisplayCutout.getClass();
        return consumeDisplayCutout;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        SafeAreaProvider findAncestorProvider = findAncestorProvider();
        if (findAncestorProvider == null) {
            super.onAttachedToWindow();
            return;
        }
        findAncestorProvider.setOnInterfaceInsetsChangeListener(this);
        this.provider = new WeakReference<>(findAncestorProvider);
        this.currentInterfaceInsets = findAncestorProvider.getInterfaceInsets();
        updateInsets();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        SafeAreaProvider safeAreaProvider = this.provider.get();
        if (safeAreaProvider != null) {
            safeAreaProvider.removeOnInterfaceInsetsChangeListener(this);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    public final void onInterfaceInsetsChange(@NotNull EdgeInsets newInterfaceInsets) {
        newInterfaceInsets.getClass();
        if (Intrinsics.areEqual(newInterfaceInsets, this.currentInterfaceInsets)) {
            return;
        }
        this.currentInterfaceInsets = newInterfaceInsets;
        if (this.insetType.containsInterface()) {
            this.needsInsetsUpdate = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean updateInsetsIfNeeded = updateInsetsIfNeeded();
        if (updateInsetsIfNeeded) {
            requestLayout();
        }
        return !updateInsetsIfNeeded;
    }

    public final void setEdges(@NotNull SafeAreaViewEdges edges) {
        edges.getClass();
        this.edges = edges;
        requestApplyInsets();
        this.needsInsetsUpdate = true;
    }

    public final void setInsetType(@NotNull InsetType insetType) {
        insetType.getClass();
        this.insetType = insetType;
        requestApplyInsets();
        this.needsInsetsUpdate = true;
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }
}
