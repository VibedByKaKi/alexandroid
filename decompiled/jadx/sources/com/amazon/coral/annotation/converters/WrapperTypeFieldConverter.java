package com.amazon.coral.annotation.converters;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazon.coral.Strings;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.customtrait.IValueConverter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class WrapperTypeFieldConverter implements IValueConverter<Object, String> {
    @Override // com.amazon.coral.annotation.customtrait.IValueConverter
    public String convert(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            Method method = cls.getMethod("isInputWrapped", null);
            Method method2 = cls.getMethod("isOutputWrapped", null);
            boolean booleanValue = ((Boolean) method.invoke(obj, null)).booleanValue();
            boolean booleanValue2 = ((Boolean) method2.invoke(obj, null)).booleanValue();
            ArrayList arrayList = new ArrayList();
            if (booleanValue) {
                arrayList.add(WrapperType.class.getName() + "." + WrapperType.INPUT.name());
            }
            if (booleanValue2) {
                arrayList.add(WrapperType.class.getName() + "." + WrapperType.OUTPUT.name());
            }
            if (arrayList.isEmpty()) {
                arrayList.add(WrapperType.class.getName() + "." + WrapperType.INPUT.name());
                arrayList.add(WrapperType.class.getName() + "." + WrapperType.OUTPUT.name());
            }
            return "{" + Strings.join(",", arrayList) + StringSubstitutor.DEFAULT_VAR_END;
        } catch (NoSuchMethodException e) {
            Single$$ExternalSyntheticBUOutline0.m("source must be a WrapperTraits", e);
            return null;
        } catch (Exception e2) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("could not read properties off the trait", e2);
            return null;
        }
    }
}
