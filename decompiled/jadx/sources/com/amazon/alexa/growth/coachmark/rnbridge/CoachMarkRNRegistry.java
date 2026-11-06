package com.amazon.alexa.growth.coachmark.rnbridge;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CoachMarkRNRegistry {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CoachMarkRNID {
        COACH_MARK_CONTACT_BUTTON("coach_mark_contact_button"),
        COACH_MARK_DEVICE_SETTINGS_BUTTON("coach_mark_device_settings_button"),
        COACH_MARK_ADD_DEVICE_BUTTON("coach_mark_add_device_button"),
        COACH_MARK_MAP_VIEW_BUTTON("coach_mark_map_view_button"),
        COACH_MARK_FOLLOW_UP_REMINDERS_INFO("coach_mark_follow_up_reminders_info"),
        COACH_MARK_FOLLOW_UP_REMINDERS_INFO_GLOBAL_SETTING("coach_mark_follow_up_reminders_info_global_setting"),
        COACH_MARK_COMMS_HISTORY_VIEW_BUTTON("coach_mark_comms_history_open_button"),
        COACH_MARK_DEVICES_SETTING_SYNC("coach_mark_devices_setting_sync"),
        COACH_MARK_UPSELL_TILE("coach_mark_upsell_tile"),
        COACH_MARK_NOW_PLAY_SCREEN_AMAZON_MUSIC_HINTS("coach_mark_now_playing_screen_amazon_music_hints"),
        COACH_MARK_CALENDAR_MONTHLY_VIEW_TOGGLE("coach_mark_calendar_monthly_view_toggle"),
        COACH_MARK_CALENDAR_MONTHLY_VIEW_SWIPE("coach_mark_calendar_monthly_view_swipe"),
        COACH_MARK_COMMS_ONE_TAP_ANNOUNCEMENT("coach_mark_comms_1tapannouncement"),
        COACH_MARK_SCAN_TO_LIST_BUTTON_ON_LIST_DETAIL_PAGE("coach_mark_scan_to_list_button_on_list_detail_page"),
        COACH_MARK_SCAN_TO_LIST_BUTTON_ON_ADD_ITEM_PAGE("coach_mark_scan_to_list_button_on_add_item_page"),
        COACH_MARK_LAYER_BUTTON_ON_MAP_VIEW("coach_mark_layer_button_on_map_view"),
        COACH_MARK_CAMERA_BUTTON_ON_GD_LANDING_PAGE("coach_mark_camera_button_on_gd_landing_page"),
        COACH_MARK_ENERGY_DASHBOARD("coach_mark_energy_dashboard"),
        COACH_MARK_DEVICE_PLACEMENT_ON_MAP_VIEW("coach_mark_device_placement_on_map_view"),
        COACH_MARK_COMMS_NEW_ANNOUNCEMENT_UI("coach_mark_comms_new_announcement_ui"),
        COACH_MARK_HSB_FAVORITES_MIGRATION("coach_mark_hsb_favorites_migration"),
        COACH_MARK_FOR_YOU_FEEDBACK("coach_mark_for_you_feedback"),
        COACH_MARK_TASKS_DRAG_AND_DROP("coach_mark_tasks_drag_and_drop"),
        COACH_MARK_SETTINGS_SEARCH_SEND("coach_mark_settings_search_send");

        private static final Set<String> coachMarkIdsInString = new HashSet();
        private final String toString;

        static {
            for (CoachMarkRNID coachMarkRNID : values()) {
                coachMarkIdsInString.add(coachMarkRNID.toString);
            }
        }

        CoachMarkRNID(String str) {
            this.toString = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.toString;
        }
    }

    private CoachMarkRNRegistry() {
    }

    public static boolean contains(String str) {
        return CoachMarkRNID.coachMarkIdsInString.contains(str);
    }
}
