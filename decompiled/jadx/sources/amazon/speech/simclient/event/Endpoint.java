package amazon.speech.simclient.event;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class Endpoint implements Serializable {
    private final Map<String, String> mCookie;
    private final String mEndpointId;

    public Endpoint() {
        this.mEndpointId = null;
        this.mCookie = null;
    }

    public Map<String, String> getCookie() {
        return this.mCookie;
    }

    public String getEndpointId() {
        return this.mEndpointId;
    }

    public Endpoint(String str, Map<String, String> map) {
        this.mEndpointId = str;
        this.mCookie = map;
    }
}
