package org.eclipse.paho.client.mqttv3.internal.wire;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.internal.ExceptionHelper;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class MqttWireMessage {
    private static final long FOUR_BYTE_INT_MAX = 4294967295L;
    public static final byte MESSAGE_TYPE_CONNACK = 2;
    public static final byte MESSAGE_TYPE_CONNECT = 1;
    public static final byte MESSAGE_TYPE_DISCONNECT = 14;
    public static final byte MESSAGE_TYPE_PINGREQ = 12;
    public static final byte MESSAGE_TYPE_PINGRESP = 13;
    public static final byte MESSAGE_TYPE_PUBACK = 4;
    public static final byte MESSAGE_TYPE_PUBCOMP = 7;
    public static final byte MESSAGE_TYPE_PUBLISH = 3;
    public static final byte MESSAGE_TYPE_PUBREC = 5;
    public static final byte MESSAGE_TYPE_PUBREL = 6;
    public static final byte MESSAGE_TYPE_SUBACK = 9;
    public static final byte MESSAGE_TYPE_SUBSCRIBE = 8;
    public static final byte MESSAGE_TYPE_UNSUBACK = 11;
    public static final byte MESSAGE_TYPE_UNSUBSCRIBE = 10;
    private static final int VARIABLE_BYTE_INT_MAX = 268435455;
    protected boolean duplicate = false;
    protected int msgId = 0;
    private MqttToken token;
    private byte type;
    protected static final Charset STRING_ENCODING = StandardCharsets.UTF_8;
    private static final String[] PACKET_NAMES = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};

    public MqttWireMessage(byte b) {
        this.type = b;
    }

    private static MqttWireMessage createWireMessage(InputStream inputStream) throws MqttException {
        try {
            DataInputStream dataInputStream = new DataInputStream(new CountingInputStream(inputStream));
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            byte b = (byte) (readUnsignedByte >> 4);
            byte b2 = (byte) (readUnsignedByte & 15);
            long counter = (r0.getCounter() + readMBI(dataInputStream).getValue()) - r0.getCounter();
            byte[] bArr = new byte[0];
            if (counter > 0) {
                int i = (int) counter;
                byte[] bArr2 = new byte[i];
                dataInputStream.readFully(bArr2, 0, i);
                bArr = bArr2;
            }
            if (b == 1) {
                return new MqttConnect(b2, bArr);
            }
            if (b == 3) {
                return new MqttPublish(b2, bArr);
            }
            if (b == 4) {
                return new MqttPubAck(b2, bArr);
            }
            if (b == 7) {
                return new MqttPubComp(b2, bArr);
            }
            if (b == 2) {
                return new MqttConnack(b2, bArr);
            }
            if (b == 12) {
                return new MqttPingReq(b2, bArr);
            }
            if (b == 13) {
                return new MqttPingResp(b2, bArr);
            }
            if (b == 8) {
                return new MqttSubscribe(b2, bArr);
            }
            if (b == 9) {
                return new MqttSuback(b2, bArr);
            }
            if (b == 10) {
                return new MqttUnsubscribe(b2, bArr);
            }
            if (b == 11) {
                return new MqttUnsubAck(b2, bArr);
            }
            if (b == 6) {
                return new MqttPubRel(b2, bArr);
            }
            if (b == 5) {
                return new MqttPubRec(b2, bArr);
            }
            if (b == 14) {
                return new MqttDisconnect(b2, bArr);
            }
            throw ExceptionHelper.createMqttException(6);
        } catch (IOException e) {
            throw new MqttException(e);
        }
    }

    public static String decodeUTF8(DataInputStream dataInputStream) throws MqttException {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            String str = new String(bArr, STRING_ENCODING);
            validateUTF8String(str);
            return str;
        } catch (IOException e) {
            throw new MqttException(e);
        }
    }

    public static byte[] encodeMBI(long j) {
        validateVariableByteInt((int) j);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        do {
            byte b = (byte) (j % 128);
            j /= 128;
            if (j > 0) {
                b = (byte) (b | 128);
            }
            byteArrayOutputStream.write(b);
            i++;
            if (j <= 0) {
                break;
            }
        } while (i < 4);
        return byteArrayOutputStream.toByteArray();
    }

    public static void encodeUTF8(DataOutputStream dataOutputStream, String str) throws MqttException {
        validateUTF8String(str);
        try {
            byte[] bytes = str.getBytes(STRING_ENCODING);
            byte length = (byte) ((bytes.length >>> 8) & 255);
            byte length2 = (byte) (bytes.length & 255);
            dataOutputStream.write(length);
            dataOutputStream.write(length2);
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e) {
            throw new MqttException(e);
        } catch (IOException e2) {
            throw new MqttException(e2);
        }
    }

    public static MultiByteInteger readMBI(DataInputStream dataInputStream) throws IOException {
        byte readByte;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        do {
            readByte = dataInputStream.readByte();
            i++;
            i2 += (readByte & Byte.MAX_VALUE) * i3;
            i3 *= 128;
        } while ((readByte & 128) != 0);
        if (i2 >= 0 && i2 <= VARIABLE_BYTE_INT_MAX) {
            return new MultiByteInteger(i2, i);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(i2, "This property must be a number between 0 and 268435455. Read value was: "));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r3 != 65534) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r2 > 64991) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void validateUTF8String(java.lang.String r7) throws java.lang.IllegalArgumentException {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.length()
            if (r1 < r2) goto L9
            return
        L9:
            char r2 = r7.charAt(r1)
            boolean r3 = java.lang.Character.isHighSurrogate(r2)
            r4 = 65534(0xfffe, float:9.1833E-41)
            r5 = 1
            if (r3 == 0) goto L3e
            int r1 = r1 + 1
            int r3 = r7.length()
            if (r1 != r3) goto L21
        L1f:
            r3 = r5
            goto L5a
        L21:
            char r3 = r7.charAt(r1)
            boolean r6 = java.lang.Character.isLowSurrogate(r3)
            if (r6 == 0) goto L2c
            goto L1f
        L2c:
            r6 = r2 & 1023(0x3ff, float:1.434E-42)
            int r6 = r6 << 10
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r3 = r3 | r6
            r6 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r6
            if (r3 == r6) goto L1f
            if (r3 != r4) goto L3c
            goto L1f
        L3c:
            r3 = r0
            goto L5a
        L3e:
            boolean r3 = java.lang.Character.isISOControl(r2)
            if (r3 != 0) goto L1f
            boolean r3 = java.lang.Character.isLowSurrogate(r2)
            if (r3 == 0) goto L4b
            goto L1f
        L4b:
            r3 = 64976(0xfdd0, float:9.1051E-41)
            if (r2 < r3) goto L3c
            if (r2 == r4) goto L1f
            if (r2 >= r3) goto L1f
            r3 = 64991(0xfddf, float:9.1072E-41)
            if (r2 > r3) goto L3c
            goto L1f
        L5a:
            if (r3 != 0) goto L5e
            int r1 = r1 + r5
            goto L2
        L5e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r0 = "Invalid UTF-8 char: [%x]"
            okio.Buffer$$ExternalSyntheticBUOutline0.m(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage.validateUTF8String(java.lang.String):void");
    }

    public static void validateVariableByteInt(int i) throws IllegalArgumentException {
        if (i < 0 || i > VARIABLE_BYTE_INT_MAX) {
            Single$$ExternalSyntheticBUOutline0.m$3("This property must be a number between 0 and 268435455");
        }
    }

    public byte[] encodeMessageId() throws MqttException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.msgId);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new MqttException(e);
        }
    }

    public byte[] getHeader() throws MqttException {
        try {
            int type = ((getType() & 15) << 4) ^ (getMessageInfo() & 15);
            byte[] variableHeader = getVariableHeader();
            int length = variableHeader.length + getPayload().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(type);
            dataOutputStream.write(encodeMBI(length));
            dataOutputStream.write(variableHeader);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new MqttException(e);
        }
    }

    public String getKey() {
        return Integer.toString(getMessageId());
    }

    public int getMessageId() {
        return this.msgId;
    }

    public abstract byte getMessageInfo();

    public byte[] getPayload() throws MqttException {
        return new byte[0];
    }

    public MqttToken getToken() {
        return this.token;
    }

    public byte getType() {
        return this.type;
    }

    public abstract byte[] getVariableHeader() throws MqttException;

    public boolean isMessageIdRequired() {
        return true;
    }

    public boolean isRetryable() {
        return false;
    }

    public void setDuplicate(boolean z) {
        this.duplicate = z;
    }

    public void setMessageId(int i) {
        this.msgId = i;
    }

    public void setToken(MqttToken mqttToken) {
        this.token = mqttToken;
    }

    public String toString() {
        return PACKET_NAMES[this.type];
    }

    public static MqttWireMessage createWireMessage(byte[] bArr) throws MqttException {
        return createWireMessage(new ByteArrayInputStream(bArr));
    }

    public static MqttWireMessage createWireMessage(MqttPersistable mqttPersistable) throws MqttException {
        byte[] payloadBytes = mqttPersistable.getPayloadBytes();
        if (payloadBytes == null) {
            payloadBytes = new byte[0];
        }
        return createWireMessage(new MultiByteArrayInputStream(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength(), payloadBytes, mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength()));
    }
}
