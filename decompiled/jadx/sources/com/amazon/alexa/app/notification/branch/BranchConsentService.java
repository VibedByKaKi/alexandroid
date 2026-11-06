package com.amazon.alexa.app.notification.branch;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.Lazy;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes.dex */
public class BranchConsentService {
    private static final String ACCEPTED = "ACCEPTED";
    private static final String CANADA = "CA";
    private static final String CONSENT_KEY_PREFIX = "decision_";
    private static final String DECLINED = "DECLINED";
    private static final String EVENT_SOURCE = "ALISTAIR_UPDATE_SUCCESS";
    private static final String EVENT_TYPE = "AdsCookieConsentDecision";
    private static final String STORAGE_NAME = "branch_hva_consent";
    private static final String TAG = "BranchConsent";
    private final EventBus eventBus;
    private final Lazy<IdentityService> identityService;
    private boolean initialized;
    private final Set<ConsentListener> listeners;
    private final PersistentStorage storage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConsentListener {
        void onConsentStateChanged(ConsentState consentState);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConsentState {
        ALLOWED,
        WAITING,
        DECLINED,
        DISABLED
    }

    @VisibleForTesting
    public BranchConsentService(EventBus eventBus, Lazy<IdentityService> lazy, PersistentStorage persistentStorage) {
        this.listeners = new CopyOnWriteArraySet();
        this.eventBus = eventBus;
        this.identityService = lazy;
        this.storage = persistentStorage;
    }

    @Nullable
    private static String consentKey(@Nullable UserIdentity userIdentity) {
        if (userIdentity == null) {
            return null;
        }
        String directedId = userIdentity.getDirectedId();
        if (directedId == null || directedId.isEmpty()) {
            directedId = userIdentity.getId();
        }
        if (directedId != null && !directedId.isEmpty()) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(directedId.getBytes(StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder(CONSENT_KEY_PREFIX);
                for (byte b : digest) {
                    sb.append(Character.forDigit((b & 255) >>> 4, 16));
                    sb.append(Character.forDigit(b & 15, 16));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e(TAG, "Unable to scope Branch consent to the account.", e);
            }
        }
        return null;
    }

    @Nullable
    private UserIdentity currentUser() {
        try {
            IdentityService identityService = this.identityService.get();
            if (identityService == null) {
                return null;
            }
            return identityService.getUser(TAG);
        } catch (RuntimeException e) {
            Log.e(TAG, "Unable to resolve the current account.", e);
            return null;
        }
    }

    private static boolean isBranchDisabled(String str) {
        return "CA".equals(str.toUpperCase(Locale.US));
    }

    private void notifyListeners(ConsentState consentState) {
        Iterator<ConsentListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onConsentStateChanged(consentState);
            } catch (RuntimeException e) {
                Log.e(TAG, "Unable to notify a Branch consent listener.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConsentDecision(@Nullable Message message) {
        if (message == null || message.getPayload() == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(message.getPayloadAsString());
            if (jSONObject.optInt("schemaVersion", -1) == 1 && EVENT_SOURCE.equals(jSONObject.optString("source", ""))) {
                String optString = jSONObject.optString("status", "");
                if (ACCEPTED.equals(optString) || DECLINED.equals(optString)) {
                    applyConsentDecision(optString);
                }
            }
        } catch (JSONException | RuntimeException e) {
            Log.e(TAG, "Unable to process Branch consent.", e);
        }
    }

    private static boolean requiresConsent(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        return "GB".equals(upperCase) || "IT".equals(upperCase) || "DE".equals(upperCase) || "ES".equals(upperCase) || "FR".equals(upperCase);
    }

    public void addListener(ConsentListener consentListener) {
        this.listeners.add(consentListener);
    }

    @VisibleForTesting
    public void applyConsentDecision(String str) {
        String consentKey = consentKey(currentUser());
        if (consentKey == null) {
            return;
        }
        try {
            this.storage.edit().set(consentKey, str).commit();
            notifyListeners(getConsentState());
        } catch (RuntimeException e) {
            Log.e(TAG, "Unable to persist Branch consent.", e);
        }
    }

    public ConsentState getConsentState() {
        String string;
        UserIdentity currentUser = currentUser();
        if (currentUser == null) {
            return ConsentState.WAITING;
        }
        String countryOfResidence = currentUser.getCountryOfResidence();
        if (countryOfResidence == null || countryOfResidence.isEmpty()) {
            return ConsentState.WAITING;
        }
        if (isBranchDisabled(countryOfResidence)) {
            return ConsentState.DISABLED;
        }
        if (!requiresConsent(countryOfResidence)) {
            return ConsentState.ALLOWED;
        }
        String consentKey = consentKey(currentUser);
        if (consentKey == null) {
            return ConsentState.WAITING;
        }
        try {
            string = this.storage.getString(consentKey, null);
        } catch (RuntimeException e) {
            Log.e(TAG, "Unable to read Branch consent.", e);
        }
        if (ACCEPTED.equals(string)) {
            return ConsentState.ALLOWED;
        }
        if (DECLINED.equals(string)) {
            return ConsentState.DECLINED;
        }
        return ConsentState.WAITING;
    }

    public synchronized void initialize() {
        if (this.initialized) {
            return;
        }
        this.eventBus.getSubscriber().subscribeFilter(new EventTypeMessageFilter(EVENT_TYPE), new BranchConsentService$$ExternalSyntheticLambda0(this, 0));
        this.initialized = true;
    }

    @Inject
    public BranchConsentService(EventBus eventBus, Lazy<IdentityService> lazy, PersistentStorage.Factory factory) {
        this(eventBus, lazy, factory.create(STORAGE_NAME));
    }
}
