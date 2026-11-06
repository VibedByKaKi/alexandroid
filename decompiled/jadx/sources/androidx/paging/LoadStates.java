package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadState;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import com.dee.app.metrics.MetricsConstants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J&\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0015H\u0087\bø\u0001\u0000J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroidx/paging/LoadStates;", "", "refresh", "Landroidx/paging/LoadState;", "prepend", "append", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V", "getAppend", "()Landroidx/paging/LoadState;", "getPrepend", "getRefresh", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "forEach", "", "op", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", MetricsConstants.Method.CACHE_GET, "loadType", "get$paging_common", "hashCode", "", "modifyState", "newState", "modifyState$paging_common", "toString", "", "Companion", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LoadStates {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final LoadStates IDLE;

    @NotNull
    private final LoadState append;

    @NotNull
    private final LoadState prepend;

    @NotNull
    private final LoadState refresh;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
        IDLE = new LoadStates(companion.getIncomplete$paging_common(), companion.getIncomplete$paging_common(), companion.getIncomplete$paging_common());
    }

    public LoadStates(@NotNull LoadState loadState, @NotNull LoadState loadState2, @NotNull LoadState loadState3) {
        loadState.getClass();
        loadState2.getClass();
        loadState3.getClass();
        this.refresh = loadState;
        this.prepend = loadState2;
        this.append = loadState3;
    }

    public static /* synthetic */ LoadStates copy$default(LoadStates loadStates, LoadState loadState, LoadState loadState2, LoadState loadState3, int i, Object obj) {
        if ((i & 1) != 0) {
            loadState = loadStates.refresh;
        }
        if ((i & 2) != 0) {
            loadState2 = loadStates.prepend;
        }
        if ((i & 4) != 0) {
            loadState3 = loadStates.append;
        }
        return loadStates.copy(loadState, loadState2, loadState3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LoadState getRefresh() {
        return this.refresh;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LoadState getPrepend() {
        return this.prepend;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final LoadState getAppend() {
        return this.append;
    }

    @NotNull
    public final LoadStates copy(@NotNull LoadState refresh, @NotNull LoadState prepend, @NotNull LoadState append) {
        refresh.getClass();
        prepend.getClass();
        append.getClass();
        return new LoadStates(refresh, prepend, append);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) other;
        return Intrinsics.areEqual(this.refresh, loadStates.refresh) && Intrinsics.areEqual(this.prepend, loadStates.prepend) && Intrinsics.areEqual(this.append, loadStates.append);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void forEach(@NotNull Function2<? super LoadType, ? super LoadState, Unit> op) {
        op.getClass();
        op.invoke(LoadType.REFRESH, getRefresh());
        op.invoke(LoadType.PREPEND, getPrepend());
        op.invoke(LoadType.APPEND, getAppend());
    }

    @NotNull
    public final LoadState get$paging_common(@NotNull LoadType loadType) {
        loadType.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.append;
        }
        if (i == 2) {
            return this.prepend;
        }
        if (i == 3) {
            return this.refresh;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final LoadState getAppend() {
        return this.append;
    }

    @NotNull
    public final LoadState getPrepend() {
        return this.prepend;
    }

    @NotNull
    public final LoadState getRefresh() {
        return this.refresh;
    }

    public int hashCode() {
        return this.append.hashCode() + ((this.prepend.hashCode() + (this.refresh.hashCode() * 31)) * 31);
    }

    @NotNull
    public final LoadStates modifyState$paging_common(@NotNull LoadType loadType, @NotNull LoadState newState) {
        loadType.getClass();
        newState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return copy$default(this, null, null, newState, 3, null);
        }
        if (i == 2) {
            return copy$default(this, null, newState, null, 5, null);
        }
        if (i == 3) {
            return copy$default(this, newState, null, null, 6, null);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/LoadStates$Companion;", "", "()V", WifiConnectionState.IDLE, "Landroidx/paging/LoadStates;", "getIDLE", "()Landroidx/paging/LoadStates;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoadStates getIDLE() {
            return LoadStates.IDLE;
        }

        private Companion() {
        }
    }
}
