package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.AutoValue_UrlRequests_UrlRequest;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class UrlRequests implements IterableProperty<UrlRequest> {
    public static final int REPEAT_FOREVER = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class UrlRequest {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract UrlRequest build();

            public abstract Builder headers(Map<String, String> map);

            public abstract Builder url(String str);
        }

        public static Builder builder() {
            return new AutoValue_UrlRequests_UrlRequest.Builder().headers(Collections.EMPTY_MAP);
        }

        public abstract Map<String, String> headers();

        public abstract String url();
    }

    public static UrlRequests create(BoundObject boundObject, APLEnum aPLEnum) {
        return (UrlRequests) IterableProperty.create(new UrlRequestGetter(boundObject, aPLEnum));
    }
}
