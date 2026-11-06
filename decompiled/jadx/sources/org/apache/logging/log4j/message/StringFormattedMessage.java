package org.apache.logging.log4j.message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StringFormattedMessage implements Message {
    private static final int HASHVAL = 31;
    private static final Logger LOGGER = StatusLogger.getLogger();
    private static final long serialVersionUID = -665975803997290697L;
    private transient Object[] argArray;
    private transient String formattedMessage;
    private final Locale locale;
    private String messagePattern;
    private String[] stringArgs;
    private transient Throwable throwable;

    public StringFormattedMessage(Locale locale, String str, Object... objArr) {
        this.locale = locale;
        this.messagePattern = str;
        this.argArray = objArr;
        if (objArr == null || objArr.length <= 0 || !(objArr[objArr.length - 1] instanceof Throwable)) {
            return;
        }
        this.throwable = (Throwable) objArr[objArr.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.formattedMessage = objectInputStream.readUTF();
        this.messagePattern = objectInputStream.readUTF();
        int readInt = objectInputStream.readInt();
        this.stringArgs = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            this.stringArgs[i] = objectInputStream.readUTF();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        getFormattedMessage();
        objectOutputStream.writeUTF(this.formattedMessage);
        objectOutputStream.writeUTF(this.messagePattern);
        objectOutputStream.writeInt(this.argArray.length);
        Object[] objArr = this.argArray;
        this.stringArgs = new String[objArr.length];
        int i = 0;
        for (Object obj : objArr) {
            String valueOf = String.valueOf(obj);
            this.stringArgs[i] = valueOf;
            objectOutputStream.writeUTF(valueOf);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringFormattedMessage)) {
            return false;
        }
        StringFormattedMessage stringFormattedMessage = (StringFormattedMessage) obj;
        String str = this.messagePattern;
        String str2 = stringFormattedMessage.messagePattern;
        if (str == null ? str2 == null : str.equals(str2)) {
            return Arrays.equals(this.stringArgs, stringFormattedMessage.stringArgs);
        }
        return false;
    }

    public String formatMessage(String str, Object... objArr) {
        if (objArr != null && objArr.length == 0) {
            return str;
        }
        try {
            return String.format(this.locale, str, objArr);
        } catch (IllegalFormatException e) {
            LOGGER.error("Unable to format msg: {}", str, e);
            return str;
        }
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormat() {
        return this.messagePattern;
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        if (this.formattedMessage == null) {
            this.formattedMessage = formatMessage(this.messagePattern, this.argArray);
        }
        return this.formattedMessage;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Object[] getParameters() {
        Object[] objArr = this.argArray;
        return objArr != null ? objArr : this.stringArgs;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        String str = this.messagePattern;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String[] strArr = this.stringArgs;
        return hashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public String toString() {
        return getFormattedMessage();
    }

    public StringFormattedMessage(String str, Object... objArr) {
        this(Locale.getDefault(Locale.Category.FORMAT), str, objArr);
    }
}
