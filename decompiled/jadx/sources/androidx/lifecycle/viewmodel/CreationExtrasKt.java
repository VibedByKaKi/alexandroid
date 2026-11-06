package androidx.lifecycle.viewmodel;

import androidx.compose.ui.text.input.TextFieldValue$$ExternalSyntheticLambda1;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007\u001a\u0019\u0010\b\u001a\u00020\t*\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0086\u0002\u001a\u0015\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0002¨\u0006\u000f"}, d2 = {"CreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", "builderAction", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "", "Lkotlin/ExtensionFunctionType;", "contains", "", "key", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "plus", "creationExtras", "plusAssign", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreationExtrasKt {
    @JvmOverloads
    @NotNull
    public static final CreationExtras CreationExtras(@NotNull CreationExtras creationExtras, @NotNull Function1<? super MutableCreationExtras, Unit> function1) {
        creationExtras.getClass();
        function1.getClass();
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(creationExtras);
        function1.invoke(mutableCreationExtras);
        return mutableCreationExtras;
    }

    public static /* synthetic */ CreationExtras CreationExtras$default(CreationExtras creationExtras, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        if ((i & 2) != 0) {
            function1 = new TextFieldValue$$ExternalSyntheticLambda1(3);
        }
        return CreationExtras(creationExtras, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreationExtras$lambda$0(MutableCreationExtras mutableCreationExtras) {
        mutableCreationExtras.getClass();
        return Unit.INSTANCE;
    }

    public static final boolean contains(@NotNull CreationExtras creationExtras, @NotNull CreationExtras.Key<?> key) {
        creationExtras.getClass();
        key.getClass();
        return creationExtras.getExtras$lifecycle_viewmodel().containsKey(key);
    }

    @NotNull
    public static final MutableCreationExtras plus(@NotNull CreationExtras creationExtras, @NotNull CreationExtras creationExtras2) {
        creationExtras.getClass();
        creationExtras2.getClass();
        return new MutableCreationExtras((Map<CreationExtras.Key<?>, ? extends Object>) MapsKt.plus(creationExtras.getExtras$lifecycle_viewmodel(), creationExtras2.getExtras$lifecycle_viewmodel()));
    }

    public static final void plusAssign(@NotNull MutableCreationExtras mutableCreationExtras, @NotNull CreationExtras creationExtras) {
        mutableCreationExtras.getClass();
        creationExtras.getClass();
        mutableCreationExtras.getExtras$lifecycle_viewmodel().putAll(creationExtras.getExtras$lifecycle_viewmodel());
    }

    @JvmOverloads
    @NotNull
    public static final CreationExtras CreationExtras(@NotNull CreationExtras creationExtras) {
        creationExtras.getClass();
        return CreationExtras$default(creationExtras, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final CreationExtras CreationExtras() {
        return CreationExtras$default(null, null, 3, null);
    }
}
