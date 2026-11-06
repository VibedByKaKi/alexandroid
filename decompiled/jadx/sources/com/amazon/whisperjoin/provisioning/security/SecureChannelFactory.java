package com.amazon.whisperjoin.provisioning.security;

import com.amazon.whispercloak.SecureChannel;
import com.amazon.whispercloak.SecureChannelImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class SecureChannelFactory {
    public SecureChannel createSecureChannel() {
        return new SecureChannelImpl();
    }
}
