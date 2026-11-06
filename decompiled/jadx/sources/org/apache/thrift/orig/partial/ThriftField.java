package org.apache.thrift.orig.partial;

import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ThriftField {
    public final List<ThriftField> fields;
    private int hashcode;
    public final String name;

    public ThriftField(String str, List<ThriftField> list) {
        this.hashcode = 0;
        Validate.checkNotNullAndNotEmpty(str, "name");
        Validate.checkNotNull(list, "fields");
        this.name = str;
        this.fields = Collections.unmodifiableList(list);
    }

    private static ThriftField findField(String str, List<ThriftField> list) {
        for (ThriftField thriftField : list) {
            if (thriftField.name.equalsIgnoreCase(str)) {
                return thriftField;
            }
        }
        return null;
    }

    public static List<ThriftField> fromNames(Collection<String> collection) {
        Validate.checkNotNullAndNotEmpty(collection, "fieldNames");
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<ThriftField> list = arrayList2;
            for (String str : ((String) it2.next()).split(ArcusConfig.PATH_SEPARATOR)) {
                ThriftField findField = findField(str, list);
                if (findField == null) {
                    findField = new ThriftField(str, new ArrayList(), true);
                    list.add(findField);
                }
                list = findField.fields;
            }
        }
        return makeReadOnly(arrayList2);
    }

    private static List<ThriftField> makeReadOnly(List<ThriftField> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ThriftField thriftField : list) {
            arrayList.add(new ThriftField(thriftField.name, makeReadOnly(thriftField.fields)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ThriftField)) {
            return false;
        }
        ThriftField thriftField = (ThriftField) obj;
        if (!this.name.equalsIgnoreCase(thriftField.name) || this.fields.size() != thriftField.fields.size()) {
            return false;
        }
        for (int i = 0; i < this.fields.size(); i++) {
            if (!this.fields.get(i).equals(thriftField.fields.get(i))) {
                return false;
            }
        }
        return true;
    }

    public List<String> getFieldNames() {
        ArrayList arrayList = new ArrayList();
        if (this.fields.size() == 0) {
            arrayList.add(this.name);
            return arrayList;
        }
        Iterator<ThriftField> it2 = this.fields.iterator();
        while (it2.hasNext()) {
            Iterator<String> it3 = it2.next().getFieldNames().iterator();
            while (it3.hasNext()) {
                arrayList.add(this.name + "." + it3.next());
            }
        }
        return arrayList;
    }

    public int hashCode() {
        if (this.hashcode == 0) {
            int hashCode = this.name.toLowerCase().hashCode();
            Iterator<ThriftField> it2 = this.fields.iterator();
            while (it2.hasNext()) {
                hashCode ^= it2.next().hashCode();
            }
            this.hashcode = hashCode;
        }
        return this.hashcode;
    }

    public String toString() {
        return String.join(", ", getFieldNames());
    }

    public ThriftField(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public ThriftField(String str, List<ThriftField> list, boolean z) {
        this.hashcode = 0;
        Validate.checkNotNullAndNotEmpty(str, "name");
        Validate.checkNotNull(list, "fields");
        this.name = str;
        this.fields = list;
    }
}
