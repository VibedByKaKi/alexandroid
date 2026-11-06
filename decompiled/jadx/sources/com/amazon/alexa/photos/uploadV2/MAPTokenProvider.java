package com.amazon.alexa.photos.uploadV2;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.clouddrive.cdasdk.TokenProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MAPTokenProvider implements TokenProvider {
    private static final String TAG = "MAPTokenProvider";

    @NonNull
    private IdentityService identityService;

    public MAPTokenProvider(@NonNull IdentityService identityService) {
        this.identityService = identityService;
    }

    @Override // com.amazon.clouddrive.cdasdk.TokenProvider
    public String getAccessTokenBlocking(@NonNull Context context) {
        return this.identityService.getAccessToken(TAG);
    }
}
