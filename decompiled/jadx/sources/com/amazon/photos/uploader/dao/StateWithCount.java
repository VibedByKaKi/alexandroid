package com.amazon.photos.uploader.dao;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.UploadState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/photos/uploader/dao/StateWithCount;", "", "state", "Lcom/amazon/photos/uploader/UploadState;", "count", "", "(Lcom/amazon/photos/uploader/UploadState;I)V", "getCount", "()I", "getState", "()Lcom/amazon/photos/uploader/UploadState;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StateWithCount {
    private final int count;

    @NotNull
    private final UploadState state;

    public StateWithCount(@NotNull UploadState uploadState, int i) {
        uploadState.getClass();
        this.state = uploadState;
        this.count = i;
    }

    public static /* synthetic */ StateWithCount copy$default(StateWithCount stateWithCount, UploadState uploadState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uploadState = stateWithCount.state;
        }
        if ((i2 & 2) != 0) {
            i = stateWithCount.count;
        }
        return stateWithCount.copy(uploadState, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UploadState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final StateWithCount copy(@NotNull UploadState state, int count) {
        state.getClass();
        return new StateWithCount(state, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateWithCount)) {
            return false;
        }
        StateWithCount stateWithCount = (StateWithCount) other;
        return this.state == stateWithCount.state && this.count == stateWithCount.count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final UploadState getState() {
        return this.state;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.state.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StateWithCount(state=");
        sb.append(this.state);
        sb.append(", count=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.count, ')');
    }
}
