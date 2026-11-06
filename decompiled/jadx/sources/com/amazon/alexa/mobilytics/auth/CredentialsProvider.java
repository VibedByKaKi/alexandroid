package com.amazon.alexa.mobilytics.auth;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.configuration.Endpoint;
import com.amazonaws.regions.Regions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface CredentialsProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        CredentialsProvider create(@NonNull Endpoint endpoint);

        CredentialsProvider create(@NonNull String str, @NonNull Regions regions);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
        public static final int COGNITO_CREDENTIALS_PROVIDER = 0;
    }

    String id(boolean z);

    int type();
}
