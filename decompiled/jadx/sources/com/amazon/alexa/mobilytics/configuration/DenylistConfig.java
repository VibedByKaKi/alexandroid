package com.amazon.alexa.mobilytics.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class DenylistConfig {
    private List<Denylist> denylist = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Denylist {
        public String appComponent;
        public String eventName;
        public String ownerIdentifier;

        public String appComponent() {
            return this.appComponent;
        }

        public String eventName() {
            return this.eventName;
        }

        public String ownerIdentifier() {
            return this.ownerIdentifier;
        }
    }

    public void clearDenylist() {
        this.denylist.clear();
    }

    public List<Denylist> denylist() {
        return this.denylist;
    }
}
