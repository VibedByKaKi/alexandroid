package org.apache.commons.lang.enums;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang.ClassUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ValuedEnum extends Enum {
    private static final long serialVersionUID = -7129650521543789085L;
    private final int iValue;

    public ValuedEnum(String str, int i) {
        super(str);
        this.iValue = i;
    }

    public static Enum getEnum(Class cls, int i) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The Enum Class must not be null");
            return null;
        }
        for (ValuedEnum valuedEnum : Enum.getEnumList(cls)) {
            if (valuedEnum.getValue() == i) {
                return valuedEnum;
            }
        }
        return null;
    }

    private int getValueInOtherClassLoader(Object obj) {
        try {
            return ((Integer) obj.getClass().getMethod("getValue", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            Single$$ExternalSyntheticBUOutline0.m$2("This should not happen");
            return 0;
        }
    }

    @Override // org.apache.commons.lang.enums.Enum, java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == this) {
            return 0;
        }
        if (obj.getClass() == getClass()) {
            return this.iValue - ((ValuedEnum) obj).iValue;
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.iValue - getValueInOtherClassLoader(obj);
        }
        StringBuffer stringBuffer = new StringBuffer("Different enum class '");
        stringBuffer.append(ClassUtils.getShortClassName(obj.getClass()));
        stringBuffer.append("'");
        throw new ClassCastException(stringBuffer.toString());
    }

    public final int getValue() {
        return this.iValue;
    }

    @Override // org.apache.commons.lang.enums.Enum
    public String toString() {
        if (this.iToString == null) {
            String shortClassName = ClassUtils.getShortClassName(getEnumClass());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(shortClassName);
            stringBuffer.append(MarkdownConstants.LEFT_BRACKET);
            stringBuffer.append(getName());
            stringBuffer.append("=");
            stringBuffer.append(getValue());
            stringBuffer.append(MarkdownConstants.RIGHT_BRACKET);
            this.iToString = stringBuffer.toString();
        }
        return this.iToString;
    }
}
