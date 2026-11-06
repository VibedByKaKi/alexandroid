package com.amazon.deecomms.calling.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallConfigurationsModel {

    @JsonProperty("configurations")
    public CallConfigurations configurations;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class CallConfigurations {

        @JsonProperty("audioStartBitrateInKbps")
        public int audioStartBitrateInKbps;

        public CallConfigurations() {
        }
    }
}
