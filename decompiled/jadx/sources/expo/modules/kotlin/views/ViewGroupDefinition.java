package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BÉ\u0002\u0012S\u0010\u0002\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003j\u0004\u0018\u0001`\r\u0012@\u0010\u000e\u001a<\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012)\u0010\u0011\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012>\u0010\u0014\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0004\u0018\u0001`\u0016\u0012>\u0010\u0017\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0019\u0010\u001aR^\u0010\u0002\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003j\u0004\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cRK\u0010\u000e\u001a<\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR4\u0010\u0011\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 RI\u0010\u0014\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0004\u0018\u0001`\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eRI\u0010\u0017\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0004\u0018\u0001`\u0018¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinition;", "", "addViewAction", "Lkotlin/Function3;", "Landroid/view/ViewGroup;", "Lkotlin/ParameterName;", "name", RouteParameter.PARENT, "Landroid/view/View;", MetricKeys.VALUE_IS_CHILD, "", "index", "", "Lexpo/modules/kotlin/views/AddViewAction;", "getChildAtAction", "Lkotlin/Function2;", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getChildCountAction", "Lkotlin/Function1;", "Lexpo/modules/kotlin/views/GetChildCountAction;", "removeViewAction", "childToRemove", "Lexpo/modules/kotlin/views/RemoveViewAction;", "removeViewAtAction", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getAddViewAction", "()Lkotlin/jvm/functions/Function3;", "getGetChildAtAction", "()Lkotlin/jvm/functions/Function2;", "getGetChildCountAction", "()Lkotlin/jvm/functions/Function1;", "getRemoveViewAction", "getRemoveViewAtAction", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ViewGroupDefinition {

    @Nullable
    private final Function3<ViewGroup, View, Integer, Unit> addViewAction;

    @Nullable
    private final Function2<ViewGroup, Integer, View> getChildAtAction;

    @Nullable
    private final Function1<ViewGroup, Integer> getChildCountAction;

    @Nullable
    private final Function2<ViewGroup, View, Unit> removeViewAction;

    @Nullable
    private final Function2<ViewGroup, Integer, Unit> removeViewAtAction;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroupDefinition(@Nullable Function3<? super ViewGroup, ? super View, ? super Integer, Unit> function3, @Nullable Function2<? super ViewGroup, ? super Integer, ? extends View> function2, @Nullable Function1<? super ViewGroup, Integer> function1, @Nullable Function2<? super ViewGroup, ? super View, Unit> function22, @Nullable Function2<? super ViewGroup, ? super Integer, Unit> function23) {
        this.addViewAction = function3;
        this.getChildAtAction = function2;
        this.getChildCountAction = function1;
        this.removeViewAction = function22;
        this.removeViewAtAction = function23;
    }

    @Nullable
    public final Function3<ViewGroup, View, Integer, Unit> getAddViewAction() {
        return this.addViewAction;
    }

    @Nullable
    public final Function2<ViewGroup, Integer, View> getGetChildAtAction() {
        return this.getChildAtAction;
    }

    @Nullable
    public final Function1<ViewGroup, Integer> getGetChildCountAction() {
        return this.getChildCountAction;
    }

    @Nullable
    public final Function2<ViewGroup, View, Unit> getRemoveViewAction() {
        return this.removeViewAction;
    }

    @Nullable
    public final Function2<ViewGroup, Integer, Unit> getRemoveViewAtAction() {
        return this.removeViewAtAction;
    }
}
