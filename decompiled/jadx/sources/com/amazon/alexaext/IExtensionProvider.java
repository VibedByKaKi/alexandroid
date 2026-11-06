package com.amazon.alexaext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IExtensionProvider {
    void finish();

    ExtensionProxy getExtension(String str);

    boolean hasExtension(String str);
}
