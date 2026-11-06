package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.core.messages.Namespace;
import java.util.Date;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateCachingPreference extends ExternalComponentStateCachingPreference {
    private final boolean cachingEnabled;
    private final Date dateUpdated;
    private final Namespace namespace;

    public AutoValue_ExternalComponentStateCachingPreference(Namespace namespace, boolean z, @Nullable Date date) {
        if (namespace == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null namespace");
            throw null;
        }
        this.namespace = namespace;
        this.cachingEnabled = z;
        this.dateUpdated = date;
    }

    public boolean equals(Object obj) {
        Date date;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalComponentStateCachingPreference) {
            ExternalComponentStateCachingPreference externalComponentStateCachingPreference = (ExternalComponentStateCachingPreference) obj;
            if (this.namespace.equals(externalComponentStateCachingPreference.getNamespace()) && this.cachingEnabled == externalComponentStateCachingPreference.isCachingEnabled() && ((date = this.dateUpdated) != null ? date.equals(externalComponentStateCachingPreference.getDateUpdated()) : externalComponentStateCachingPreference.getDateUpdated() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateCachingPreference
    @Nullable
    public Date getDateUpdated() {
        return this.dateUpdated;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateCachingPreference
    public Namespace getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        int hashCode = (((this.namespace.hashCode() ^ 1000003) * 1000003) ^ (this.cachingEnabled ? 1231 : 1237)) * 1000003;
        Date date = this.dateUpdated;
        return (date == null ? 0 : date.hashCode()) ^ hashCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateCachingPreference
    public boolean isCachingEnabled() {
        return this.cachingEnabled;
    }

    public String toString() {
        return "ExternalComponentStateCachingPreference{namespace=" + this.namespace + ", cachingEnabled=" + this.cachingEnabled + ", dateUpdated=" + this.dateUpdated + StringSubstitutor.DEFAULT_VAR_END;
    }
}
