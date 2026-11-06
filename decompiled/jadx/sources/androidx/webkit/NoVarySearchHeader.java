package androidx.webkit;

import androidx.webkit.Profile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Profile.ExperimentalUrlPrefetch
/* loaded from: classes14.dex */
public class NoVarySearchHeader {
    public final List<String> consideredQueryParameters;
    public final boolean ignoreDifferencesInParameters;
    public final List<String> ignoredQueryParameters;
    public final boolean varyOnKeyOrder;

    private NoVarySearchHeader(boolean z, boolean z2, List<String> list, List<String> list2) {
        this.varyOnKeyOrder = z;
        this.ignoreDifferencesInParameters = z2;
        this.ignoredQueryParameters = list;
        this.consideredQueryParameters = list2;
    }

    @Profile.ExperimentalUrlPrefetch
    public static NoVarySearchHeader alwaysVaryHeader() {
        return new NoVarySearchHeader(true, false, new ArrayList(), new ArrayList());
    }

    @Profile.ExperimentalUrlPrefetch
    public static NoVarySearchHeader neverVaryExcept(boolean z, List<String> list) {
        return new NoVarySearchHeader(z, true, new ArrayList(), list);
    }

    @Profile.ExperimentalUrlPrefetch
    public static NoVarySearchHeader neverVaryHeader() {
        return new NoVarySearchHeader(false, true, new ArrayList(), new ArrayList());
    }

    @Profile.ExperimentalUrlPrefetch
    public static NoVarySearchHeader varyExcept(boolean z, List<String> list) {
        return new NoVarySearchHeader(z, false, list, new ArrayList());
    }
}
