package com.amazon.whisperjoin.common.sharedtypes.provisioning.data;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GenericTreeSetCollection<T> {
    protected final Set<T> values;

    public GenericTreeSetCollection(Collection<T> collection) {
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Values cannot be null");
            throw null;
        }
        this.values = new TreeSet();
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
        return new EqualsBuilder().append(this.values, ((GenericTreeSetCollection) obj).values).isEquals();
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

    public GenericTreeSetCollection() {
        this(Collections.EMPTY_SET);
    }
}
