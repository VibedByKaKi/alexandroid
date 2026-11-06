package com.amazon.alexa.client.alexaservice.base.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum AddFragmentState {
    NO_FRAGMENTS("NoFragments"),
    NO_CONTAINER_FRAGMENTS("NoContainerFragments"),
    NO_AGENT_FRAGMENTS_EMPTY_CONTAINER("NoAgentResponseEmptyContainer"),
    NO_AGENT_FRAGMENTS_NON_EMPTY_CONTAINER("NoAgentResponseNonEmptyContainer"),
    VALID_RESPONSE("ValidAgentResponse"),
    UNKNOWN("Unknown");

    private final String value;

    AddFragmentState(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
