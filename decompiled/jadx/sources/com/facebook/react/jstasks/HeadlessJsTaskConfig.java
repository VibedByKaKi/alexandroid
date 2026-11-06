package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "", "taskKey", "", "data", "Lcom/facebook/react/bridge/WritableMap;", "timeout", "", "isAllowedInForeground", "", "retryPolicy", "Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;)V", "source", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "getTaskKey", "()Ljava/lang/String;", "getData", "()Lcom/facebook/react/bridge/WritableMap;", "getTimeout", "()J", "()Z", "getRetryPolicy", "()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeadlessJsTaskConfig {

    @NotNull
    private final WritableMap data;
    private final boolean isAllowedInForeground;

    @Nullable
    private final HeadlessJsTaskRetryPolicy retryPolicy;

    @NotNull
    private final String taskKey;
    private final long timeout;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HeadlessJsTaskConfig(@org.jetbrains.annotations.NotNull com.facebook.react.jstasks.HeadlessJsTaskConfig r8) {
        /*
            r7 = this;
            r8.getClass()
            java.lang.String r1 = r8.taskKey
            com.facebook.react.bridge.WritableMap r0 = r8.data
            com.facebook.react.bridge.WritableMap r2 = r0.copy()
            long r3 = r8.timeout
            boolean r5 = r8.isAllowedInForeground
            com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy r8 = r8.retryPolicy
            if (r8 == 0) goto L1a
            com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy r8 = r8.copy()
        L17:
            r0 = r7
            r6 = r8
            goto L1c
        L1a:
            r8 = 0
            goto L17
        L1c:
            r0.<init>(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.jstasks.HeadlessJsTaskConfig.<init>(com.facebook.react.jstasks.HeadlessJsTaskConfig):void");
    }

    @NotNull
    public final WritableMap getData() {
        return this.data;
    }

    @Nullable
    public final HeadlessJsTaskRetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    @NotNull
    public final String getTaskKey() {
        return this.taskKey;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    /* renamed from: isAllowedInForeground, reason: from getter */
    public final boolean getIsAllowedInForeground() {
        return this.isAllowedInForeground;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String str, @NotNull WritableMap writableMap, long j) {
        this(str, writableMap, j, false, null, 24, null);
        str.getClass();
        writableMap.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String str, @NotNull WritableMap writableMap, long j, boolean z) {
        this(str, writableMap, j, z, null, 16, null);
        str.getClass();
        writableMap.getClass();
    }

    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String str, @NotNull WritableMap writableMap, long j, boolean z, @Nullable HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy) {
        str.getClass();
        writableMap.getClass();
        this.taskKey = str;
        this.data = writableMap;
        this.timeout = j;
        this.isAllowedInForeground = z;
        this.retryPolicy = headlessJsTaskRetryPolicy;
    }

    public /* synthetic */ HeadlessJsTaskConfig(String str, WritableMap writableMap, long j, boolean z, HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, writableMap, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z, (i & 16) != 0 ? NoRetryPolicy.INSTANCE : headlessJsTaskRetryPolicy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeadlessJsTaskConfig(@NotNull String str, @NotNull WritableMap writableMap) {
        this(str, writableMap, 0L, false, null, 28, null);
        str.getClass();
        writableMap.getClass();
    }
}
