package com.amazon.identity.auth.device.api;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.identity.auth.device.api.RecordP2AConfirmationEventInput;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import org.apache.commons.text.StringSubstitutor;
import org.immutables.value.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated(from = "RecordP2AConfirmationEventInput", generator = "Immutables")
/* loaded from: classes5.dex */
public final class ImmutableRecordP2AConfirmationEventInput extends RecordP2AConfirmationEventInput {

    /* renamed from: a, reason: collision with root package name */
    private final String f481a;
    private final RecordP2AConfirmationEventInput.Action b;
    private final MetadataScope c;

    private ImmutableRecordP2AConfirmationEventInput(Builder builder) {
        this.f481a = builder.b;
        this.b = builder.c;
        MetadataScope metadataScope = builder.d;
        if (metadataScope == null && (metadataScope = super.getScope()) == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(PermissionsResponse.SCOPE_KEY);
            throw null;
        }
        this.c = metadataScope;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static ImmutableRecordP2AConfirmationEventInput copyOf(RecordP2AConfirmationEventInput recordP2AConfirmationEventInput) {
        return recordP2AConfirmationEventInput instanceof ImmutableRecordP2AConfirmationEventInput ? (ImmutableRecordP2AConfirmationEventInput) recordP2AConfirmationEventInput : builder().from(recordP2AConfirmationEventInput).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableRecordP2AConfirmationEventInput)) {
            return false;
        }
        ImmutableRecordP2AConfirmationEventInput immutableRecordP2AConfirmationEventInput = (ImmutableRecordP2AConfirmationEventInput) obj;
        return this.f481a.equals(immutableRecordP2AConfirmationEventInput.f481a) && this.b.equals(immutableRecordP2AConfirmationEventInput.b) && this.c.equals(immutableRecordP2AConfirmationEventInput.c);
    }

    @Override // com.amazon.identity.auth.device.api.RecordP2AConfirmationEventInput
    public RecordP2AConfirmationEventInput.Action getAction() {
        return this.b;
    }

    @Override // com.amazon.identity.auth.device.api.RecordP2AConfirmationEventInput
    public MetadataScope getScope() {
        return this.c;
    }

    @Override // com.amazon.identity.auth.device.api.RecordP2AConfirmationEventInput
    public String getTransitionId() {
        return this.f481a;
    }

    public int hashCode() {
        int hashCode = this.f481a.hashCode() + 177573;
        int hashCode2 = this.b.hashCode() + (hashCode << 5) + hashCode;
        return this.c.hashCode() + (hashCode2 << 5) + hashCode2;
    }

    public String toString() {
        return "RecordP2AConfirmationEventInput{transitionId=" + this.f481a + ", action=" + this.b + ", scope=" + this.c + StringSubstitutor.DEFAULT_VAR_END;
    }

    public final ImmutableRecordP2AConfirmationEventInput withAction(RecordP2AConfirmationEventInput.Action action) {
        if (action != null) {
            return this.b == action ? this : new ImmutableRecordP2AConfirmationEventInput(this.f481a, action, this.c);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("action");
        return null;
    }

    public final ImmutableRecordP2AConfirmationEventInput withScope(MetadataScope metadataScope) {
        if (metadataScope != null) {
            return this.c == metadataScope ? this : new ImmutableRecordP2AConfirmationEventInput(this.f481a, this.b, metadataScope);
        }
        Single$$ExternalSyntheticBUOutline0.m$1(PermissionsResponse.SCOPE_KEY);
        return null;
    }

    public final ImmutableRecordP2AConfirmationEventInput withTransitionId(String str) {
        if (str != null) {
            return this.f481a.equals(str) ? this : new ImmutableRecordP2AConfirmationEventInput(str, this.b, this.c);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("transitionId");
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated(from = "RecordP2AConfirmationEventInput", generator = "Immutables")
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private long f482a;
        private String b;
        private RecordP2AConfirmationEventInput.Action c;
        private MetadataScope d;

        private Builder() {
            this.f482a = 3L;
        }

        public final Builder action(RecordP2AConfirmationEventInput.Action action) {
            if (action == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("action");
                return null;
            }
            this.c = action;
            this.f482a &= -3;
            return this;
        }

        public ImmutableRecordP2AConfirmationEventInput build() {
            if (this.f482a == 0) {
                return new ImmutableRecordP2AConfirmationEventInput(this, 0);
            }
            ArrayList arrayList = new ArrayList();
            if ((this.f482a & 1) != 0) {
                arrayList.add("transitionId");
            }
            if ((this.f482a & 2) != 0) {
                arrayList.add("action");
            }
            throw new IllegalStateException("Cannot build RecordP2AConfirmationEventInput, some of required attributes are not set " + arrayList);
        }

        public final Builder from(RecordP2AConfirmationEventInput recordP2AConfirmationEventInput) {
            if (recordP2AConfirmationEventInput == null) {
                Single$$ExternalSyntheticBUOutline0.m$1(AlexaEventBundleKeys.INSTANCE);
                return null;
            }
            transitionId(recordP2AConfirmationEventInput.getTransitionId());
            action(recordP2AConfirmationEventInput.getAction());
            scope(recordP2AConfirmationEventInput.getScope());
            return this;
        }

        public final Builder scope(MetadataScope metadataScope) {
            if (metadataScope != null) {
                this.d = metadataScope;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1(PermissionsResponse.SCOPE_KEY);
            return null;
        }

        public final Builder transitionId(String str) {
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("transitionId");
                return null;
            }
            this.b = str;
            this.f482a &= -2;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ ImmutableRecordP2AConfirmationEventInput(Builder builder, int i) {
        this(builder);
    }

    private ImmutableRecordP2AConfirmationEventInput(String str, RecordP2AConfirmationEventInput.Action action, MetadataScope metadataScope) {
        this.f481a = str;
        this.b = action;
        this.c = metadataScope;
    }
}
