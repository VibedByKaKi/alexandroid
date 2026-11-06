package com.amazon.coral.metrics;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class GroupBuilder {
    private final ArrayList<Attribute> attributeList;
    private final String groupName;
    private static final Attribute[] dummyArray = new Attribute[0];
    public static final Group DEFAULT_GROUP = new GroupBuilder().newGroup();
    public static final Group METERING_GROUP = new GroupBuilder("Metering").newGroup();
    public static final Group BANDWIDTH_METERING_GROUP = new GroupBuilder("BandwidthMetering").newGroup();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Attribute {
        final String name;
        final String value;

        public Attribute(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attribute)) {
                return false;
            }
            Attribute attribute = (Attribute) obj;
            return this.name.equals(attribute.name) && this.value.equals(attribute.value);
        }

        public int hashCode() {
            return this.value.hashCode() * this.name.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Attribute{name='");
            sb.append(this.name);
            sb.append("', value='");
            return a$$ExternalSyntheticOutline0.m(sb, this.value, "'}");
        }
    }

    public GroupBuilder(String str) {
        this.attributeList = new ArrayList<>();
        if (str != null) {
            this.groupName = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Group names may not be null");
            throw null;
        }
    }

    public Group newGroup() {
        return new GroupImpl(this.groupName, (Attribute[]) this.attributeList.toArray(dummyArray));
    }

    public GroupBuilder setAttribute(String str, String str2) {
        if (str == null || str.equals("")) {
            Single$$ExternalSyntheticBUOutline0.m$3("Attribute names may not be null");
            return null;
        }
        if (str2 != null) {
            this.attributeList.add(new Attribute(str, str2));
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(DeviceConfigConstants.DOUBLE_QUOTE, str, "\" attribute values may not be null"));
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupImpl implements Group {
        private static final Comparator<Attribute> attribEqualityComparator;
        private static final Comparator<Attribute> attribSortComparator;
        private final int hashCode;
        private final String name;
        private final Attribute[] sortedAttributes;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class AttributeEqualityComparator implements Comparator<Attribute> {
            private AttributeEqualityComparator() {
            }

            @Override // java.util.Comparator
            public int compare(Attribute attribute, Attribute attribute2) {
                int compareTo = attribute.name.compareTo(attribute2.name);
                return compareTo != 0 ? compareTo : attribute.value.compareTo(attribute2.value);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class AttributeNameIterator implements Iterator<String> {
            int index;

            private AttributeNameIterator() {
                this.index = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < GroupImpl.this.sortedAttributes.length;
            }

            @Override // java.util.Iterator
            public String next() {
                Attribute[] attributeArr = GroupImpl.this.sortedAttributes;
                int i = this.index;
                String str = attributeArr[i].name;
                this.index = i + 1;
                return str;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static {
            attribSortComparator = new AttributeSortComparator();
            attribEqualityComparator = new AttributeEqualityComparator();
        }

        private GroupImpl(String str, Attribute[] attributeArr) {
            this.name = str;
            this.sortedAttributes = attributeArr;
            Arrays.sort(attributeArr, attribSortComparator);
            this.hashCode = calculateHashCode();
        }

        private int calculateHashCode() {
            int hashCode = this.name.hashCode();
            for (Attribute attribute : this.sortedAttributes) {
                hashCode += attribute.hashCode();
            }
            return hashCode;
        }

        @Override // java.lang.Comparable
        public int compareTo(Group group) {
            int compareTo;
            if (this == group) {
                return 0;
            }
            if (group.getClass() != GroupImpl.class) {
                Single$$ExternalSyntheticBUOutline0.m$3("GroupImpl can only compare with other GroupImpl objects");
                return 0;
            }
            GroupImpl groupImpl = (GroupImpl) group;
            String str = this.name;
            String str2 = groupImpl.name;
            if (str != str2 && (compareTo = str.compareTo(str2)) != 0) {
                return compareTo;
            }
            int length = this.sortedAttributes.length - groupImpl.sortedAttributes.length;
            if (length != 0) {
                return length;
            }
            int i = 0;
            while (true) {
                Attribute[] attributeArr = this.sortedAttributes;
                if (i >= attributeArr.length) {
                    return 0;
                }
                int compare = attribEqualityComparator.compare(attributeArr[i], groupImpl.sortedAttributes[i]);
                if (compare != 0) {
                    return compare;
                }
                i++;
            }
        }

        @Override // com.amazon.coral.metrics.Group
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupImpl)) {
                return false;
            }
            GroupImpl groupImpl = (GroupImpl) obj;
            return this.hashCode == groupImpl.hashCode && this.name.equals(groupImpl.name) && Arrays.equals(this.sortedAttributes, groupImpl.sortedAttributes);
        }

        @Override // com.amazon.coral.metrics.Group
        public Iterator<String> getAttributeNames() {
            return new AttributeNameIterator();
        }

        @Override // com.amazon.coral.metrics.Group
        public String getAttributeValue(String str) {
            int binarySearch = Arrays.binarySearch(this.sortedAttributes, new Attribute(str, ""), attribSortComparator);
            if (binarySearch < 0) {
                return null;
            }
            return this.sortedAttributes[binarySearch].value;
        }

        @Override // com.amazon.coral.metrics.Group
        public String getName() {
            return this.name;
        }

        @Override // com.amazon.coral.metrics.Group
        public int hashCode() {
            return this.hashCode;
        }

        public String toString() {
            return "GroupImpl{name='" + this.name + "', sortedAttributes=" + Arrays.toString(this.sortedAttributes) + AbstractJsonLexerKt.END_OBJ;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class AttributeSortComparator implements Comparator<Attribute> {
            private AttributeSortComparator() {
            }

            @Override // java.util.Comparator
            public int compare(Attribute attribute, Attribute attribute2) {
                return attribute.name.compareTo(attribute2.name);
            }
        }
    }

    public GroupBuilder() {
        this.attributeList = new ArrayList<>();
        this.groupName = "";
    }
}
