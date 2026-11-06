package com.amazon.deecomms.contacts.model;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class GetCommsIdentities {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Response {

        @NonNull
        @JsonProperty("identities")
        private List<Identity> identities;

        @NonNull
        public List<Identity> getIdentities() {
            return this.identities;
        }
    }

    private GetCommsIdentities() {
    }
}
