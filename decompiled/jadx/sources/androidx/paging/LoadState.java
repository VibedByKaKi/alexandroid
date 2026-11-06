package androidx.paging;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/paging/LoadState;", "", "endOfPaginationReached", "", "(Z)V", "getEndOfPaginationReached", "()Z", "Error", "Loading", "NotLoading", "Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState$NotLoading;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class LoadState {
    private final boolean endOfPaginationReached;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends LoadState {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable th) {
            super(false, null);
            th.getClass();
            this.error = th;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return getEndOfPaginationReached() == error.getEndOfPaginationReached() && Intrinsics.areEqual(this.error, error.error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode() + Boolean.hashCode(getEndOfPaginationReached());
        }

        @NotNull
        public String toString() {
            return "Error(endOfPaginationReached=" + getEndOfPaginationReached() + ", error=" + this.error + ')';
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState;", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading extends LoadState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(false, null);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Loading) && getEndOfPaginationReached() == ((Loading) other).getEndOfPaginationReached();
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }

        @NotNull
        public String toString() {
            return "Loading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    private LoadState(boolean z) {
        this.endOfPaginationReached = z;
    }

    public final boolean getEndOfPaginationReached() {
        return this.endOfPaginationReached;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Landroidx/paging/LoadState$NotLoading;", "Landroidx/paging/LoadState;", "endOfPaginationReached", "", "(Z)V", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "Companion", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotLoading extends LoadState {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final NotLoading Complete = new NotLoading(true);

        @NotNull
        private static final NotLoading Incomplete = new NotLoading(false);

        public NotLoading(boolean z) {
            super(z, null);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof NotLoading) && getEndOfPaginationReached() == ((NotLoading) other).getEndOfPaginationReached();
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }

        @NotNull
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/paging/LoadState$NotLoading$Companion;", "", "()V", "Complete", "Landroidx/paging/LoadState$NotLoading;", "getComplete$paging_common", "()Landroidx/paging/LoadState$NotLoading;", "Incomplete", "getIncomplete$paging_common", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final NotLoading getComplete$paging_common() {
                return NotLoading.Complete;
            }

            @NotNull
            public final NotLoading getIncomplete$paging_common() {
                return NotLoading.Incomplete;
            }

            private Companion() {
            }
        }
    }

    public /* synthetic */ LoadState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
