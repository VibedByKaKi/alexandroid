package com.dee.app.sync.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.contacts.common.utils.ContactsLogger;
import com.dee.app.contacts.interfaces.models.data.ContactUploadInfo;
import com.dee.app.contacts.interfaces.models.data.PhoneNumberType;
import com.dee.app.contacts.interfaces.models.data.enums.EmailAddressType;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeviceContactsFetcher {
    private static final int DEFAULT_BATCH_SIZE = 100;
    private static final ContactsLogger LOG = ContactsLogger.getLogger(Constants.LOG_TAG, DeviceContactsFetcher.class);
    private final Context mContext;
    private final String mDeviceId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ContactFetchCallback {
        void onContactsFetched(List<ContactUploadInfo> list);
    }

    @Inject
    public DeviceContactsFetcher(Context context, @Named("DeviceId") String str) {
        this.mContext = context;
        this.mDeviceId = str;
    }

    @NonNull
    private List<ContactUploadInfo> fetchDeviceContactsInternal(ContactFetchCallback contactFetchCallback, int i, String str, String[] strArr) {
        int count;
        LOG.i("Fetching device contacts.");
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, str, strArr, null);
        if (query != null) {
            try {
                count = query.getCount();
            } catch (Throwable th) {
                if (query == null) {
                    throw th;
                }
                try {
                    query.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            count = 0;
        }
        if (count == 0) {
            if (contactFetchCallback != null) {
                contactFetchCallback.onContactsFetched(arrayList);
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        }
        long j = 0;
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("_id"));
            ContactUploadInfo contactUploadInfo = new ContactUploadInfo();
            contactUploadInfo.setDeviceContactId(string);
            long j2 = currentTimeMillis;
            contactUploadInfo.setSourceDeviceId(this.mDeviceId);
            hashMap.put(string, contactUploadInfo);
            if (hashMap.size() == i) {
                fetchNamesAndCompany(hashMap);
                fetchPhoneNumbers(hashMap);
                fetchEmailAddresses(hashMap);
                long currentTimeMillis2 = System.currentTimeMillis() - j2;
                j += currentTimeMillis2;
                LOG.d("Contacts read: " + i + ". Time taken: " + currentTimeMillis2);
                if (contactFetchCallback != null) {
                    contactFetchCallback.onContactsFetched(new ArrayList<>(hashMap.values()));
                } else {
                    arrayList.addAll(hashMap.values());
                }
                hashMap.clear();
                currentTimeMillis = System.currentTimeMillis();
            } else {
                currentTimeMillis = j2;
            }
        }
        long j3 = currentTimeMillis;
        if (!hashMap.isEmpty()) {
            fetchNamesAndCompany(hashMap);
            fetchPhoneNumbers(hashMap);
            fetchEmailAddresses(hashMap);
            long currentTimeMillis3 = System.currentTimeMillis() - j3;
            j += currentTimeMillis3;
            LOG.d("Contacts read: " + i + ". Time taken: " + currentTimeMillis3);
            if (contactFetchCallback != null) {
                contactFetchCallback.onContactsFetched(new ArrayList<>(hashMap.values()));
            } else {
                arrayList.addAll(hashMap.values());
            }
            hashMap.clear();
        }
        query.close();
        ContactsLogger contactsLogger = LOG;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m(j, "Time taken to fetch ", count, "contacts is ");
        m.append("ms");
        contactsLogger.d(m.toString());
        return arrayList;
    }

    private void fetchEmailAddresses(Map<String, ContactUploadInfo> map) {
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[]{com.amazon.deecomms.common.Constants.BUNDLE_KEY_CONTACT_ID, "data1", "data2", "data3"}, a$$ExternalSyntheticOutline0.m(new StringBuilder("contact_id IN ("), getInListPlaceholder(map.size()), MarkdownConstants.RIGHT_PARENTHESIS), (String[]) map.keySet().toArray(new String[map.size()]), null);
        if (query != null) {
            try {
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    do {
                        String string = query.getString(query.getColumnIndex(com.amazon.deecomms.common.Constants.BUNDLE_KEY_CONTACT_ID));
                        map.get(string).addEmailAddress(query.getString(query.getColumnIndex("data1")), getEmailAddressType(query.getInt(query.getColumnIndex("data2")), query.getString(query.getColumnIndex("data3"))));
                    } while (query.moveToNext());
                    query.close();
                    return;
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
    }

    @TargetApi(21)
    private void fetchNamesAndCompany(Map<String, ContactUploadInfo> map) {
        String m = a$$ExternalSyntheticOutline0.m(new StringBuilder("name_raw_contact_id = raw_contact_id AND contact_id IN ("), getInListPlaceholder(map.size()), MarkdownConstants.RIGHT_PARENTHESIS);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(map.keySet());
        String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
        linkedHashSet.clear();
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, m, strArr, null);
        while (query.moveToNext()) {
            try {
                ContactUploadInfo contactUploadInfo = map.get(query.getString(query.getColumnIndex(com.amazon.deecomms.common.Constants.BUNDLE_KEY_CONTACT_ID)));
                String string = query.getString(query.getColumnIndex("mimetype"));
                int hashCode = string.hashCode();
                if (hashCode != -1079224304) {
                    if (hashCode != 689862072) {
                        if (hashCode == 2034973555 && string.equals("vnd.android.cursor.item/nickname")) {
                            String string2 = query.getString(query.getColumnIndex("data1"));
                            if (contactUploadInfo.getName() == null) {
                                contactUploadInfo.setContactName(null, null, string2);
                            } else {
                                contactUploadInfo.getName().setNickName(string2);
                            }
                        }
                        LOG.d("The cursor does not hold information required for names/company");
                    } else if (string.equals("vnd.android.cursor.item/organization")) {
                        contactUploadInfo.setCompany(query.getString(query.getColumnIndex("data1")));
                    } else {
                        LOG.d("The cursor does not hold information required for names/company");
                    }
                } else if (string.equals("vnd.android.cursor.item/name")) {
                    String string3 = query.getString(query.getColumnIndex("data2"));
                    String string4 = query.getString(query.getColumnIndex("data3"));
                    String string5 = query.getString(query.getColumnIndex("data7"));
                    String string6 = query.getString(query.getColumnIndex("data9"));
                    if (contactUploadInfo.getName() == null) {
                        contactUploadInfo.setContactName(string3, string4, string5, string6, null);
                    } else {
                        contactUploadInfo.getName().setFirstName(string3);
                        contactUploadInfo.getName().setLastName(string4);
                        contactUploadInfo.getName().setPhoneticFirstName(string5);
                        contactUploadInfo.getName().setPhoneticLastName(string6);
                    }
                } else {
                    LOG.d("The cursor does not hold information required for names/company");
                }
            } finally {
            }
        }
        query.close();
    }

    private void fetchPhoneNumbers(Map<String, ContactUploadInfo> map) {
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{com.amazon.deecomms.common.Constants.BUNDLE_KEY_CONTACT_ID, "data1", "data2", "data3"}, a$$ExternalSyntheticOutline0.m(new StringBuilder("contact_id IN ("), getInListPlaceholder(map.size()), MarkdownConstants.RIGHT_PARENTHESIS), (String[]) map.keySet().toArray(new String[map.size()]), null);
        if (query != null) {
            try {
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    do {
                        String string = query.getString(query.getColumnIndex(com.amazon.deecomms.common.Constants.BUNDLE_KEY_CONTACT_ID));
                        map.get(string).addPhoneNumber(query.getString(query.getColumnIndex("data1")), getPhoneNumberType(query.getInt(query.getColumnIndex("data2")), query.getString(query.getColumnIndex("data3"))));
                    } while (query.moveToNext());
                    query.close();
                    return;
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
    }

    private String getInListPlaceholder(int i) {
        if (i < 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public void fetchAllDeviceContactsBatch(ContactFetchCallback contactFetchCallback, int i) {
        if (contactFetchCallback == null) {
            LOG.w("fetchAllDeviceContactsBatch: ");
        } else {
            fetchDeviceContactsInternal(contactFetchCallback, i, null, null);
        }
    }

    public Set getAllDeviceContactIds() {
        HashSet hashSet = new HashSet();
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
        while (query.moveToNext()) {
            try {
                hashSet.add(query.getString(query.getColumnIndex("_id")));
            } catch (Throwable th) {
                if (query == null) {
                    throw th;
                }
                try {
                    query.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        query.close();
        return hashSet;
    }

    public List<ContactUploadInfo> getCreatedContacts(int i) {
        return fetchDeviceContactsInternal(null, 100, "_id > ? ", new String[]{String.valueOf(i)});
    }

    @NonNull
    public List<ContactUploadInfo> getDeviceContacts() {
        return fetchDeviceContactsInternal(null, 100, "_id > ? ", new String[]{String.valueOf(-1)});
    }

    public int getDeviceContactsCount() {
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
        try {
            int count = query.getCount();
            query.close();
            return count;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public String getEmailAddressType(int i, String str) {
        EmailAddressType fromAddressBookType = EmailAddressType.fromAddressBookType(i);
        return fromAddressBookType == EmailAddressType.Custom ? str != null ? str : "" : fromAddressBookType.getAcmsType();
    }

    public int getLastDeviceContactId() {
        Cursor query = this.mContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, null, null, "_id DESC LIMIT 1");
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    int i = query.getInt(query.getColumnIndex("_id"));
                    query.close();
                    return i;
                }
            } finally {
            }
        }
        if (query == null) {
            return 0;
        }
        query.close();
        return 0;
    }

    public String getPhoneNumberType(int i, String str) {
        PhoneNumberType fromAddressBookType = PhoneNumberType.fromAddressBookType(i);
        return fromAddressBookType == PhoneNumberType.Custom ? str != null ? str : "" : fromAddressBookType.getAcmsType();
    }

    public List<ContactUploadInfo> getUpdatedContacts(int i, long j) {
        return fetchDeviceContactsInternal(null, 100, "_id <= ? AND contact_last_updated_timestamp > ?", new String[]{String.valueOf(i), String.valueOf(j)});
    }
}
