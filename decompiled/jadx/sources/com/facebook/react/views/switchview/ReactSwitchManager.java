package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import com.amazon.clouddrive.cdasdk.aps.account.FeatureState;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.AndroidSwitchManagerDelegate;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0000\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001>B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0018H\u0017J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0017J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0018H\u0017J\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010!J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010!J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010!J\u001f\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010!J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0014JX\u0010.\u001a\u00020/2\u0006\u0010\u000f\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0018\u0010=\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0018H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/switchview/ReactSwitch;", "Lcom/facebook/react/views/switchview/ReactSwitchShadowNode;", "Lcom/facebook/react/viewmanagers/AndroidSwitchManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createShadowNodeInstance", "getShadowNodeClass", "Ljava/lang/Class;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setBackgroundColor", "", "view", "backgroundColor", "", "setDisabled", FeatureState.DISABLED, "", "setEnabled", "enabled", "setOn", "on", "setValue", "value", "setThumbTintColor", "color", "(Lcom/facebook/react/views/switchview/ReactSwitch;Ljava/lang/Integer;)V", "setThumbColor", "setTrackColorForFalse", "setTrackColorForTrue", "setTrackTintColor", "setNativeValue", "addEventEmitters", "reactContext", "updateExtraData", "root", "extraData", "", "getDelegate", "measure", "", "Landroid/content/Context;", "localData", "Lcom/facebook/react/bridge/ReadableMap;", "props", "state", "width", "", "widthMode", "Lcom/facebook/yoga/YogaMeasureMode;", "height", "heightMode", "attachmentsPositions", "", "setValueInternal", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactSwitchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactSwitchManager.kt\ncom/facebook/react/views/switchview/ReactSwitchManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: classes7.dex */
public final class ReactSwitchManager extends BaseViewManager<ReactSwitch, ReactSwitchShadowNode> implements AndroidSwitchManagerInterface<ReactSwitch> {

    @NotNull
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new ReactSwitchManager$$ExternalSyntheticLambda0();

    @NotNull
    public static final String REACT_CLASS = "AndroidSwitch";

    @NotNull
    private final ViewManagerDelegate<ReactSwitch> delegate = new AndroidSwitchManagerDelegate(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ON_CHECKED_CHANGE_LISTENER$lambda$2(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Context context = compoundButton.getContext();
        context.getClass();
        ReactContext reactContext = (ReactContext) context;
        int id = compoundButton.getId();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, id);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ReactSwitchEvent(UIManagerHelper.getSurfaceId(reactContext), id, z));
        }
    }

    private final void setValueInternal(ReactSwitch view, boolean value) {
        view.setOnCheckedChangeListener(null);
        view.setOn(value);
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull ReactSwitch view) {
        reactContext.getClass();
        view.getClass();
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactSwitchShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactSwitch createViewInstance(@NotNull ThemedReactContext context) {
        context.getClass();
        ReactSwitch reactSwitch = new ReactSwitch(context);
        reactSwitch.setShowText(false);
        return reactSwitch;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactSwitch> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<ReactSwitchShadowNode> getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, @Nullable ReadableMap localData, @Nullable ReadableMap props, @Nullable ReadableMap state, float width, @NotNull YogaMeasureMode widthMode, float height, @NotNull YogaMeasureMode heightMode, @Nullable float[] attachmentsPositions) {
        context.getClass();
        widthMode.getClass();
        heightMode.getClass();
        ReactSwitch reactSwitch = new ReactSwitch(context);
        reactSwitch.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        reactSwitch.measure(makeMeasureSpec, makeMeasureSpec);
        return YogaMeasureOutput.make(PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredWidth()), PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(@NotNull ReactSwitch view, @ColorInt int backgroundColor) {
        view.getClass();
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(defaultBoolean = false, name = FeatureState.DISABLED)
    public void setDisabled(@NotNull ReactSwitch view, boolean disabled) {
        view.getClass();
        view.setEnabled(!disabled);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(@NotNull ReactSwitch view, boolean enabled) {
        view.getClass();
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    public void setNativeValue(@NotNull ReactSwitch view, boolean value) {
        view.getClass();
        setValueInternal(view, value);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(name = "on")
    public void setOn(@NotNull ReactSwitch view, boolean on) {
        view.getClass();
        setValueInternal(view, on);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "thumbColor")
    public void setThumbColor(@NotNull ReactSwitch view, @Nullable Integer color) {
        view.getClass();
        view.setThumbColor(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(@NotNull ReactSwitch view, @Nullable Integer color) {
        view.getClass();
        setThumbColor(view, color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(@NotNull ReactSwitch view, @Nullable Integer color) {
        view.getClass();
        view.setTrackColorForFalse(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(@NotNull ReactSwitch view, @Nullable Integer color) {
        view.getClass();
        view.setTrackColorForTrue(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(@NotNull ReactSwitch view, @Nullable Integer color) {
        view.getClass();
        view.setTrackColor(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(name = "value")
    public void setValue(@NotNull ReactSwitch view, boolean value) {
        view.getClass();
        setValueInternal(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ReactSwitch root, @NotNull Object extraData) {
        root.getClass();
        extraData.getClass();
    }
}
