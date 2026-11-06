package com.amazon.alexa.accessory.davs.i18n;

import com.amazon.alexa.accessory.io.Sink;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface I18nConfigSupplier {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StreamableI18nConfig {
        void cancel();

        JSONObject complete() throws IOException, JSONException;

        Sink getSink() throws IOException;
    }

    Single<StreamableI18nConfig> getStreamableI18nConfig();
}
