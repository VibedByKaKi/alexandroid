package org.apache.logging.log4j.util;

import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class LambdaUtil {
    private LambdaUtil() {
    }

    public static Object get(Supplier<?> supplier) {
        if (supplier == null) {
            return null;
        }
        Object obj = supplier.get();
        return obj instanceof Message ? ((Message) obj).getFormattedMessage() : obj;
    }

    public static Object[] getAll(Supplier<?>... supplierArr) {
        if (supplierArr == null) {
            return null;
        }
        int length = supplierArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = get(supplierArr[i]);
        }
        return objArr;
    }

    public static Message getMessage(Supplier<?> supplier, MessageFactory messageFactory) {
        if (supplier == null) {
            return null;
        }
        Object obj = supplier.get();
        return obj instanceof Message ? (Message) obj : messageFactory.newMessage(obj);
    }

    public static Message get(MessageSupplier messageSupplier) {
        if (messageSupplier == null) {
            return null;
        }
        return messageSupplier.get();
    }
}
