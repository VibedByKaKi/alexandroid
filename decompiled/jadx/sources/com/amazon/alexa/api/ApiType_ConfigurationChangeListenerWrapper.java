package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_ConfigurationChangeListenerWrapper extends ConfigurationChangeListener implements AlexaConfigurationChangeListener {
    private final AlexaConfigurationChangeListener alexaConfigurationChangeListener;

    public ApiType_ConfigurationChangeListenerWrapper(AlexaConfigurationChangeListener alexaConfigurationChangeListener) {
        this.alexaConfigurationChangeListener = alexaConfigurationChangeListener;
    }

    @Override // com.amazon.alexa.api.ConfigurationChangeListener, com.amazon.alexa.api.AlexaConfigurationChangeListener
    public void onConfigurationAvailabilityChange(ConfigurationAvailability configurationAvailability) {
        this.alexaConfigurationChangeListener.onConfigurationAvailabilityChange(configurationAvailability);
    }
}
