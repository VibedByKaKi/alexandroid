package com.amazon.alexaext.metricsextensionv2;

import android.util.Log;
import com.amazon.common.BoundObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class DestinationFactory extends BoundObject {
    private static final String TAG = "DestinationFactory";
    private Destination mDestination;

    public DestinationFactory() {
        init();
    }

    private native long nCreate();

    public abstract Destination createDestination(JSONObject jSONObject);

    public long createDestinationInternal(String str) {
        try {
            Destination createDestination = createDestination(new JSONObject(str));
            this.mDestination = createDestination;
            return createDestination.getNativeHandle();
        } catch (JSONException e) {
            Log.e(TAG, "Failed to create destination", e);
            return -1L;
        }
    }

    public void init() {
        bind(nCreate());
    }
}
