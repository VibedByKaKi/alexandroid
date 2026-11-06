package com.amazon.whisperjoin.common.sharedtypes.utility;

import java.nio.charset.Charset;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EncodingHelpers {
    private static final int MAX_BYTE_VALUE = 255;
    private static final int MAX_COMMAND_LENGTH = 64;
    private static final String UTF_8 = "UTF-8";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CommandInformation {
        String getCommand();

        byte[] getPayload();
    }

    private int getBufferSize(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length + bArr2.length + 1;
        if (length < i) {
            return length;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("buffer size is larger than maximumMessageSize");
        return 0;
    }

    private String getCommand(byte[] bArr) {
        return new String(bArr, 1, getCommandSize(bArr), Charset.forName("UTF-8"));
    }

    private byte[] getCommandBytes(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        if (bytes.length <= 127) {
            return bytes;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("command's UTF 8 bytes larger than Byte.MAX_VALUE");
        return null;
    }

    private byte getCommandSize(byte[] bArr) {
        if (bArr.length <= 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("messageBuffer not large enough to have a command");
            return (byte) 0;
        }
        byte b = bArr[0];
        if (bArr.length >= b + 1) {
            return b;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("command size is larger than buffer size");
        return (byte) 0;
    }

    private byte[] getPayload(byte[] bArr) {
        int commandSize = getCommandSize(bArr) + 1;
        if (commandSize == bArr.length) {
            return null;
        }
        if (commandSize <= bArr.length) {
            return Arrays.copyOfRange(bArr, commandSize, bArr.length);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("command size is larger than message size");
        return null;
    }

    private void setCommand(byte[] bArr, byte[] bArr2) {
        setCommandSize(bArr, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, 1, bArr2.length);
    }

    private void setCommandSize(byte[] bArr, int i) {
        if (i > 255) {
            Single$$ExternalSyntheticBUOutline0.m$3("command's UTF 8 bytes larger than Byte.MAX_VALUE");
            return;
        }
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("command size can not be <= 0");
            return;
        }
        if (bArr.length >= i + 1) {
            bArr[0] = (byte) i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("final buffer not large enough for commandBuffer");
        }
    }

    private void setPayload(byte[] bArr, byte[] bArr2) {
        byte commandSize = getCommandSize(bArr);
        if (bArr.length == bArr2.length + commandSize + 1) {
            System.arraycopy(bArr2, 0, bArr, commandSize + 1, bArr2.length);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("finalBuffer is not the correct size");
        }
    }

    public CommandInformation decodeCommand(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("data is empty");
            return null;
        }
        if (bArr.length <= 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("message is too small for a command");
            return null;
        }
        final String command = getCommand(bArr);
        final byte[] payload = getPayload(bArr);
        return new CommandInformation() { // from class: com.amazon.whisperjoin.common.sharedtypes.utility.EncodingHelpers.1
            @Override // com.amazon.whisperjoin.common.sharedtypes.utility.EncodingHelpers.CommandInformation
            public String getCommand() {
                return command;
            }

            @Override // com.amazon.whisperjoin.common.sharedtypes.utility.EncodingHelpers.CommandInformation
            public byte[] getPayload() {
                return payload;
            }
        };
    }

    public byte[] encodeCommand(String str, byte[] bArr, int i) {
        if (str == null || str.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("command must not null or greater than 0 length");
            return null;
        }
        if (str.length() > 64) {
            Single$$ExternalSyntheticBUOutline0.m$3("command is too long");
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] commandBytes = getCommandBytes(str);
        byte[] bArr2 = new byte[getBufferSize(commandBytes, bArr, i)];
        setCommand(bArr2, commandBytes);
        setPayload(bArr2, bArr);
        return bArr2;
    }
}
