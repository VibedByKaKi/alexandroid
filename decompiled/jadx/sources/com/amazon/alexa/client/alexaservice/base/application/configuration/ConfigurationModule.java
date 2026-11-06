package com.amazon.alexa.client.alexaservice.base.application.configuration;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import com.amazon.alexa.client.core.configuration.PropertiesConfigurationLoader;
import com.amazon.alexa.client.core.configuration.ResourcesConfigurationLoader;
import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import java.util.Properties;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ConfigurationModule {
    private static final String PROPERTIES_FILE_NAME = "avs.properties";
    private static final String TAG = "ConfigurationModule";

    @Provides
    @Singleton
    public ClientConfiguration provideClientConfiguration(DefaultConfigurationLoader defaultConfigurationLoader, PropertiesConfigurationLoader propertiesConfigurationLoader, ResourcesConfigurationLoader resourcesConfigurationLoader) {
        ClientConfiguration.Builder builder = ClientConfiguration.builder();
        defaultConfigurationLoader.load(builder);
        propertiesConfigurationLoader.load(builder);
        resourcesConfigurationLoader.load(builder);
        return builder.build();
    }

    @Provides
    @Singleton
    public Properties providesProperties(Context context) {
        Properties properties = new Properties();
        try {
            properties.load(context.getAssets().open(PROPERTIES_FILE_NAME));
            return properties;
        } catch (IOException e) {
            Log.e(TAG, "Error reading avs.properties: " + e);
            return properties;
        }
    }
}
