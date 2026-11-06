package expo.modules.core.errors;

import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.core.interfaces.CodedThrowable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ModuleNotFoundException extends CodedException implements CodedThrowable {
    public ModuleNotFoundException(String str) {
        super(a$$ExternalSyntheticOutline0.m("Module '", str, "' not found. Are you sure all modules are linked correctly?"));
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_MODULE_NOT_FOUND";
    }
}
