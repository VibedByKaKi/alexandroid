package com.amazon.alexa.client.alexaservice.audio.local;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum DAVSOfflinePrompts {
    LOST_CONNECTION("offline_prompt_lost_connection.mp3"),
    NOT_CONNECTED("offline_prompt_not_connected.mp3"),
    ALEXA_DOWN("offline_prompt_alexa_down.mp3"),
    NETWORK_LOW_BANDWIDTH("error_offline_network_has_low_bandwidth.mp3"),
    NETWORK_TRANSITION_AUTO("error_offline_network_transition_auto.mp3"),
    NETWORK_TRANSITION_NON_AUTO("error_offline_network_transition_non_auto.mp3"),
    CONNECTIVITY_ISSUE_AUTO("error_offline_network_transition_auto.mp3"),
    CONNECTIVITY_ISSUE_NON_AUTO("error_offline_network_transition_non_auto.mp3");

    private final String filename;

    DAVSOfflinePrompts(String str) {
        this.filename = str;
    }

    public String getFileName() {
        return this.filename;
    }
}
