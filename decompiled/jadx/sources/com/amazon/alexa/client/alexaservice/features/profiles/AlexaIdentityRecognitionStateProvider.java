package com.amazon.alexa.client.alexaservice.features.profiles;

import android.util.Log;
import com.amazon.alexa.api.AlexaUserProfile;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.core.componentstate.BaseComponentStateProvider;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaIdentityRecognitionStateProvider extends BaseComponentStateProvider {
    private static final int DEFAULT_ACL = 200;
    private static final String TAG = "AlexaIdentityRecognitionStateProvider";
    private final UserProfileAuthority userProfileAuthority;

    @Inject
    public AlexaIdentityRecognitionStateProvider(UserProfileAuthority userProfileAuthority) {
        super(AvsApiConstants.Alexa.Identity.Recognition.NAMESPACE, AvsApiConstants.Alexa.Identity.Recognition.ComponentStates.RecognitionState.NAME);
        this.userProfileAuthority = userProfileAuthority;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        AlexaUserProfile userProfile = this.userProfileAuthority.getUserProfile();
        if (userProfile != null) {
            return ComponentState.create(getComponentStateHeader(), RecognitionStatePayload.create(RecognitionState.builder().setPrimaryPerson(PrimaryPerson.create(userProfile.getPersonId(), 200)).build()));
        }
        Log.w(TAG, "Unable to set Alexa.Identity.Recognition state in state provider as user profile not available");
        return null;
    }
}
