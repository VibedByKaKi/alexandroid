package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class TurnstileEvent implements Serializable {

    @NonNull
    private final UserSKUIdentifier skuId;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TurnstileEvent(@NonNull UserSKUIdentifier userSKUIdentifier) {
        this.skuId = userSKUIdentifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.skuId, ((TurnstileEvent) obj).skuId);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public UserSKUIdentifier getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return Objects.hash(this.skuId);
    }

    public String toString() {
        return "[skuId: " + RecordUtils.fieldToString(this.skuId) + MarkdownConstants.RIGHT_BRACKET;
    }
}
