package kotlin.text.jdk8;

import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {MetricsConstants.Method.CACHE_GET, "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, pn = "kotlin.text", xi = 48)
@JvmName(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes10.dex */
public final class RegexExtensionsJDK8Kt {
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final MatchGroup get(@NotNull MatchGroupCollection matchGroupCollection, @NotNull String str) {
        matchGroupCollection.getClass();
        str.getClass();
        MatchNamedGroupCollection matchNamedGroupCollection = matchGroupCollection instanceof MatchNamedGroupCollection ? (MatchNamedGroupCollection) matchGroupCollection : null;
        if (matchNamedGroupCollection != null) {
            return matchNamedGroupCollection.get(str);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Retrieving groups by name is not supported on this platform.");
        return null;
    }
}
