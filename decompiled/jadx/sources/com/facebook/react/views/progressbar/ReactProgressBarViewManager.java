package com.facebook.react.views.progressbar;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerDelegate;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0001\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001<B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0017J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001bH\u0017J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0017J\b\u0010$\u001a\u00020\u0003H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014JR\u0010-\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010;H\u0016R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/progressbar/ProgressBarContainerView;", "Lcom/facebook/react/views/progressbar/ProgressBarShadowNode;", "Lcom/facebook/react/viewmanagers/AndroidProgressBarManagerInterface;", "<init>", "()V", "measuredStyles", "Ljava/util/WeakHashMap;", "", "Landroid/util/Pair;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setStyleAttr", "", "view", "styleName", "setColor", "color", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;Ljava/lang/Integer;)V", "setIndeterminate", ReactProgressBarViewManager.PROP_INDETERMINATE, "", "setProgress", "progress", "", "setAnimating", ReactProgressBarViewManager.PROP_ANIMATING, "setTestID", "value", "setTypeAttr", "createShadowNodeInstance", "getShadowNodeClass", "Ljava/lang/Class;", "updateExtraData", "root", "extraData", "", "onAfterUpdateTransaction", "getDelegate", "measure", "", "Landroid/content/Context;", "localData", "Lcom/facebook/react/bridge/ReadableMap;", "props", "state", "width", "", "widthMode", "Lcom/facebook/yoga/YogaMeasureMode;", "height", "heightMode", "attachmentsPositions", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ReactProgressBarViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nReactProgressBarViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactProgressBarViewManager.kt\ncom/facebook/react/views/progressbar/ReactProgressBarViewManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,166:1\n384#2,7:167\n*S KotlinDebug\n*F\n+ 1 ReactProgressBarViewManager.kt\ncom/facebook/react/views/progressbar/ReactProgressBarViewManager\n*L\n111#1:167,7\n*E\n"})
/* loaded from: classes7.dex */
public final class ReactProgressBarViewManager extends BaseViewManager<ProgressBarContainerView, ProgressBarShadowNode> implements AndroidProgressBarManagerInterface<ProgressBarContainerView> {

    @NotNull
    public static final String DEFAULT_STYLE = "Normal";

    @NotNull
    public static final String PROP_ANIMATING = "animating";

    @NotNull
    public static final String PROP_ATTR = "typeAttr";

    @NotNull
    public static final String PROP_INDETERMINATE = "indeterminate";

    @NotNull
    public static final String PROP_PROGRESS = "progress";

    @NotNull
    public static final String PROP_STYLE = "styleAttr";

    @NotNull
    public static final String REACT_CLASS = "AndroidProgressBar";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object progressBarCtorLock = new Object();

    @NotNull
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();

    @NotNull
    private final ViewManagerDelegate<ProgressBarContainerView> delegate = new AndroidProgressBarManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ProgressBarContainerView createViewInstance(@NotNull ThemedReactContext context) {
        context.getClass();
        return new ProgressBarContainerView(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ProgressBarContainerView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<ProgressBarShadowNode> getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, @NotNull ReadableMap localData, @NotNull ReadableMap props, @NotNull ReadableMap state, float width, @NotNull YogaMeasureMode widthMode, float height, @NotNull YogaMeasureMode heightMode, @Nullable float[] attachmentsPositions) {
        context.getClass();
        localData.getClass();
        props.getClass();
        state.getClass();
        widthMode.getClass();
        heightMode.getClass();
        Companion companion = INSTANCE;
        int styleFromString$ReactAndroid_release = companion.getStyleFromString$ReactAndroid_release(props.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer valueOf = Integer.valueOf(styleFromString$ReactAndroid_release);
        Pair<Integer, Integer> pair = weakHashMap.get(valueOf);
        if (pair == null) {
            ProgressBar createProgressBar = companion.createProgressBar(context, styleFromString$ReactAndroid_release);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            pair = Pair.create(Integer.valueOf(createProgressBar.getMeasuredWidth()), Integer.valueOf(createProgressBar.getMeasuredHeight()));
            weakHashMap.put(valueOf, pair);
        }
        Pair<Integer, Integer> pair2 = pair;
        return YogaMeasureOutput.make(PixelUtil.toDIPFromPixel(((Number) pair2.first).intValue()), PixelUtil.toDIPFromPixel(((Number) pair2.second).intValue()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ProgressBarContainerView view) {
        view.getClass();
        view.apply$ReactAndroid_release();
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_ANIMATING)
    public void setAnimating(@NotNull ProgressBarContainerView view, boolean animating) {
        view.getClass();
        view.setAnimating$ReactAndroid_release(animating);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(customType = "Color", name = "color")
    public void setColor(@NotNull ProgressBarContainerView view, @Nullable Integer color) {
        view.getClass();
        view.setColor$ReactAndroid_release(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_INDETERMINATE)
    public void setIndeterminate(@NotNull ProgressBarContainerView view, boolean indeterminate) {
        view.getClass();
        view.setIndeterminate$ReactAndroid_release(indeterminate);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = "progress")
    public void setProgress(@NotNull ProgressBarContainerView view, double progress) {
        view.getClass();
        view.setProgress$ReactAndroid_release(progress);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_STYLE)
    public void setStyleAttr(@NotNull ProgressBarContainerView view, @Nullable String styleName) {
        view.getClass();
        view.setStyle$ReactAndroid_release(styleName);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    public void setTestID(@NotNull ProgressBarContainerView view, @Nullable String value) {
        view.getClass();
        super.setTestId(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ProgressBarContainerView root, @NotNull Object extraData) {
        root.getClass();
        extraData.getClass();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager$Companion;", "", "<init>", "()V", "REACT_CLASS", "", "PROP_STYLE", "PROP_ATTR", "PROP_INDETERMINATE", "PROP_PROGRESS", "PROP_ANIMATING", "DEFAULT_STYLE", "progressBarCtorLock", "createProgressBar", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "style", "", "getStyleFromString", "styleStr", "getStyleFromString$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProgressBar createProgressBar(@Nullable Context context, int style) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, style);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r3.equals("Normal") == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getStyleFromString$ReactAndroid_release(@org.jetbrains.annotations.Nullable java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r2 = "ReactNative"
                r0 = 16842871(0x1010077, float:2.3693892E-38)
                if (r3 == 0) goto L6f
                int r1 = r3.hashCode()
                switch(r1) {
                    case -1955878649: goto L5d;
                    case -1414214583: goto L50;
                    case -913872828: goto L43;
                    case -670403824: goto L36;
                    case -142408811: goto L29;
                    case 73190171: goto L1c;
                    case 79996135: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L65
            Lf:
                java.lang.String r1 = "Small"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L18
                goto L65
            L18:
                r2 = 16842873(0x1010079, float:2.3693897E-38)
                return r2
            L1c:
                java.lang.String r1 = "Large"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L25
                goto L65
            L25:
                r2 = 16842874(0x101007a, float:2.36939E-38)
                return r2
            L29:
                java.lang.String r1 = "LargeInverse"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L32
                goto L65
            L32:
                r2 = 16843401(0x1010289, float:2.3695377E-38)
                return r2
            L36:
                java.lang.String r1 = "Inverse"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L3f
                goto L65
            L3f:
                r2 = 16843399(0x1010287, float:2.369537E-38)
                return r2
            L43:
                java.lang.String r1 = "Horizontal"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L4c
                goto L65
            L4c:
                r2 = 16842872(0x1010078, float:2.3693894E-38)
                return r2
            L50:
                java.lang.String r1 = "SmallInverse"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L59
                goto L65
            L59:
                r2 = 16843400(0x1010288, float:2.3695374E-38)
                return r2
            L5d:
                java.lang.String r1 = "Normal"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L6e
            L65:
                java.lang.String r1 = "Unknown ProgressBar style: "
                java.lang.String r3 = r1.concat(r3)
                com.facebook.common.logging.FLog.w(r2, r3)
            L6e:
                return r0
            L6f:
                java.lang.String r3 = "ProgressBar needs to have a style, null received"
                com.facebook.common.logging.FLog.w(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.progressbar.ReactProgressBarViewManager.Companion.getStyleFromString$ReactAndroid_release(java.lang.String):int");
        }

        private Companion() {
        }
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_ATTR)
    public void setTypeAttr(@NotNull ProgressBarContainerView view, @Nullable String value) {
        view.getClass();
    }
}
