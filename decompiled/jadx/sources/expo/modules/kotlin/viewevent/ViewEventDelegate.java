package expo.modules.kotlin.viewevent;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B@\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012/\u0010\u0005\u001a+\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00020\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0086\u0002R7\u0010\u0005\u001a+\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00040\u00040\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "", "view", "Landroid/view/View;", "coalescingKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "event", "", "Lexpo/modules/kotlin/viewevent/CoalescingKey;", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "viewHolder", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getValue", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ViewEventDelegate<T> {

    @Nullable
    private final Function1<T, Short> coalescingKey;

    @NotNull
    private final WeakReference<View> viewHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewEventDelegate(@NotNull View view, @Nullable Function1<? super T, Short> function1) {
        view.getClass();
        this.coalescingKey = function1;
        this.viewHolder = new WeakReference<>(view);
    }

    @NotNull
    public final ViewEventCallback<T> getValue(@NotNull View thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        View view = this.viewHolder.get();
        if (view != null) {
            return new ViewEvent(property.getName(), view, this.coalescingKey);
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Can't send the '", property.getName(), "' event from the view that is deallocated"));
        return null;
    }
}
