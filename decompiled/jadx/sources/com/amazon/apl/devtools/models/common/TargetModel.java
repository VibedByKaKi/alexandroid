package com.amazon.apl.devtools.models.common;

import com.amazon.apl.devtools.enums.TargetType;
import com.amazon.apl.devtools.util.IdGenerator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class TargetModel {
    private static final String SEPARATOR = ".";
    private static final IdGenerator mSerializeIdGenerator = new IdGenerator(1);
    private final String mName;
    private final String mTargetId;
    private final TargetType mType;

    public TargetModel(String str, TargetType targetType, String str2) {
        this.mTargetId = str;
        this.mType = targetType;
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str2, ".");
        m1m.append(mSerializeIdGenerator.generateId());
        this.mName = m1m.toString();
    }

    public String getName() {
        return this.mName;
    }

    public String getTargetId() {
        return this.mTargetId;
    }

    public TargetType getType() {
        return this.mType;
    }
}
