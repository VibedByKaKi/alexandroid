package io.ktor.util;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [To] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"io/ktor/util/DelegatingMutableSet$iterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", BulkOperationType.remove, "", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class DelegatingMutableSet$iterator$1<To> implements Iterator<To>, KMutableIterator {

    @NotNull
    private final Iterator<From> delegateIterator;
    final /* synthetic */ DelegatingMutableSet this$0;

    public DelegatingMutableSet$iterator$1(DelegatingMutableSet delegatingMutableSet) {
        Set set;
        this.this$0 = delegatingMutableSet;
        set = delegatingMutableSet.delegate;
        this.delegateIterator = set.iterator();
    }

    @NotNull
    public final Iterator<From> getDelegateIterator() {
        return this.delegateIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.delegateIterator.hasNext();
    }

    @Override // java.util.Iterator
    public To next() {
        Function1 function1;
        function1 = this.this$0.convertTo;
        return (To) function1.invoke(this.delegateIterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.delegateIterator.remove();
    }
}
