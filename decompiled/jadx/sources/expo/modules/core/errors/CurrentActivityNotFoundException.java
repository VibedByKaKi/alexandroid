package expo.modules.core.errors;

import expo.modules.core.interfaces.CodedThrowable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CurrentActivityNotFoundException extends CodedException implements CodedThrowable {
    public CurrentActivityNotFoundException() {
        super("Current activity not found. Make sure to call this method while your application is in foreground.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_CURRENT_ACTIVITY_NOT_FOUND";
    }
}
