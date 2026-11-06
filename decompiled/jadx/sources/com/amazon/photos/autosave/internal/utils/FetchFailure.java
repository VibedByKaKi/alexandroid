package com.amazon.photos.autosave.internal.utils;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/autosave/internal/utils/FetchFailure;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/photos/autosave/internal/utils/FetchResult;", "failureResult", "(Ljava/lang/Object;)V", "getFailureResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/amazon/photos/autosave/internal/utils/FetchFailure;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FetchFailure<T> extends FetchResult<T> {
    private final T failureResult;

    public FetchFailure(T t) {
        super(null);
        this.failureResult = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchFailure copy$default(FetchFailure fetchFailure, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = fetchFailure.failureResult;
        }
        return fetchFailure.copy(obj);
    }

    public final T component1() {
        return this.failureResult;
    }

    @NotNull
    public final FetchFailure<T> copy(T failureResult) {
        return new FetchFailure<>(failureResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchFailure) && Intrinsics.areEqual(this.failureResult, ((FetchFailure) other).failureResult);
    }

    public final T getFailureResult() {
        return this.failureResult;
    }

    public int hashCode() {
        T t = this.failureResult;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @NotNull
    public String toString() {
        return BitVector$$ExternalSyntheticOutline0.m(new StringBuilder("FetchFailure(failureResult="), (Object) this.failureResult, ')');
    }
}
