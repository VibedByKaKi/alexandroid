package com.dee.app.contacts.common.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class AppUrlConstants {
    public static final String CAN_SYNC_URL = "/contacts/users/{0}/canSyncContacts";
    public static final String CONTACTS_URL = "/users/{0}/contacts";
    public static final String CONTACT_URL = "/users/{0}/contact/{1}?view=full";
    public static final String DELETE_ADDRESS_BOOKS_URL = "/users/{0}/addressbooks";
    public static final String GET_ACCOUNTS_URL = "/commsidentity/accounts";
    public static final String GET_ACTIVE_CONTACTS = "/users/contacts/presence";
    public static final String GET_ADDRESS_BOOKS_URL = "/users/{0}/addressbooks";
    public static final String GET_CONTACTS_V2_URL = "/users/{0}/paginatedContacts";
    public static final String GET_CONTACT_BY_CONTACT_ID_URL = "/users/{0}/contact/{1}";
    public static final String GET_CONTACT_PREFERENCE_URL = "/users/{0}/contacts/{1}/preferences/{2}";
    public static final String GET_DEVICES_URL = "/homegroups/{0}/devices?target=false";
    public static final String GET_IDENTITY_PREFERENCE_URL = "/users/{0}/preferences/{1}";
    public static final String GET_MASTER_DEVICE_ID_URL = "/users/{0}/devices";
    public static final String GET_OWNER_PREFERENCE_URL = "/contacts/users/{0}/preferences/{1}";
    public static final String GET_PNV_URL = "/commsidentity/cvf/aao";
    public static final String SET_CONTACT_PREFERENCE_URL = "/users/{0}/contacts/{1}/preferences";
    public static final String SET_IDENTITY_PREFERENCE_URL = "/users/{0}/preferences/{1}";
    public static final String SET_OWNER_PREFERENCE_URL = "/contacts/users/{0}/preferences";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ACMS {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class QueryParam {
            public static final String DEFAULT_ACMS_HOST = "https://alexa-comms-mobile-service.amazon.com";

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Keys {
                public static final String ADDRESS_BOOK_TYPE = "addressBookType";
                public static final String BULK_IMPORT_ONLY = "bulkImportOnly";
                public static final String CONTACTS_PREFERENCE_TO_BE_INCLUDED = "contactPreferencesToInclude";
                public static final String CONTACT_SYNC_TYPE = "contactSyncType";
                public static final String DEDUPE_MODE = "dedupeMode";
                public static final String ETAG = "etag";
                public static final String HOME_GROUP_ID = "homeGroupId";
                public static final String INCLUDE_BLOCK_STATUS = "includeBlockStatus";
                public static final String INCLUDE_DEFAULT_ACTOR = "includeDefaultActor";
                public static final String INCLUDE_HOME_GROUP_MEMBERS = "includeHomeGroupMembers";
                public static final String INCLUDE_INACTIVE_CONTACTS = "includeInactiveContacts";
                public static final String INCLUDE_MERGED_CONTACTS = "includeMergedContacts";
                public static final String INCLUDE_NON_A2A_CONTACTS = "includeNonAlexaContacts";
                public static final String INCLUDE_PREF_BY_LEVEL = "includePreferencesByLevel";
                public static final String NEXT_PAGINATION_TOKEN = "nextPaginationToken";
                public static final String ONLY_DROP_IN_CONTACTS = "onlyDropInContacts";
                public static final String OWNER_ID_TYPE = "ownerIdType";
                public static final String PAGINATION_COUNT = "paginationCount";
                public static final String PAGINATION_ENABLED = "paginationEnabled";
                public static final String PREFERENCE_NAMESPACE = "preferenceNamespace";
                public static final String RETURN_AS_HG_CONTACTS = "returnAsHomegroupContacts";
                public static final String SOURCE_DEVICE_ID = "sourceDeviceId";
                public static final String TARGET = "target";
                public static final String VIEW = "view";

                private Keys() {
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Values {
                public static final String ASCENDING = "asc";
                public static final String VIEW_QUERY_PARAM_VALUE = "full";

                private Values() {
                }
            }

            private QueryParam() {
            }
        }

        private ACMS() {
        }
    }

    private AppUrlConstants() {
    }
}
