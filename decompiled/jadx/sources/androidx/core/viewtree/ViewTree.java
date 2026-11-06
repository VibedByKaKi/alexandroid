package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import com.amazon.alexa.routing.api.RouteParameter;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"getParentOrViewTreeDisjointParent", "Landroid/view/ViewParent;", "Landroid/view/View;", "setViewTreeDisjointParent", "", RouteParameter.PARENT, "core-viewtree_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "ViewTree")
/* loaded from: classes13.dex */
public final class ViewTree {
    @Nullable
    public static final ViewParent getParentOrViewTreeDisjointParent(@NotNull View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void setViewTreeDisjointParent(@NotNull View view, @Nullable ViewParent viewParent) {
        view.getClass();
        view.setTag(R.id.view_tree_disjoint_parent, viewParent);
    }
}
