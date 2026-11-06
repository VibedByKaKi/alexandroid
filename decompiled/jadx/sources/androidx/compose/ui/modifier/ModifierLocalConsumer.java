package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/Modifier$Element;", "onModifierLocalsUpdated", "", PermissionsResponse.SCOPE_KEY, "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ModifierLocalConsumer modifierLocalConsumer, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ModifierLocalConsumer.super.all(function1);
        }

        @Deprecated
        public static boolean any(@NotNull ModifierLocalConsumer modifierLocalConsumer, @NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ModifierLocalConsumer.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull ModifierLocalConsumer modifierLocalConsumer, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) ModifierLocalConsumer.super.foldIn(r, function2);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull ModifierLocalConsumer modifierLocalConsumer, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) ModifierLocalConsumer.super.foldOut(r, function2);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ModifierLocalConsumer modifierLocalConsumer, @NotNull Modifier modifier) {
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope);
}
