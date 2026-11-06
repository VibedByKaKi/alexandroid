package com.amazon.alexa.client.alexaservice.audio.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PlaylistFetchResultEvent extends PlaylistFetchResultEvent {
    private final boolean hasMoreItems;

    public AutoValue_PlaylistFetchResultEvent(boolean z) {
        this.hasMoreItems = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PlaylistFetchResultEvent) && this.hasMoreItems == ((PlaylistFetchResultEvent) obj).hasMoreItems();
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.PlaylistFetchResultEvent
    public boolean hasMoreItems() {
        return this.hasMoreItems;
    }

    public int hashCode() {
        return (this.hasMoreItems ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("PlaylistFetchResultEvent{hasMoreItems="), this.hasMoreItems, StringSubstitutor.DEFAULT_VAR_END);
    }
}
