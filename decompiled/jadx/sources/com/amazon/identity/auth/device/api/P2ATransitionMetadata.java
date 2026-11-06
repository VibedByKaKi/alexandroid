package com.amazon.identity.auth.device.api;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class P2ATransitionMetadata {

    /* renamed from: a, reason: collision with root package name */
    private final long f514a;
    private final Long b;
    private final List c;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private long f515a;
        private Long b;
        private ArrayList c = new ArrayList();

        public Builder addTransitionEvent(JSONObject jSONObject) {
            this.c.add(jSONObject);
            return this;
        }

        public P2ATransitionMetadata build() {
            return new P2ATransitionMetadata(this, 0);
        }

        public Builder lastConfirmationTimestamp(@Nullable Long l) {
            this.b = l;
            return this;
        }

        public Builder lastTransitionTimestamp(long j) {
            this.f515a = j;
            return this;
        }

        public Builder transitionEvents(List<JSONObject> list) {
            this.c = new ArrayList(list);
            return this;
        }
    }

    private P2ATransitionMetadata(Builder builder) {
        this.f514a = builder.f515a;
        this.b = builder.b;
        this.c = Collections.unmodifiableList(new ArrayList(builder.c));
    }

    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public Long getLastConfirmationTimestamp() {
        return this.b;
    }

    public long getLastTransitionTimestamp() {
        return this.f514a;
    }

    public List<JSONObject> getTransitionEvents() {
        return this.c;
    }

    public /* synthetic */ P2ATransitionMetadata(Builder builder, int i) {
        this(builder);
    }
}
