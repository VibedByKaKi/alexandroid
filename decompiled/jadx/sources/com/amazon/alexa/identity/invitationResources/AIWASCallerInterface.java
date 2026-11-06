package com.amazon.alexa.identity.invitationResources;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface AIWASCallerInterface {
    InvitationDTO getInvitationById(@NonNull String str, @NonNull String str2);

    AcceptInvitationResponseDTO putInvitationComplete(@NonNull InvitationCompleteDTO invitationCompleteDTO, @NonNull String str, @NonNull String str2);
}
