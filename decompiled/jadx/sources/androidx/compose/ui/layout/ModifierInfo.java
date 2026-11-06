package androidx.compose.ui.layout;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "modifier", "Landroidx/compose/ui/Modifier;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "extra", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "getModifier", "()Landroidx/compose/ui/Modifier;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getExtra", "()Ljava/lang/Object;", "toString", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModifierInfo {
    public static final int $stable = 8;

    @NotNull
    private final LayoutCoordinates coordinates;

    @Nullable
    private final Object extra;

    @NotNull
    private final Modifier modifier;

    public ModifierInfo(@NotNull Modifier modifier, @NotNull LayoutCoordinates layoutCoordinates, @Nullable Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final Object getExtra() {
        return this.extra;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ModifierInfo(");
        sb.append(this.modifier);
        sb.append(", ");
        sb.append(this.coordinates);
        sb.append(", ");
        return BitVector$$ExternalSyntheticOutline0.m(sb, this.extra, ')');
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, layoutCoordinates, (i & 4) != 0 ? null : obj);
    }
}
