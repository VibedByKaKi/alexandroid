package expo.modules.fetch;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0000¨\u0006\u0005"}, d2 = {"toHeaders", "Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "expo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RequestUtilsKt {
    @NotNull
    public static final Headers toHeaders(@NotNull List<Pair<String, String>> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (Pair<String, String> pair : list) {
            builder.add(pair.getFirst(), pair.getSecond());
        }
        return builder.build();
    }
}
