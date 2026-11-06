package org.apache.logging.log4j.message;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.apache.logging.log4j.util.StringBuilders;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@PerformanceSensitive({"allocation"})
/* loaded from: classes11.dex */
public class ReusableObjectMessage implements ReusableMessage, ParameterVisitable, Clearable {
    private static final long serialVersionUID = 6922476812535519960L;
    private transient Object obj;

    private Object writeReplace() {
        return memento();
    }

    @Override // org.apache.logging.log4j.message.Clearable
    public void clear() {
        this.obj = null;
    }

    @Override // org.apache.logging.log4j.message.ParameterVisitable
    public <S> void forEachParameter(ParameterConsumer<S> parameterConsumer, S s) {
        parameterConsumer.accept(this.obj, 0, s);
    }

    @Override // org.apache.logging.log4j.util.StringBuilderFormattable
    public void formatTo(StringBuilder sb) {
        StringBuilders.appendValue(sb, this.obj);
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormat() {
        Object obj = this.obj;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        return String.valueOf(this.obj);
    }

    public Object getParameter() {
        return this.obj;
    }

    @Override // org.apache.logging.log4j.message.ReusableMessage
    public short getParameterCount() {
        return (short) 1;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Object[] getParameters() {
        return new Object[]{this.obj};
    }

    @Override // org.apache.logging.log4j.message.Message
    public Throwable getThrowable() {
        Object obj = this.obj;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    @Override // org.apache.logging.log4j.message.ReusableMessage
    public Message memento() {
        ObjectMessage objectMessage = new ObjectMessage(this.obj);
        objectMessage.getFormattedMessage();
        return objectMessage;
    }

    public void set(Object obj) {
        this.obj = obj;
    }

    @Override // org.apache.logging.log4j.message.ReusableMessage
    public Object[] swapParameters(Object[] objArr) {
        int length = objArr.length;
        Object obj = this.obj;
        if (length != 0) {
            objArr[0] = obj;
            return objArr;
        }
        Object[] objArr2 = new Object[10];
        objArr2[0] = obj;
        return objArr2;
    }

    public String toString() {
        return getFormattedMessage();
    }
}
