package com.amazon.deecomms.messaging.model.status;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum TranscriptStatus {
    Success,
    UnsupportedMediaType,
    MediaOversized,
    TranscodingError,
    BluefrontError,
    LowConfidence,
    TimedOut,
    UnknownError,
    InvalidTranscript,
    InvalidConversation,
    InvalidMessage,
    Transcribing;

    public static TranscriptStatus fromString(String str) {
        if (str == null) {
            return Transcribing;
        }
        for (TranscriptStatus transcriptStatus : values()) {
            if (transcriptStatus.name().equalsIgnoreCase(str)) {
                return transcriptStatus;
            }
        }
        return UnknownError;
    }
}
