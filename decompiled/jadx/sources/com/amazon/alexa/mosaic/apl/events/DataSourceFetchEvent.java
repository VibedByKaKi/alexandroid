package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.enums.DataType;
import com.amazon.alexa.mosaic.apl.events.AutoValue_DataSourceFetchEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.google.auto.value.AutoValue;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class DataSourceFetchEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DataSourceFetchEvent build();

        public abstract Builder params(Map<String, Object> map);

        public Builder type(DataType dataType) {
            return type(dataType.type());
        }

        public abstract Builder type(String str);
    }

    public static Builder builder() {
        return new AutoValue_DataSourceFetchEvent.Builder();
    }

    public abstract Map<String, Object> params();

    public abstract String type();
}
