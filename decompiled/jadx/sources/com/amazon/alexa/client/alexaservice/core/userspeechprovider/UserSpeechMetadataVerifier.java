package com.amazon.alexa.client.alexaservice.core.userspeechprovider;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaAudioMetadata;
import com.amazon.alexa.api.AlexaProfile;
import com.amazon.alexa.api.AlexaWakeWord;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UserSpeechMetadataVerifier {
    private static final String TAG = "UserSpeechMetadataVerifier";

    private UserSpeechMetadataVerifier() {
        throw new UnsupportedOperationException("don't instantiate");
    }

    public static boolean verifyAlexaAudioMetadata(@Nullable AlexaAudioMetadata alexaAudioMetadata) {
        if (alexaAudioMetadata == null) {
            Log.e(TAG, "AlexaAudioMetadata rejected because it was null.");
            return false;
        }
        AlexaProfile alexaProfile = alexaAudioMetadata.getAlexaProfile();
        String alexaAudioFormat = alexaAudioMetadata.getAlexaAudioFormat();
        if (alexaProfile == null) {
            Log.e(TAG, "AlexaAudioMetadata rejected due to null AlexaProfile.");
            return false;
        }
        if (!TextUtils.isEmpty(alexaAudioFormat)) {
            return verifyAlexaWakeWord(alexaAudioMetadata.getAlexaWakeword());
        }
        Log.e(TAG, "AlexaAudioMetadata rejected due to empty AlexaAudioFormat.");
        return false;
    }

    private static boolean verifyAlexaWakeWord(@Nullable AlexaWakeWord alexaWakeWord) {
        if (alexaWakeWord == null) {
            return true;
        }
        long startIndexInSamples = alexaWakeWord.getStartIndexInSamples();
        long endIndexInSamples = alexaWakeWord.getEndIndexInSamples();
        if (startIndexInSamples >= 0 && endIndexInSamples >= 0 && endIndexInSamples >= startIndexInSamples) {
            if (!TextUtils.isEmpty(alexaWakeWord.getWakeWordName())) {
                return true;
            }
            Log.e(TAG, "AlexaAudioMetadata rejected due to empty wake word name.");
            return false;
        }
        String str = TAG;
        StringBuilder m = a$$ExternalSyntheticOutline0.m("AlexaAudioMetadata rejected due to invalid wake word indices. Start: ", startIndexInSamples, ", end: ");
        m.append(endIndexInSamples);
        m.append(".");
        Log.e(str, m.toString());
        return false;
    }
}
