package com.amazon.ion;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonContainer extends IonValue, Iterable<IonValue> {
    void clear();

    @Override // com.amazon.ion.IonValue
    IonContainer clone() throws UnknownSymbolException;

    boolean isEmpty() throws NullValueException;

    @Override // java.lang.Iterable
    Iterator<IonValue> iterator();

    void makeNull();

    boolean remove(IonValue ionValue);

    int size();
}
