package com.amazon.alexa.mobilytics.event.orchestrator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.serializer.customdata.CustomDataStorage;
import com.amazon.alexa.mobilytics.event.serializer.longlived.LongLivedDataBuilder;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;
import com.amazon.alexa.mobilytics.util.Log;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Preconditions;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class LongLivedDataOrchestrator {
    private static final String TAG = Log.tag((Class<?>) LongLivedDataOrchestrator.class);
    private static final String UNKNOWN_VALUE = "Unknown";
    private String cognitoId = "Unknown";
    private String cognitoIdentityPoolId = "Unknown";
    private MobilyticsSession currentSession;
    private final CustomDataStorage customDataStorage;
    private final LongLivedDataBuilder dataBuilder;
    private String installationId;

    @Inject
    public LongLivedDataOrchestrator(@NonNull LongLivedDataBuilder longLivedDataBuilder, @NonNull CustomDataStorage customDataStorage) {
        this.dataBuilder = (LongLivedDataBuilder) Preconditions.checkNotNull(longLivedDataBuilder);
        this.customDataStorage = (CustomDataStorage) Preconditions.checkNotNull(customDataStorage);
    }

    private boolean isInitialized() {
        return this.installationId != null;
    }

    private void onFullDataRefresh() {
        String str = TAG;
        Log.i(str, "Full data refresh - refreshing all long-lived data");
        if (!isInitialized()) {
            Log.w(str, "Orchestrator not initialized, cannot refresh data");
            return;
        }
        try {
            ObjectNode buildAllData = this.dataBuilder.buildAllData(this.cognitoId, this.installationId, this.cognitoIdentityPoolId, this.currentSession);
            Log.i(str, "Writing complete long-lived data to storage");
            this.customDataStorage.write(buildAllData);
        } catch (JSONException e) {
            Log.e(TAG, e, "Failed to build and store long-lived data on full refresh", new Object[0]);
        } catch (Exception e2) {
            Log.e(TAG, e2, "Unexpected error during full data refresh", new Object[0]);
        }
    }

    public void initialize(@Nullable String str, @NonNull String str2, @Nullable String str3) {
        if (str2 == null) {
            return;
        }
        this.installationId = str2;
        if (str3 != null) {
            this.cognitoIdentityPoolId = str3;
        }
        if (str != null) {
            this.cognitoId = str;
        }
        Log.i(TAG, "Initialized LongLivedDataOrchestrator with cognitoId: %s, installationId: %s,cognitoIdentityPoolId: %s", str, str2, str3);
        onFullDataRefresh();
    }

    public void onSessionStart(@NonNull MobilyticsSession mobilyticsSession) {
        if (mobilyticsSession != null) {
            this.currentSession = mobilyticsSession;
        }
        onFullDataRefresh();
    }

    public void onSessionUpdate(@NonNull MobilyticsSession mobilyticsSession) {
        if (mobilyticsSession == null) {
            return;
        }
        this.currentSession = mobilyticsSession;
        String str = TAG;
        Log.i(str, "Session update - updating session data only");
        if (!isInitialized()) {
            Log.w(str, "Orchestrator not initialized, cannot update session data");
            return;
        }
        try {
            ObjectNode read = this.customDataStorage.read();
            if (read == null) {
                Log.i(str, "No existing data found, performing full refresh instead");
                onFullDataRefresh();
            } else {
                ObjectNode updateSessionDataInExisting = this.dataBuilder.updateSessionDataInExisting(read, this.dataBuilder.buildSessionDataOnly(this.currentSession));
                Log.i(str, "Writing updated long-lived data with new session data");
                this.customDataStorage.write(updateSessionDataInExisting);
            }
        } catch (JSONException e) {
            Log.e(TAG, e, "Failed to update session data in long-lived storage", new Object[0]);
        } catch (Exception e2) {
            Log.e(TAG, e2, "Unexpected error during session data update", new Object[0]);
        }
    }

    public void onUserChanged(@Nullable String str, @Nullable String str2) {
        if (str != null) {
            this.cognitoId = str;
        }
        if (str2 != null) {
            this.cognitoIdentityPoolId = str2;
        }
        onFullDataRefresh();
    }
}
