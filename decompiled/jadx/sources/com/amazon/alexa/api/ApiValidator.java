package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiValidator {
    public static boolean isAlexaAudioMetadataValid(@Nullable AlexaAudioMetadata alexaAudioMetadata) {
        if (alexaAudioMetadata == null) {
            return false;
        }
        AlexaProfile alexaProfile = alexaAudioMetadata.getAlexaProfile();
        String alexaAudioFormat = alexaAudioMetadata.getAlexaAudioFormat();
        if (alexaProfile == null || isEmpty(alexaAudioFormat)) {
            return false;
        }
        return isAlexaWakeWordValid(alexaAudioMetadata.getAlexaWakeword());
    }

    public static boolean isAlexaWakeWordValid(@Nullable AlexaWakeWord alexaWakeWord) {
        if (alexaWakeWord == null) {
            return true;
        }
        long startIndexInSamples = alexaWakeWord.getStartIndexInSamples();
        long endIndexInSamples = alexaWakeWord.getEndIndexInSamples();
        if (startIndexInSamples < 0 || endIndexInSamples < 0 || endIndexInSamples < startIndexInSamples) {
            return false;
        }
        return !isEmpty(alexaWakeWord.getWakeWordName());
    }

    private static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
