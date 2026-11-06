package com.amazon.alexa.client.alexaservice.audio.local;

import androidx.annotation.RawRes;
import com.amazon.alexa.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum OfflinePrompts {
    LOST_CONNECTION(R.raw.offline_prompt_lost_connection),
    NOT_CONNECTED(R.raw.offline_prompt_not_connected),
    ALEXA_DOWN(R.raw.offline_prompt_alexa_down),
    NETWORK_LOW_BANDWIDTH(R.raw.error_offline_network_has_low_bandwidth),
    NETWORK_TRANSITION_AUTO(R.raw.error_offline_network_transition_auto),
    NETWORK_TRANSITION_NON_AUTO(R.raw.error_offline_network_transition_non_auto),
    CONNECTIVITY_ISSUE_AUTO(R.raw.error_offline_network_transition_auto),
    CONNECTIVITY_ISSUE_NON_AUTO(R.raw.error_offline_network_transition_non_auto);


    @RawRes
    private final int resourceId;

    OfflinePrompts(@RawRes int i) {
        this.resourceId = i;
    }

    @RawRes
    public int getResourceId() {
        return this.resourceId;
    }
}
