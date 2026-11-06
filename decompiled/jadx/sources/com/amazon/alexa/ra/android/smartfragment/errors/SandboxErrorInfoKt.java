package com.amazon.alexa.ra.android.smartfragment.errors;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u001a<\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"errorInfoOf", "", "", "", "name", "message", "stack", StackTraceHelper.IS_FATAL_KEY, "", "errorInfoFrom", "throwable", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SandboxErrorInfoKt {
    @NotNull
    public static final Map<String, Object> errorInfoFrom(@NotNull Throwable th, boolean z) {
        th.getClass();
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return errorInfoOf(simpleName, message, ExceptionsKt.stackTraceToString(th), z);
    }

    public static /* synthetic */ Map errorInfoFrom$default(Throwable th, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return errorInfoFrom(th, z);
    }

    @NotNull
    public static final Map<String, Object> errorInfoOf(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
        str.getClass();
        str2.getClass();
        return MapsKt.mapOf(TuplesKt.to("name", str), TuplesKt.to("message", str2), TuplesKt.to("stack", str3), TuplesKt.to(StackTraceHelper.IS_FATAL_KEY, Boolean.valueOf(z)));
    }

    public static /* synthetic */ Map errorInfoOf$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return errorInfoOf(str, str2, str3, z);
    }
}
