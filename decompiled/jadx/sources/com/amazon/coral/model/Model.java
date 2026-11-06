package com.amazon.coral.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface Model extends Serializable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidModelIdException extends IllegalArgumentException {
        public InvalidModelIdException(String str) {
            super(str);
        }
    }

    void accept(ModelVisitor modelVisitor);

    void accept(TraitsVisitor traitsVisitor);

    Map<Class<? extends Traits>, Traits> getAllTraits();

    Id getId();

    Class<? extends Model> getModelType();

    <TRAITS extends Traits> TRAITS getTraits(Class<TRAITS> cls);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Id implements Comparable<Id>, Serializable {
        private static final int MAX_CACHE_SIZE = 1000;
        private final int hash;
        private final String id;
        private final String name;
        private final String namespace;
        private final CharSequence source;
        private static final String N = "[A-Za-z0-9.:_]+";
        private static final Pattern namePattern = Pattern.compile(N);
        private static final String NS = "[A-Za-z0-9.:_]*#([A-Za-z0-9.:_]+\\$)*";
        private static final Pattern namespacePattern = Pattern.compile(NS);
        private static final ConcurrentHashMap<CharSequence, Id> idNameToObjectCache = new ConcurrentHashMap<>();
        private static final AtomicInteger cacheSize = new AtomicInteger(0);
        public static final Id NONE = new Id();

        public Id(String str, String str2, CharSequence charSequence) {
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("name");
                throw null;
            }
            if (str2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("namespace");
                throw null;
            }
            if (!namePattern.matcher(str).matches()) {
                throw new InvalidModelIdException(a$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, str2, str, "\" is a malformed id"));
            }
            if (!namespacePattern.matcher(str2).matches()) {
                StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, str2, str, "\" is a malformed id due to \"", str2);
                m.append("\" component");
                throw new InvalidModelIdException(m.toString());
            }
            charSequence = charSequence == null ? "N/A" : charSequence;
            this.name = str;
            this.namespace = str2;
            this.id = str2.concat(str);
            this.source = charSequence;
            this.hash = str2.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(2, 17, str) + 1;
        }

        public static Id makeId(CharSequence charSequence) {
            Id id = idNameToObjectCache.get(charSequence);
            if (id != null) {
                return id;
            }
            for (int length = charSequence.length(); length > 0; length--) {
                int i = length - 1;
                if (charSequence.charAt(i) == '#' || charSequence.charAt(i) == '$') {
                    Id id2 = new Id(charSequence.subSequence(length, charSequence.length()).toString(), charSequence.subSequence(0, length).toString());
                    AtomicInteger atomicInteger = cacheSize;
                    if (atomicInteger.get() <= 1000) {
                        idNameToObjectCache.putIfAbsent(charSequence, id2);
                        atomicInteger.incrementAndGet();
                    }
                    return id2;
                }
            }
            throw new InvalidModelIdException("Could not create Model ID for '" + ((Object) charSequence) + "'");
        }

        @Override // java.lang.Comparable
        public int compareTo(Id id) {
            int compareTo = this.namespace.compareTo(id.namespace);
            return compareTo != 0 ? compareTo : this.name.compareTo(id.name);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Id)) {
                return false;
            }
            Id id = (Id) obj;
            return hashCode() == id.hashCode() && getName().equals(id.getName()) && getNamespace().equals(id.getNamespace());
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getNamespace() {
            return this.namespace;
        }

        public CharSequence getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.hash;
        }

        public String toString() {
            return getNamespace() + getName() + "[ " + ((Object) getSource()) + " ]";
        }

        public Id(String str, String str2) {
            this(str, str2, null);
        }

        private Id() {
            this.name = "";
            this.namespace = "";
            this.id = "";
            this.source = "";
            this.hash = 0;
        }
    }
}
