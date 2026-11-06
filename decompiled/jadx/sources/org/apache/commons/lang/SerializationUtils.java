package org.apache.commons.lang;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SerializationUtils {
    public static Object clone(Serializable serializable) {
        return deserialize(serialize(serializable));
    }

    public static Object deserialize(InputStream inputStream) {
        ObjectInputStream objectInputStream;
        if (inputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The InputStream must not be null");
            return null;
        }
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(inputStream);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object readObject = objectInputStream.readObject();
                try {
                    objectInputStream.close();
                } catch (IOException unused) {
                }
                return readObject;
            } catch (IOException e) {
                e = e;
                throw new SerializationException(e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                throw new SerializationException(e);
            } catch (Throwable th2) {
                th = th2;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (ClassNotFoundException e4) {
            e = e4;
        }
    }

    public static void serialize(Serializable serializable, OutputStream outputStream) {
        ObjectOutputStream objectOutputStream;
        if (outputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The OutputStream must not be null");
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(outputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(serializable);
            try {
                objectOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (IOException e2) {
            e = e2;
            objectOutputStream2 = objectOutputStream;
            throw new SerializationException(e);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static byte[] serialize(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        serialize(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Object deserialize(byte[] bArr) {
        if (bArr != null) {
            return deserialize(new ByteArrayInputStream(bArr));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The byte[] must not be null");
        return null;
    }
}
