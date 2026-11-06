package chip.devicecontroller;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum DiagnosticLogType {
    EndUserSupport(0),
    NetworkDiagnostics(1),
    CrashLogs(2);

    private final int value;

    DiagnosticLogType(int i) {
        this.value = i;
    }

    public static DiagnosticLogType value(String str) {
        for (DiagnosticLogType diagnosticLogType : values()) {
            if (diagnosticLogType.toString().equals(str)) {
                return diagnosticLogType;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid value: ", str));
        return null;
    }

    public final int getValue() {
        return this.value;
    }

    public static DiagnosticLogType value(int i) {
        for (DiagnosticLogType diagnosticLogType : values()) {
            if (diagnosticLogType.value == i) {
                return diagnosticLogType;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid value: "));
        return null;
    }
}
