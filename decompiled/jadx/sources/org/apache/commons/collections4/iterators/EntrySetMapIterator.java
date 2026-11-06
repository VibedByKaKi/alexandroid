package org.apache.commons.collections4.iterators;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.ResettableIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class EntrySetMapIterator<K, V> implements MapIterator<K, V>, ResettableIterator<K> {
    private boolean canRemove = false;
    private Iterator<Map.Entry<K, V>> iterator;
    private Map.Entry<K, V> last;
    private final Map<K, V> map;

    public EntrySetMapIterator(Map<K, V> map) {
        this.map = map;
        this.iterator = map.entrySet().iterator();
    }

    @Override // org.apache.commons.collections4.MapIterator
    public K getKey() {
        Map.Entry<K, V> entry = this.last;
        if (entry != null) {
            return entry.getKey();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Iterator getKey() can only be called after next() and before remove()");
        return null;
    }

    @Override // org.apache.commons.collections4.MapIterator
    public V getValue() {
        Map.Entry<K, V> entry = this.last;
        if (entry != null) {
            return entry.getValue();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Iterator getValue() can only be called after next() and before remove()");
        return null;
    }

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public K next() {
        Map.Entry<K, V> next = this.iterator.next();
        this.last = next;
        this.canRemove = true;
        return next.getKey();
    }

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            Single$$ExternalSyntheticBUOutline0.m$2("Iterator remove() can only be called once after next()");
            return;
        }
        this.iterator.remove();
        this.last = null;
        this.canRemove = false;
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        this.iterator = this.map.entrySet().iterator();
        this.last = null;
        this.canRemove = false;
    }

    @Override // org.apache.commons.collections4.MapIterator
    public V setValue(V v) {
        Map.Entry<K, V> entry = this.last;
        if (entry != null) {
            return entry.setValue(v);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Iterator setValue() can only be called after next() and before remove()");
        return null;
    }

    public String toString() {
        if (this.last == null) {
            return "MapIterator[]";
        }
        return "MapIterator[" + getKey() + "=" + getValue() + MarkdownConstants.RIGHT_BRACKET;
    }
}
