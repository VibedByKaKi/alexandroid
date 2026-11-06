package com.amazon.rtvi.alexa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/rtvi/alexa/model/enums/OpticalMachineReadableCodeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BARCODE", "QRCODE", "DATAMATRIX", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpticalMachineReadableCodeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OpticalMachineReadableCodeType[] $VALUES;

    @JsonValue
    @NotNull
    private final String value;
    public static final OpticalMachineReadableCodeType BARCODE = new OpticalMachineReadableCodeType("BARCODE", 0, "BARCODE");
    public static final OpticalMachineReadableCodeType QRCODE = new OpticalMachineReadableCodeType("QRCODE", 1, "QRCODE");
    public static final OpticalMachineReadableCodeType DATAMATRIX = new OpticalMachineReadableCodeType("DATAMATRIX", 2, "DATAMATRIX");

    private static final /* synthetic */ OpticalMachineReadableCodeType[] $values() {
        return new OpticalMachineReadableCodeType[]{BARCODE, QRCODE, DATAMATRIX};
    }

    static {
        OpticalMachineReadableCodeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OpticalMachineReadableCodeType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<OpticalMachineReadableCodeType> getEntries() {
        return $ENTRIES;
    }

    public static OpticalMachineReadableCodeType valueOf(String str) {
        return (OpticalMachineReadableCodeType) Enum.valueOf(OpticalMachineReadableCodeType.class, str);
    }

    public static OpticalMachineReadableCodeType[] values() {
        return (OpticalMachineReadableCodeType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
