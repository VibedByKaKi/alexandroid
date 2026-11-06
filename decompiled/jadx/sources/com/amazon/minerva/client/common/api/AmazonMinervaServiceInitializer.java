package com.amazon.minerva.client.common.api;

import android.content.Context;
import com.amazon.minerva.client.common.api.provider.CustomerInfoProvider;
import com.amazon.minerva.client.common.compliance.ChildProfileVerifier;
import com.amazon.minerva.client.common.compliance.NonAnonymousCustomerIdProvider;
import com.amazon.minerva.client.common.compliance.UserControlVerifier;
import com.amazon.minerva.client.common.internal.AmazonMinervaServiceInitializerAdapter;
import com.amazon.minerva.client.common.internal.android.AndroidMinervaServiceInitializerAdapter;
import com.amazon.minerva.client.common.internal.util.DevicePlatformIdentifierUtil;
import com.amazon.minerva.client.common.transport.OAuthProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AmazonMinervaServiceInitializer {
    private static AmazonMinervaServiceInitializer INSTANCE = new AmazonMinervaServiceInitializer();
    private AmazonMinervaServiceInitializerAdapter mAdapter;
    private DevicePlatformIdentifierUtil mDevicePlatformIdentifierUtil;

    private AmazonMinervaServiceInitializer() {
        DevicePlatformIdentifierUtil devicePlatformIdentifierUtil = DevicePlatformIdentifierUtil.getInstance();
        this.mDevicePlatformIdentifierUtil = devicePlatformIdentifierUtil;
        if (devicePlatformIdentifierUtil.isDevicePlatformFireOS()) {
            return;
        }
        this.mAdapter = AndroidMinervaServiceInitializerAdapter.getInstance();
    }

    public static AmazonMinervaServiceInitializer getInstance() {
        return INSTANCE;
    }

    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3, String str4, CustomerInfoProvider customerInfoProvider) {
        AmazonMinervaServiceInitializerAdapter amazonMinervaServiceInitializerAdapter = this.mAdapter;
        if (amazonMinervaServiceInitializerAdapter != null) {
            amazonMinervaServiceInitializerAdapter.initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, str3, str4, customerInfoProvider);
        }
    }

    public boolean isInitialized() {
        AmazonMinervaServiceInitializerAdapter amazonMinervaServiceInitializerAdapter = this.mAdapter;
        return amazonMinervaServiceInitializerAdapter == null || amazonMinervaServiceInitializerAdapter.isInitialized();
    }

    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, null);
    }

    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, null);
    }

    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, str3, null);
    }

    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier, String str2, NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider, String str3, String str4) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, str2, nonAnonymousCustomerIdProvider, str3, str4, null);
    }

    public synchronized void initialize(Context context, String str, OAuthProvider oAuthProvider, ChildProfileVerifier childProfileVerifier, UserControlVerifier userControlVerifier) {
        initialize(context, str, oAuthProvider, childProfileVerifier, userControlVerifier, null);
    }
}
