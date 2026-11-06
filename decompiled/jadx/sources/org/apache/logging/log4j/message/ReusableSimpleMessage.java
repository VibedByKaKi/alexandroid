package org.apache.logging.log4j.message;

import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.PerformanceSensitive;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@PerformanceSensitive({"allocation"})
/* loaded from: classes11.dex */
public class ReusableSimpleMessage implements ReusableMessage, CharSequence, ParameterVisitable, Clearable {
    private static final long serialVersionUID = -9199974506498249809L;
    private CharSequence charSequence;

    private Object writeReplace() {
        return memento();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.charSequence.charAt(i);
    }

    @Override // org.apache.logging.log4j.message.Clearable
    public void clear() {
        this.charSequence = null;
    }

    @Override // org.apache.logging.log4j.util.StringBuilderFormattable
    public void formatTo(StringBuilder sb) {
        sb.append(this.charSequence);
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormat() {
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof String) {
            return (String) charSequence;
        }
        return null;
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        return String.valueOf(this.charSequence);
    }

    @Override // org.apache.logging.log4j.message.ReusableMessage
    public short getParameterCount() {
        return (short) 0;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Object[] getParameters() {
        return Constants.EMPTY_OBJECT_ARRAY;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Throwable getThrowable() {
        return null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        CharSequence charSequence = this.charSequence;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    @Override // org.apache.logging.log4j.message.ReusableMessage
    public Message memento() {
        SimpleMessage simpleMessage = new SimpleMessage(this.charSequence);
        simpleMessage.getFormattedMessage();
        return simpleMessage;
    }

    public void set(String str) {
        this.charSequence = str;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.charSequence.subSequence(i, i2);
    }

    public void set(CharSequence charSequence) {
        this.charSequence = charSequence;
    }

    @Override // org.apache.logging.log4j.message.ReusableMessage
    public Object[] swapParameters(Object[] objArr) {
        return objArr;
    }

    @Override // org.apache.logging.log4j.message.ParameterVisitable
    public <S> void forEachParameter(ParameterConsumer<S> parameterConsumer, S s) {
    }
}
