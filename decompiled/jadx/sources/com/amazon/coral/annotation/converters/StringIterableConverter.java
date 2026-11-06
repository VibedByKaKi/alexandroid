package com.amazon.coral.annotation.converters;

import com.amazon.coral.Strings;
import com.amazon.coral.annotation.customtrait.IValueConverter;
import com.amazon.coral.annotation.customtrait.JavaEscapedValueConverter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class StringIterableConverter implements IValueConverter<Iterable<String>, String> {
    private final IValueConverter<String, String> _escapeJavaStringConverter;

    public StringIterableConverter(IValueConverter<String, String> iValueConverter) {
        if (iValueConverter != null) {
            this._escapeJavaStringConverter = iValueConverter;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("escapeJavaStringConverter cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.annotation.customtrait.IValueConverter
    public String convert(Iterable<String> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.format("\"%s\"", this._escapeJavaStringConverter.convert(it2.next())));
        }
        return a$$ExternalSyntheticOutline0.m("{", Strings.join(",", arrayList), StringSubstitutor.DEFAULT_VAR_END);
    }

    public StringIterableConverter() {
        this(new JavaEscapedValueConverter());
    }
}
