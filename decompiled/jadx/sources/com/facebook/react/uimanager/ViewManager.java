package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactPropertyHolder
/* loaded from: classes6.dex */
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    private static final String TAG = "ViewManager";

    @Nullable
    private ViewManagerDelegate<T> mDelegate;

    @Nullable
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private ViewManagerDelegate<T> getOrCreateViewManagerDelegate() {
        ViewManagerDelegate<T> viewManagerDelegate = this.mDelegate;
        if (viewManagerDelegate != null) {
            return viewManagerDelegate;
        }
        ViewManagerDelegate<T> delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    @Nullable
    private Stack<T> getRecyclableViewStack(int i, boolean z) {
        HashMap<Integer, Stack<T>> hashMap = this.mRecyclableViews;
        if (hashMap == null) {
            return null;
        }
        if (z && !hashMap.containsKey(Integer.valueOf(i))) {
            this.mRecyclableViews.put(Integer.valueOf(i), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i));
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public T createView(int i, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper, JSResponderHandler jSResponderHandler) {
        T createViewInstance = createViewInstance(i, themedReactContext, reactStylesDiffMap, stateWrapper);
        if (createViewInstance instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) createViewInstance).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return createViewInstance;
    }

    @NonNull
    public T createViewInstance(int i, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        Object updateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), true);
        T createViewInstance = (recyclableViewStack == null || recyclableViewStack.empty()) ? createViewInstance(themedReactContext) : recycleView(themedReactContext, recyclableViewStack.pop());
        createViewInstance.setId(i);
        addEventEmitters(themedReactContext, createViewInstance);
        if (reactStylesDiffMap != null) {
            updateProperties(createViewInstance, reactStylesDiffMap);
        }
        if (stateWrapper != null && (updateState = updateState(createViewInstance, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    @NonNull
    public abstract T createViewInstance(@NonNull ThemedReactContext themedReactContext);

    @UnstableReactNativeAPI
    public boolean experimental_isPrefetchingEnabled() {
        return false;
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public ViewManagerDelegate<T> getDelegate() {
        if (this instanceof ViewManagerWithGeneratedInterface) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new ViewManagerPropertyUpdater.GenericViewManagerDelegate(this);
    }

    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) ? ViewManagerPropertyUpdater.getNativeProps(getClass(), null) : ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable float[] fArr) {
        return 0L;
    }

    public void onDropViewInstance(@NonNull T t) {
        T prepareToRecycleView;
        Context context = t.getContext();
        if (context == null) {
            FLog.e(TAG, "onDropViewInstance: view [" + t.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof ThemedReactContext)) {
            FLog.e(TAG, "onDropViewInstance: view [" + t.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), false);
        if (recyclableViewStack == null || (prepareToRecycleView = prepareToRecycleView(themedReactContext, t)) == null) {
            return;
        }
        Assertions.assertCondition(prepareToRecycleView.getParent() == null, "Recycled view [" + t.getId() + "] should not be attached to a parent. View: " + t + " Parent: " + prepareToRecycleView.getParent() + " ThemedReactContext: " + themedReactContext);
        recyclableViewStack.push(prepareToRecycleView);
    }

    public void onSurfaceStopped(int i) {
        HashMap<Integer, Stack<T>> hashMap = this.mRecyclableViews;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
    }

    @Nullable
    public abstract T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t);

    public void receiveCommand(@NonNull T t, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().kotlinCompat$receiveCommand(t, str, readableArray);
    }

    public void setupViewRecycling() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(@NonNull T t, Object obj);

    public void updateProperties(@NonNull T t, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerDelegate<T> orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.kotlinCompat$setProperty(t, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t);
    }

    @Nullable
    public Object updateState(@NonNull T t, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        return null;
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    @Deprecated
    public void receiveCommand(@NonNull T t, int i, ReadableArray readableArray) {
    }

    public ViewManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    public void onAfterUpdateTransaction(@NonNull T t) {
    }

    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, @NonNull T t) {
    }

    public T recycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t) {
        return t;
    }

    @UnstableReactNativeAPI
    public void experimental_prefetchResource(ReactContext reactContext, int i, int i2, MapBuffer mapBuffer) {
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }
}
