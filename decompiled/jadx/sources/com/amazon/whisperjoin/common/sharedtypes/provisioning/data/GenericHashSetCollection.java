package com.amazon.whisperjoin.common.sharedtypes.provisioning.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GenericHashSetCollection<T> {
    protected final Set<T> values;

    public GenericHashSetCollection(Collection<T> collection) {
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Values can not be null");
            throw null;
        }
        this.values = new HashSet();
        for (T t : collection) {
            if (t == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Values in the set cannot contain any null references.");
                throw null;
            }
            if (!this.values.contains(t)) {
                this.values.add(t);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new EqualsBuilder().append(this.values, ((GenericHashSetCollection) obj).values).isEquals();
    }

    public Collection<T> getSetCollection() {
        return Collections.unmodifiableSet(this.values);
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.values).toHashCode();
    }

    public int size() {
        return this.values.size();
    }

    public GenericHashSetCollection() {
        this(Collections.EMPTY_SET);
    }
}
