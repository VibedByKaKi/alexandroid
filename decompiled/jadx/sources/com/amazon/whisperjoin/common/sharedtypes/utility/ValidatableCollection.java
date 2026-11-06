package com.amazon.whisperjoin.common.sharedtypes.utility;

import com.amazon.whisperjoin.common.sharedtypes.utility.Validatable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ValidatableCollection<Type extends Validatable> implements Validatable {
    private Collection<Type> mCollection;

    public ValidatableCollection(Collection<Type> collection) {
        this.mCollection = collection;
    }

    public Collection<Type> getCollection() {
        return this.mCollection;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.utility.Validatable
    public void validate() {
        Iterator<Type> it2 = this.mCollection.iterator();
        while (it2.hasNext()) {
            it2.next().validate();
        }
    }
}
