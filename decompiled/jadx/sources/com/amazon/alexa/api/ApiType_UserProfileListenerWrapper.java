package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_UserProfileListenerWrapper extends UserProfileListener implements AlexaUserProfileListener {
    private final AlexaUserProfileListener alexaUserProfileListener;

    public ApiType_UserProfileListenerWrapper(AlexaUserProfileListener alexaUserProfileListener) {
        this.alexaUserProfileListener = alexaUserProfileListener;
    }

    @Override // com.amazon.alexa.api.UserProfileListener, com.amazon.alexa.api.AlexaUserProfileListener
    public void onProfileUpdated(AlexaUserProfile alexaUserProfile) {
        this.alexaUserProfileListener.onProfileUpdated(alexaUserProfile);
    }
}
