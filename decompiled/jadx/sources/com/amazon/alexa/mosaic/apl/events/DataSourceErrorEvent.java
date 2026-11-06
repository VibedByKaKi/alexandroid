package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.AutoValue_DataSourceErrorEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.google.auto.value.AutoValue;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class DataSourceErrorEvent implements IEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DataSourceErrorEvent build();

        public Builder errors(Object obj) {
            try {
                return errors(new JSONArray(obj));
            } catch (JSONException unused) {
                return this.errors(new JSONArray());
            }
        }

        public abstract Builder errors(JSONArray jSONArray);
    }

    public static Builder builder() {
        return new AutoValue_DataSourceErrorEvent.Builder();
    }

    public abstract JSONArray errors();
}
