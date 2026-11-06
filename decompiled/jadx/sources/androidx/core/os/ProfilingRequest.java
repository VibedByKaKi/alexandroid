package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 35)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/core/os/ProfilingRequest;", "", "profilingType", "", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Landroid/os/Bundle;", "tag", "", "cancellationSignal", "Landroid/os/CancellationSignal;", "(ILandroid/os/Bundle;Ljava/lang/String;Landroid/os/CancellationSignal;)V", "getCancellationSignal", "()Landroid/os/CancellationSignal;", "getParams", "()Landroid/os/Bundle;", "getProfilingType", "()I", "getTag", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfilingRequest {

    @Nullable
    private final android.os.CancellationSignal cancellationSignal;

    @NotNull
    private final Bundle params;
    private final int profilingType;

    @Nullable
    private final String tag;

    public ProfilingRequest(int i, @NotNull Bundle bundle, @Nullable String str, @Nullable android.os.CancellationSignal cancellationSignal) {
        bundle.getClass();
        this.profilingType = i;
        this.params = bundle;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    @Nullable
    public final android.os.CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }

    @NotNull
    public final Bundle getParams() {
        return this.params;
    }

    public final int getProfilingType() {
        return this.profilingType;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }
}
