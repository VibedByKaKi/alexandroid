package com.amazon.alexa.mosaic.components.apl.models;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AplEvent implements IAplEvent {
    private final Object[] mArgs;
    private final Map<String, Object> mComponents;
    private final Map<String, Object> mFlags;
    private final String mPresentationToken;
    private final String mPresentationUri;
    private final Map<String, Object> mSources;

    public AplEvent(String str, String str2, Object[] objArr, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        this.mPresentationUri = str;
        this.mPresentationToken = str2;
        this.mArgs = objArr;
        this.mComponents = map;
        this.mSources = map2;
        this.mFlags = map3;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IAplEvent
    public Object[] getArgs() {
        return this.mArgs;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IAplEvent
    public Map<String, Object> getComponents() {
        return this.mComponents;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IAplEvent
    public Map<String, Object> getFlags() {
        return this.mFlags;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IAplEvent
    public String getPresentationToken() {
        return this.mPresentationToken;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IAplEvent
    public String getPresentationUri() {
        return this.mPresentationUri;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IAplEvent
    public Map<String, Object> getSources() {
        return this.mSources;
    }
}
