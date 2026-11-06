package io.ktor.util;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003H\u0007¨\u0006\u0004"}, d2 = {"caseInsensitiveMap", "", "", "Value", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class CollectionsKt {
    @InternalAPI
    @NotNull
    public static final <Value> Map<String, Value> caseInsensitiveMap() {
        return new CaseInsensitiveMap();
    }
}
