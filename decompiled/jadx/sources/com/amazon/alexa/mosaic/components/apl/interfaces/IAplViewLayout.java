package com.amazon.alexa.mosaic.components.apl.interfaces;

import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface IAplViewLayout {
    void execute(String str);

    void pause();

    void render(String str, String str2, IAplEventListener iAplEventListener, IVisualContextEventListener iVisualContextEventListener) throws JSONException;

    void resume();

    void update(String str, String str2);
}
