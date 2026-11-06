package expo.modules.filesystem.legacy;

import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lexpo/modules/filesystem/legacy/RequestBodyDecorator;", "", "decorate", "Lokhttp3/RequestBody;", "requestBody", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface RequestBodyDecorator {
    @NotNull
    RequestBody decorate(@NotNull RequestBody requestBody);
}
