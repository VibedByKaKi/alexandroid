package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.enums.PaginationDirection;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0000J\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000J\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000J\n\u0010\b\u001a\u00020\u0005*\u00020\u0000J\b\u0010\t\u001a\u00020\nH\u0016\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;", "", "<init>", "()V", "isNonPaginated", "", "isCardTranscript", "isUserPagination", "isRoutePagination", "toString", "", UpdateFragmentApiType.NON_PAGINATED, UpdateFragmentApiType.CARD_TRANSCRIPT, UpdateFragmentApiType.PAGINATED, "Companion", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$CardTranscript;", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$NonPaginated;", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$Paginated;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UpdateFragmentApiType {
    public static final int $stable = 0;

    @NotNull
    private static final String CARD_TRANSCRIPT = "CardTranscript";

    @NotNull
    private static final String NON_PAGINATED = "NonPaginated";

    @NotNull
    private static final String PAGINATED = "Paginated";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$CardTranscript;", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardTranscript extends UpdateFragmentApiType {
        public static final int $stable = 0;

        @NotNull
        public static final CardTranscript INSTANCE = new CardTranscript();

        private CardTranscript() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$NonPaginated;", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NonPaginated extends UpdateFragmentApiType {
        public static final int $stable = 0;

        @NotNull
        public static final NonPaginated INSTANCE = new NonPaginated();

        private NonPaginated() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$Paginated;", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;", "paginationSource", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$Paginated$Companion$PaginationSource;", "direction", "Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$Paginated$Companion$PaginationSource;Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;)V", "getPaginationSource", "()Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType$Paginated$Companion$PaginationSource;", "getDirection", "()Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Paginated extends UpdateFragmentApiType {
        public static final int $stable = 0;

        @NotNull
        private final PaginationDirection direction;

        @NotNull
        private final Companion.PaginationSource paginationSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paginated(@NotNull Companion.PaginationSource paginationSource, @NotNull PaginationDirection paginationDirection) {
            super(null);
            paginationSource.getClass();
            paginationDirection.getClass();
            this.paginationSource = paginationSource;
            this.direction = paginationDirection;
        }

        @NotNull
        public final PaginationDirection getDirection() {
            return this.direction;
        }

        @NotNull
        public final Companion.PaginationSource getPaginationSource() {
            return this.paginationSource;
        }
    }

    public /* synthetic */ UpdateFragmentApiType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isCardTranscript(@NotNull UpdateFragmentApiType updateFragmentApiType) {
        updateFragmentApiType.getClass();
        return updateFragmentApiType instanceof CardTranscript;
    }

    public final boolean isNonPaginated(@NotNull UpdateFragmentApiType updateFragmentApiType) {
        updateFragmentApiType.getClass();
        return updateFragmentApiType instanceof NonPaginated;
    }

    public final boolean isRoutePagination(@NotNull UpdateFragmentApiType updateFragmentApiType) {
        updateFragmentApiType.getClass();
        if (!(updateFragmentApiType instanceof Paginated)) {
            return false;
        }
        Paginated paginated = (Paginated) updateFragmentApiType;
        return paginated.getPaginationSource() == Paginated.Companion.PaginationSource.ROUTE || paginated.getPaginationSource() == Paginated.Companion.PaginationSource.ROUTE_RETRY;
    }

    public final boolean isUserPagination(@NotNull UpdateFragmentApiType updateFragmentApiType) {
        updateFragmentApiType.getClass();
        if (!(updateFragmentApiType instanceof Paginated)) {
            return false;
        }
        Paginated paginated = (Paginated) updateFragmentApiType;
        return paginated.getPaginationSource() == Paginated.Companion.PaginationSource.USER || paginated.getPaginationSource() == Paginated.Companion.PaginationSource.USER_RETRY;
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this, NonPaginated.INSTANCE)) {
            return NON_PAGINATED;
        }
        if (Intrinsics.areEqual(this, CardTranscript.INSTANCE)) {
            return CARD_TRANSCRIPT;
        }
        if (this instanceof Paginated) {
            return a$$ExternalSyntheticOutline0.m("Paginated.", ((Paginated) this).getPaginationSource().name());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private UpdateFragmentApiType() {
    }
}
