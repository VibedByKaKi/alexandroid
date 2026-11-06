package org.apache.logging.log4j.message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.logging.log4j.status.StatusLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LocalizedMessage implements Message, LoggerNameAwareMessage {
    private static final long serialVersionUID = 3893703791567290742L;
    private transient Object[] argArray;
    private String baseName;
    private String formattedMessage;
    private String key;
    private final Locale locale;
    private transient StatusLogger logger;
    private String loggerName;
    private transient ResourceBundle resourceBundle;
    private String[] stringArgs;
    private transient Throwable throwable;

    public LocalizedMessage(String str, Locale locale, String str2, Object[] objArr) {
        this.logger = StatusLogger.getLogger();
        this.key = str2;
        this.argArray = objArr;
        this.throwable = null;
        this.baseName = str;
        this.resourceBundle = null;
        this.locale = locale;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.formattedMessage = objectInputStream.readUTF();
        this.key = objectInputStream.readUTF();
        this.baseName = objectInputStream.readUTF();
        objectInputStream.readInt();
        this.stringArgs = (String[]) objectInputStream.readObject();
        this.logger = StatusLogger.getLogger();
        this.resourceBundle = null;
        this.argArray = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        getFormattedMessage();
        objectOutputStream.writeUTF(this.formattedMessage);
        objectOutputStream.writeUTF(this.key);
        objectOutputStream.writeUTF(this.baseName);
        objectOutputStream.writeInt(this.argArray.length);
        Object[] objArr = this.argArray;
        this.stringArgs = new String[objArr.length];
        int i = 0;
        for (Object obj : objArr) {
            this.stringArgs[i] = obj.toString();
            i++;
        }
        objectOutputStream.writeObject(this.stringArgs);
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormat() {
        return this.key;
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        String str = this.formattedMessage;
        if (str != null) {
            return str;
        }
        ResourceBundle resourceBundle = this.resourceBundle;
        if (resourceBundle == null) {
            String str2 = this.baseName;
            resourceBundle = str2 != null ? getResourceBundle(str2, this.locale, false) : getResourceBundle(this.loggerName, this.locale, true);
        }
        String format = getFormat();
        if (resourceBundle != null && resourceBundle.containsKey(format)) {
            format = resourceBundle.getString(format);
        }
        Object[] objArr = this.argArray;
        if (objArr == null) {
            objArr = this.stringArgs;
        }
        FormattedMessage formattedMessage = new FormattedMessage(format, objArr);
        this.formattedMessage = formattedMessage.getFormattedMessage();
        this.throwable = formattedMessage.getThrowable();
        return this.formattedMessage;
    }

    @Override // org.apache.logging.log4j.message.LoggerNameAwareMessage
    public String getLoggerName() {
        return this.loggerName;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Object[] getParameters() {
        Object[] objArr = this.argArray;
        return objArr != null ? objArr : this.stringArgs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ResourceBundle] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ResourceBundle] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ResourceBundle] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ResourceBundle] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:9:0x000c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002c -> B:9:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ResourceBundle getResourceBundle(java.lang.String r4, java.util.Locale r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "Unable to locate ResourceBundle {}"
            if (r5 == 0) goto Le
            java.util.ResourceBundle r6 = java.util.ResourceBundle.getBundle(r4, r5)     // Catch: java.util.MissingResourceException -> L13
        Lc:
            r0 = r6
            goto L1b
        Le:
            java.util.ResourceBundle r6 = java.util.ResourceBundle.getBundle(r4)     // Catch: java.util.MissingResourceException -> L13
            goto Lc
        L13:
            if (r6 != 0) goto L1b
            org.apache.logging.log4j.status.StatusLogger r3 = r3.logger
            r3.debug(r1, r4)
            return r0
        L1b:
            if (r0 != 0) goto L3c
            r6 = 46
            int r6 = r4.lastIndexOf(r6)
            if (r6 <= 0) goto L3c
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r6)
            if (r5 == 0) goto L31
            java.util.ResourceBundle r6 = java.util.ResourceBundle.getBundle(r4, r5)     // Catch: java.util.MissingResourceException -> L36
            goto Lc
        L31:
            java.util.ResourceBundle r6 = java.util.ResourceBundle.getBundle(r4)     // Catch: java.util.MissingResourceException -> L36
            goto Lc
        L36:
            org.apache.logging.log4j.status.StatusLogger r6 = r3.logger
            r6.debug(r1, r4)
            goto L1b
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.logging.log4j.message.LocalizedMessage.getResourceBundle(java.lang.String, java.util.Locale, boolean):java.util.ResourceBundle");
    }

    @Override // org.apache.logging.log4j.message.Message
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // org.apache.logging.log4j.message.LoggerNameAwareMessage
    public void setLoggerName(String str) {
        this.loggerName = str;
    }

    public String toString() {
        return getFormattedMessage();
    }

    public LocalizedMessage(String str, String str2, Object[] objArr) {
        this(str, (Locale) null, str2, objArr);
    }

    public LocalizedMessage(ResourceBundle resourceBundle, String str, Object[] objArr) {
        this(resourceBundle, (Locale) null, str, objArr);
    }

    public LocalizedMessage(String str, Object[] objArr) {
        this((ResourceBundle) null, (Locale) null, str, objArr);
    }

    public LocalizedMessage(ResourceBundle resourceBundle, Locale locale, String str, Object[] objArr) {
        this.logger = StatusLogger.getLogger();
        this.key = str;
        this.argArray = objArr;
        this.throwable = null;
        this.baseName = null;
        this.resourceBundle = resourceBundle;
        this.locale = locale;
    }

    public LocalizedMessage(Locale locale, String str, Object[] objArr) {
        this((ResourceBundle) null, locale, str, objArr);
    }

    public LocalizedMessage(String str, Object obj) {
        this((ResourceBundle) null, (Locale) null, str, new Object[]{obj});
    }

    public LocalizedMessage(String str, String str2, Object obj) {
        this(str, (Locale) null, str2, new Object[]{obj});
    }

    public LocalizedMessage(ResourceBundle resourceBundle, String str) {
        this(resourceBundle, (Locale) null, str, new Object[0]);
    }

    public LocalizedMessage(ResourceBundle resourceBundle, String str, Object obj) {
        this(resourceBundle, (Locale) null, str, new Object[]{obj});
    }

    public LocalizedMessage(String str, Locale locale, String str2, Object obj) {
        this(str, locale, str2, new Object[]{obj});
    }

    public LocalizedMessage(ResourceBundle resourceBundle, Locale locale, String str, Object obj) {
        this(resourceBundle, locale, str, new Object[]{obj});
    }

    public LocalizedMessage(Locale locale, String str, Object obj) {
        this((ResourceBundle) null, locale, str, new Object[]{obj});
    }

    public LocalizedMessage(String str, Object obj, Object obj2) {
        this((ResourceBundle) null, (Locale) null, str, new Object[]{obj, obj2});
    }

    public LocalizedMessage(String str, String str2, Object obj, Object obj2) {
        this(str, (Locale) null, str2, new Object[]{obj, obj2});
    }

    public LocalizedMessage(ResourceBundle resourceBundle, String str, Object obj, Object obj2) {
        this(resourceBundle, (Locale) null, str, new Object[]{obj, obj2});
    }

    public LocalizedMessage(String str, Locale locale, String str2, Object obj, Object obj2) {
        this(str, locale, str2, new Object[]{obj, obj2});
    }

    public LocalizedMessage(ResourceBundle resourceBundle, Locale locale, String str, Object obj, Object obj2) {
        this(resourceBundle, locale, str, new Object[]{obj, obj2});
    }

    public LocalizedMessage(Locale locale, String str, Object obj, Object obj2) {
        this((ResourceBundle) null, locale, str, new Object[]{obj, obj2});
    }
}
