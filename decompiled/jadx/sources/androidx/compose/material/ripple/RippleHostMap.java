package androidx.compose.material.ripple;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ripple/RippleHostMap;", "", "()V", "hostToIndicationMap", "", "Landroidx/compose/material/ripple/RippleHostView;", "Landroidx/compose/material/ripple/RippleHostKey;", "indicationToHostMap", MetricsConstants.Method.CACHE_GET, "indicationInstance", "rippleHostView", BulkOperationType.remove, "", "set", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
/* loaded from: classes.dex */
final class RippleHostMap {

    @NotNull
    private final Map<RippleHostKey, RippleHostView> indicationToHostMap = new LinkedHashMap();

    @NotNull
    private final Map<RippleHostView, RippleHostKey> hostToIndicationMap = new LinkedHashMap();

    @Nullable
    public final RippleHostView get(@NotNull RippleHostKey indicationInstance) {
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void remove(@NotNull RippleHostKey indicationInstance) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(indicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void set(@NotNull RippleHostKey indicationInstance, @NotNull RippleHostView rippleHostView) {
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }

    @Nullable
    public final RippleHostKey get(@NotNull RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
