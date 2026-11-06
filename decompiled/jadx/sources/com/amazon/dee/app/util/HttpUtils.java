package com.amazon.dee.app.util;

import com.google.common.collect.ImmutableSet;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/util/HttpUtils;", "", "<init>", "()V", "BOB_API_TO_WEBLABS_KEY", "", "PFM_TO_ENDPOINT_KEY", "BOB_DISPATCH_ENDPOINT_REQ", "BOB_RETRIES", "Lcom/google/common/collect/ImmutableSet;", "", "OPF_RETRIES", "getStatusCodeToRetry", "url", "isBob", "", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HttpUtils {

    @NotNull
    public static final String BOB_API_TO_WEBLABS_KEY = "pathToWeblab";

    @NotNull
    public static final String BOB_DISPATCH_ENDPOINT_REQ = "bob-dispatch";

    @NotNull
    private static final ImmutableSet<Integer> BOB_RETRIES;

    @NotNull
    public static final HttpUtils INSTANCE = new HttpUtils();

    @NotNull
    private static final ImmutableSet<Integer> OPF_RETRIES;

    @NotNull
    public static final String PFM_TO_ENDPOINT_KEY = "pfmToBobEndpoint";

    static {
        ImmutableSet<Integer> of = ImmutableSet.of(401, 403);
        of.getClass();
        BOB_RETRIES = of;
        ImmutableSet<Integer> of2 = ImmutableSet.of(401);
        of2.getClass();
        OPF_RETRIES = of2;
    }

    private HttpUtils() {
    }

    @JvmStatic
    @NotNull
    public static final ImmutableSet<Integer> getStatusCodeToRetry(@Nullable String url) {
        return isBob(url) ? BOB_RETRIES : OPF_RETRIES;
    }

    @JvmStatic
    public static final boolean isBob(@Nullable String url) {
        boolean contains$default;
        if (url == null) {
            return false;
        }
        try {
            String host = new URI(url).getHost();
            if (host == null) {
                return false;
            }
            contains$default = StringsKt__StringsKt.contains$default(host, BOB_DISPATCH_ENDPOINT_REQ, false, 2, (Object) null);
            return contains$default;
        } catch (Exception unused) {
            return false;
        }
    }
}
