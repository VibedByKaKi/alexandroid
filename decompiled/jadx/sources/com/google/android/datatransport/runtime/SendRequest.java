package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes7.dex */
abstract class SendRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SendRequest build();

        public abstract Builder setEncoding(Encoding encoding);

        public abstract Builder setEvent(Event<?> event);

        public <T> Builder setEvent(Event<T> event, Encoding encoding, Transformer<T, byte[]> transformer) {
            setEvent(event);
            setEncoding(encoding);
            setTransformer(transformer);
            return this;
        }

        public abstract Builder setTransformer(Transformer<?, byte[]> transformer);

        public abstract Builder setTransportContext(TransportContext transportContext);

        public abstract Builder setTransportName(String str);
    }

    public static Builder builder() {
        return new AutoValue_SendRequest.Builder();
    }

    public abstract Encoding getEncoding();

    public abstract Event<?> getEvent();

    public byte[] getPayload() {
        return getTransformer().apply(getEvent().getPayload());
    }

    public abstract Transformer<?, byte[]> getTransformer();

    public abstract TransportContext getTransportContext();

    public abstract String getTransportName();
}
