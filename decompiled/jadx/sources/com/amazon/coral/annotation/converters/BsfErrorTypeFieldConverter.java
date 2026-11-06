package com.amazon.coral.annotation.converters;

import com.amazon.coral.annotation.BsfErrorType;
import com.amazon.coral.annotation.customtrait.IValueConverter;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class BsfErrorTypeFieldConverter implements IValueConverter<Enum, String> {
    @Override // com.amazon.coral.annotation.customtrait.IValueConverter
    public String convert(Enum r2) {
        return a$$ExternalSyntheticOutline0.m$1(BsfErrorType.class.getName(), ".", r2.name());
    }
}
