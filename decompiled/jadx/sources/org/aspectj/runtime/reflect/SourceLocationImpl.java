package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.SourceLocation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class SourceLocationImpl implements SourceLocation {
    String fileName;
    int line;
    Class withinType;

    public SourceLocationImpl(Class cls, String str, int i) {
        this.withinType = cls;
        this.fileName = str;
        this.line = i;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public int getColumn() {
        return -1;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public String getFileName() {
        return this.fileName;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public int getLine() {
        return this.line;
    }

    @Override // org.aspectj.lang.reflect.SourceLocation
    public Class getWithinType() {
        return this.withinType;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getFileName());
        stringBuffer.append(":");
        stringBuffer.append(getLine());
        return stringBuffer.toString();
    }
}
