package dagger.spi.shaded.androidx.room.compiler.processing.javac;

import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004Bc\u0012#\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u0012\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0002\u0010\u001bR+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/javac/XTypeElementStore;", "BackingType", ExifInterface.GPS_DIRECTION_TRUE, "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "", "findElement", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "qName", "getQName", "wrap", "type", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "typeCache", "", "Ljava/lang/ref/WeakReference;", "cache", "element", "(Ljava/lang/String;Landroidx/room/compiler/processing/XTypeElement;)Landroidx/room/compiler/processing/XTypeElement;", MetricsConstants.Method.CACHE_CLEAR, "", "clear$room_compiler_processing", MetricsConstants.Method.CACHE_GET, "backingType", "(Ljava/lang/Object;)Landroidx/room/compiler/processing/XTypeElement;", "(Ljava/lang/String;)Landroidx/room/compiler/processing/XTypeElement;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class XTypeElementStore<BackingType, T extends XTypeElement> {

    @NotNull
    private final Function1<String, BackingType> findElement;

    @NotNull
    private final Function1<BackingType, String> getQName;

    @NotNull
    private final Map<String, WeakReference<T>> typeCache;

    @NotNull
    private final Function1<BackingType, T> wrap;

    /* JADX WARN: Multi-variable type inference failed */
    public XTypeElementStore(@NotNull Function1<? super String, ? extends BackingType> function1, @NotNull Function1<? super BackingType, String> function12, @NotNull Function1<? super BackingType, ? extends T> function13) {
        function1.getClass();
        function12.getClass();
        function13.getClass();
        this.findElement = function1;
        this.getQName = function12;
        this.wrap = function13;
        this.typeCache = new LinkedHashMap();
    }

    private final T cache(String str, T t) {
        this.typeCache.put(str, new WeakReference<>(t));
        return t;
    }

    public final void clear$room_compiler_processing() {
        this.typeCache.clear();
    }

    @NotNull
    public final T get(BackingType backingtype) {
        T t;
        String invoke = this.getQName.invoke(backingtype);
        if (invoke == null) {
            return this.wrap.invoke(backingtype);
        }
        WeakReference<T> weakReference = this.typeCache.get(invoke);
        return (weakReference == null || (t = weakReference.get()) == null) ? cache(invoke, this.wrap.invoke(backingtype)) : t;
    }

    @Nullable
    public final T get(@NotNull String str) {
        T invoke;
        T t;
        str.getClass();
        WeakReference<T> weakReference = this.typeCache.get(str);
        if (weakReference != null && (t = weakReference.get()) != null) {
            return t;
        }
        BackingType invoke2 = this.findElement.invoke(str);
        if (invoke2 == null || (invoke = this.wrap.invoke(invoke2)) == null) {
            return null;
        }
        return cache(str, invoke);
    }
}
