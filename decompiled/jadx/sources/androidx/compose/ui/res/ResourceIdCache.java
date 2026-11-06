package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/res/ResourceIdCache;", "", "<init>", "()V", "resIdPathMap", "Landroidx/collection/MutableIntObjectMap;", "Landroid/util/TypedValue;", "resolveResourcePath", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources;", "id", "", MetricsConstants.Method.CACHE_CLEAR, "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/ResourceIdCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes13.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;

    @NotNull
    private final MutableIntObjectMap<TypedValue> resIdPathMap = new MutableIntObjectMap<>(0, 1, null);

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final TypedValue resolveResourcePath(@NotNull Resources res, @DrawableRes int id) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = this.resIdPathMap.get(id);
            if (typedValue == null) {
                typedValue = new TypedValue();
                res.getValue(id, typedValue, true);
                this.resIdPathMap.put(id, typedValue);
            }
        }
        return typedValue;
    }
}
