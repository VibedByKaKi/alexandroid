package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.Linked;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
interface Linked<T extends Linked<T>> {
    T getNext();

    T getPrevious();

    void setNext(T t);

    void setPrevious(T t);
}
