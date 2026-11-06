package com.amazon.comms.ringservice;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.calling.service.Call;
import com.amazon.comms.calling.service.Participant;
import com.amazon.comms.util.ListenerSet;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ParticipantImpl implements Participant {

    @Nullable
    private boolean dropInPermission;

    @Nullable
    private String endpointDescription;

    @Nullable
    private String name;

    @Nonnull
    private final Call.Side origin;
    private final ListenerSet<Participant.Listener> participantListeners = new ListenerSet<>();

    @Nullable
    private String providerSpecifiedId;

    @Nullable
    private String providerSpecifiedName;

    @Nullable
    private final String uri;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ParticipantImplBuilder {
        private boolean dropInPermission;
        private String endpointDescription;
        private String name;
        private Call.Side origin;
        private String providerSpecifiedId;
        private String providerSpecifiedName;
        private String uri;

        public ParticipantImpl build() {
            return new ParticipantImpl(this.origin, this.uri, this.name, this.providerSpecifiedId, this.providerSpecifiedName, this.endpointDescription, this.dropInPermission);
        }

        public ParticipantImplBuilder dropInPermission(@Nullable boolean z) {
            this.dropInPermission = z;
            return this;
        }

        public ParticipantImplBuilder endpointDescription(@Nullable String str) {
            this.endpointDescription = str;
            return this;
        }

        public ParticipantImplBuilder name(@Nullable String str) {
            this.name = str;
            return this;
        }

        public ParticipantImplBuilder origin(@Nonnull Call.Side side) {
            if (side != null) {
                this.origin = side;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("origin is marked non-null but is null");
            return null;
        }

        public ParticipantImplBuilder providerSpecifiedId(@Nullable String str) {
            this.providerSpecifiedId = str;
            return this;
        }

        public ParticipantImplBuilder providerSpecifiedName(@Nullable String str) {
            this.providerSpecifiedName = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ParticipantImpl.ParticipantImplBuilder(origin=");
            sb.append(this.origin);
            sb.append(", uri=");
            sb.append(this.uri);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", providerSpecifiedId=");
            sb.append(this.providerSpecifiedId);
            sb.append(", providerSpecifiedName=");
            sb.append(this.providerSpecifiedName);
            sb.append(", endpointDescription=");
            sb.append(this.endpointDescription);
            sb.append(", dropInPermission=");
            return a$$ExternalSyntheticOutline0.m(sb, this.dropInPermission, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public ParticipantImplBuilder uri(@Nullable String str) {
            this.uri = str;
            return this;
        }
    }

    public ParticipantImpl(@Nonnull Call.Side side, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable boolean z) {
        if (side == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("origin is marked non-null but is null");
            throw null;
        }
        this.origin = side;
        this.uri = str;
        this.name = str2;
        this.providerSpecifiedId = str3;
        this.providerSpecifiedName = str4;
        this.endpointDescription = str5;
        this.dropInPermission = z;
    }

    public static ParticipantImplBuilder builder() {
        return new ParticipantImplBuilder();
    }

    private void notifyListeners() {
        this.participantListeners.notify(new ListenerSet.Notifier<Participant.Listener>() { // from class: com.amazon.comms.ringservice.ParticipantImpl.1
            @Override // com.amazon.comms.util.ListenerSet.Notifier
            public void notify(Participant.Listener listener) {
                listener.onUpdated(ParticipantImpl.this);
            }
        });
    }

    @Override // com.amazon.comms.calling.service.Participant
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public String getProviderSpecifiedId() {
        return this.providerSpecifiedId;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public String getProviderSpecifiedName() {
        return this.providerSpecifiedName;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public String getUri() {
        return this.uri;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public boolean hasDropInPermission() {
        return this.dropInPermission;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public void registerListener(Participant.Listener listener) {
        this.participantListeners.add(listener);
    }

    public void setDropInPermission(boolean z) {
        this.dropInPermission = z;
        notifyListeners();
    }

    public void setEndpointDescription(String str) {
        this.endpointDescription = str;
        notifyListeners();
    }

    public void setName(String str) {
        this.name = str;
        notifyListeners();
    }

    public void setProviderSpecifiedId(@Nullable String str) {
        this.providerSpecifiedId = str;
    }

    public void setProviderSpecifiedName(@Nullable String str) {
        this.providerSpecifiedName = str;
    }

    @Override // com.amazon.comms.calling.service.Participant
    public void unregisterListener(Participant.Listener listener) {
        this.participantListeners.remove(listener);
    }
}
