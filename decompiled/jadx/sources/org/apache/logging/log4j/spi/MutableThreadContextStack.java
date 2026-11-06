package org.apache.logging.log4j.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.util.StringBuilderFormattable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableThreadContextStack implements ThreadContextStack, StringBuilderFormattable {
    private static final long serialVersionUID = 50505011;
    private boolean frozen;
    private final List<String> list;

    private MutableThreadContextStack(MutableThreadContextStack mutableThreadContextStack) {
        this.list = new ArrayList(mutableThreadContextStack.list);
    }

    private void checkInvariants() {
        if (this.frozen) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("context stack has been frozen");
        }
    }

    @Override // java.util.Collection
    public boolean add(String str) {
        checkInvariants();
        return this.list.add(str);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends String> collection) {
        checkInvariants();
        return this.list.addAll(collection);
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public List<String> asList() {
        return this.list;
    }

    @Override // java.util.Collection
    public void clear() {
        checkInvariants();
        this.list.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.list.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.list.containsAll(collection);
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public ThreadContextStack copy() {
        return new MutableThreadContextStack(this);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThreadContextStack)) {
            return false;
        }
        return Objects.equals(this.list, ((ThreadContextStack) obj).asList());
    }

    @Override // org.apache.logging.log4j.util.StringBuilderFormattable
    public void formatTo(StringBuilder sb) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        for (int i = 0; i < this.list.size(); i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(' ');
            }
            sb.append(this.list.get(i));
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public void freeze() {
        this.frozen = true;
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public int getDepth() {
        return this.list.size();
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public ThreadContext.ContextStack getImmutableStackOrNull() {
        return copy();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Objects.hashCode(this.list) + 31;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public boolean isFrozen() {
        return this.frozen;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<String> iterator() {
        return this.list.iterator();
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public String peek() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.get(this.list.size() - 1);
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public String pop() {
        checkInvariants();
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.remove(this.list.size() - 1);
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public void push(String str) {
        checkInvariants();
        this.list.add(str);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        checkInvariants();
        return this.list.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        checkInvariants();
        return this.list.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        checkInvariants();
        return this.list.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.list.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.list.toArray();
    }

    public String toString() {
        return String.valueOf(this.list);
    }

    @Override // org.apache.logging.log4j.ThreadContext.ContextStack
    public void trim(int i) {
        checkInvariants();
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Maximum stack depth cannot be negative");
            return;
        }
        if (this.list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.list.size());
        int min = Math.min(i, this.list.size());
        int i2 = 0;
        while (true) {
            List<String> list = this.list;
            if (i2 >= min) {
                list.clear();
                this.list.addAll(arrayList);
                return;
            } else {
                arrayList.add(list.get(i2));
                i2++;
            }
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.list.toArray(tArr);
    }

    public MutableThreadContextStack(List<String> list) {
        this.list = new ArrayList(list);
    }

    public MutableThreadContextStack() {
        this(new ArrayList());
    }
}
