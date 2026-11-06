package com.amazon.alexa.client.alexaservice.voicechat;

import android.content.Context;
import android.net.Uri;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceChatContract {
    public static final String AUTHORITY_SUFFIX = ".voicechat.provider";
    public static final String COLUMN_IS_ACTIVE = "isActive";
    public static final String PATH_VOICE_CHAT_STATE = "voiceChatState";
    public static final int VALUE_ACTIVE = 1;
    public static final int VALUE_INACTIVE = 0;

    private VoiceChatContract() {
    }

    public static String getAuthority(Context context) {
        return context.getPackageName() + AUTHORITY_SUFFIX;
    }

    public static Uri getContentUri(Context context) {
        return ErrorUtils$$ExternalSyntheticOutline0.m28m("content").authority(getAuthority(context)).appendPath(PATH_VOICE_CHAT_STATE).build();
    }
}
