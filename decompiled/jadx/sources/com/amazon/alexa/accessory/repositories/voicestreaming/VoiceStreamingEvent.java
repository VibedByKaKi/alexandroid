package com.amazon.alexa.accessory.repositories.voicestreaming;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Speech;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class VoiceStreamingEvent {
    private final byte[] data;
    private final Common.ErrorCode errorCode;
    private final String errorMessage;
    private final Speech.SpeechSettings speechSettings;
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        WILL_RESUME,
        DATA_RECEIVED,
        DID_PAUSE,
        DID_TERMINATE,
        ERROR
    }

    private VoiceStreamingEvent(Type type, Speech.SpeechSettings speechSettings, byte[] bArr, String str, Common.ErrorCode errorCode) {
        this.type = type;
        this.speechSettings = speechSettings;
        this.data = bArr;
        this.errorMessage = str;
        this.errorCode = errorCode;
    }

    public static VoiceStreamingEvent dataReceived(byte[] bArr) {
        return new VoiceStreamingEvent(Type.DATA_RECEIVED, null, bArr, null, null);
    }

    public static VoiceStreamingEvent didPause() {
        return new VoiceStreamingEvent(Type.DID_PAUSE, null, null, null, null);
    }

    public static VoiceStreamingEvent didTerminate(Common.ErrorCode errorCode) {
        return new VoiceStreamingEvent(Type.DID_TERMINATE, null, null, null, errorCode);
    }

    public static VoiceStreamingEvent error(String str) {
        return new VoiceStreamingEvent(Type.ERROR, null, null, str, null);
    }

    public static VoiceStreamingEvent willResume(Speech.SpeechSettings speechSettings) {
        return new VoiceStreamingEvent(Type.WILL_RESUME, speechSettings, null, null, null);
    }

    public byte[] getData() {
        return this.data;
    }

    public Common.ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Speech.SpeechSettings getSpeechSettings() {
        return this.speechSettings;
    }

    public Type getType() {
        return this.type;
    }

    public static VoiceStreamingEvent didTerminate() {
        return didTerminate(Common.ErrorCode.SUCCESS);
    }
}
