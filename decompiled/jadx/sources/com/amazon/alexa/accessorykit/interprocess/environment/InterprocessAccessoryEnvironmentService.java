package com.amazon.alexa.accessorykit.interprocess.environment;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.io.IOException;
import java.util.Properties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class InterprocessAccessoryEnvironmentService implements AccessoryEnvironmentService {
    private static final String AVS_PROPERTIES_FILE = "avs.properties";
    private static final String AVS_PROPERTIES_KEY_STAGE = "stage";
    private static final String TAG = "InterprocessAccessoryEnvironmentService:";
    private String buildStage;
    private final Context context;
    private final Properties properties;
    private final String propertiesFile;

    @VisibleForTesting
    public InterprocessAccessoryEnvironmentService(Context context, String str) {
        this.properties = new Properties();
        Preconditions.notNull(context, "context");
        Preconditions.notNull(str, "propertiesFile");
        this.context = context;
        this.propertiesFile = str;
    }

    @Override // com.amazon.alexa.accessorykit.interprocess.environment.AccessoryEnvironmentService
    public String getApiGatewayEndpoint() {
        String alexaApiEndpoint = AccessoryEnvironmentServicePreferences.getInstance(this.context).getAlexaApiEndpoint();
        Logger.d("%s: getAlexaApiEndpoint: %s", TAG, alexaApiEndpoint);
        return alexaApiEndpoint;
    }

    @Override // com.amazon.alexa.accessorykit.interprocess.environment.AccessoryEnvironmentService
    public String getBuildStage() {
        String str = this.buildStage;
        if (str != null) {
            return str;
        }
        try {
            this.properties.load(this.context.getAssets().open(this.propertiesFile));
        } catch (IOException e) {
            Logger.e("%s exception while reading file %s: ", e, TAG, this.propertiesFile);
        }
        String property = this.properties.getProperty(AVS_PROPERTIES_KEY_STAGE);
        this.buildStage = property;
        return property;
    }

    @Override // com.amazon.alexa.accessorykit.interprocess.environment.AccessoryEnvironmentService
    public String getWebEndpoint() {
        String endpoint = AccessoryEnvironmentServicePreferences.getInstance(this.context).getEndpoint();
        Logger.d("%s: getWebEndpoint: %s", TAG, endpoint);
        return endpoint;
    }

    public InterprocessAccessoryEnvironmentService(Context context) {
        this(context, AVS_PROPERTIES_FILE);
    }
}
