package org.apache.logging.log4j.util;

import com.google.common.collect.CompactHashMap$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.logging.log4j.util.internal.SerializationUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FilteredObjectInputStream extends ObjectInputStream {
    private final Collection<String> allowedExtraClasses;

    public FilteredObjectInputStream() throws IOException, SecurityException {
        this.allowedExtraClasses = Collections.EMPTY_SET;
    }

    private static boolean isAllowedByDefault(String str) {
        return isRequiredPackage(str) || SerializationUtil.REQUIRED_JAVA_CLASSES.contains(str);
    }

    private static boolean isRequiredPackage(String str) {
        Iterator<String> it2 = SerializationUtil.REQUIRED_JAVA_PACKAGES.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public Collection<String> getAllowedClasses() {
        return this.allowedExtraClasses;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        String stripArray = SerializationUtil.stripArray(objectStreamClass.getName());
        if (isAllowedByDefault(stripArray) || this.allowedExtraClasses.contains(stripArray)) {
            return super.resolveClass(objectStreamClass);
        }
        CompactHashMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Class is not allowed for deserialization: ", stripArray));
        return null;
    }

    public FilteredObjectInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
        this.allowedExtraClasses = Collections.EMPTY_SET;
    }

    public FilteredObjectInputStream(Collection<String> collection) throws IOException, SecurityException {
        this.allowedExtraClasses = collection;
    }

    public FilteredObjectInputStream(InputStream inputStream, Collection<String> collection) throws IOException {
        super(inputStream);
        this.allowedExtraClasses = collection;
    }
}
