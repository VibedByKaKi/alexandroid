package com.dee.app.contacts.interfaces.models.data.preference.identitypreference;

import com.dee.app.contacts.interfaces.models.data.preference.IPreference;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CONTACT_SYNC_PREFERENCE_ENABLED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class ContactIdentityPreference implements IPreference<IdentityPreferenceKey, IdentityPreferenceValue> {
    private static final /* synthetic */ ContactIdentityPreference[] $VALUES;
    public static final ContactIdentityPreference BLOCK_UNKNOWN_NUMBER_PREFERENCE_DISABLED;
    public static final ContactIdentityPreference BLOCK_UNKNOWN_NUMBER_PREFERENCE_ENABLED;
    public static final ContactIdentityPreference CONTACT_ACCESS_ALL_CONTACTS;
    public static final ContactIdentityPreference CONTACT_ACCESS_FAVORITES_ONLY;
    public static final ContactIdentityPreference CONTACT_SYNC_PREFERENCE_DISABLED;
    public static final ContactIdentityPreference CONTACT_SYNC_PREFERENCE_ENABLED;
    public static final ContactIdentityPreference GROUP_AMC_PREFERENCE_ENABLED;
    public static final ContactIdentityPreference GROUP_AMC_PREFERENCE_TYPE_DISABLED;
    private final IdentityPreferenceKey key;
    private final IdentityPreferenceValue value;

    private static /* synthetic */ ContactIdentityPreference[] $values() {
        return new ContactIdentityPreference[]{CONTACT_SYNC_PREFERENCE_ENABLED, CONTACT_SYNC_PREFERENCE_DISABLED, CONTACT_ACCESS_ALL_CONTACTS, CONTACT_ACCESS_FAVORITES_ONLY, GROUP_AMC_PREFERENCE_ENABLED, GROUP_AMC_PREFERENCE_TYPE_DISABLED, BLOCK_UNKNOWN_NUMBER_PREFERENCE_ENABLED, BLOCK_UNKNOWN_NUMBER_PREFERENCE_DISABLED};
    }

    static {
        IdentityPreferenceKey identityPreferenceKey = IdentityPreferenceKey.CONTACT_SYNC_ENABLED;
        IdentityPreferenceValue identityPreferenceValue = IdentityPreferenceValue.ENABLED;
        CONTACT_SYNC_PREFERENCE_ENABLED = new ContactIdentityPreference("CONTACT_SYNC_PREFERENCE_ENABLED", 0, identityPreferenceKey, identityPreferenceValue);
        IdentityPreferenceValue identityPreferenceValue2 = IdentityPreferenceValue.DISABLED;
        CONTACT_SYNC_PREFERENCE_DISABLED = new ContactIdentityPreference("CONTACT_SYNC_PREFERENCE_DISABLED", 1, identityPreferenceKey, identityPreferenceValue2);
        IdentityPreferenceKey identityPreferenceKey2 = IdentityPreferenceKey.CONTACT_ACCESS_CONTROL_TYPE;
        CONTACT_ACCESS_ALL_CONTACTS = new ContactIdentityPreference("CONTACT_ACCESS_ALL_CONTACTS", 2, identityPreferenceKey2, IdentityPreferenceValue.ALL_CONTACTS);
        CONTACT_ACCESS_FAVORITES_ONLY = new ContactIdentityPreference("CONTACT_ACCESS_FAVORITES_ONLY", 3, identityPreferenceKey2, IdentityPreferenceValue.FAVORITES_ONLY);
        IdentityPreferenceKey identityPreferenceKey3 = IdentityPreferenceKey.GROUP_AMC_PREFERENCE;
        GROUP_AMC_PREFERENCE_ENABLED = new ContactIdentityPreference("GROUP_AMC_PREFERENCE_ENABLED", 4, identityPreferenceKey3, identityPreferenceValue);
        GROUP_AMC_PREFERENCE_TYPE_DISABLED = new ContactIdentityPreference("GROUP_AMC_PREFERENCE_TYPE_DISABLED", 5, identityPreferenceKey3, identityPreferenceValue2);
        IdentityPreferenceKey identityPreferenceKey4 = IdentityPreferenceKey.BLOCK_UNKNOWN_NUMBER_PREFERENCE;
        BLOCK_UNKNOWN_NUMBER_PREFERENCE_ENABLED = new ContactIdentityPreference("BLOCK_UNKNOWN_NUMBER_PREFERENCE_ENABLED", 6, identityPreferenceKey4, identityPreferenceValue);
        BLOCK_UNKNOWN_NUMBER_PREFERENCE_DISABLED = new ContactIdentityPreference("BLOCK_UNKNOWN_NUMBER_PREFERENCE_DISABLED", 7, identityPreferenceKey4, identityPreferenceValue2);
        $VALUES = $values();
    }

    private ContactIdentityPreference(String str, int i, IdentityPreferenceKey identityPreferenceKey, IdentityPreferenceValue identityPreferenceValue) {
        this.key = identityPreferenceKey;
        this.value = identityPreferenceValue;
    }

    public static ContactIdentityPreference getIdentityPreferenceForKeyAndValue(String str, String str2) {
        for (ContactIdentityPreference contactIdentityPreference : values()) {
            if (contactIdentityPreference.getPreferenceKey().isPreferenceKeyForString(str) && contactIdentityPreference.getPreferenceValue().isPreferenceValueForString(str2)) {
                return contactIdentityPreference;
            }
        }
        return null;
    }

    public static ContactIdentityPreference valueOf(String str) {
        return (ContactIdentityPreference) Enum.valueOf(ContactIdentityPreference.class, str);
    }

    public static ContactIdentityPreference[] values() {
        return (ContactIdentityPreference[]) $VALUES.clone();
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreference
    public IdentityPreferenceKey getPreferenceKey() {
        return this.key;
    }

    @Override // com.dee.app.contacts.interfaces.models.data.preference.IPreference
    public IdentityPreferenceValue getPreferenceValue() {
        return this.value;
    }
}
