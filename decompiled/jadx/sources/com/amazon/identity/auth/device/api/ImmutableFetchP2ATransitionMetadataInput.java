package com.amazon.identity.auth.device.api;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import expo.modules.interfaces.permissions.PermissionsResponse;
import org.apache.commons.text.StringSubstitutor;
import org.immutables.value.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated(from = "FetchP2ATransitionMetadataInput", generator = "Immutables")
/* loaded from: classes5.dex */
public final class ImmutableFetchP2ATransitionMetadataInput extends FetchP2ATransitionMetadataInput {

    /* renamed from: a, reason: collision with root package name */
    private final MetadataScope f479a;

    private ImmutableFetchP2ATransitionMetadataInput(Builder builder) {
        MetadataScope metadataScope = builder.f480a;
        if (metadataScope == null && (metadataScope = super.getScope()) == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(PermissionsResponse.SCOPE_KEY);
            throw null;
        }
        this.f479a = metadataScope;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static ImmutableFetchP2ATransitionMetadataInput copyOf(FetchP2ATransitionMetadataInput fetchP2ATransitionMetadataInput) {
        return fetchP2ATransitionMetadataInput instanceof ImmutableFetchP2ATransitionMetadataInput ? (ImmutableFetchP2ATransitionMetadataInput) fetchP2ATransitionMetadataInput : builder().from(fetchP2ATransitionMetadataInput).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImmutableFetchP2ATransitionMetadataInput) && this.f479a.equals(((ImmutableFetchP2ATransitionMetadataInput) obj).f479a);
    }

    @Override // com.amazon.identity.auth.device.api.FetchP2ATransitionMetadataInput
    public MetadataScope getScope() {
        return this.f479a;
    }

    public int hashCode() {
        return this.f479a.hashCode() + 177573;
    }

    public String toString() {
        return "FetchP2ATransitionMetadataInput{scope=" + this.f479a + StringSubstitutor.DEFAULT_VAR_END;
    }

    public final ImmutableFetchP2ATransitionMetadataInput withScope(MetadataScope metadataScope) {
        if (metadataScope != null) {
            return this.f479a == metadataScope ? this : new ImmutableFetchP2ATransitionMetadataInput(metadataScope);
        }
        Single$$ExternalSyntheticBUOutline0.m$1(PermissionsResponse.SCOPE_KEY);
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated(from = "FetchP2ATransitionMetadataInput", generator = "Immutables")
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MetadataScope f480a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public ImmutableFetchP2ATransitionMetadataInput build() {
            return new ImmutableFetchP2ATransitionMetadataInput(this, 0);
        }

        public final Builder from(FetchP2ATransitionMetadataInput fetchP2ATransitionMetadataInput) {
            if (fetchP2ATransitionMetadataInput != null) {
                scope(fetchP2ATransitionMetadataInput.getScope());
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1(AlexaEventBundleKeys.INSTANCE);
            return null;
        }

        public final Builder scope(MetadataScope metadataScope) {
            if (metadataScope != null) {
                this.f480a = metadataScope;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1(PermissionsResponse.SCOPE_KEY);
            return null;
        }

        private Builder() {
        }
    }

    public /* synthetic */ ImmutableFetchP2ATransitionMetadataInput(Builder builder, int i) {
        this(builder);
    }

    private ImmutableFetchP2ATransitionMetadataInput(MetadataScope metadataScope) {
        this.f479a = metadataScope;
    }
}
