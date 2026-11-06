package com.amazon.alexa.mobilytics.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.storage.PersistentStorage;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.mobilytics.util.Utils;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class InstallationIdProvider {
    private static final String INSTALLATION_ID_KEY = "InstallationId";
    private static final String TAG = Log.tag((Class<?>) InstallationIdProvider.class);
    private final String installationId;
    private final PersistentStorage persistentStorage;

    @Inject
    public InstallationIdProvider(@NonNull PersistentStorage.Factory factory, @NonNull Context context) {
        this.persistentStorage = factory.create("mobilytics.installation-id");
        this.installationId = generateId(context);
    }

    @NonNull
    private String generateId(@NonNull Context context) {
        String string = this.persistentStorage.getString("InstallationId");
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            try {
                this.persistentStorage.edit().set("InstallationId", string).commit();
            } catch (Exception e) {
                Log.e(TAG, "Error storing installation ID", e);
            }
        }
        Log.i(TAG, "Installation ID: %s on process: %s", string, Utils.getProcessName(context));
        return string;
    }

    @NonNull
    public String id() {
        return this.installationId;
    }
}
