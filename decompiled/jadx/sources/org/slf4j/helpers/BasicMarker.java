package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class BasicMarker implements Marker {
    private static String CLOSE = " ]";
    private static String OPEN = "[ ";
    private static String SEP = ", ";
    private static final long serialVersionUID = -2849567615646933777L;
    private final String name;
    private List<Marker> referenceList = new CopyOnWriteArrayList();

    public BasicMarker(String str) {
        if (str != null) {
            this.name = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("A marker name cannot be null");
            throw null;
        }
    }

    @Override // org.slf4j.Marker
    public void add(Marker marker) {
        if (marker == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("A null value cannot be added to a Marker as reference.");
        } else {
            if (contains(marker) || marker.contains(this)) {
                return;
            }
            this.referenceList.add(marker);
        }
    }

    @Override // org.slf4j.Marker
    public boolean contains(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Other cannot be null");
            return false;
        }
        if (this.name.equals(str)) {
            return true;
        }
        if (!hasReferences()) {
            return false;
        }
        Iterator<Marker> it2 = this.referenceList.iterator();
        while (it2.hasNext()) {
            if (it2.next().contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Marker)) {
            return this.name.equals(((Marker) obj).getName());
        }
        return false;
    }

    @Override // org.slf4j.Marker
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Marker
    public boolean hasChildren() {
        return hasReferences();
    }

    @Override // org.slf4j.Marker
    public boolean hasReferences() {
        return this.referenceList.size() > 0;
    }

    @Override // org.slf4j.Marker
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // org.slf4j.Marker
    public Iterator<Marker> iterator() {
        return this.referenceList.iterator();
    }

    @Override // org.slf4j.Marker
    public boolean remove(Marker marker) {
        return this.referenceList.remove(marker);
    }

    public String toString() {
        if (!hasReferences()) {
            return getName();
        }
        Iterator<Marker> it2 = iterator();
        StringBuilder sb = new StringBuilder(getName());
        sb.append(' ');
        sb.append(OPEN);
        while (it2.hasNext()) {
            sb.append(it2.next().getName());
            if (it2.hasNext()) {
                sb.append(SEP);
            }
        }
        sb.append(CLOSE);
        return sb.toString();
    }

    @Override // org.slf4j.Marker
    public boolean contains(Marker marker) {
        if (marker != null) {
            if (equals(marker)) {
                return true;
            }
            if (!hasReferences()) {
                return false;
            }
            Iterator<Marker> it2 = this.referenceList.iterator();
            while (it2.hasNext()) {
                if (it2.next().contains(marker)) {
                    return true;
                }
            }
            return false;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Other cannot be null");
        return false;
    }
}
