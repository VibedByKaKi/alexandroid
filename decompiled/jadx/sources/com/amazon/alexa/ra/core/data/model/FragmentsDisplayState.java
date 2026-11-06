package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.metrics.MetricsConstants;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/FragmentsDisplayState;", "", "<init>", "()V", "_displayedFragmentUris", "", "", "isDisplayed", "", "uri", "setAsDisplayed", "", MetricsConstants.Method.CACHE_CLEAR, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FragmentsDisplayState {
    public static final int $stable = 8;

    @NotNull
    private final Set<String> _displayedFragmentUris = new LinkedHashSet();

    public final void clear() {
        this._displayedFragmentUris.clear();
    }

    public final boolean isDisplayed(@NotNull String uri) {
        uri.getClass();
        return this._displayedFragmentUris.contains(uri);
    }

    public final void setAsDisplayed(@NotNull String uri) {
        uri.getClass();
        this._displayedFragmentUris.add(uri);
    }
}
