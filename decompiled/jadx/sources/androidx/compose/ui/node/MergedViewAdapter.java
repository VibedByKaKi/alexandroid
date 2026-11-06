package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.routing.api.RouteParameter;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0086\b¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "<init>", "()V", "id", "", "getId", "()I", "adapters", "", "getAdapters", "()Ljava/util/List;", MetricsConstants.Method.CACHE_GET, ExifInterface.GPS_DIRECTION_TRUE, "factory", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "willInsert", "", "view", "Landroid/view/View;", RouteParameter.PARENT, "Landroid/view/ViewGroup;", "didInsert", "didUpdate", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,96:1\n118#2:97\n35#2,5:98\n119#2:103\n35#2,5:104\n35#2,5:109\n35#2,5:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n52#1:97\n52#1:98,5\n52#1:103\n60#1:104,5\n64#1:109,5\n68#1:114,5\n*E\n"})
/* loaded from: classes13.dex */
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;

    @NotNull
    private final List<ViewAdapter> adapters = new ArrayList();
    private final int id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(@NotNull View view, @NotNull ViewGroup parent) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, parent);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(@NotNull View view, @NotNull ViewGroup parent) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, parent);
        }
    }

    @NotNull
    public final <T extends ViewAdapter> T get(int id, @NotNull Function0<? extends T> factory) {
        ViewAdapter viewAdapter;
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i);
            if (viewAdapter.getId() == id) {
                break;
            }
            i++;
        }
        T t = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        getAdapters().add(invoke);
        return invoke;
    }

    @NotNull
    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(@NotNull View view, @NotNull ViewGroup parent) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, parent);
        }
    }
}
