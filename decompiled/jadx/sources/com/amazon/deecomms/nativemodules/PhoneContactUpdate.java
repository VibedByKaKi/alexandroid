package com.amazon.deecomms.nativemodules;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.mobilytics.event.Channels;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.amazon.clouddrive.cdasdk.cds.common.TimeGroupBy;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class PhoneContactUpdate {

    @Nullable
    final Birthday birthday;

    @Nullable
    final String displayName;

    @Nullable
    final List<EmailAddress> emailAddresses;

    @Nullable
    final String familyName;

    @Nullable
    final String givenName;

    @Nullable
    final List<PhoneNumber> phoneNumbers;
    final String recordID;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Birthday {
        final int day;
        final int month;
        final boolean shouldClear;

        @Nullable
        final Integer year;

        private Birthday(boolean z, int i, int i2, @Nullable Integer num) {
            this.shouldClear = z;
            this.month = i;
            this.day = i2;
            this.year = num;
        }

        public static Birthday clear() {
            return new Birthday(true, 0, 0, null);
        }

        public static Birthday of(int i, int i2, @Nullable Integer num) {
            return new Birthday(false, i, i2, num);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EmailAddress {
        final String email;
        final int type;

        public EmailAddress(int i, String str) {
            this.type = i;
            this.email = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PhoneNumber {
        final String number;
        final int type;

        public PhoneNumber(int i, String str) {
            this.type = i;
            this.number = str;
        }
    }

    private PhoneContactUpdate(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<PhoneNumber> list, @Nullable List<EmailAddress> list2, @Nullable Birthday birthday) {
        this.recordID = str;
        this.givenName = str2;
        this.familyName = str3;
        this.displayName = str4;
        this.phoneNumbers = list;
        this.emailAddresses = list2;
        this.birthday = birthday;
    }

    @Nullable
    public static PhoneContactUpdate from(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("recordID") || (string = readableMap.getString("recordID")) == null || string.isEmpty()) {
            return null;
        }
        return new PhoneContactUpdate(string, readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null, readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null, readableMap.hasKey(CamerasRouteParameter.DISPLAY_NAME) ? readableMap.getString(CamerasRouteParameter.DISPLAY_NAME) : null, parsePhoneNumbers(readableMap), parseEmailAddresses(readableMap), parseBirthday(readableMap));
    }

    public static int mapEmailType(String str) {
        if (str == null) {
            return 3;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals(Channels.HOME)) {
            return 1;
        }
        return !lowerCase.equals("work") ? 3 : 2;
    }

    public static int mapPhoneType(String str) {
        if (str == null) {
            return 7;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return 7;
    }

    @Nullable
    private static Birthday parseBirthday(ReadableMap readableMap) {
        Integer num = null;
        if (!readableMap.hasKey("birthday")) {
            return null;
        }
        if (readableMap.isNull("birthday")) {
            return Birthday.clear();
        }
        ReadableMap map = readableMap.getMap("birthday");
        if (map == null || !map.hasKey(TimeGroupBy.MONTH) || !map.hasKey(TimeGroupBy.DAY)) {
            return null;
        }
        if (map.hasKey(TimeGroupBy.YEAR) && !map.isNull(TimeGroupBy.YEAR)) {
            num = Integer.valueOf(map.getInt(TimeGroupBy.YEAR));
        }
        return Birthday.of(map.getInt(TimeGroupBy.MONTH), map.getInt(TimeGroupBy.DAY), num);
    }

    @Nullable
    private static List<EmailAddress> parseEmailAddresses(ReadableMap readableMap) {
        ReadableArray array;
        if (!readableMap.hasKey("emailAddresses") || (array = readableMap.getArray("emailAddresses")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (array.size() != 0) {
            for (int i = 0; i < array.size(); i++) {
                ReadableMap map = array.getMap(i);
                if (map != null) {
                    String string = map.hasKey("email") ? map.getString("email") : "";
                    if (string != null && !string.isEmpty()) {
                        arrayList.add(new EmailAddress(mapEmailType(map.hasKey("label") ? map.getString("label") : CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER), string));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }

    @Nullable
    private static List<PhoneNumber> parsePhoneNumbers(ReadableMap readableMap) {
        ReadableArray array;
        if (!readableMap.hasKey(ContactsModuleConstants.CONTACT_PHONE_NUMBERS) || (array = readableMap.getArray(ContactsModuleConstants.CONTACT_PHONE_NUMBERS)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (array.size() != 0) {
            for (int i = 0; i < array.size(); i++) {
                ReadableMap map = array.getMap(i);
                if (map != null) {
                    String string = map.hasKey("number") ? map.getString("number") : "";
                    if (string != null && !string.isEmpty()) {
                        arrayList.add(new PhoneNumber(mapPhoneType(map.hasKey("label") ? map.getString("label") : CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER), string));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }
}
