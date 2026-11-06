package com.amazon.alexa.accessory.capabilities.instrumentation;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.google.common.base.Charsets;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DefaultDataFormatter implements DataFormatter {
    private static final String FOOTER = "\n~~ End of PrintDebug ~~~~~~~~~";
    private static final String HEADER = "~~ Start of PrintDebug ~~~~~~~\n";
    private static final int HEXADECIMAL_TABLE_WIDTH = 16;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.capabilities.instrumentation.DefaultDataFormatter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$capabilities$instrumentation$OutputConfiguration;

        static {
            int[] iArr = new int[OutputConfiguration.values().length];
            $SwitchMap$com$amazon$alexa$accessory$capabilities$instrumentation$OutputConfiguration = iArr;
            try {
                iArr[OutputConfiguration.UTF_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$capabilities$instrumentation$OutputConfiguration[OutputConfiguration.HEXADECIMAL_TABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private String addHeaderAndFooter(String str) {
        return a$$ExternalSyntheticOutline0.m(HEADER, str, FOOTER);
    }

    private void addRowNumberPrefix(StringBuilder sb, int i) {
        sb.append(String.format(Locale.US, "%06x", Integer.valueOf(i * 16)));
    }

    private String asHexadecimalTable(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            if (i == 0) {
                addRowNumberPrefix(sb, i2);
            }
            sb.append(" ");
            sb.append(String.format("%02x", Byte.valueOf(b)));
            i++;
            if (i == 16) {
                sb.append("\n");
                i2++;
                i = 0;
            }
        }
        return sb.toString();
    }

    private String asUtf8(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    private String formatData(byte[] bArr, OutputConfiguration outputConfiguration) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$capabilities$instrumentation$OutputConfiguration[outputConfiguration.ordinal()];
        if (i == 1) {
            return asUtf8(bArr);
        }
        if (i == 2) {
            return asHexadecimalTable(bArr);
        }
        Logger.e("Unsupported output configuration %s", outputConfiguration);
        return null;
    }

    @Override // com.amazon.alexa.accessory.capabilities.instrumentation.DataFormatter
    public String format(byte[] bArr, List<OutputConfiguration> list) {
        Preconditions.notNull(bArr, "data");
        Preconditions.notNull(list, "formats");
        if (list.size() == 1) {
            return addHeaderAndFooter(formatData(bArr, list.get(0)));
        }
        Logger.e("DefaultDataFormatter only supports exactly 1 output configuration at a time (received %d)", Integer.valueOf(list.size()));
        return null;
    }
}
