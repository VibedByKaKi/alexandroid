package expo.modules.adapters.react.views;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ViewManagerAdapterUtils {
    public static String normalizeEventName(String str) {
        return str.startsWith("on") ? "top".concat(str.substring(2)) : str;
    }
}
