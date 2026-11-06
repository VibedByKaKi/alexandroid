package com.amazon.alexa.apl.aploptions;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.bumptech.glide.load.model.Headers;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/apl/aploptions/APLGlideHeaders;", "Lcom/bumptech/glide/load/model/Headers;", "headers", "", "", "(Ljava/util/Map;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "getHeaders", "hashCode", "", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLGlideHeaders implements Headers {

    @NotNull
    private final Map<String, String> headers;

    public APLGlideHeaders(@NotNull Map<String, String> map) {
        map.getClass();
        this.headers = map;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof APLGlideHeaders) {
            return Intrinsics.areEqual(this.headers, ((APLGlideHeaders) other).headers);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return this.headers.hashCode();
    }
}
