package com.amazon.minerva.client.thirdparty.utils;

import android.util.Log;
import com.amazon.minerva.client.thirdparty.api.provider.CustomerInfoProvider;
import com.amazon.minerva.client.thirdparty.compliance.ChildProfileVerifier;
import com.amazon.minerva.client.thirdparty.compliance.NonAnonymousCustomerIdProvider;
import com.amazon.minerva.client.thirdparty.compliance.UserControlVerifier;
import com.amazon.minerva.client.thirdparty.transport.OAuthProvider;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CustomDeviceUtil {
    private static final CustomDeviceUtil INSTANCE = new CustomDeviceUtil();
    private static final String TAG = "CustomDeviceUtil";
    private static final String UNKNOWN = "UNKNOWN";
    private String mAppConfigId;
    private ChildProfileVerifier mChildProfileVerifier;
    private CustomerInfoProvider mCustomerInfoProvider;
    private String mDeviceType;
    private String mHashedDeviceType;
    private String mMarketplaceId;
    private NonAnonymousCustomerIdProvider mNonAnonymousCustomerIdProvider;
    private String mNonAnonymousDeviceId;
    private OAuthProvider mOAuthProvider;
    private UserControlVerifier mUserControlVerifier;
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private boolean mIsInitializerSetDeviceType = false;
    private boolean mIsInitializerSetOAuthProvider = false;
    private boolean mIsInitializerSetChildProfileVerifier = false;
    private boolean mIsInitializerSetUserControlVerifier = false;
    private boolean mIsInitializerSetNonAnonymousCustomerIdProvider = false;
    private boolean mIsInitializerSetNonAnonymousDeviceId = false;
    private boolean mIsInitializerSetMarketplaceId = false;
    private boolean mIsInitializerSetCustomerInfoProvider = false;

    private CustomDeviceUtil() {
    }

    private String calculateHashedDeviceType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            return bigInteger.length() > 63 ? bigInteger.substring(1) : bigInteger;
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "Failed to generate hash value of device type", e);
            return "UNKNOWN";
        }
    }

    public static CustomDeviceUtil getInstance() {
        return INSTANCE;
    }

    public String getAppConfigId() {
        return this.mAppConfigId;
    }

    public ChildProfileVerifier getChildProfileVerifier() {
        return this.mChildProfileVerifier;
    }

    public CustomerInfoProvider getCustomerInfoProvider() {
        return this.mCustomerInfoProvider;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public String getHashedDeviceType() {
        return this.mHashedDeviceType;
    }

    public String getMarketplaceId() {
        return this.mMarketplaceId;
    }

    public NonAnonymousCustomerIdProvider getNonAnonymousCustomerIdProvider() {
        return this.mNonAnonymousCustomerIdProvider;
    }

    public String getNonAnonymousDeviceId() {
        return this.mNonAnonymousDeviceId;
    }

    public OAuthProvider getOAuthProvider() {
        return this.mOAuthProvider;
    }

    public UserControlVerifier getUserControlVerifier() {
        return this.mUserControlVerifier;
    }

    public synchronized void initialize() {
        if (this.initialized.compareAndSet(false, true)) {
            Log.i(TAG, "Initializing CustomDeviceUtil");
        }
    }

    public boolean isInitialized() {
        return this.initialized.get();
    }

    public void setAppConfigId(String str) {
        this.mAppConfigId = str;
    }

    public void setChildProfileVerifier(ChildProfileVerifier childProfileVerifier) {
        if (this.mIsInitializerSetChildProfileVerifier) {
            return;
        }
        this.mChildProfileVerifier = childProfileVerifier;
    }

    public void setChildProfileVerifierInitializer(ChildProfileVerifier childProfileVerifier) {
        if (this.mIsInitializerSetChildProfileVerifier) {
            return;
        }
        this.mChildProfileVerifier = childProfileVerifier;
        this.mIsInitializerSetChildProfileVerifier = true;
    }

    public void setCustomerIdProvider(NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider) {
        if (this.mIsInitializerSetNonAnonymousCustomerIdProvider) {
            return;
        }
        this.mNonAnonymousCustomerIdProvider = nonAnonymousCustomerIdProvider;
    }

    public void setCustomerIdProviderInitializer(NonAnonymousCustomerIdProvider nonAnonymousCustomerIdProvider) {
        if (this.mIsInitializerSetNonAnonymousCustomerIdProvider) {
            return;
        }
        this.mNonAnonymousCustomerIdProvider = nonAnonymousCustomerIdProvider;
        this.mIsInitializerSetNonAnonymousCustomerIdProvider = true;
    }

    public void setCustomerInfoProviderInitializer(CustomerInfoProvider customerInfoProvider) {
        if (this.mIsInitializerSetCustomerInfoProvider) {
            return;
        }
        this.mCustomerInfoProvider = customerInfoProvider;
        this.mIsInitializerSetCustomerInfoProvider = true;
    }

    public void setDeviceType(String str) {
        if (this.mIsInitializerSetDeviceType) {
            return;
        }
        this.mDeviceType = str;
        this.mHashedDeviceType = calculateHashedDeviceType(str);
    }

    public void setDeviceTypeInitializer(String str) {
        if (this.mIsInitializerSetDeviceType) {
            return;
        }
        this.mDeviceType = str;
        this.mHashedDeviceType = calculateHashedDeviceType(str);
        this.mIsInitializerSetDeviceType = true;
    }

    public void setMarketplaceId(String str) {
        if (this.mIsInitializerSetMarketplaceId) {
            return;
        }
        this.mMarketplaceId = str;
    }

    public void setMarketplaceIdInitializer(String str) {
        if (this.mIsInitializerSetMarketplaceId) {
            return;
        }
        this.mMarketplaceId = str;
        this.mIsInitializerSetMarketplaceId = true;
    }

    public void setNonAnonymousDeviceId(String str) {
        if (this.mIsInitializerSetNonAnonymousDeviceId) {
            return;
        }
        this.mNonAnonymousDeviceId = str;
    }

    public void setNonAnonymousDeviceIdInitializer(String str) {
        if (this.mIsInitializerSetNonAnonymousDeviceId) {
            return;
        }
        this.mNonAnonymousDeviceId = str;
        this.mIsInitializerSetNonAnonymousDeviceId = true;
    }

    public void setOAuthProvider(OAuthProvider oAuthProvider) {
        if (this.mIsInitializerSetOAuthProvider) {
            return;
        }
        this.mOAuthProvider = oAuthProvider;
    }

    public void setOAuthProviderInitializer(OAuthProvider oAuthProvider) {
        if (this.mIsInitializerSetOAuthProvider) {
            return;
        }
        this.mOAuthProvider = oAuthProvider;
        this.mIsInitializerSetOAuthProvider = true;
    }

    public void setUserControlVerifier(UserControlVerifier userControlVerifier) {
        if (this.mIsInitializerSetUserControlVerifier) {
            return;
        }
        this.mUserControlVerifier = userControlVerifier;
    }

    public void setUserControlVerifierInitializer(UserControlVerifier userControlVerifier) {
        if (this.mIsInitializerSetUserControlVerifier) {
            return;
        }
        this.mUserControlVerifier = userControlVerifier;
        this.mIsInitializerSetUserControlVerifier = true;
    }
}
