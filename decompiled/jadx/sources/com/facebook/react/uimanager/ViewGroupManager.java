package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000 )*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0001)B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\fH\u0016J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010!J\u001d\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010#J\u001d\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0016¨\u0006*"}, d2 = {"Lcom/facebook/react/uimanager/ViewGroupManager;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/IViewGroupManager;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "createShadowNodeInstance", "getShadowNodeClass", "Ljava/lang/Class;", "updateExtraData", "", "root", "extraData", "", "(Landroid/view/ViewGroup;Ljava/lang/Object;)V", "addView", RouteParameter.PARENT, MetricKeys.VALUE_IS_CHILD, "Landroid/view/View;", "index", "", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "addViews", "views", "", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "view", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "needsCustomLayoutForChildren", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroupManager.kt\ncom/facebook/react/uimanager/ViewGroupManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1878#2,3:89\n*S KotlinDebug\n*F\n+ 1 ViewGroupManager.kt\ncom/facebook/react/uimanager/ViewGroupManager\n*L\n40#1:89,3\n*E\n"})
/* loaded from: classes6.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, LayoutShadowNode> implements IViewGroupManager<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final WeakHashMap<View, Integer> zIndexHash = new WeakHashMap<>();

    public /* synthetic */ ViewGroupManager(ReactApplicationContext reactApplicationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reactApplicationContext);
    }

    @JvmStatic
    @Nullable
    public static final Integer getViewZIndex(@Nullable View view) {
        return INSTANCE.getViewZIndex(view);
    }

    @JvmStatic
    public static final void setViewZIndex(@NotNull View view, int i) {
        INSTANCE.setViewZIndex(view, i);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(@NotNull T parent, @NotNull View child, int index) {
        parent.getClass();
        child.getClass();
        parent.addView(child, index);
    }

    public final void addViews(@NotNull T parent, @NotNull List<? extends View> views) {
        parent.getClass();
        views.getClass();
        UiThreadUtil.assertOnUiThread();
        int i = 0;
        for (Object obj : views) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            addView((ViewGroupManager<T>) parent, (View) obj, i);
            i = i2;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    @Nullable
    public View getChildAt(@NotNull T parent, int index) {
        parent.getClass();
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(@NotNull T parent) {
        parent.getClass();
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeView(@NotNull T parent, @NotNull View view) {
        parent.getClass();
        view.getClass();
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount((ViewGroupManager<T>) parent);
        for (int i = 0; i < childCount; i++) {
            if (getChildAt((ViewGroupManager<T>) parent, i) == view) {
                removeViewAt((ViewGroupManager<T>) parent, i);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(@NotNull T parent, int index) {
        parent.getClass();
        UiThreadUtil.assertOnUiThread();
        parent.removeViewAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull T root, @NotNull Object extraData) {
        root.getClass();
        extraData.getClass();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/ViewGroupManager$Companion;", "", "<init>", "()V", "zIndexHash", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "", "setViewZIndex", "", "view", ViewProps.Z_INDEX, "getViewZIndex", "(Landroid/view/View;)Ljava/lang/Integer;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Integer getViewZIndex(@Nullable View view) {
            return (Integer) ViewGroupManager.zIndexHash.get(view);
        }

        @JvmStatic
        public final void setViewZIndex(@NotNull View view, int zIndex) {
            view.getClass();
            ViewGroupManager.zIndexHash.put(view, Integer.valueOf(zIndex));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ViewGroupManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public ViewGroupManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
