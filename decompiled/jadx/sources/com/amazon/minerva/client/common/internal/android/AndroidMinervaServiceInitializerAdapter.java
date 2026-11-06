package com.amazon.minerva.client.common.internal.android;

import android.content.Context;
import com.amazon.minerva.client.common.api.provider.CustomerInfoProvider;
import com.amazon.minerva.client.common.compliance.ChildProfileVerifier;
import com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider;
import com.amazon.minerva.client.common.compliance.UserControlVerifier;
import com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter;
import com.amazon.minerva.client.common.internal.compliance.ChildProfileVerifierAdapter;
import com.amazon.minerva.client.common.internal.compliance.NonAnonymousCustomerIdProviderAdapter;
import com.amazon.minerva.client.common.internal.compliance.UserControlVerifierAdapter;
import com.amazon.minerva.client.common.internal.provider.CustomerInfoProviderAdapter;
import com.amazon.minerva.client.common.internal.transport.OAuthProviderAdapter;
import com.amazon.minerva.client.common.transport.OAuthProvider;
import com.amazon.minerva.client.thirdparty.api.AmazonMinervaServiceInitializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AndroidMinervaServiceInitializerAdapter implements AmazonMinervaServiceInitializerAdapter {
    private static AndroidMinervaServiceInitializerAdapter INSTANCE = new AndroidMinervaServiceInitializerAdapter();
    private AmazonMinervaServiceInitializer mAmazonMinervaServiceInitializer = AmazonMinervaServiceInitializer.getInstance();

    private AndroidMinervaServiceInitializerAdapter() {
    }

    public static AndroidMinervaServiceInitializerAdapter getInstance() {
        return INSTANCE;
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3, String str4, CustomerInfoProvider customerInfoProvider) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (oAuthProvider == null) {
                        throw new IllegalStateException("OAuthProvider cannot be null");
                    }
                    if (childProfileVerifier == null) {
                        throw new IllegalStateException("ChildProfileVerifier cannot be null");
                    }
                    if (userControlVerifier == null) {
                        throw new IllegalStateException("User control verifier cannot be null");
                    }
                    OAuthProviderAdapter oAuthProviderAdapter = new OAuthProviderAdapter(oAuthProvider);
                    ChildProfileVerifierAdapter childProfileVerifierAdapter = new ChildProfileVerifierAdapter(childProfileVerifier);
                    UserControlVerifierAdapter userControlVerifierAdapter = new UserControlVerifierAdapter(userControlVerifier);
                    NonAnonymousCustomerIdProviderAdapter nonAnonymousCustomerIdProviderAdapter = nonAnonymousCustomerIdProvider != null ? new NonAnonymousCustomerIdProviderAdapter(nonAnonymousCustomerIdProvider) : null;
                    CustomerInfoProviderAdapter customerInfoProviderAdapter = customerInfoProvider != null ? new CustomerInfoProviderAdapter(customerInfoProvider) : null;
                    if (!this.mAmazonMinervaServiceInitializer.isInitialized()) {
                        this.mAmazonMinervaServiceInitializer.initialize(context, str, oAuthProviderAdapter, childProfileVerifierAdapter, userControlVerifierAdapter, str2, nonAnonymousCustomerIdProviderAdapter, str3, str4, customerInfoProviderAdapter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new IllegalStateException("Non-null and Non-empty device type required");
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public boolean isInitialized() {
        return this.mAmazonMinervaServiceInitializer.isInitialized();
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, null);
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, null);
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, str3, null);
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3, String str4) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, str3, str4, null);
    }

    @Override // com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter
    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, null);
    }
}
