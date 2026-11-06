package com.amazon.coral.annotation.converters;

import com.amazon.coral.annotation.customtrait.IValueConverter;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class AwsErrorTypeFieldConverterBase implements IValueConverter<Boolean, String> {
    private final Class<? extends Enum> _errorTypeClass;

    public AwsErrorTypeFieldConverterBase(Class<? extends Enum> cls) {
        if (cls != null) {
            this._errorTypeClass = cls;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("errorTypeClass cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.annotation.customtrait.IValueConverter
    public String convert(Boolean bool) {
        return a$$ExternalSyntheticOutline0.m$1(this._errorTypeClass.getName(), ".", bool.booleanValue() ? "Sender" : "Receiver");
    }
}
