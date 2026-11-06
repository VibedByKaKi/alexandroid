package com.amazon.alexa.client.alexaservice.voicechat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class VoiceChatState {
    private static volatile boolean active = false;

    private VoiceChatState() {
    }

    public static boolean isActive() {
        return active;
    }

    public static void setActive(boolean z) {
        active = z;
    }
}
