package io.ktor.http.parsing;

import com.amazon.identity.auth.accounts.MultipleAccountsCommunication$DoesAccountHaveMappingAction;
import com.dee.app.metrics.MetricsConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\t\u001a\u00020\u0004R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/ktor/http/parsing/ParseResult;", "", MultipleAccountsCommunication$DoesAccountHaveMappingAction.KEY_ACCOUNT_MAPPING, "", "", "", "(Ljava/util/Map;)V", "contains", "", "key", MetricsConstants.Method.CACHE_GET, "getAll", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ParseResult {
    private final Map<String, List<String>> mapping;

    /* JADX WARN: Multi-variable type inference failed */
    public ParseResult(@NotNull Map<String, ? extends List<String>> map) {
        map.getClass();
        this.mapping = map;
    }

    public final boolean contains(@NotNull String key) {
        key.getClass();
        return this.mapping.containsKey(key);
    }

    @Nullable
    public final String get(@NotNull String key) {
        key.getClass();
        List<String> list = this.mapping.get(key);
        if (list != null) {
            return (String) CollectionsKt.firstOrNull((List) list);
        }
        return null;
    }

    @NotNull
    public final List<String> getAll(@NotNull String key) {
        key.getClass();
        List<String> list = this.mapping.get(key);
        return list != null ? list : CollectionsKt.emptyList();
    }
}
