package com.amazon.comms.calling.service;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AmazonAudioManagerUtilInterface {
    void clearPlatformVoIPSelection(PlatformVoIPSelection platformVoIPSelection);

    void configurePlatformVoIPSelection(Context context, PlatformVoIPSelection platformVoIPSelection);

    int setASPVoIPConfigCommand(byte[] bArr);
}
