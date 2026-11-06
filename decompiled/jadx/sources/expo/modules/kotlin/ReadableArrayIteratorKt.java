package expo.modules.kotlin;

import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"iterator", "Lexpo/modules/kotlin/ReadableArrayIterator;", "Lcom/facebook/react/bridge/ReadableArray;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReadableArrayIteratorKt {
    @NotNull
    public static final ReadableArrayIterator iterator(@NotNull ReadableArray readableArray) {
        readableArray.getClass();
        return new ReadableArrayIterator(readableArray);
    }
}
