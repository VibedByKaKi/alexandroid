package com.amazon.alexa.mobilytics.auth;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.auth.CredentialsProvider;
import com.amazon.alexa.mobilytics.configuration.Endpoint;
import com.amazon.alexa.mobilytics.configuration.KinesisEndpoint;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.mobilytics.util.Utils;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.google.common.base.Preconditions;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class CognitoCredentialsProvider implements CredentialsProvider {
    private static final String TAG = Log.tag((Class<?>) CognitoCredentialsProvider.class);
    final CognitoCachingCredentialsProvider credentialsProvider;

    private CognitoCredentialsProvider(@NonNull Context context, @NonNull String str, @NonNull Regions regions) {
        this.credentialsProvider = new CognitoCachingCredentialsProvider(context, str, regions);
    }

    public AWSCredentialsProvider awsCredentialsProvider() {
        return this.credentialsProvider;
    }

    @Override // com.amazon.alexa.mobilytics.auth.CredentialsProvider
    public String id(boolean z) {
        try {
            return (z && TextUtils.isEmpty(this.credentialsProvider.getCachedIdentityId())) ? Utils.trimString(this.credentialsProvider.getIdentityId(), 55) : "Unknown";
        } catch (Exception e) {
            Log.e(TAG, e, "Error fetching ID", new Object[0]);
            return "Unknown";
        }
    }

    @Override // com.amazon.alexa.mobilytics.auth.CredentialsProvider
    public int type() {
        return 0;
    }

    public /* synthetic */ CognitoCredentialsProvider(Context context, String str, Regions regions, int i) {
        this(context, str, regions);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Singleton
    public static class Factory implements CredentialsProvider.Factory {
        private final Context context;

        @Inject
        public Factory(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
        }

        @Override // com.amazon.alexa.mobilytics.auth.CredentialsProvider.Factory
        public CredentialsProvider create(@NonNull Endpoint endpoint) {
            Preconditions.checkNotNull(endpoint);
            if (endpoint.type() == 0) {
                KinesisEndpoint kinesisEndpoint = (KinesisEndpoint) endpoint;
                return new CognitoCredentialsProvider(this.context, kinesisEndpoint.cognitoIdentityPoolId(), kinesisEndpoint.awsRegion(), 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("only Kinesis Endpoints are supported");
            return null;
        }

        @Override // com.amazon.alexa.mobilytics.auth.CredentialsProvider.Factory
        public CredentialsProvider create(@NonNull String str, @NonNull Regions regions) {
            return new CognitoCredentialsProvider(this.context, str, regions, 0);
        }
    }
}
