package org.apache.logging.log4j;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Marker extends Serializable {
    Marker addParents(Marker... markerArr);

    boolean equals(Object obj);

    String getName();

    Marker[] getParents();

    boolean hasParents();

    int hashCode();

    boolean isInstanceOf(String str);

    boolean isInstanceOf(Marker marker);

    boolean remove(Marker marker);

    Marker setParents(Marker... markerArr);
}
