package com.amazon.minerva.client.common.internal;

import android.content.Context;
import com.amazon.minerva.client.common.api.provider.CustomerInfoProvider;
import com.amazon.minerva.client.common.compliance.ChildProfileVerifier;
import com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider;
import com.amazon.minerva.client.common.compliance.UserControlVerifier;
import com.amazon.minerva.client.common.transport.OAuthProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface AmazonMinervaServiceInitializerAdapter {
    void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier);

    void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2);

    void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider);

    void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3);

    void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3, String str4);

    void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3, String str4, CustomerInfoProvider customerInfoProvider);

    boolean isInitialized();
}
