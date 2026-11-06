package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AudioDevice {
    public static AudioDevice DEFAULT = new AudioDevice("INTERNAL", com.amazon.alexa.api.compat.model.AudioDevice.DEFAULT_FRIENDLY_NAME);
    public static String DEFAULT_FRIENDLY_NAME = "DEFAULT_OUTPUT";
    public static String DEFAULT_PHYSICAL_ADDRESS = "INTERNAL";
    private String friendlyName;
    private String physicalAddress;

    private AudioDevice(@NonNull String str, @NonNull String str2) {
        Preconditions.notNull(str, "Physical address cannot be null");
        Preconditions.notNull(str2, "Friendly name cannot be null");
        this.physicalAddress = str;
        this.friendlyName = str2;
    }

    public static AudioDevice create(@NonNull String str, @NonNull String str2) {
        return new AudioDevice(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioDevice)) {
            return false;
        }
        AudioDevice audioDevice = (AudioDevice) obj;
        return getPhysicalAddress().equals(audioDevice.getPhysicalAddress()) && getFriendlyName().equals(audioDevice.getFriendlyName());
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }

    public String getPhysicalAddress() {
        return this.physicalAddress;
    }

    public int hashCode() {
        return Objects.hash(getPhysicalAddress(), getFriendlyName());
    }
}
