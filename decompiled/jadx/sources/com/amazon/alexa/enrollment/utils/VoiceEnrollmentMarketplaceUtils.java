package com.amazon.alexa.enrollment.utils;

import android.util.Log;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.MarketplaceId;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceEnrollmentMarketplaceUtils {
    private static final String TAG = "VoxEn_MarketplaceUtils";

    private VoiceEnrollmentMarketplaceUtils() {
    }

    public static boolean isAuMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in AU Marketplace. Exception - ", e);
        }
        if (user != null) {
            return MarketplaceId.COM_AU_PROD.equals(user.getMarketplace().getObfuscatedId());
        }
        Log.i(TAG, "customer is null, returning false for isAuMarketplace");
        return false;
    }

    public static boolean isBRMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in BR Marketplace. Exception - ", e);
        }
        if (user != null) {
            return MarketplaceId.COM_BR_PROD.equals(user.getMarketplace().getObfuscatedId());
        }
        Log.i(TAG, "customer is null, returning false for isBRMarketplace");
        return false;
    }

    public static boolean isBipa(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in bipa. Exception - ", e);
        }
        if (user == null) {
            Log.i(TAG, "customer is null, returning false for isBipa");
            return false;
        }
        MarketplaceId obfuscatedId = user.getMarketplace().getObfuscatedId();
        return MarketplaceId.CO_UK.equals(obfuscatedId) || MarketplaceId.FR.equals(obfuscatedId) || MarketplaceId.COM_BR_PROD.equals(obfuscatedId) || MarketplaceId.DE.equals(obfuscatedId) || MarketplaceId.ES_PROD.equals(obfuscatedId) || MarketplaceId.IT_PROD.equals(obfuscatedId) || MarketplaceId.NL_PROD.equals(obfuscatedId);
    }

    public static boolean isDEMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in DE Marketplace. Exception - ", e);
        }
        if (user != null) {
            return MarketplaceId.DE.equals(user.getMarketplace().getObfuscatedId());
        }
        Log.i(TAG, "customer is null, returning false for isDEMarketplace");
        return false;
    }

    public static boolean isINMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in IN Marketplace. Exception - ", e);
        }
        if (user != null) {
            return MarketplaceId.IN.equals(user.getMarketplace().getObfuscatedId());
        }
        Log.i(TAG, "customer is null, returning false for isINMarketplace");
        return false;
    }

    public static boolean isITOrFROrESMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in IT or ES or FR Marketplace. Exception - ", e);
        }
        if (user == null) {
            Log.i(TAG, "customer is null, returning false for isAuMarketplace");
            return false;
        }
        MarketplaceId obfuscatedId = user.getMarketplace().getObfuscatedId();
        return MarketplaceId.IT_PROD.equals(obfuscatedId) || MarketplaceId.FR.equals(obfuscatedId) || MarketplaceId.ES_PROD.equals(obfuscatedId);
    }

    public static boolean isJPMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in JP Marketplace. Exception - ", e);
        }
        if (user != null) {
            return MarketplaceId.CO_JP.equals(user.getMarketplace().getObfuscatedId());
        }
        Log.i(TAG, "customer is null, returning false for isJPMarketplace");
        return false;
    }

    public static boolean isMXMarketplace(IdentityService identityService, String str) {
        UserIdentity user;
        try {
            user = identityService.getUser(str);
        } catch (Exception e) {
            Log.e(TAG, "Unable to find if the customer is in MX Marketplace. Exception - ", e);
        }
        if (user != null) {
            return MarketplaceId.COM_MX_PROD.equals(user.getMarketplace().getObfuscatedId());
        }
        Log.i(TAG, "customer is null, returning false for isMXMarketplace");
        return false;
    }
}
