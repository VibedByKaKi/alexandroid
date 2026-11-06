package com.amazon.alexa.api;

import android.content.ComponentName;
import android.os.Bundle;
import com.amazon.alexa.api.Bundles;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaCapabilityAgentRegistration {
    public ComponentName componentName;
    public String packageName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<AlexaCapabilityAgentRegistration> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CapabilityAgentKeys implements Bundles.Key {
            KEY_COMPONENT,
            KEY_PACKAGE
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AlexaCapabilityAgentRegistration createFromBundle(Bundle bundle) {
            return new AlexaCapabilityAgentRegistration((ComponentName) bundle.getParcelable(CapabilityAgentKeys.KEY_COMPONENT.name()), bundle.getString(CapabilityAgentKeys.KEY_PACKAGE.name()));
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaCapabilityAgentRegistration alexaCapabilityAgentRegistration) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(CapabilityAgentKeys.KEY_COMPONENT.name(), alexaCapabilityAgentRegistration.componentName);
            bundle.putString(CapabilityAgentKeys.KEY_PACKAGE.name(), alexaCapabilityAgentRegistration.packageName);
            return bundle;
        }
    }

    public AlexaCapabilityAgentRegistration(ComponentName componentName, String str) {
        this.componentName = componentName;
        this.packageName = str;
    }
}
