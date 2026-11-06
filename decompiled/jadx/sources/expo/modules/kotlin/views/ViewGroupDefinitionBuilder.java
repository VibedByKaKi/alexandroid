package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import expo.modules.kotlin.modules.DefinitionMarker;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u00101\u001a\u000202Jg\u00103\u001a\u00020\u000f\"\n\b\u0001\u00104\u0018\u0001*\u00020\u000b2M\b\u0004\u00105\u001aG\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H4¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0086\bø\u0001\u0000J1\u00106\u001a\u00020\u000f2#\b\u0004\u00105\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\r0\u001fH\u0086\bø\u0001\u0000JT\u00108\u001a\u00020\u000f\"\n\b\u0001\u00104\u0018\u0001*\u00020\u000b2:\b\u0004\u00105\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u0001H40\u0017H\u0086\bø\u0001\u0000JF\u00109\u001a\u00020\u000f28\b\u0004\u00105\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0017H\u0086\bø\u0001\u0000JR\u0010:\u001a\u00020\u000f\"\n\b\u0001\u00104\u0018\u0001*\u00020\u000b28\b\b\u00105\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H4¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0017H\u0086\bø\u0001\u0000Rq\u0010\u0006\u001aO\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007j\u0004\u0018\u0001`\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R^\u0010\u0016\u001a<\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u001e\u001a%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001fj\u0004\u0018\u0001` 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0005\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\\\u0010&\u001a:\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017j\u0004\u0018\u0001`(8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0005\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\\\u0010,\u001a:\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017j\u0004\u0018\u0001`-8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0005\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "ParentType", "Landroid/view/ViewGroup;", "", "<init>", "()V", "addViewAction", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", RouteParameter.PARENT, "Landroid/view/View;", MetricKeys.VALUE_IS_CHILD, "", "index", "", "Lexpo/modules/kotlin/views/AddViewAction;", "getAddViewAction$annotations", "getAddViewAction", "()Lkotlin/jvm/functions/Function3;", "setAddViewAction", "(Lkotlin/jvm/functions/Function3;)V", "getChildAtAction", "Lkotlin/Function2;", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getGetChildAtAction$annotations", "getGetChildAtAction", "()Lkotlin/jvm/functions/Function2;", "setGetChildAtAction", "(Lkotlin/jvm/functions/Function2;)V", "getChildCountAction", "Lkotlin/Function1;", "Lexpo/modules/kotlin/views/GetChildCountAction;", "getGetChildCountAction$annotations", "getGetChildCountAction", "()Lkotlin/jvm/functions/Function1;", "setGetChildCountAction", "(Lkotlin/jvm/functions/Function1;)V", "removeViewAction", "childToRemove", "Lexpo/modules/kotlin/views/RemoveViewAction;", "getRemoveViewAction$annotations", "getRemoveViewAction", "setRemoveViewAction", "removeViewAtAction", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "getRemoveViewAtAction$annotations", "getRemoveViewAtAction", "setRemoveViewAtAction", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "AddChildView", "ChildViewType", "body", "GetChildCount", "view", "GetChildViewAt", "RemoveChildViewAt", "RemoveChildView", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DefinitionMarker
/* loaded from: classes9.dex */
public final class ViewGroupDefinitionBuilder<ParentType extends ViewGroup> {

    @Nullable
    private Function3<? super ViewGroup, ? super View, ? super Integer, Unit> addViewAction;

    @Nullable
    private Function2<? super ViewGroup, ? super Integer, ? extends View> getChildAtAction;

    @Nullable
    private Function1<? super ViewGroup, Integer> getChildCountAction;

    @Nullable
    private Function2<? super ViewGroup, ? super View, Unit> removeViewAction;

    @Nullable
    private Function2<? super ViewGroup, ? super Integer, Unit> removeViewAtAction;

    public final /* synthetic */ <ChildViewType extends View> void AddChildView(final Function3<? super ParentType, ? super ChildViewType, ? super Integer, Unit> body) {
        body.getClass();
        Intrinsics.needClassReification();
        setAddViewAction(new Function3<ViewGroup, View, Integer, Unit>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder$AddChildView$1
            public final void invoke(ViewGroup viewGroup, View view, int i) {
                viewGroup.getClass();
                view.getClass();
                Function3<ParentType, ChildViewType, Integer, Unit> function3 = body;
                Intrinsics.reifiedOperationMarker(1, "ChildViewType");
                function3.invoke(viewGroup, view, Integer.valueOf(i));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup, View view, Integer num) {
                invoke(viewGroup, view, num.intValue());
                return Unit.INSTANCE;
            }
        });
    }

    public final void GetChildCount(@NotNull final Function1<? super ParentType, Integer> body) {
        body.getClass();
        setGetChildCountAction(new Function1<ViewGroup, Integer>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder$GetChildCount$1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(ViewGroup viewGroup) {
                viewGroup.getClass();
                return body.invoke(viewGroup);
            }
        });
    }

    public final /* synthetic */ <ChildViewType extends View> void GetChildViewAt(final Function2<? super ParentType, ? super Integer, ? extends ChildViewType> body) {
        body.getClass();
        Intrinsics.needClassReification();
        setGetChildAtAction(new Function2<ViewGroup, Integer, ChildViewType>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder$GetChildViewAt$1
            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;I)TChildViewType; */
            public final View invoke(ViewGroup viewGroup, int i) {
                viewGroup.getClass();
                return (View) body.invoke(viewGroup, Integer.valueOf(i));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ViewGroup viewGroup, Integer num) {
                return invoke(viewGroup, num.intValue());
            }
        });
    }

    public final /* synthetic */ <ChildViewType extends View> void RemoveChildView(final Function2<? super ParentType, ? super ChildViewType, Unit> body) {
        body.getClass();
        Intrinsics.needClassReification();
        setRemoveViewAction(new Function2<ViewGroup, View, Unit>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder$RemoveChildView$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ViewGroup viewGroup, View view) {
                viewGroup.getClass();
                view.getClass();
                Function2<ParentType, ChildViewType, Unit> function2 = body;
                Intrinsics.reifiedOperationMarker(1, "ChildViewType");
                function2.invoke(viewGroup, view);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup, View view) {
                invoke2(viewGroup, view);
                return Unit.INSTANCE;
            }
        });
    }

    public final void RemoveChildViewAt(@NotNull final Function2<? super ParentType, ? super Integer, Unit> body) {
        body.getClass();
        setRemoveViewAtAction(new Function2<ViewGroup, Integer, Unit>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder$RemoveChildViewAt$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup, Integer num) {
                invoke(viewGroup, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ViewGroup viewGroup, int i) {
                viewGroup.getClass();
                body.invoke(viewGroup, Integer.valueOf(i));
            }
        });
    }

    @NotNull
    public final ViewGroupDefinition build() {
        return new ViewGroupDefinition(this.addViewAction, this.getChildAtAction, this.getChildCountAction, this.removeViewAction, this.removeViewAtAction);
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

    public final void setAddViewAction(@Nullable Function3<? super ViewGroup, ? super View, ? super Integer, Unit> function3) {
        this.addViewAction = function3;
    }

    public final void setGetChildAtAction(@Nullable Function2<? super ViewGroup, ? super Integer, ? extends View> function2) {
        this.getChildAtAction = function2;
    }

    public final void setGetChildCountAction(@Nullable Function1<? super ViewGroup, Integer> function1) {
        this.getChildCountAction = function1;
    }

    public final void setRemoveViewAction(@Nullable Function2<? super ViewGroup, ? super View, Unit> function2) {
        this.removeViewAction = function2;
    }

    public final void setRemoveViewAtAction(@Nullable Function2<? super ViewGroup, ? super Integer, Unit> function2) {
        this.removeViewAtAction = function2;
    }

    @PublishedApi
    public static /* synthetic */ void getAddViewAction$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getGetChildAtAction$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getGetChildCountAction$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getRemoveViewAction$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getRemoveViewAtAction$annotations() {
    }
}
