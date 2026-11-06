package com.amazon.alexa.handsfree.settings.voxsettings;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.api.AlexaAudioProviderConnection;
import com.amazon.alexa.api.AlexaConnectingFailedReason;
import com.amazon.alexa.api.compat.migration.sdk.SdkSelectionProvider;
import com.amazon.alexa.api.compat.migration.sdk.SdkType;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.dependencies.FalcoAlexaAppSettingsMediatorComponent;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoxSettingsJobIntentService extends SafeDequeueJobIntentService {
    static final int JOB_ID = 30033;
    public static final String REQUEST_GET = "com.amazon.alexa.handsfree.voxsettings.ACTION_GET";
    public static final String REQUEST_SET = "com.amazon.alexa.handsfree.voxsettings.ACTION_SET";
    private static final String TAG = "VoxSettingsService";
    private static final int TIMEOUT_SECS = 5;

    @VisibleForTesting
    static final String VOX_SETTINGS_REQUEST_SUCCESS = "VoxSettingsRequestSuccess";
    private Supplier<AlexaAudioProviderConnection> mAlexaAudioProviderConnectionSupplier;

    @Inject
    Initializer mInitializer;
    private MetricsBuilderProvider mMetricsBuilderProvider;
    private SharedPreferences mSharedPreferences;
    private VoxSettingsSetRequestRetryPolicy mVoxSettingsSetRequestRetryPolicy;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConnectionListener implements AlexaAudioProviderConnection.ConnectionListener {
        private final VoxSettingsRequestHandler mRequestHandler;
        private final CompletableFuture<Boolean> mSuccessFuture;

        public ConnectionListener(CompletableFuture<Boolean> completableFuture, @NonNull VoxSettingsRequestHandler voxSettingsRequestHandler) {
            this.mSuccessFuture = completableFuture;
            this.mRequestHandler = voxSettingsRequestHandler;
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onConnected() {
            this.mSuccessFuture.complete(Boolean.valueOf(this.mRequestHandler.onConnectedToService()));
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
            Exception exc = new Exception("Connection failed. Reason: " + alexaConnectingFailedReason);
            Log.w(VoxSettingsJobIntentService.TAG, exc);
            this.mSuccessFuture.completeExceptionally(exc);
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onDisconnected() {
            Log.v(VoxSettingsJobIntentService.TAG, "Disconnected from service");
        }
    }

    @VisibleForTesting
    public VoxSettingsJobIntentService(@NonNull Supplier<AlexaAudioProviderConnection> supplier, @NonNull SharedPreferences sharedPreferences, @NonNull VoxSettingsSetRequestRetryPolicy voxSettingsSetRequestRetryPolicy, @NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull Initializer initializer) {
        this.mAlexaAudioProviderConnectionSupplier = supplier;
        this.mSharedPreferences = sharedPreferences;
        this.mVoxSettingsSetRequestRetryPolicy = voxSettingsSetRequestRetryPolicy;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mInitializer = initializer;
    }

    private void performRequest(@NonNull Intent intent, @NonNull AlexaAudioProviderConnection alexaAudioProviderConnection, @NonNull VoxSettingsRequestHandler voxSettingsRequestHandler) {
        if (voxSettingsRequestHandler.initialize(intent)) {
            Log.v(TAG, "Performing request: " + intent.getAction());
            CompletableFuture completableFuture = new CompletableFuture();
            alexaAudioProviderConnection.disableConnectionFailureBroadcastIntent(true);
            alexaAudioProviderConnection.registerListener(new ConnectionListener(completableFuture, voxSettingsRequestHandler));
            try {
                try {
                    alexaAudioProviderConnection.connect();
                    voxSettingsRequestHandler.onRequestSucceeded(((Boolean) completableFuture.get(5L, TimeUnit.SECONDS)).booleanValue());
                    this.mMetricsBuilderProvider.newBuilder().withPercentileMetricSuccess(TAG, VOX_SETTINGS_REQUEST_SUCCESS).emit(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                    voxSettingsRequestHandler.onRequestFailed();
                    this.mMetricsBuilderProvider.newBuilder().withPercentileMetricFailure(TAG, VOX_SETTINGS_REQUEST_SUCCESS).emit(this);
                }
            } finally {
                alexaAudioProviderConnection.disconnect();
                alexaAudioProviderConnection.release();
            }
        }
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ((FalcoAlexaAppSettingsMediatorComponent) AhfComponentsProvider.getComponent(getApplicationContext(), FalcoAlexaAppSettingsMediatorComponent.class)).inject(this);
        this.mAlexaAudioProviderConnectionSupplier = new Supplier<AlexaAudioProviderConnection>() { // from class: com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsJobIntentService.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.function.Supplier
            public AlexaAudioProviderConnection get() {
                return new AlexaAudioProviderConnection(VoxSettingsJobIntentService.this);
            }
        };
        this.mSharedPreferences = getSharedPreferences(VoxSettingsRequestHandler.SHARED_PREFS_FILENAME, 0);
        this.mVoxSettingsSetRequestRetryPolicy = new VoxSettingsSetRequestRetryPolicy(this);
        this.mMetricsBuilderProvider = MetricsBuilderProvider.getInstance(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        if (SdkSelectionProvider.INSTANCE.read(this) != SdkType.VOX) {
            Log.v(TAG, "Skipping Vox settings request: device not using VOX SDK");
            return;
        }
        AlexaAudioProviderConnection alexaAudioProviderConnection = this.mAlexaAudioProviderConnectionSupplier.get();
        String action = intent.getAction();
        action.getClass();
        if (action.equals(REQUEST_GET)) {
            performRequest(intent, alexaAudioProviderConnection, new VoxSettingsGetRequestHandler(alexaAudioProviderConnection, this.mSharedPreferences));
        } else {
            if (action.equals(REQUEST_SET)) {
                performRequest(intent, alexaAudioProviderConnection, new VoxSettingsSetRequestHandler(alexaAudioProviderConnection, this.mSharedPreferences, this.mVoxSettingsSetRequestRetryPolicy));
                return;
            }
            Log.w(TAG, "Unknown action " + intent.getAction());
        }
    }

    public VoxSettingsJobIntentService() {
        this.mInitializer = InitializerProvider.getInitializer();
    }
}
