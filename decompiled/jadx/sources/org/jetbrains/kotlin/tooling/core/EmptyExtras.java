package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.tooling.core.Extras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0006H\u0096\u0002J\u0015\u0010\u0013\u001a\u00020\u00142\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002J(\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\b\b\u0000\u0010\u0019*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\nH\u0096\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\rX\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/EmptyExtras;", "Lorg/jetbrains/kotlin/tooling/core/AbstractExtras;", "Ljava/io/Serializable;", "()V", "entries", "", "Lorg/jetbrains/kotlin/tooling/core/Extras$Entry;", "getEntries", "()Ljava/util/Set;", "keys", "Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "getKeys", "serialVersionUID", "", "getSerialVersionUID$annotations", "size", "", "getSize", "()I", "contains", "", "element", "", "key", MetricsConstants.Method.CACHE_GET, ExifInterface.GPS_DIRECTION_TRUE, "(Lorg/jetbrains/kotlin/tooling/core/Extras$Key;)Ljava/lang/Object;", "isEmpty", "readResolve", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyExtras extends AbstractExtras implements Serializable {
    private static final long serialVersionUID = 0;
    private static final int size = 0;

    @NotNull
    public static final EmptyExtras INSTANCE = new EmptyExtras();

    @NotNull
    private static final Set<Extras.Key<?>> keys = SetsKt.emptySet();

    @NotNull
    private static final Set<Extras.Entry<?>> entries = SetsKt.emptySet();

    private EmptyExtras() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // org.jetbrains.kotlin.tooling.core.AbstractExtras
    public boolean contains(@NotNull Extras.Entry element) {
        element.getClass();
        return false;
    }

    @Override // org.jetbrains.kotlin.tooling.core.Extras
    @Nullable
    public <T> T get(@NotNull Extras.Key<T> key) {
        key.getClass();
        return null;
    }

    @Override // org.jetbrains.kotlin.tooling.core.Extras
    @NotNull
    public Set<Extras.Entry<?>> getEntries() {
        return entries;
    }

    @Override // org.jetbrains.kotlin.tooling.core.Extras
    @NotNull
    public Set<Extras.Key<?>> getKeys() {
        return keys;
    }

    @Override // org.jetbrains.kotlin.tooling.core.AbstractExtras
    public int getSize() {
        return size;
    }

    @Override // org.jetbrains.kotlin.tooling.core.AbstractExtras, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // org.jetbrains.kotlin.tooling.core.AbstractExtras, org.jetbrains.kotlin.tooling.core.Extras
    public boolean contains(@NotNull Extras.Key<?> key) {
        key.getClass();
        return false;
    }

    private static /* synthetic */ void getSerialVersionUID$annotations() {
    }
}
