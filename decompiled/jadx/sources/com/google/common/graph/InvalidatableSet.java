package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ForwardingSet;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class InvalidatableSet<E> extends ForwardingSet<E> {
    private final Set<E> delegate;
    private final Supplier<String> errorMessage;
    private final Supplier<Boolean> validator;

    private InvalidatableSet(Set<E> set, Supplier<Boolean> supplier, Supplier<String> supplier2) {
        this.delegate = set;
        this.validator = supplier;
        this.errorMessage = supplier2;
    }

    public static <E> InvalidatableSet<E> of(Set<E> set, Supplier<Boolean> supplier, Supplier<String> supplier2) {
        return new InvalidatableSet<>((Set) Preconditions.checkNotNull(set), (Supplier) Preconditions.checkNotNull(supplier), (Supplier) Preconditions.checkNotNull(supplier2));
    }

    private void validate() {
        if (this.validator.get().booleanValue()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(this.errorMessage.get());
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public Set<E> delegate() {
        validate();
        return this.delegate;
    }

    @Override // com.google.common.collect.ForwardingSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.delegate.hashCode();
    }
}
